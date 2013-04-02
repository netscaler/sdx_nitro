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

class br_restoreconfig_response extends base_response
{
	public br_restoreconfig[] br_restoreconfig;
}

class br_restoreconfig_responses extends base_response
{
	public br_restoreconfig_response[] br_restoreconfig_response_array;
}

/**
 * Configuration for Restore configuration of Repeater Instance resource
 */

public class br_restoreconfig extends base_resource
{
	private String file_name;
	private String[] br_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "br_restoreconfig";
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
	 * Repeater Config File Name
	 * </pre>
	 */
	public void set_file_name(String file_name)
	{
		this.file_name = file_name;
	}

	/**
	 * <pre>
	 * Repeater Config File Name
	 * </pre>
	 */
	public String get_file_name()
	{
		return this.file_name;
	}

	/**
	 * <pre>
	 * List of Repeater IP Address
	 * </pre>
	 */
	public void set_br_ip_address_arr(String[] br_ip_address_arr)
	{
		this.br_ip_address_arr = br_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of Repeater IP Address
	 * </pre>
	 */
	public String[] get_br_ip_address_arr()
	{
		return this.br_ip_address_arr;
	}


	/**
	 * <pre>
	 * Use this operation to restore config from file on Repeater Instances.
	 * </pre>
	 */
	public static br_restoreconfig restoreconfig(nitro_service client, br_restoreconfig resource) throws Exception
	{
		return ((br_restoreconfig[]) resource.perform_operation(client, "restoreconfig"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to restore config from file on Repeater Instances in bulk.
	 * </pre>
	 */
	public static br_restoreconfig[] restoreconfig(nitro_service client, br_restoreconfig[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((br_restoreconfig[]) resources[0].perform_operation(client, "restoreconfig"));
		
		return ((br_restoreconfig[]) perform_operation_bulk_request(client, resources, "restoreconfig"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_restoreconfig_response result = (br_restoreconfig_response) service.get_payload_formatter().string_to_resource(br_restoreconfig_response.class, response);
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
		return result.br_restoreconfig;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_restoreconfig_responses result = (br_restoreconfig_responses) service.get_payload_formatter().string_to_resource(br_restoreconfig_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_restoreconfig_response_array);
		}
		br_restoreconfig[] result_br_restoreconfig = new br_restoreconfig[result.br_restoreconfig_response_array.length];
		
		for(int i = 0; i < result.br_restoreconfig_response_array.length; i++)
		{
			result_br_restoreconfig[i] = result.br_restoreconfig_response_array[i].br_restoreconfig[0];
		}
		
		return result_br_restoreconfig;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString file_name_validator = new MPSString();
		file_name_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		file_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		file_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		file_name_validator.validate(operationType, file_name, "\"file_name\"");
		
		MPSIPAddress br_ip_address_arr_validator = new MPSIPAddress();
		br_ip_address_arr_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		if(br_ip_address_arr != null)
		{
			for(int i=0; i<br_ip_address_arr.length; i++)
			{
				br_ip_address_arr_validator.validate(operationType, br_ip_address_arr[i], "br_ip_address_arr["+i+"]");
			}
		}
		
	}
}
