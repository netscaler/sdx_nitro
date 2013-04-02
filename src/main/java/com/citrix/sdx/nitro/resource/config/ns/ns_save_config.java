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


class ns_save_config_response extends base_response
{
	public ns_save_config[] ns_save_config;
}

class ns_save_config_responses extends base_response
{
	public ns_save_config_response[] ns_save_config_response_array;
}

/**
 * Configuration for Save configuration on NetScaler resource
 */

public class ns_save_config extends base_resource
{
	private String[] ns_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_save_config";
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
	 * List of NS IP Address
	 * </pre>
	 */
	public void set_ns_ip_address_arr(String[] ns_ip_address_arr)
	{
		this.ns_ip_address_arr = ns_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of NS IP Address
	 * </pre>
	 */
	public String[] get_ns_ip_address_arr()
	{
		return this.ns_ip_address_arr;
	}


	/**
	 * <pre>
	 * Use this operation to save configuration on NS Instance(s).
	 * </pre>
	 */
	public static ns_save_config add(nitro_service client, ns_save_config resource) throws Exception
	{
		resource.validate("add");
		return ((ns_save_config[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to save configuration on NS Instance(s) in bulk.
	 * </pre>
	 */
	public static ns_save_config[] add(nitro_service client, ns_save_config[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_save_config[]) resources[0].perform_operation(client, "add"));
		
		return ((ns_save_config[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		ns_save_config_response result = (ns_save_config_response) service.get_payload_formatter().string_to_resource(ns_save_config_response.class, response);
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
		return result.ns_save_config;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_save_config_responses result = (ns_save_config_responses) service.get_payload_formatter().string_to_resource(ns_save_config_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_save_config_response_array);
		}
		ns_save_config[] result_ns_save_config = new ns_save_config[result.ns_save_config_response_array.length];
		
		for(int i = 0; i < result.ns_save_config_response_array.length; i++)
		{
			result_ns_save_config[i] = result.ns_save_config_response_array[i].ns_save_config[0];
		}
		
		return result_ns_save_config;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress ns_ip_address_arr_validator = new MPSIPAddress();
		ns_ip_address_arr_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		if(ns_ip_address_arr != null)
		{
			for(int i=0; i<ns_ip_address_arr.length; i++)
			{
				ns_ip_address_arr_validator.validate(operationType, ns_ip_address_arr[i], "ns_ip_address_arr["+i+"]");
			}
		}
		
	}
}
