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

package com.citrix.sdx.nitro.resource.config.br;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class br_currentconfig_response extends base_response
{
	public br_currentconfig[] br_currentconfig;
}

class br_currentconfig_responses extends base_response
{
	public br_currentconfig_response[] br_currentconfig_response_array;
}

/**
 * Configuration for Repeater Current Configuration resource
 */

public class br_currentconfig extends base_resource
{
	private String response;
	private String br_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "br_currentconfig";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return br_ip_address;
	}


	/**
	 * <pre>
	 * response
	 * </pre>
	 */
	public String get_response()
	{
		return this.response;
	}

	/**
	 * <pre>
	 * Repeater IP Address
	 * </pre>
	 */
	public void set_br_ip_address(String br_ip_address)
	{
		this.br_ip_address = br_ip_address;
	}

	/**
	 * <pre>
	 * Repeater IP Address
	 * </pre>
	 */
	public String get_br_ip_address()
	{
		return this.br_ip_address;
	}


	/**
	 * Use this operation to get current configuration from Repeater Instance.
	 */
	public static br_currentconfig get(nitro_service client, br_currentconfig resource) throws Exception
	{
		resource.validate("get");
		return ((br_currentconfig[]) resource.get_resources(client))[0];
	}

	/**
	* Use this API to fetch filtered set of br_currentconfig resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static br_currentconfig[] get_filtered(nitro_service service, String filter) throws Exception
	{
		br_currentconfig obj = new br_currentconfig();
		options option = new options();
		option.set_filter(filter);
		br_currentconfig[] response = (br_currentconfig[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of br_currentconfig resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static br_currentconfig[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br_currentconfig obj = new br_currentconfig();
		options option = new options();
		option.set_filter(filter);
		br_currentconfig[] response = (br_currentconfig[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the br_currentconfig resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		br_currentconfig obj = new br_currentconfig();
		options option = new options();
		option.set_count(true);
		br_currentconfig[] response = (br_currentconfig[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br_currentconfig resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		br_currentconfig obj = new br_currentconfig();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br_currentconfig[] response = (br_currentconfig[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br_currentconfig resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br_currentconfig obj = new br_currentconfig();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br_currentconfig[] response = (br_currentconfig[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_currentconfig_response result = (br_currentconfig_response) service.get_payload_formatter().string_to_resource(br_currentconfig_response.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			if(result.severity != null)
			{
				if(result.severity.equals("ERROR"))
					throw new nitro_exception(result.message, result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message, result.errorcode);
			}
		}
		return result.br_currentconfig;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_currentconfig_responses result = (br_currentconfig_responses) service.get_payload_formatter().string_to_resource(br_currentconfig_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_currentconfig_response_array);
		}
		br_currentconfig[] result_br_currentconfig = new br_currentconfig[result.br_currentconfig_response_array.length];
		
		for(int i = 0; i < result.br_currentconfig_response_array.length; i++)
		{
			result_br_currentconfig[i] = result.br_currentconfig_response_array[i].br_currentconfig[0];
		}
		
		return result_br_currentconfig;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString response_validator = new MPSString();
		response_validator.validate(operationType, response, "\"response\"");
		
		MPSIPAddress br_ip_address_validator = new MPSIPAddress();
		br_ip_address_validator.validate(operationType, br_ip_address, "\"br_ip_address\"");
		
	}
}
