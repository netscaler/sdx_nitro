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


class smtp_server_response extends base_response
{
	public smtp_server[] smtp_server;
}

class smtp_server_responses extends base_response
{
	public smtp_server_response[] smtp_server_response_array;
}

/**
 * Configuration for SMTP server properties  resource
 */

public class smtp_server extends base_resource
{
	private String password;
	private Boolean is_auth;
	private String id;
	private Boolean is_ssl;
	private Integer port;
	private String username;
	private String server_name;
	private Long __count;

	protected String get_object_type()
	{
		return "smtp_server";
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
	 * Password for the smtp server
	 * </pre>
	 */
	public void set_password(String password)
	{
		this.password = password;
	}

	/**
	 * <pre>
	 * Password for the smtp server
	 * </pre>
	 */
	public String get_password()
	{
		return this.password;
	}

	/**
	 * <pre>
	 * Is authentication enabled for this smtp server
	 * </pre>
	 */
	public void set_is_auth(Boolean is_auth)
	{
		this.is_auth = is_auth;
	}

	/**
	 * <pre>
	 * Is authentication enabled for this smtp server
	 * </pre>
	 */
	public Boolean get_is_auth()
	{
		return this.is_auth;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the smtp server
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the smtp server
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * Is this smtp server is SSL support configured.
	 * </pre>
	 */
	public void set_is_ssl(Boolean is_ssl)
	{
		this.is_ssl = is_ssl;
	}

	/**
	 * <pre>
	 * Is this smtp server is SSL support configured.
	 * </pre>
	 */
	public Boolean get_is_ssl()
	{
		return this.is_ssl;
	}

	/**
	 * <pre>
	 * SMTP Server port address.
	 * </pre>
	 */
	public void set_port(Integer port)
	{
		this.port = port;
	}

	/**
	 * <pre>
	 * SMTP Server port address.
	 * </pre>
	 */
	public Integer get_port()
	{
		return this.port;
	}

	/**
	 * <pre>
	 * Username for the smtp server
	 * </pre>
	 */
	public void set_username(String username)
	{
		this.username = username;
	}

	/**
	 * <pre>
	 * Username for the smtp server
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}

	/**
	 * <pre>
	 * SMTP server name
	 * </pre>
	 */
	public void set_server_name(String server_name)
	{
		this.server_name = server_name;
	}

	/**
	 * <pre>
	 * SMTP server name
	 * </pre>
	 */
	public String get_server_name()
	{
		return this.server_name;
	}


	/**
	 * <pre>
	 * Use this operation to add smtp server.
	 * </pre>
	 */
	public static smtp_server add(nitro_service client, smtp_server resource) throws Exception
	{
		resource.validate("add");
		return ((smtp_server[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add smtp server in bulk.
	 * </pre>
	 */
	public static smtp_server[] add(nitro_service client, smtp_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((smtp_server[]) resources[0].perform_operation(client, "add"));
		
		return ((smtp_server[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete smtp server.
	 * </pre>
	 */
	public static smtp_server delete(nitro_service client, smtp_server resource) throws Exception
	{
		resource.validate("delete");
		return ((smtp_server[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete smtp server in bulk.
	 * </pre>
	 */
	public static smtp_server[] delete(nitro_service client, smtp_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((smtp_server[]) resources[0].delete_resource(client));
		
		return ((smtp_server[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get smtp server details..
	 * </pre>
	 */
	public static smtp_server[] get(nitro_service client) throws Exception
	{
		smtp_server resource = new smtp_server();
		resource.validate("get");
		return (smtp_server[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get smtp server details..
	 */
	public static smtp_server get(nitro_service client, smtp_server resource) throws Exception
	{
		resource.validate("get");
		return ((smtp_server[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get smtp server details. in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify smtp server.
	 * </pre>
	 */
	public static smtp_server update(nitro_service client, smtp_server resource) throws Exception
	{
		resource.validate("modify");
		return ((smtp_server[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify smtp server in bulk.
	 * </pre>
	 */
	public static smtp_server[] update(nitro_service client, smtp_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((smtp_server[]) resources[0].update_resource(client));
		
		return ((smtp_server[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of smtp_server resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static smtp_server[] get_filtered(nitro_service service, String filter) throws Exception
	{
		smtp_server obj = new smtp_server();
		options option = new options();
		option.set_filter(filter);
		smtp_server[] response = (smtp_server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of smtp_server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static smtp_server[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		smtp_server obj = new smtp_server();
		options option = new options();
		option.set_filter(filter);
		smtp_server[] response = (smtp_server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the smtp_server resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		smtp_server obj = new smtp_server();
		options option = new options();
		option.set_count(true);
		smtp_server[] response = (smtp_server[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of smtp_server resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		smtp_server obj = new smtp_server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		smtp_server[] response = (smtp_server[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of smtp_server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		smtp_server obj = new smtp_server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		smtp_server[] response = (smtp_server[])obj.get_resources(service, option);
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
		smtp_server_response result = (smtp_server_response) service.get_payload_formatter().string_to_resource(smtp_server_response.class, response);
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
		return result.smtp_server;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		smtp_server_responses result = (smtp_server_responses) service.get_payload_formatter().string_to_resource(smtp_server_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.smtp_server_response_array);
		}
		smtp_server[] result_smtp_server = new smtp_server[result.smtp_server_response_array.length];
		
		for(int i = 0; i < result.smtp_server_response_array.length; i++)
		{
			result_smtp_server[i] = result.smtp_server_response_array[i].smtp_server[0];
		}
		
		return result_smtp_server;
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
		
		MPSInternetHost server_name_validator = new MPSInternetHost();
		server_name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		server_name_validator.validate(operationType, server_name, "\"server_name\"");
		
		MPSInt port_validator = new MPSInt();
		port_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 1);
		port_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 65534);
		port_validator.validate(operationType, port, "\"port\"");
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSBoolean is_auth_validator = new MPSBoolean();
		is_auth_validator.validate(operationType, is_auth, "\"is_auth\"");
		
		MPSBoolean is_ssl_validator = new MPSBoolean();
		is_ssl_validator.validate(operationType, is_ssl, "\"is_ssl\"");
		
	}
}
