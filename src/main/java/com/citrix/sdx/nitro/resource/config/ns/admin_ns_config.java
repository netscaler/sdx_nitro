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


class admin_ns_config_response extends base_response
{
	public admin_ns_config[] admin_ns_config;
}

class admin_ns_config_responses extends base_response
{
	public admin_ns_config_response[] admin_ns_config_response_array;
}

/**
 * Configuration for Admin configuration on NetScaler resource
 */

public class admin_ns_config extends base_resource
{
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "admin_ns_config";
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
	 * NetScaler IP Address
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NetScaler IP Address
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}


	/**
	 * <pre>
	 * Use this operation to apply admin configuration on NetScaler Instance.
	 * </pre>
	 */
	public static admin_ns_config modify(nitro_service client, admin_ns_config resource) throws Exception
	{
		resource.validate("modify");
		return ((admin_ns_config[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to apply admin configuration on NetScaler Instance in bulk.
	 * </pre>
	 */
	public static admin_ns_config[] modify(nitro_service client, admin_ns_config[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((admin_ns_config[]) resources[0].update_resource(client));
		
		return ((admin_ns_config[]) update_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		admin_ns_config_response result = (admin_ns_config_response) service.get_payload_formatter().string_to_resource(admin_ns_config_response.class, response);
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
		return result.admin_ns_config;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		admin_ns_config_responses result = (admin_ns_config_responses) service.get_payload_formatter().string_to_resource(admin_ns_config_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.admin_ns_config_response_array);
		}
		admin_ns_config[] result_admin_ns_config = new admin_ns_config[result.admin_ns_config_response_array.length];
		
		for(int i = 0; i < result.admin_ns_config_response_array.length; i++)
		{
			result_admin_ns_config[i] = result.admin_ns_config_response_array[i].admin_ns_config[0];
		}
		
		return result_admin_ns_config;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
	}
}
