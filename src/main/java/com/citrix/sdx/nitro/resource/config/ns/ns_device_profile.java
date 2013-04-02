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

package com.citrix.sdx.nitro.resource.config.ns;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

import com.citrix.sdx.nitro.resource.config.mps.*;

class ns_device_profile_response extends base_response
{
	public ns_device_profile[] ns_device_profile;
}

class ns_device_profile_responses extends base_response
{
	public ns_device_profile_response[] ns_device_profile_response_array;
}

/**
 * Configuration for ns_device_profile resource
 */

public class ns_device_profile extends device_profile
{
	private Long __count;

	protected String get_object_type()
	{
		return "ns_device_profile";
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
	 * Use this operation to add device profile.
	 * </pre>
	 */
	public static ns_device_profile add(nitro_service client, ns_device_profile resource) throws Exception
	{
		resource.validate("add");
		return ((ns_device_profile[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add device profile in bulk.
	 * </pre>
	 */
	public static ns_device_profile[] add(nitro_service client, ns_device_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_device_profile[]) resources[0].perform_operation(client, "add"));
		
		return ((ns_device_profile[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete device profile(s).
	 * </pre>
	 */
	public static ns_device_profile delete(nitro_service client, ns_device_profile resource) throws Exception
	{
		resource.validate("delete");
		return ((ns_device_profile[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete device profile(s) in bulk.
	 * </pre>
	 */
	public static ns_device_profile[] delete(nitro_service client, ns_device_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((ns_device_profile[]) resources[0].delete_resource(client));
		
		return ((ns_device_profile[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get device profiles.
	 * </pre>
	 */
	public static ns_device_profile[] get(nitro_service client) throws Exception
	{
		ns_device_profile resource = new ns_device_profile();
		resource.validate("get");
		return (ns_device_profile[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of ns_device_profile resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_device_profile[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_device_profile obj = new ns_device_profile();
		options option = new options();
		option.set_filter(filter);
		ns_device_profile[] response = (ns_device_profile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_device_profile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_device_profile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_device_profile obj = new ns_device_profile();
		options option = new options();
		option.set_filter(filter);
		ns_device_profile[] response = (ns_device_profile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_device_profile resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_device_profile obj = new ns_device_profile();
		options option = new options();
		option.set_count(true);
		ns_device_profile[] response = (ns_device_profile[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_device_profile resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_device_profile obj = new ns_device_profile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_device_profile[] response = (ns_device_profile[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_device_profile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_device_profile obj = new ns_device_profile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_device_profile[] response = (ns_device_profile[])obj.get_resources(service, option);
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
		ns_device_profile_response result = (ns_device_profile_response) service.get_payload_formatter().string_to_resource(ns_device_profile_response.class, response);
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
		return result.ns_device_profile;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_device_profile_responses result = (ns_device_profile_responses) service.get_payload_formatter().string_to_resource(ns_device_profile_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_device_profile_response_array);
		}
		ns_device_profile[] result_ns_device_profile = new ns_device_profile[result.ns_device_profile_response_array.length];
		
		for(int i = 0; i < result.ns_device_profile_response_array.length; i++)
		{
			result_ns_device_profile[i] = result.ns_device_profile_response_array[i].ns_device_profile[0];
		}
		
		return result_ns_device_profile;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

	}
}
