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


class syslog_params_response extends base_response
{
	public syslog_params[] syslog_params;
}

class syslog_params_responses extends base_response
{
	public syslog_params_response[] syslog_params_response_array;
}

/**
 * Configuration for Syslog Parameters resource
 */

public class syslog_params extends base_resource
{
	private String date_format;
	private String timezone;
	private String id;
	private Long __count;

	protected String get_object_type()
	{
		return "syslog_params";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return id;
	}

	/**
	 * <pre>
	 * Format of date to be added in the syslog message
	 * </pre>
	 */
	public void set_date_format(String date_format)
	{
		this.date_format = date_format;
	}

	/**
	 * <pre>
	 * Format of date to be added in the syslog message
	 * </pre>
	 */
	public String get_date_format()
	{
		return this.date_format;
	}

	/**
	 * <pre>
	 * Timezone to be used in the syslog message
	 * </pre>
	 */
	public void set_timezone(String timezone)
	{
		this.timezone = timezone;
	}

	/**
	 * <pre>
	 * Timezone to be used in the syslog message
	 * </pre>
	 */
	public String get_timezone()
	{
		return this.timezone;
	}

	/**
	 * <pre>
	 * Id is system generated key
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Use this operation to get the syslog parameters.
	 * </pre>
	 */
	public static syslog_params[] get(nitro_service client) throws Exception
	{
		syslog_params resource = new syslog_params();
		resource.validate("get");
		return (syslog_params[]) resource.get_resources(client);
	}

	/**
	 * <pre>
	 * Use this operation to modify the syslog parameters.
	 * </pre>
	 */
	public static syslog_params modify(nitro_service client, syslog_params resource) throws Exception
	{
		resource.validate("modify");
		return ((syslog_params[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify the syslog parameters in bulk.
	 * </pre>
	 */
	public static syslog_params[] modify(nitro_service client, syslog_params[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((syslog_params[]) resources[0].update_resource(client));
		
		return ((syslog_params[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of syslog_params resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static syslog_params[] get_filtered(nitro_service service, String filter) throws Exception
	{
		syslog_params obj = new syslog_params();
		options option = new options();
		option.set_filter(filter);
		syslog_params[] response = (syslog_params[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of syslog_params resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static syslog_params[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		syslog_params obj = new syslog_params();
		options option = new options();
		option.set_filter(filter);
		syslog_params[] response = (syslog_params[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the syslog_params resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		syslog_params obj = new syslog_params();
		options option = new options();
		option.set_count(true);
		syslog_params[] response = (syslog_params[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of syslog_params resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		syslog_params obj = new syslog_params();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		syslog_params[] response = (syslog_params[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of syslog_params resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		syslog_params obj = new syslog_params();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		syslog_params[] response = (syslog_params[])obj.get_resources(service, option);
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
		syslog_params_response result = (syslog_params_response) service.get_payload_formatter().string_to_resource(syslog_params_response.class, response);
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
		return result.syslog_params;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		syslog_params_responses result = (syslog_params_responses) service.get_payload_formatter().string_to_resource(syslog_params_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.syslog_params_response_array);
		}
		syslog_params[] result_syslog_params = new syslog_params[result.syslog_params_response_array.length];
		
		for(int i = 0; i < result.syslog_params_response_array.length; i++)
		{
			result_syslog_params[i] = result.syslog_params_response_array[i].syslog_params[0];
		}
		
		return result_syslog_params;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString id_validator = new MPSString();
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSString date_format_validator = new MPSString();
		date_format_validator.validate(operationType, date_format, "\"date_format\"");
		
		MPSString timezone_validator = new MPSString();
		timezone_validator.validate(operationType, timezone, "\"timezone\"");
		
	}
}
