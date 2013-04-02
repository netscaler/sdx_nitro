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

class br_configurealert_response extends base_response
{
	public br_configurealert[] br_configurealert;
}

class br_configurealert_responses extends base_response
{
	public br_configurealert_response[] br_configurealert_response_array;
}

/**
 * Configuration for Configure Alert Settings resource
 */

public class br_configurealert extends base_resource
{
	private String level;
	private String name;
	private String[] br_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "br_configurealert";
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
	 * Alert Level
	 * </pre>
	 */
	public void set_level(String level)
	{
		this.level = level;
	}

	/**
	 * <pre>
	 * Alert Level
	 * </pre>
	 */
	public String get_level()
	{
		return this.level;
	}

	/**
	 * <pre>
	 * Alert name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Alert name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * List of BR IP Address
	 * </pre>
	 */
	public void set_br_ip_address_arr(String[] br_ip_address_arr)
	{
		this.br_ip_address_arr = br_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of BR IP Address
	 * </pre>
	 */
	public String[] get_br_ip_address_arr()
	{
		return this.br_ip_address_arr;
	}


	/**
	 * <pre>
	 * Use this operation to configure alerts on Repeater Instances.
	 * </pre>
	 */
	public static br_configurealert configurealert(nitro_service client, br_configurealert resource) throws Exception
	{
		return ((br_configurealert[]) resource.perform_operation(client, "configurealert"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to configure alerts on Repeater Instances in bulk.
	 * </pre>
	 */
	public static br_configurealert[] configurealert(nitro_service client, br_configurealert[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((br_configurealert[]) resources[0].perform_operation(client, "configurealert"));
		
		return ((br_configurealert[]) perform_operation_bulk_request(client, resources, "configurealert"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_configurealert_response result = (br_configurealert_response) service.get_payload_formatter().string_to_resource(br_configurealert_response.class, response);
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
		return result.br_configurealert;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_configurealert_responses result = (br_configurealert_responses) service.get_payload_formatter().string_to_resource(br_configurealert_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_configurealert_response_array);
		}
		br_configurealert[] result_br_configurealert = new br_configurealert[result.br_configurealert_response_array.length];
		
		for(int i = 0; i < result.br_configurealert_response_array.length; i++)
		{
			result_br_configurealert[i] = result.br_configurealert_response_array[i].br_configurealert[0];
		}
		
		return result_br_configurealert;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString name_validator = new MPSString();
		name_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSString level_validator = new MPSString();
		level_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		level_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		level_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		level_validator.validate(operationType, level, "\"level\"");
		
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
