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


class current_hostname_response extends base_response
{
	public current_hostname[] current_hostname;
}

class current_hostname_responses extends base_response
{
	public current_hostname_response[] current_hostname_response_array;
}

/**
 * Configuration for Current SVM Hostname resource
 */

public class current_hostname extends base_resource
{
	private String hostname;
	private Long __count;

	protected String get_object_type()
	{
		return "current_hostname";
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
	 * SVM Hostname
	 * </pre>
	 */
	public void set_hostname(String hostname)
	{
		this.hostname = hostname;
	}

	/**
	 * <pre>
	 * SVM Hostname
	 * </pre>
	 */
	public String get_hostname()
	{
		return this.hostname;
	}


	/**
	 * <pre>
	 * Use this operation to get the current hostname.
	 * </pre>
	 */
	public static current_hostname[] get(nitro_service client) throws Exception
	{
		current_hostname resource = new current_hostname();
		resource.validate("get");
		return (current_hostname[]) resource.get_resources(client);
	}

	/**
	 * <pre>
	 * Use this operation to modify current hostname.
	 * </pre>
	 */
	public static current_hostname modify(nitro_service client, current_hostname resource) throws Exception
	{
		resource.validate("modify");
		return ((current_hostname[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify current hostname in bulk.
	 * </pre>
	 */
	public static current_hostname[] modify(nitro_service client, current_hostname[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((current_hostname[]) resources[0].update_resource(client));
		
		return ((current_hostname[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of current_hostname resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static current_hostname[] get_filtered(nitro_service service, String filter) throws Exception
	{
		current_hostname obj = new current_hostname();
		options option = new options();
		option.set_filter(filter);
		current_hostname[] response = (current_hostname[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of current_hostname resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static current_hostname[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		current_hostname obj = new current_hostname();
		options option = new options();
		option.set_filter(filter);
		current_hostname[] response = (current_hostname[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the current_hostname resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		current_hostname obj = new current_hostname();
		options option = new options();
		option.set_count(true);
		current_hostname[] response = (current_hostname[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of current_hostname resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		current_hostname obj = new current_hostname();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		current_hostname[] response = (current_hostname[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of current_hostname resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		current_hostname obj = new current_hostname();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		current_hostname[] response = (current_hostname[])obj.get_resources(service, option);
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
		current_hostname_response result = (current_hostname_response) service.get_payload_formatter().string_to_resource(current_hostname_response.class, response);
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
		return result.current_hostname;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		current_hostname_responses result = (current_hostname_responses) service.get_payload_formatter().string_to_resource(current_hostname_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.current_hostname_response_array);
		}
		current_hostname[] result_current_hostname = new current_hostname[result.current_hostname_response_array.length];
		
		for(int i = 0; i < result.current_hostname_response_array.length; i++)
		{
			result_current_hostname[i] = result.current_hostname_response_array[i].current_hostname[0];
		}
		
		return result_current_hostname;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString hostname_validator = new MPSString();
		hostname_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		hostname_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		hostname_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		hostname_validator.validate(operationType, hostname, "\"hostname\"");
		
	}
}
