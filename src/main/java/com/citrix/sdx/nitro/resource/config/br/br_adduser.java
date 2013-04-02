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

class br_adduser_response extends base_response
{
	public br_adduser[] br_adduser;
}

class br_adduser_responses extends base_response
{
	public br_adduser_response[] br_adduser_response_array;
}

/**
 * Configuration for Repeater User resource
 */

public class br_adduser extends base_resource
{
	private String password;
	private String name;
	private String privilege;
	private String[] br_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "br_adduser";
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
	 * Password
	 * </pre>
	 */
	public void set_password(String password)
	{
		this.password = password;
	}

	/**
	 * <pre>
	 * Password
	 * </pre>
	 */
	public String get_password()
	{
		return this.password;
	}

	/**
	 * <pre>
	 * Username
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Username
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Privilege
	 * </pre>
	 */
	public void set_privilege(String privilege)
	{
		this.privilege = privilege;
	}

	/**
	 * <pre>
	 * Privilege
	 * </pre>
	 */
	public String get_privilege()
	{
		return this.privilege;
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
	 * Use this operation to add user and assign privilege on Repeater Instances.
	 * </pre>
	 */
	public static br_adduser adduser(nitro_service client, br_adduser resource) throws Exception
	{
		return ((br_adduser[]) resource.perform_operation(client, "adduser"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add user and assign privilege on Repeater Instances in bulk.
	 * </pre>
	 */
	public static br_adduser[] adduser(nitro_service client, br_adduser[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((br_adduser[]) resources[0].perform_operation(client, "adduser"));
		
		return ((br_adduser[]) perform_operation_bulk_request(client, resources, "adduser"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_adduser_response result = (br_adduser_response) service.get_payload_formatter().string_to_resource(br_adduser_response.class, response);
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
		return result.br_adduser;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_adduser_responses result = (br_adduser_responses) service.get_payload_formatter().string_to_resource(br_adduser_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_adduser_response_array);
		}
		br_adduser[] result_br_adduser = new br_adduser[result.br_adduser_response_array.length];
		
		for(int i = 0; i < result.br_adduser_response_array.length; i++)
		{
			result_br_adduser[i] = result.br_adduser_response_array[i].br_adduser[0];
		}
		
		return result_br_adduser;
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
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSString privilege_validator = new MPSString();
		privilege_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		privilege_validator.validate(operationType, privilege, "\"privilege\"");
		
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
