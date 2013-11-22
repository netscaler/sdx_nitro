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


class mail_profile_response extends base_response
{
	public mail_profile[] mail_profile;
}

class mail_profile_responses extends base_response
{
	public mail_profile_response[] mail_profile_response_array;
}

/**
 * Configuration for Mail profile resource
 */

public class mail_profile extends base_resource
{
	private String to_list;
	private String bcc_list;
	private String id;
	private String cc_list;
	private String server_name;
	private String profile_name;
	private Long __count;

	protected String get_object_type()
	{
		return "mail_profile";
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
	 * Id is system generated key for all the mail profile.
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the mail profile.
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
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
	 * Profile name for the mail setting.
	 * </pre>
	 */
	public void set_profile_name(String profile_name)
	{
		this.profile_name = profile_name;
	}

	/**
	 * <pre>
	 * Profile name for the mail setting.
	 * </pre>
	 */
	public String get_profile_name()
	{
		return this.profile_name;
	}


	/**
	 * <pre>
	 * Use this operation to add mail profile..
	 * </pre>
	 */
	public static mail_profile add(nitro_service client, mail_profile resource) throws Exception
	{
		resource.validate("add");
		return ((mail_profile[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add mail profile. in bulk.
	 * </pre>
	 */
	public static mail_profile[] add(nitro_service client, mail_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((mail_profile[]) resources[0].perform_operation(client, "add"));
		
		return ((mail_profile[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete mail profile..
	 * </pre>
	 */
	public static mail_profile delete(nitro_service client, mail_profile resource) throws Exception
	{
		resource.validate("delete");
		return ((mail_profile[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete mail profile. in bulk.
	 * </pre>
	 */
	public static mail_profile[] delete(nitro_service client, mail_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((mail_profile[]) resources[0].delete_resource(client));
		
		return ((mail_profile[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get mail profile..
	 * </pre>
	 */
	public static mail_profile[] get(nitro_service client) throws Exception
	{
		mail_profile resource = new mail_profile();
		resource.validate("get");
		return (mail_profile[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get mail profile..
	 */
	public static mail_profile get(nitro_service client, mail_profile resource) throws Exception
	{
		resource.validate("get");
		return ((mail_profile[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get mail profile. in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify mail profile..
	 * </pre>
	 */
	public static mail_profile update(nitro_service client, mail_profile resource) throws Exception
	{
		resource.validate("modify");
		return ((mail_profile[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify mail profile. in bulk.
	 * </pre>
	 */
	public static mail_profile[] update(nitro_service client, mail_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((mail_profile[]) resources[0].update_resource(client));
		
		return ((mail_profile[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of mail_profile resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static mail_profile[] get_filtered(nitro_service service, String filter) throws Exception
	{
		mail_profile obj = new mail_profile();
		options option = new options();
		option.set_filter(filter);
		mail_profile[] response = (mail_profile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of mail_profile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static mail_profile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mail_profile obj = new mail_profile();
		options option = new options();
		option.set_filter(filter);
		mail_profile[] response = (mail_profile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the mail_profile resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		mail_profile obj = new mail_profile();
		options option = new options();
		option.set_count(true);
		mail_profile[] response = (mail_profile[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mail_profile resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		mail_profile obj = new mail_profile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mail_profile[] response = (mail_profile[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mail_profile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mail_profile obj = new mail_profile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mail_profile[] response = (mail_profile[])obj.get_resources(service, option);
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
		mail_profile_response result = (mail_profile_response) service.get_payload_formatter().string_to_resource(mail_profile_response.class, response);
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
		return result.mail_profile;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		mail_profile_responses result = (mail_profile_responses) service.get_payload_formatter().string_to_resource(mail_profile_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.mail_profile_response_array);
		}
		mail_profile[] result_mail_profile = new mail_profile[result.mail_profile_response_array.length];
		
		for(int i = 0; i < result.mail_profile_response_array.length; i++)
		{
			result_mail_profile[i] = result.mail_profile_response_array[i].mail_profile[0];
		}
		
		return result_mail_profile;
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
		
		MPSString profile_name_validator = new MPSString();
		profile_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		profile_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		profile_name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		profile_name_validator.validate(operationType, profile_name, "\"profile_name\"");
		
		MPSInternetHost server_name_validator = new MPSInternetHost();
		server_name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		server_name_validator.validate(operationType, server_name, "\"server_name\"");
		
		MPSString to_list_validator = new MPSString();
		to_list_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 6);
		to_list_validator.validate(operationType, to_list, "\"to_list\"");
		
		MPSString cc_list_validator = new MPSString();
		cc_list_validator.validate(operationType, cc_list, "\"cc_list\"");
		
		MPSString bcc_list_validator = new MPSString();
		bcc_list_validator.validate(operationType, bcc_list, "\"bcc_list\"");
		
	}
}
