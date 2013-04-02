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

package com.citrix.sdx.nitro.resource.base;

import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;


class login_response extends base_response
{
	public login[] login;
}

class login_responses extends base_response
{
	public login_response[] login_response_array;
}

/**
 * Configuration for Login/Logout resource
 */

public class login extends base_resource
{
	private String password;
	private Integer session_timeout;
	private String sessionid;
	private String username;
	private Long __count;

	protected String get_object_type()
	{
		return "login";
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
	 * Session Timeout in seconds, if no activity is performed for specified time then session will be expired
	 * </pre>
	 */
	public void set_session_timeout(Integer session_timeout)
	{
		this.session_timeout = session_timeout;
	}

	/**
	 * <pre>
	 * Session Timeout in seconds, if no activity is performed for specified time then session will be expired
	 * </pre>
	 */
	public Integer get_session_timeout()
	{
		return this.session_timeout;
	}

	/**
	 * <pre>
	 * Session ID would only be set if login was performed successfully
	 * </pre>
	 */
	public void set_sessionid(String sessionid)
	{
		this.sessionid = sessionid;
	}

	/**
	 * <pre>
	 * Session ID would only be set if login was performed successfully
	 * </pre>
	 */
	public String get_sessionid()
	{
		return this.sessionid;
	}

	/**
	 * <pre>
	 * User Name that wants to login
	 * </pre>
	 */
	public void set_username(String username)
	{
		this.username = username;
	}

	/**
	 * <pre>
	 * User Name that wants to login
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}


	/**
	 * <pre>
	 * Login.
	 * </pre>
	 */
	public static login add(nitro_service client, login resource) throws Exception
	{
		resource.validate("add");
		return ((login[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Login in bulk.
	 * </pre>
	 */
	public static login[] add(nitro_service client, login[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((login[]) resources[0].perform_operation(client, "add"));
		
		return ((login[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Logout.
	 * </pre>
	 */
	public static login delete(nitro_service client, login resource) throws Exception
	{
		resource.validate("delete");
		return ((login[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Logout in bulk.
	 * </pre>
	 */
	public static login[] delete(nitro_service client, login[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((login[]) resources[0].delete_resource(client));
		
		return ((login[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		login_response result = (login_response) service.get_payload_formatter().string_to_resource(login_response.class, response);
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
		return result.login;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		login_responses result = (login_responses) service.get_payload_formatter().string_to_resource(login_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.login_response_array);
		}
		login[] result_login = new login[result.login_response_array.length];
		
		for(int i = 0; i < result.login_response_array.length; i++)
		{
			result_login[i] = result.login_response_array[i].login[0];
		}
		
		return result_login;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString sessionid_validator = new MPSString();
		sessionid_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		sessionid_validator.validate(operationType, sessionid, "\"sessionid\"");
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		username_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		username_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		password_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSInt session_timeout_validator = new MPSInt();
		session_timeout_validator.validate(operationType, session_timeout, "\"session_timeout\"");
		
	}
}
