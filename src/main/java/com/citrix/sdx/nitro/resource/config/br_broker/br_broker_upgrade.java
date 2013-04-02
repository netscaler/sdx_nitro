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

package com.citrix.sdx.nitro.resource.config.br_broker;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class br_broker_upgrade_response extends base_response
{
	public br_broker_upgrade[] br_broker_upgrade;
}

class br_broker_upgrade_responses extends base_response
{
	public br_broker_upgrade_response[] br_broker_upgrade_response_array;
}

/**
 * Configuration for Upgrade Unified Repeater Instance resource
 */

public class br_broker_upgrade extends base_resource
{
	private String image_name;
	private String[] br_broker_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "br_broker_upgrade";
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
	 * Unified Repeater Image Name
	 * </pre>
	 */
	public void set_image_name(String image_name)
	{
		this.image_name = image_name;
	}

	/**
	 * <pre>
	 * Unified Repeater Image Name
	 * </pre>
	 */
	public String get_image_name()
	{
		return this.image_name;
	}

	/**
	 * <pre>
	 * List of Unified Repeater IP Address
	 * </pre>
	 */
	public void set_br_broker_ip_address_arr(String[] br_broker_ip_address_arr)
	{
		this.br_broker_ip_address_arr = br_broker_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of Unified Repeater IP Address
	 * </pre>
	 */
	public String[] get_br_broker_ip_address_arr()
	{
		return this.br_broker_ip_address_arr;
	}


	/**
	 * <pre>
	 * Use this operation to upgrade Unified Repeater Instances.
	 * </pre>
	 */
	public static br_broker_upgrade upgrade(nitro_service client, br_broker_upgrade resource) throws Exception
	{
		return ((br_broker_upgrade[]) resource.perform_operation(client, "upgrade"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to upgrade Unified Repeater Instances in bulk.
	 * </pre>
	 */
	public static br_broker_upgrade[] upgrade(nitro_service client, br_broker_upgrade[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((br_broker_upgrade[]) resources[0].perform_operation(client, "upgrade"));
		
		return ((br_broker_upgrade[]) perform_operation_bulk_request(client, resources, "upgrade"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_broker_upgrade_response result = (br_broker_upgrade_response) service.get_payload_formatter().string_to_resource(br_broker_upgrade_response.class, response);
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
		return result.br_broker_upgrade;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_broker_upgrade_responses result = (br_broker_upgrade_responses) service.get_payload_formatter().string_to_resource(br_broker_upgrade_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_broker_upgrade_response_array);
		}
		br_broker_upgrade[] result_br_broker_upgrade = new br_broker_upgrade[result.br_broker_upgrade_response_array.length];
		
		for(int i = 0; i < result.br_broker_upgrade_response_array.length; i++)
		{
			result_br_broker_upgrade[i] = result.br_broker_upgrade_response_array[i].br_broker_upgrade[0];
		}
		
		return result_br_broker_upgrade;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString image_name_validator = new MPSString();
		image_name_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		image_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		image_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		image_name_validator.validate(operationType, image_name, "\"image_name\"");
		
		MPSIPAddress br_broker_ip_address_arr_validator = new MPSIPAddress();
		br_broker_ip_address_arr_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		if(br_broker_ip_address_arr != null)
		{
			for(int i=0; i<br_broker_ip_address_arr.length; i++)
			{
				br_broker_ip_address_arr_validator.validate(operationType, br_broker_ip_address_arr[i], "br_broker_ip_address_arr["+i+"]");
			}
		}
		
	}
}
