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


class current_timezone_response extends base_response
{
	public current_timezone[] current_timezone;
}

class current_timezone_responses extends base_response
{
	public current_timezone_response[] current_timezone_response_array;
}

/**
 * Configuration for Current timezone resource
 */

public class current_timezone extends base_resource
{
	private String timezone;
	private Long __count;

	protected String get_object_type()
	{
		return "current_timezone";
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
	 * Timezone
	 * </pre>
	 */
	public void set_timezone(String timezone)
	{
		this.timezone = timezone;
	}

	/**
	 * <pre>
	 * Timezone
	 * </pre>
	 */
	public String get_timezone()
	{
		return this.timezone;
	}


	/**
	 * Use this operation to get the current time zone.
	 */
	public static current_timezone get(nitro_service client) throws Exception
	{
		current_timezone resource = new current_timezone();
		resource.validate("get");
		return ((current_timezone[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify current time zone.
	 * </pre>
	 */
	public static current_timezone update(nitro_service client, current_timezone resource) throws Exception
	{
		resource.validate("modify");
		return ((current_timezone[]) resource.update_resource(client))[0];
	}

	/**
	* Use this API to fetch filtered set of current_timezone resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static current_timezone[] get_filtered(nitro_service service, String filter) throws Exception
	{
		current_timezone obj = new current_timezone();
		options option = new options();
		option.set_filter(filter);
		current_timezone[] response = (current_timezone[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of current_timezone resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static current_timezone[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		current_timezone obj = new current_timezone();
		options option = new options();
		option.set_filter(filter);
		current_timezone[] response = (current_timezone[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the current_timezone resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		current_timezone obj = new current_timezone();
		options option = new options();
		option.set_count(true);
		current_timezone[] response = (current_timezone[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of current_timezone resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		current_timezone obj = new current_timezone();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		current_timezone[] response = (current_timezone[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of current_timezone resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		current_timezone obj = new current_timezone();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		current_timezone[] response = (current_timezone[])obj.get_resources(service, option);
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
		current_timezone_response result = (current_timezone_response) service.get_payload_formatter().string_to_resource(current_timezone_response.class, response);
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
		return result.current_timezone;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		current_timezone_responses result = (current_timezone_responses) service.get_payload_formatter().string_to_resource(current_timezone_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.current_timezone_response_array);
		}
		current_timezone[] result_current_timezone = new current_timezone[result.current_timezone_response_array.length];
		
		for(int i = 0; i < result.current_timezone_response_array.length; i++)
		{
			result_current_timezone[i] = result.current_timezone_response_array[i].current_timezone[0];
		}
		
		return result_current_timezone;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString timezone_validator = new MPSString();
		timezone_validator.validate(operationType, timezone, "\"timezone\"");
		
	}
}
