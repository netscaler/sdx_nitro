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

package com.citrix.sdx.nitro.resource.config.ns;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;


class ns_configtemplate_response extends base_response
{
	public ns_configtemplate[] ns_configtemplate;
}

class ns_configtemplate_responses extends base_response
{
	public ns_configtemplate_response[] ns_configtemplate_response_array;
}

/**
 * Configuration for NetScaler configuration template resource
 */

public class ns_configtemplate extends base_resource
{
	private String template_create_user;
	private Integer last_updated_time;
	private ns_command[] commands;
	private String name;
	private String id;
	private String description;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_configtemplate";
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
	 * User who created the template
	 * </pre>
	 */
	public String get_template_create_user()
	{
		return this.template_create_user;
	}

	/**
	 * <pre>
	 * Last Updated Time
	 * </pre>
	 */
	public void set_last_updated_time(Integer last_updated_time)
	{
		this.last_updated_time = last_updated_time;
	}

	/**
	 * <pre>
	 * Last Updated Time
	 * </pre>
	 */
	public Integer get_last_updated_time()
	{
		return this.last_updated_time;
	}

	/**
	 * <pre>
	 * NS Configuration Commands
	 * </pre>
	 */
	public void set_commands(ns_command[] commands)
	{
		this.commands = commands;
	}

	/**
	 * <pre>
	 * NS Configuration Commands
	 * </pre>
	 */
	public ns_command[] get_commands()
	{
		return this.commands;
	}

	/**
	 * <pre>
	 * Name of the configuration template
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Name of the configuration template
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
	 * Template Description
	 * </pre>
	 */
	public void set_description(String description)
	{
		this.description = description;
	}

	/**
	 * <pre>
	 * Template Description
	 * </pre>
	 */
	public String get_description()
	{
		return this.description;
	}


	/**
	 * <pre>
	 * Use this operation to add NetScaler configuration template.
	 * </pre>
	 */
	public static ns_configtemplate add(nitro_service client, ns_configtemplate resource) throws Exception
	{
		resource.validate("add");
		return ((ns_configtemplate[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add NetScaler configuration template in bulk.
	 * </pre>
	 */
	public static ns_configtemplate[] add(nitro_service client, ns_configtemplate[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_configtemplate[]) resources[0].perform_operation(client, "add"));
		
		return ((ns_configtemplate[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete NetScaler configuration template.
	 * </pre>
	 */
	public static ns_configtemplate delete(nitro_service client, ns_configtemplate resource) throws Exception
	{
		resource.validate("delete");
		return ((ns_configtemplate[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete NetScaler configuration template in bulk.
	 * </pre>
	 */
	public static ns_configtemplate[] delete(nitro_service client, ns_configtemplate[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((ns_configtemplate[]) resources[0].delete_resource(client));
		
		return ((ns_configtemplate[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Get netscaler configuration templates.
	 * </pre>
	 */
	public static ns_configtemplate[] get(nitro_service client) throws Exception
	{
		ns_configtemplate resource = new ns_configtemplate();
		resource.validate("get");
		return (ns_configtemplate[]) resource.get_resources(client);
	}

	/**
	 * Get netscaler configuration templates.
	 */
	public static ns_configtemplate get(nitro_service client, ns_configtemplate resource) throws Exception
	{
		resource.validate("get");
		return ((ns_configtemplate[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Get netscaler configuration templates in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify NetScaler configuration template.
	 * </pre>
	 */
	public static ns_configtemplate modify(nitro_service client, ns_configtemplate resource) throws Exception
	{
		resource.validate("modify");
		return ((ns_configtemplate[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify NetScaler configuration template in bulk.
	 * </pre>
	 */
	public static ns_configtemplate[] modify(nitro_service client, ns_configtemplate[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((ns_configtemplate[]) resources[0].update_resource(client));
		
		return ((ns_configtemplate[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of ns_configtemplate resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_configtemplate[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_configtemplate obj = new ns_configtemplate();
		options option = new options();
		option.set_filter(filter);
		ns_configtemplate[] response = (ns_configtemplate[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_configtemplate resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_configtemplate[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_configtemplate obj = new ns_configtemplate();
		options option = new options();
		option.set_filter(filter);
		ns_configtemplate[] response = (ns_configtemplate[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_configtemplate resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_configtemplate obj = new ns_configtemplate();
		options option = new options();
		option.set_count(true);
		ns_configtemplate[] response = (ns_configtemplate[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_configtemplate resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_configtemplate obj = new ns_configtemplate();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_configtemplate[] response = (ns_configtemplate[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_configtemplate resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_configtemplate obj = new ns_configtemplate();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_configtemplate[] response = (ns_configtemplate[])obj.get_resources(service, option);
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
		ns_configtemplate_response result = (ns_configtemplate_response) service.get_payload_formatter().string_to_resource(ns_configtemplate_response.class, response);
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
		return result.ns_configtemplate;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_configtemplate_responses result = (ns_configtemplate_responses) service.get_payload_formatter().string_to_resource(ns_configtemplate_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_configtemplate_response_array);
		}
		ns_configtemplate[] result_ns_configtemplate = new ns_configtemplate[result.ns_configtemplate_response_array.length];
		
		for(int i = 0; i < result.ns_configtemplate_response_array.length; i++)
		{
			result_ns_configtemplate[i] = result.ns_configtemplate_response_array[i].ns_configtemplate[0];
		}
		
		return result_ns_configtemplate;
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
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSString description_validator = new MPSString();
		description_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		description_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		description_validator.validate(operationType, description, "\"description\"");
		
		if(commands != null)
		{
			for(int i=0; i<commands.length; i++)
			{
				commands[i].validate(operationType);
			}
		}
		
		MPSInt last_updated_time_validator = new MPSInt();
		last_updated_time_validator.validate(operationType, last_updated_time, "\"last_updated_time\"");
		
		MPSString template_create_user_validator = new MPSString();
		template_create_user_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		template_create_user_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		template_create_user_validator.validate(operationType, template_create_user, "\"template_create_user\"");
		
	}
}
