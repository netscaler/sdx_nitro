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


class sent_mails_response extends base_response
{
	public sent_mails[] sent_mails;
}

class sent_mails_responses extends base_response
{
	public sent_mails_response[] sent_mails_response_array;
}

/**
 * Configuration for Sent mail record item keeping. resource
 */

public class sent_mails extends base_resource
{
	private String to_list;
	private String failed_message;
	private String subject;
	private String bcc_list;
	private Boolean is_auth;
	private String cc_list;
	private Integer port;
	private Boolean is_sent;
	private String message;
	private String username;
	private Double timestamp;
	private String id;
	private Boolean is_ssl;
	private String server_name;
	private String profile_name;
	private Long __count;

	protected String get_object_type()
	{
		return "sent_mails";
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
	 * List of to whom send the mail. 
	 * </pre>
	 */
	public void set_to_list(String to_list)
	{
		this.to_list = to_list;
	}

	/**
	 * <pre>
	 * List of to whom send the mail. 
	 * </pre>
	 */
	public String get_to_list()
	{
		return this.to_list;
	}

	/**
	 * <pre>
	 * Subject of the mail sent.
	 * </pre>
	 */
	public void set_failed_message(String failed_message)
	{
		this.failed_message = failed_message;
	}

	/**
	 * <pre>
	 * Subject of the mail sent.
	 * </pre>
	 */
	public String get_failed_message()
	{
		return this.failed_message;
	}

	/**
	 * <pre>
	 * Subject of the mail sent.
	 * </pre>
	 */
	public void set_subject(String subject)
	{
		this.subject = subject;
	}

	/**
	 * <pre>
	 * Subject of the mail sent.
	 * </pre>
	 */
	public String get_subject()
	{
		return this.subject;
	}

	/**
	 * <pre>
	 * List to whom BCC the mail.
	 * </pre>
	 */
	public void set_bcc_list(String bcc_list)
	{
		this.bcc_list = bcc_list;
	}

	/**
	 * <pre>
	 * List to whom BCC the mail.
	 * </pre>
	 */
	public String get_bcc_list()
	{
		return this.bcc_list;
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
	 * List to whom CC the mail.
	 * </pre>
	 */
	public void set_cc_list(String cc_list)
	{
		this.cc_list = cc_list;
	}

	/**
	 * <pre>
	 * List to whom CC the mail.
	 * </pre>
	 */
	public String get_cc_list()
	{
		return this.cc_list;
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
	 * Is this mail sent successfully.
	 * </pre>
	 */
	public void set_is_sent(Boolean is_sent)
	{
		this.is_sent = is_sent;
	}

	/**
	 * <pre>
	 * Is this mail sent successfully.
	 * </pre>
	 */
	public Boolean get_is_sent()
	{
		return this.is_sent;
	}

	/**
	 * <pre>
	 * Content of the mail sent.
	 * </pre>
	 */
	public void set_message(String message)
	{
		this.message = message;
	}

	/**
	 * <pre>
	 * Content of the mail sent.
	 * </pre>
	 */
	public String get_message()
	{
		return this.message;
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
	 * Time when the mail was sent
	 * </pre>
	 */
	public Double get_timestamp()
	{
		return this.timestamp;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the sent mail record.
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the sent mail record.
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
	 * Profile name through which mail sent.
	 * </pre>
	 */
	public void set_profile_name(String profile_name)
	{
		this.profile_name = profile_name;
	}

	/**
	 * <pre>
	 * Profile name through which mail sent.
	 * </pre>
	 */
	public String get_profile_name()
	{
		return this.profile_name;
	}


	/**
	 * <pre>
	 * Use this operation to delete sent mail details..
	 * </pre>
	 */
	public static sent_mails delete(nitro_service client, sent_mails resource) throws Exception
	{
		resource.validate("delete");
		return ((sent_mails[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete sent mail details. in bulk.
	 * </pre>
	 */
	public static sent_mails[] delete(nitro_service client, sent_mails[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((sent_mails[]) resources[0].delete_resource(client));
		
		return ((sent_mails[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get sent mail details..
	 * </pre>
	 */
	public static sent_mails[] get(nitro_service client) throws Exception
	{
		sent_mails resource = new sent_mails();
		resource.validate("get");
		return (sent_mails[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of sent_mails resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static sent_mails[] get_filtered(nitro_service service, String filter) throws Exception
	{
		sent_mails obj = new sent_mails();
		options option = new options();
		option.set_filter(filter);
		sent_mails[] response = (sent_mails[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sent_mails resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sent_mails[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sent_mails obj = new sent_mails();
		options option = new options();
		option.set_filter(filter);
		sent_mails[] response = (sent_mails[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sent_mails resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		sent_mails obj = new sent_mails();
		options option = new options();
		option.set_count(true);
		sent_mails[] response = (sent_mails[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sent_mails resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		sent_mails obj = new sent_mails();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sent_mails[] response = (sent_mails[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sent_mails resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sent_mails obj = new sent_mails();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sent_mails[] response = (sent_mails[])obj.get_resources(service, option);
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
		sent_mails_response result = (sent_mails_response) service.get_payload_formatter().string_to_resource(sent_mails_response.class, response);
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
		return result.sent_mails;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		sent_mails_responses result = (sent_mails_responses) service.get_payload_formatter().string_to_resource(sent_mails_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.sent_mails_response_array);
		}
		sent_mails[] result_sent_mails = new sent_mails[result.sent_mails_response_array.length];
		
		for(int i = 0; i < result.sent_mails_response_array.length; i++)
		{
			result_sent_mails[i] = result.sent_mails_response_array[i].sent_mails[0];
		}
		
		return result_sent_mails;
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
		port_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		port_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 65534);
		port_validator.validate(operationType, port, "\"port\"");
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSBoolean is_auth_validator = new MPSBoolean();
		is_auth_validator.validate(operationType, is_auth, "\"is_auth\"");
		
		MPSBoolean is_ssl_validator = new MPSBoolean();
		is_ssl_validator.validate(operationType, is_ssl, "\"is_ssl\"");
		
		MPSString profile_name_validator = new MPSString();
		profile_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		profile_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		profile_name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		profile_name_validator.validate(operationType, profile_name, "\"profile_name\"");
		
		MPSString to_list_validator = new MPSString();
		to_list_validator.validate(operationType, to_list, "\"to_list\"");
		
		MPSString cc_list_validator = new MPSString();
		cc_list_validator.validate(operationType, cc_list, "\"cc_list\"");
		
		MPSString bcc_list_validator = new MPSString();
		bcc_list_validator.validate(operationType, bcc_list, "\"bcc_list\"");
		
		MPSString subject_validator = new MPSString();
		subject_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 2000);
		subject_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		subject_validator.validate(operationType, subject, "\"subject\"");
		
		MPSString message_validator = new MPSString();
		message_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 20000);
		message_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		message_validator.validate(operationType, message, "\"message\"");
		
		MPSBoolean is_sent_validator = new MPSBoolean();
		is_sent_validator.validate(operationType, is_sent, "\"is_sent\"");
		
		MPSLong timestamp_validator = new MPSLong();
		timestamp_validator.validate(operationType, timestamp, "\"timestamp\"");
		
		MPSString failed_message_validator = new MPSString();
		failed_message_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 2000);
		failed_message_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		failed_message_validator.validate(operationType, failed_message, "\"failed_message\"");
		
	}
}
