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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class MPSConstraintString extends MPSConstraint
{
	private boolean isRequired;
	private int maxStrLen;
	public int minStrLen;
	private String charSetRegEx;
	
	public MPSConstraintString()
	{
		isRequired = false;
		minStrLen = 0;
		maxStrLen = Integer.MAX_VALUE;
		charSetRegEx = "";
	}

	public void setIsRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}
		
	public void setMaxStrLen(int maxStrLen) {
		this.maxStrLen = maxStrLen;
	}

	public void setMinStrLen(int minStrLen) {
		this.minStrLen = minStrLen;
	}
	
	public void setCharSetRegEx(String charSetRegEx) {
		this.charSetRegEx = charSetRegEx;
	}

	public void validate(Object _value, String label) throws Exception
	{
		if(_value == null)
			_value = "";
		
		String value = (String)_value;
		if(isRequired == false && value.length() == 0)
			return;
		
		if(value.length() < minStrLen)
		{
			throw new Exception(label+" String length: "+value.length()+" is less than minimum length: "+minStrLen);
		}
		
		if(value.length() > maxStrLen)
		{
			throw new Exception(label+" String length: "+value.length()+" is greater than maximum length: "+maxStrLen);
		}
		
		if (charSetRegEx.length() == 0)
			return;
		
		Pattern pattern;
		Matcher matcher;
		try
		{
			pattern = Pattern.compile(charSetRegEx);
			matcher = pattern.matcher(value);
		}catch(PatternSyntaxException e)
		{
			throw new Exception("charSetRegEx:"+charSetRegEx+" pattern compilation failed "+e.getMessage());
		}
		
		if(matcher != null)
		{	
			if(matcher.matches())
			{
				if(matcher.start() == 0 && matcher.end() == value.length())
					return;
			}
			else
			{
				throw new Exception(label+" String: "+value+" does not comply with characters: "+charSetRegEx);
			}
		}
		else
		{
			throw new Exception(label+" String: " + value + " Null matcher value returned");
		}	
	}
}