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

class br_enable_response extends base_response
{
	public br_enable[] br_enable;
}

class br_enable_responses extends base_response
{
	public br_enable_response[] br_enable_response_array;
}

/**
 * Configuration for Enable Repeater Instance resource
 */

public class br_enable extends base_resource
{
	private String[] br_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "br_enable";
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
	 * Use this operation to enable Repeater Instances.
	 * </pre>
	 */
	public static br_enable enable(nitro_service client, br_enable resource) throws Exception
	{
		return ((br_enable[]) resource.perform_operation(client, "enable"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to enable Repeater Instances in bulk.
	 * </pre>
	 */
	public static br_enable[] enable(nitro_service client, br_enable[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((br_enable[]) resources[0].perform_operation(client, "enable"));
		
		return ((br_enable[]) perform_operation_bulk_request(client, resources, "enable"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_enable_response result = (br_enable_response) service.get_payload_formatter().string_to_resource(br_enable_response.class, response);
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
		return result.br_enable;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_enable_responses result = (br_enable_responses) service.get_payload_formatter().string_to_resource(br_enable_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_enable_response_array);
		}
		br_enable[] result_br_enable = new br_enable[result.br_enable_response_array.length];
		
		for(int i = 0; i < result.br_enable_response_array.length; i++)
		{
			result_br_enable[i] = result.br_enable_response_array[i].br_enable[0];
		}
		
		return result_br_enable;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

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
