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


class sms_server_response extends base_response
{
	public sms_server[] sms_server;
}

class sms_server_responses extends base_response
{
	public sms_server_response[] sms_server_response_array;
}

/**
 * Configuration for SMS server properties  resource
 */

public class sms_server extends base_resource
{
	private String optional3_val;
	private String base_url;
	private String optional2_val1;
	private String optional1_val;
	private String to_seperater;
	private String username_key;
	private String optional2_key;
	private String username_val;
	private String to_key;
	private String message_key;
	private String optional1_key;
	private String message_word_sperater;
	private String optional3_key;
	private String type;
	private String id;
	private Boolean is_ssl;
	private String password_val;
	private String server_name;
	private String password_key;
	private Long __count;

	protected String get_object_type()
	{
		return "sms_server";
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
	 * Optional3 Val for the sms server
	 * </pre>
	 */
	public void set_optional3_val(String optional3_val)
	{
		this.optional3_val = optional3_val;
	}

	/**
	 * <pre>
	 * Optional3 Val for the sms server
	 * </pre>
	 */
	public String get_optional3_val()
	{
		return this.optional3_val;
	}

	/**
	 * <pre>
	 * Base URL for the sms server, without payload
	 * </pre>
	 */
	public void set_base_url(String base_url)
	{
		this.base_url = base_url;
	}

	/**
	 * <pre>
	 * Base URL for the sms server, without payload
	 * </pre>
	 */
	public String get_base_url()
	{
		return this.base_url;
	}

	/**
	 * <pre>
	 * Optional2 Val for the sms server
	 * </pre>
	 */
	public void set_optional2_val1(String optional2_val1)
	{
		this.optional2_val1 = optional2_val1;
	}

	/**
	 * <pre>
	 * Optional2 Val for the sms server
	 * </pre>
	 */
	public String get_optional2_val1()
	{
		return this.optional2_val1;
	}

	/**
	 * <pre>
	 * Optional1 Val for the sms server
	 * </pre>
	 */
	public void set_optional1_val(String optional1_val)
	{
		this.optional1_val = optional1_val;
	}

	/**
	 * <pre>
	 * Optional1 Val for the sms server
	 * </pre>
	 */
	public String get_optional1_val()
	{
		return this.optional1_val;
	}

	/**
	 * <pre>
	 * To list seperater for the sms server
	 * </pre>
	 */
	public void set_to_seperater(String to_seperater)
	{
		this.to_seperater = to_seperater;
	}

	/**
	 * <pre>
	 * To list seperater for the sms server
	 * </pre>
	 */
	public String get_to_seperater()
	{
		return this.to_seperater;
	}

	/**
	 * <pre>
	 * Username key for the sms server
	 * </pre>
	 */
	public void set_username_key(String username_key)
	{
		this.username_key = username_key;
	}

	/**
	 * <pre>
	 * Username key for the sms server
	 * </pre>
	 */
	public String get_username_key()
	{
		return this.username_key;
	}

	/**
	 * <pre>
	 * Optional2 key for the sms server
	 * </pre>
	 */
	public void set_optional2_key(String optional2_key)
	{
		this.optional2_key = optional2_key;
	}

	/**
	 * <pre>
	 * Optional2 key for the sms server
	 * </pre>
	 */
	public String get_optional2_key()
	{
		return this.optional2_key;
	}

	/**
	 * <pre>
	 * Username val for the sms server
	 * </pre>
	 */
	public void set_username_val(String username_val)
	{
		this.username_val = username_val;
	}

	/**
	 * <pre>
	 * Username val for the sms server
	 * </pre>
	 */
	public String get_username_val()
	{
		return this.username_val;
	}

	/**
	 * <pre>
	 * To key for the sms server
	 * </pre>
	 */
	public void set_to_key(String to_key)
	{
		this.to_key = to_key;
	}

	/**
	 * <pre>
	 * To key for the sms server
	 * </pre>
	 */
	public String get_to_key()
	{
		return this.to_key;
	}

	/**
	 * <pre>
	 * Message key for the sms server
	 * </pre>
	 */
	public void set_message_key(String message_key)
	{
		this.message_key = message_key;
	}

	/**
	 * <pre>
	 * Message key for the sms server
	 * </pre>
	 */
	public String get_message_key()
	{
		return this.message_key;
	}

	/**
	 * <pre>
	 * Optional1 key for the sms server
	 * </pre>
	 */
	public void set_optional1_key(String optional1_key)
	{
		this.optional1_key = optional1_key;
	}

	/**
	 * <pre>
	 * Optional1 key for the sms server
	 * </pre>
	 */
	public String get_optional1_key()
	{
		return this.optional1_key;
	}

	/**
	 * <pre>
	 * Message Word Seperater for the sms server
	 * </pre>
	 */
	public void set_message_word_sperater(String message_word_sperater)
	{
		this.message_word_sperater = message_word_sperater;
	}

	/**
	 * <pre>
	 * Message Word Seperater for the sms server
	 * </pre>
	 */
	public String get_message_word_sperater()
	{
		return this.message_word_sperater;
	}

	/**
	 * <pre>
	 * Optional3 key for the sms server
	 * </pre>
	 */
	public void set_optional3_key(String optional3_key)
	{
		this.optional3_key = optional3_key;
	}

	/**
	 * <pre>
	 * Optional3 key for the sms server
	 * </pre>
	 */
	public String get_optional3_key()
	{
		return this.optional3_key;
	}

	/**
	 * <pre>
	 * HTTP type supported for the sms server
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * HTTP type supported for the sms server
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the sms server
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the sms server
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * Is this sms server is SSL support configured.
	 * </pre>
	 */
	public void set_is_ssl(Boolean is_ssl)
	{
		this.is_ssl = is_ssl;
	}

	/**
	 * <pre>
	 * Is this sms server is SSL support configured.
	 * </pre>
	 */
	public Boolean get_is_ssl()
	{
		return this.is_ssl;
	}

	/**
	 * <pre>
	 * Password Val for the sms server
	 * </pre>
	 */
	public void set_password_val(String password_val)
	{
		this.password_val = password_val;
	}

	/**
	 * <pre>
	 * Password Val for the sms server
	 * </pre>
	 */
	public String get_password_val()
	{
		return this.password_val;
	}

	/**
	 * <pre>
	 * SMS server name
	 * </pre>
	 */
	public void set_server_name(String server_name)
	{
		this.server_name = server_name;
	}

	/**
	 * <pre>
	 * SMS server name
	 * </pre>
	 */
	public String get_server_name()
	{
		return this.server_name;
	}

	/**
	 * <pre>
	 * Password key for the sms server
	 * </pre>
	 */
	public void set_password_key(String password_key)
	{
		this.password_key = password_key;
	}

	/**
	 * <pre>
	 * Password key for the sms server
	 * </pre>
	 */
	public String get_password_key()
	{
		return this.password_key;
	}


	/**
	 * <pre>
	 * Use this operation to add sms server.
	 * </pre>
	 */
	public static sms_server add(nitro_service client, sms_server resource) throws Exception
	{
		resource.validate("add");
		return ((sms_server[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add sms server in bulk.
	 * </pre>
	 */
	public static sms_server[] add(nitro_service client, sms_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((sms_server[]) resources[0].perform_operation(client, "add"));
		
		return ((sms_server[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete sms server.
	 * </pre>
	 */
	public static sms_server delete(nitro_service client, sms_server resource) throws Exception
	{
		resource.validate("delete");
		return ((sms_server[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete sms server in bulk.
	 * </pre>
	 */
	public static sms_server[] delete(nitro_service client, sms_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((sms_server[]) resources[0].delete_resource(client));
		
		return ((sms_server[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get sms server details..
	 * </pre>
	 */
	public static sms_server[] get(nitro_service client) throws Exception
	{
		sms_server resource = new sms_server();
		resource.validate("get");
		return (sms_server[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get sms server details..
	 */
	public static sms_server get(nitro_service client, sms_server resource) throws Exception
	{
		resource.validate("get");
		return ((sms_server[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get sms server details. in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify sms server.
	 * </pre>
	 */
	public static sms_server update(nitro_service client, sms_server resource) throws Exception
	{
		resource.validate("modify");
		return ((sms_server[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify sms server in bulk.
	 * </pre>
	 */
	public static sms_server[] update(nitro_service client, sms_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((sms_server[]) resources[0].update_resource(client));
		
		return ((sms_server[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of sms_server resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static sms_server[] get_filtered(nitro_service service, String filter) throws Exception
	{
		sms_server obj = new sms_server();
		options option = new options();
		option.set_filter(filter);
		sms_server[] response = (sms_server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sms_server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sms_server[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sms_server obj = new sms_server();
		options option = new options();
		option.set_filter(filter);
		sms_server[] response = (sms_server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sms_server resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		sms_server obj = new sms_server();
		options option = new options();
		option.set_count(true);
		sms_server[] response = (sms_server[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sms_server resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		sms_server obj = new sms_server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sms_server[] response = (sms_server[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sms_server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sms_server obj = new sms_server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sms_server[] response = (sms_server[])obj.get_resources(service, option);
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
		sms_server_response result = (sms_server_response) service.get_payload_formatter().string_to_resource(sms_server_response.class, response);
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
		return result.sms_server;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		sms_server_responses result = (sms_server_responses) service.get_payload_formatter().string_to_resource(sms_server_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.sms_server_response_array);
		}
		sms_server[] result_sms_server = new sms_server[result.sms_server_response_array.length];
		
		for(int i = 0; i < result.sms_server_response_array.length; i++)
		{
			result_sms_server[i] = result.sms_server_response_array[i].sms_server[0];
		}
		
		return result_sms_server;
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
		
		MPSString server_name_validator = new MPSString();
		server_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		server_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		server_name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		server_name_validator.validate(operationType, server_name, "\"server_name\"");
		
		MPSString username_key_validator = new MPSString();
		username_key_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		username_key_validator.validate(operationType, username_key, "\"username_key\"");
		
		MPSString username_val_validator = new MPSString();
		username_val_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		username_val_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		username_val_validator.validate(operationType, username_val, "\"username_val\"");
		
		MPSString password_key_validator = new MPSString();
		password_key_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_key_validator.validate(operationType, password_key, "\"password_key\"");
		
		MPSString password_val_validator = new MPSString();
		password_val_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_val_validator.validate(operationType, password_val, "\"password_val\"");
		
		MPSString optional1_key_validator = new MPSString();
		optional1_key_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		optional1_key_validator.validate(operationType, optional1_key, "\"optional1_key\"");
		
		MPSString optional1_val_validator = new MPSString();
		optional1_val_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		optional1_val_validator.validate(operationType, optional1_val, "\"optional1_val\"");
		
		MPSString optional2_key_validator = new MPSString();
		optional2_key_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		optional2_key_validator.validate(operationType, optional2_key, "\"optional2_key\"");
		
		MPSString optional2_val1_validator = new MPSString();
		optional2_val1_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		optional2_val1_validator.validate(operationType, optional2_val1, "\"optional2_val1\"");
		
		MPSString optional3_key_validator = new MPSString();
		optional3_key_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		optional3_key_validator.validate(operationType, optional3_key, "\"optional3_key\"");
		
		MPSString optional3_val_validator = new MPSString();
		optional3_val_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		optional3_val_validator.validate(operationType, optional3_val, "\"optional3_val\"");
		
		MPSString base_url_validator = new MPSString();
		base_url_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 2000);
		base_url_validator.validate(operationType, base_url, "\"base_url\"");
		
		MPSString to_key_validator = new MPSString();
		to_key_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		to_key_validator.validate(operationType, to_key, "\"to_key\"");
		
		MPSString to_seperater_validator = new MPSString();
		to_seperater_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		to_seperater_validator.validate(operationType, to_seperater, "\"to_seperater\"");
		
		MPSString message_key_validator = new MPSString();
		message_key_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		message_key_validator.validate(operationType, message_key, "\"message_key\"");
		
		MPSString message_word_sperater_validator = new MPSString();
		message_word_sperater_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		message_word_sperater_validator.validate(operationType, message_word_sperater, "\"message_word_sperater\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSBoolean is_ssl_validator = new MPSBoolean();
		is_ssl_validator.validate(operationType, is_ssl, "\"is_ssl\"");
		
	}
}
