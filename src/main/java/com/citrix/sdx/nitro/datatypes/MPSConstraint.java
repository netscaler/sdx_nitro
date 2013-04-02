/*
* Copyright (c) 2008-2015 Citrix Systems, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.citrix.sdx.nitro.datatypes;

import java.net.Inet6Address;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class MPSConstraint
{
	abstract public void validate(Object _value, String label) throws Exception;
	
	public static boolean isValidIP4(String addr)
	{
		StringTokenizer st = new StringTokenizer(addr,".");
		if(st.countTokens()!= 4)
			return false;
		
		while(st.hasMoreElements())
		{
			int val;
			try
			{
				val = Integer.parseInt(st.nextToken());
				if(val > 255 || val < 0)
					return false;
			}catch (NumberFormatException e)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isValidIP6(String addr)
	{
		try
		{		
			@SuppressWarnings("unused")
			java.net.Inet6Address inetObj = (java.net.Inet6Address) Inet6Address.getByName(addr);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}
	
	public static boolean isValidIP(String addr)
	{
		if(isValidIP4(addr) == true)
			return true;
		
		if(isValidIP6(addr) == true)
			return true;

		return false;
	}
	
	public static boolean isValidHostName(String addr)
	{
		//Internet Hostname consists of labels separated by '.'		
		//The entire hostname length cannot exceed 255 characters
      	//It allows only alpha-numeric characters, '-' and '_'		
		if(addr.length() > 255)
			return false;
		
      	
      	//Regular Expression for a label in the hostname
      	//'-' and '_' cannot start or end a label in the hostname
		//Also, each label should not exceed 63 characters
		String regEx = "^[A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9_-]*[A-Za-z0-9]$";
		Pattern pattern;
		Matcher matcher;
		try
		{
			pattern = Pattern.compile(regEx);
		}catch(PatternSyntaxException e)
		{	
			return false;
		}
		
		String [] tokens = addr.split(".");	 
		
		for(int i = 0; i < tokens.length; i++)
		{
			if(tokens[i].length() > 63)
				return false;
			
			matcher = pattern.matcher(tokens[i]);
			if(matcher != null)
			{	
				if(!matcher.matches())
				{			
					return false;	
				}
			}
			else
			{				
				return false;
			}	
		}
			
		return true;
	}
	
	public static boolean isValidInternetHost(String addr)
	{
		if(isValidIP(addr) == true)
			return true;
		
		if(isValidHostName(addr) == true)
			return true;

		return false;
	}
}