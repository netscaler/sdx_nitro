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


class sms_profile_response extends base_response
{
	public sms_profile[] sms_profile;
}

class sms_profile_responses extends base_response
{
	public sms_profile_response[] sms_profile_response_array;
}

/**
 * Configuration for SMS profile resource
 */

public class sms_profile extends base_resource
{
	private String to_list;
	private String id;
	private String server_name;
	private String profile_name;
	private Long __count;

	protected String get_object_type()
	{
		return "sms_profile";
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
	 * To list.
	 * </pre>
	 */
	public void set_to_list(String to_list)
	{
		this.to_list = to_list;
	}

	/**
	 * <pre>
	 * To list.
	 * </pre>
	 */
	public String get_to_list()
	{
		return this.to_list;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the sms profile.
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the sms profile.
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
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
	 * Profile name for the sms setting.
	 * </pre>
	 */
	public void set_profile_name(String profile_name)
	{
		this.profile_name = profile_name;
	}

	/**
	 * <pre>
	 * Profile name for the sms setting.
	 * </pre>
	 */
	public String get_profile_name()
	{
		return this.profile_name;
	}


	/**
	 * <pre>
	 * Use this operation to add sms profile..
	 * </pre>
	 */
	public static sms_profile add(nitro_service client, sms_profile resource) throws Exception
	{
		resource.validate("add");
		return ((sms_profile[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add sms profile. in bulk.
	 * </pre>
	 */
	public static sms_profile[] add(nitro_service client, sms_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((sms_profile[]) resources[0].perform_operation(client, "add"));
		
		return ((sms_profile[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete sms profile..
	 * </pre>
	 */
	public static sms_profile delete(nitro_service client, sms_profile resource) throws Exception
	{
		resource.validate("delete");
		return ((sms_profile[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete sms profile. in bulk.
	 * </pre>
	 */
	public static sms_profile[] delete(nitro_service client, sms_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((sms_profile[]) resources[0].delete_resource(client));
		
		return ((sms_profile[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get sms profile..
	 * </pre>
	 */
	public static sms_profile[] get(nitro_service client) throws Exception
	{
		sms_profile resource = new sms_profile();
		resource.validate("get");
		return (sms_profile[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get sms profile..
	 */
	public static sms_profile get(nitro_service client, sms_profile resource) throws Exception
	{
		resource.validate("get");
		return ((sms_profile[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get sms profile. in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify sms profile..
	 * </pre>
	 */
	public static sms_profile update(nitro_service client, sms_profile resource) throws Exception
	{
		resource.validate("modify");
		return ((sms_profile[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify sms profile. in bulk.
	 * </pre>
	 */
	public static sms_profile[] update(nitro_service client, sms_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((sms_profile[]) resources[0].update_resource(client));
		
		return ((sms_profile[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of sms_profile resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static sms_profile[] get_filtered(nitro_service service, String filter) throws Exception
	{
		sms_profile obj = new sms_profile();
		options option = new options();
		option.set_filter(filter);
		sms_profile[] response = (sms_profile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sms_profile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sms_profile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sms_profile obj = new sms_profile();
		options option = new options();
		option.set_filter(filter);
		sms_profile[] response = (sms_profile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sms_profile resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		sms_profile obj = new sms_profile();
		options option = new options();
		option.set_count(true);
		sms_profile[] response = (sms_profile[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sms_profile resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		sms_profile obj = new sms_profile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sms_profile[] response = (sms_profile[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sms_profile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sms_profile obj = new sms_profile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sms_profile[] response = (sms_profile[])obj.get_resources(service, option);
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
		sms_profile_response result = (sms_profile_response) service.get_payload_formatter().string_to_resource(sms_profile_response.class, response);
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
		return result.sms_profile;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		sms_profile_responses result = (sms_profile_responses) service.get_payload_formatter().string_to_resource(sms_profile_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.sms_profile_response_array);
		}
		sms_profile[] result_sms_profile = new sms_profile[result.sms_profile_response_array.length];
		
		for(int i = 0; i < result.sms_profile_response_array.length; i++)
		{
			result_sms_profile[i] = result.sms_profile_response_array[i].sms_profile[0];
		}
		
		return result_sms_profile;
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
		
		MPSString server_name_validator = new MPSString();
		server_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		server_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		server_name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		server_name_validator.validate(operationType, server_name, "\"server_name\"");
		
		MPSString to_list_validator = new MPSString();
		to_list_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		to_list_validator.validate(operationType, to_list, "\"to_list\"");
		
	}
}
