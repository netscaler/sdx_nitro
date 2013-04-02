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

package com.citrix.sdx.nitro.resource.base;

import com.google.gson.Gson;
import com.citrix.sdx.nitro.service.options;

/**
 * Json class implements the methods in ipayload_formatter interface.
 */
public class Json implements ipayload_formatter
{
	/**
	 * Converts NetScaler SDX resource to Json string.
	 * @param resrc API resource.
	 * @return returns a String
	 */
	public String resource_to_string(base_resource resrc)
	{
		Gson gson = new Gson();
		return gson.toJson(resrc);
	}

	/**
	 * Converts Json string to NetScaler SDX resource.
	 * @param responseClass Type of the class to which the string has to be converted to.
	 * @param response input string.
	 * @return returns API resource object.
	 */
	public Object string_to_resource(Class<?> responseClass, String response)
	{
		try
		{
			Gson gson = new Gson();
			return gson.fromJson(response, responseClass);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	/**
	 * Converts NetScaler SDX resource to Json string.
	 * @param resrc API resource.
	 * @param option options class object.
	 * @return returns a String
	 */
	public String resource_to_string(base_resource resrc, options option)
	{
		String result = "{ ";
		if (option != null && option.get_action() != null)
			result = result + "\"params\": {\"action\":\"" + option.get_action() + "\"},";

		result = result + "\"" + resrc.get_object_type() + "\":" + this.resource_to_string(resrc) + "}";
		return result;
	}

	/**
	 * Converts NetScaler SDX resources to Json string.
	 * @param resources API resources.
	 * @param option options class object.
	 * @return returns a String
	 */
	public String resource_to_string(base_resource resources[], options option)
	{
		String objecttype = resources[0].get_object_type();
		String request = "{";

		if (option != null && option.get_action() != null)
			request = request + "\"params\": {\"action\": \"" + option.get_action() + "\"},";

		request = request + "\"" + objecttype + "\":[";
		for (int i = 0; i < resources.length ; i++)
		{
			String str = this.resource_to_string(resources[i]);
			request = request + str + ",";
		}
		request = request + "]}";
		return request;
	}
	
	/**
	 * Converts MPS resource to Json string.
	 * @param resrc nitro resource.
	 * @param option options class object.
	 * @return returns a String
	 */
	public String resource_to_string(base_resource resrc, options option, String onerror) 
	{
		String result = "{ ";
		
		if (option != null || (!onerror.equals(""))) 
		{ 
			result = result + "\"params\":{";
			if(option != null)
			{
				if (option.get_action() != null) {
					result = result + "\"action\":\"" + option.get_action() + "\",";
				}					
			}
			
			if((!onerror.equals("")))
			{			
				result = result +"\"onerror\":\"" + onerror +"\"";			
			}		
			result  = result + "},";
		}
		
		result = result + "\"" + resrc.get_object_type() + "\":" + this.resource_to_string(resrc) + "}";
		return result;
	}
	
	/**
	 * Converts MPS resources to Json string.
	 * @param resources nitro resources.
	 * @param option options class object.
	 * @return returns a String
	 */
	public String resource_to_string(base_resource resources[], options option, String onerror)
	{
		String objecttype = resources[0].get_object_type();
		String request = "{";
		 
		if ( (option != null && option.get_action() != null) || (!onerror.equals("")) )
		{
			request = request + "\"params\":{";
		
			if (option != null)
			{		
				if(option.get_action() != null)
				{	
					request = request + "\"action\":\"" + option.get_action()+"\",";
				}
			}
			
			if((!onerror.equals("")))
			{			
				request = request + "\"onerror\":\"" + onerror + "\"";			
			}
			request  = request + "},";
		}
		
		request = request + "\"" + objecttype + "\":[";
		for (int i = 0; i < resources.length ; i++) 
		{
			String str = this.resource_to_string(resources[i]);
			request = request + str + ",";
		}
		request = request + "]}";
		return request;
	}
}
