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


class mpsuser_response extends base_response
{
	public mpsuser[] mpsuser;
}

class mpsuser_responses extends base_response
{
	public mpsuser_response[] mpsuser_response_array;
}

/**
 * Configuration for System User resource
 */

public class mpsuser extends base_resource
{
	private String password;
	private String permission;
	private String name;
	private String id;
	private Long __count;

	protected String get_object_type()
	{
		return "mpsuser";
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
	 * Actions that this user is authorized to perform
	 * </pre>
	 */
	public void set_permission(String permission)
	{
		this.permission = permission;
	}

	/**
	 * <pre>
	 * Actions that this user is authorized to perform
	 * </pre>
	 */
	public String get_permission()
	{
		return this.permission;
	}

	/**
	 * <pre>
	 * User Name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * User Name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the system users
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the system users
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Use this operation to add system user.
	 * </pre>
	 */
	public static mpsuser add(nitro_service client, mpsuser resource) throws Exception
	{
		resource.validate("add");
		return ((mpsuser[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add system user in bulk.
	 * </pre>
	 */
	public static mpsuser[] add(nitro_service client, mpsuser[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((mpsuser[]) resources[0].perform_operation(client, "add"));
		
		return ((mpsuser[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete system user(s).
	 * </pre>
	 */
	public static mpsuser delete(nitro_service client, mpsuser resource) throws Exception
	{
		resource.validate("delete");
		return ((mpsuser[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete system user(s) in bulk.
	 * </pre>
	 */
	public static mpsuser[] delete(nitro_service client, mpsuser[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((mpsuser[]) resources[0].delete_resource(client));
		
		return ((mpsuser[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get system users.
	 * </pre>
	 */
	public static mpsuser[] get(nitro_service client) throws Exception
	{
		mpsuser resource = new mpsuser();
		resource.validate("get");
		return (mpsuser[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get system users.
	 */
	public static mpsuser get(nitro_service client, mpsuser resource) throws Exception
	{
		resource.validate("get");
		return ((mpsuser[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get system users in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify system user.
	 * </pre>
	 */
	public static mpsuser update(nitro_service client, mpsuser resource) throws Exception
	{
		resource.validate("modify");
		return ((mpsuser[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify system user in bulk.
	 * </pre>
	 */
	public static mpsuser[] update(nitro_service client, mpsuser[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((mpsuser[]) resources[0].update_resource(client));
		
		return ((mpsuser[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of mpsuser resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static mpsuser[] get_filtered(nitro_service service, String filter) throws Exception
	{
		mpsuser obj = new mpsuser();
		options option = new options();
		option.set_filter(filter);
		mpsuser[] response = (mpsuser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of mpsuser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static mpsuser[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mpsuser obj = new mpsuser();
		options option = new options();
		option.set_filter(filter);
		mpsuser[] response = (mpsuser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the mpsuser resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		mpsuser obj = new mpsuser();
		options option = new options();
		option.set_count(true);
		mpsuser[] response = (mpsuser[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mpsuser resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		mpsuser obj = new mpsuser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mpsuser[] response = (mpsuser[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mpsuser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mpsuser obj = new mpsuser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mpsuser[] response = (mpsuser[])obj.get_resources(service, option);
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
		mpsuser_response result = (mpsuser_response) service.get_payload_formatter().string_to_resource(mpsuser_response.class, response);
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
		return result.mpsuser;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		mpsuser_responses result = (mpsuser_responses) service.get_payload_formatter().string_to_resource(mpsuser_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.mpsuser_response_array);
		}
		mpsuser[] result_mpsuser = new mpsuser[result.mpsuser_response_array.length];
		
		for(int i = 0; i < result.mpsuser_response_array.length; i++)
		{
			result_mpsuser[i] = result.mpsuser_response_array[i].mpsuser[0];
		}
		
		return result_mpsuser;
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
		id_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		id_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSString name_validator = new MPSString();
		name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[^:]+");
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		password_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSString permission_validator = new MPSString();
		permission_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		permission_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		permission_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		permission_validator.validate(operationType, permission, "\"permission\"");
		
	}
}
