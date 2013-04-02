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

package com.citrix.sdx.nitro.resource.config.mps;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;


class timezone_enum_response extends base_response
{
	public timezone_enum[] timezone_enum;
}

class timezone_enum_responses extends base_response
{
	public timezone_enum_response[] timezone_enum_response_array;
}

/**
 * Configuration for Time zones resource
 */

public class timezone_enum extends base_resource
{
	private Integer enum_key;
	private String enum_value;
	private Long __count;

	protected String get_object_type()
	{
		return "timezone_enum";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return null;
	}


	/**
	 * <pre>
	 * Key
	 * </pre>
	 */
	public Integer get_enum_key()
	{
		return this.enum_key;
	}


	/**
	 * <pre>
	 * Value
	 * </pre>
	 */
	public String get_enum_value()
	{
		return this.enum_value;
	}


	/**
	 * <pre>
	 * Use this operation to get key value pair for Timezones.
	 * </pre>
	 */
	public static timezone_enum[] get(nitro_service client) throws Exception
	{
		timezone_enum resource = new timezone_enum();
		resource.validate("get");
		return (timezone_enum[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of timezone_enum resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static timezone_enum[] get_filtered(nitro_service service, String filter) throws Exception
	{
		timezone_enum obj = new timezone_enum();
		options option = new options();
		option.set_filter(filter);
		timezone_enum[] response = (timezone_enum[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of timezone_enum resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static timezone_enum[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		timezone_enum obj = new timezone_enum();
		options option = new options();
		option.set_filter(filter);
		timezone_enum[] response = (timezone_enum[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the timezone_enum resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		timezone_enum obj = new timezone_enum();
		options option = new options();
		option.set_count(true);
		timezone_enum[] response = (timezone_enum[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of timezone_enum resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		timezone_enum obj = new timezone_enum();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		timezone_enum[] response = (timezone_enum[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of timezone_enum resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		timezone_enum obj = new timezone_enum();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		timezone_enum[] response = (timezone_enum[])obj.get_resources(service, option);
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
		timezone_enum_response result = (timezone_enum_response) service.get_payload_formatter().string_to_resource(timezone_enum_response.class, response);
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
		return result.timezone_enum;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		timezone_enum_responses result = (timezone_enum_responses) service.get_payload_formatter().string_to_resource(timezone_enum_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.timezone_enum_response_array);
		}
		timezone_enum[] result_timezone_enum = new timezone_enum[result.timezone_enum_response_array.length];
		
		for(int i = 0; i < result.timezone_enum_response_array.length; i++)
		{
			result_timezone_enum[i] = result.timezone_enum_response_array[i].timezone_enum[0];
		}
		
		return result_timezone_enum;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt enum_key_validator = new MPSInt();
		enum_key_validator.validate(operationType, enum_key, "\"enum_key\"");
		
		MPSString enum_value_validator = new MPSString();
		enum_value_validator.validate(operationType, enum_value, "\"enum_value\"");
		
	}
}
