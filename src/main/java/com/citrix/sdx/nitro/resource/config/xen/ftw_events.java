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

package com.citrix.sdx.nitro.resource.config.xen;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class ftw_events_response extends base_response
{
	public ftw_events[] ftw_events;
}

class ftw_events_responses extends base_response
{
	public ftw_events_response[] ftw_events_response_array;
}

/**
 * Configuration for FTW Events resource
 */

public class ftw_events extends base_resource
{
	private String response;
	private Long __count;

	protected String get_object_type()
	{
		return "ftw_events";
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
	 * Response
	 * </pre>
	 */
	public String get_response()
	{
		return this.response;
	}


	/**
	 * <pre>
	 * Use this operation to get FTW events.
	 * </pre>
	 */
	public static ftw_events[] get(nitro_service client) throws Exception
	{
		ftw_events resource = new ftw_events();
		resource.validate("get");
		return (ftw_events[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of ftw_events resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ftw_events[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ftw_events obj = new ftw_events();
		options option = new options();
		option.set_filter(filter);
		ftw_events[] response = (ftw_events[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ftw_events resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ftw_events[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ftw_events obj = new ftw_events();
		options option = new options();
		option.set_filter(filter);
		ftw_events[] response = (ftw_events[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ftw_events resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ftw_events obj = new ftw_events();
		options option = new options();
		option.set_count(true);
		ftw_events[] response = (ftw_events[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ftw_events resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ftw_events obj = new ftw_events();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ftw_events[] response = (ftw_events[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ftw_events resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ftw_events obj = new ftw_events();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ftw_events[] response = (ftw_events[])obj.get_resources(service, option);
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
		ftw_events_response result = (ftw_events_response) service.get_payload_formatter().string_to_resource(ftw_events_response.class, response);
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
		return result.ftw_events;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ftw_events_responses result = (ftw_events_responses) service.get_payload_formatter().string_to_resource(ftw_events_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ftw_events_response_array);
		}
		ftw_events[] result_ftw_events = new ftw_events[result.ftw_events_response_array.length];
		
		for(int i = 0; i < result.ftw_events_response_array.length; i++)
		{
			result_ftw_events[i] = result.ftw_events_response_array[i].ftw_events[0];
		}
		
		return result_ftw_events;
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
		
	}
}
