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


class ns_vserver_appflow_config_response extends base_response
{
	public ns_vserver_appflow_config[] ns_vserver_appflow_config;
}

class ns_vserver_appflow_config_responses extends base_response
{
	public ns_vserver_appflow_config_response[] ns_vserver_appflow_config_response_array;
}

/**
 * Configuration for Virtual server appflow config on NetScaler resource
 */

public class ns_vserver_appflow_config extends base_resource
{
	private String appflow_policy_rule;
	private String appflowlog;
	private String es4nslog;
	private String name;
	private String state;
	private String ns_ip_address;
	private String ip_address;
	private String type;
	private String servicetype;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_vserver_appflow_config";
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
	 * Appflow policy rule
	 * </pre>
	 */
	public void set_appflow_policy_rule(String appflow_policy_rule)
	{
		this.appflow_policy_rule = appflow_policy_rule;
	}

	/**
	 * <pre>
	 * Appflow policy rule
	 * </pre>
	 */
	public String get_appflow_policy_rule()
	{
		return this.appflow_policy_rule;
	}

	/**
	 * <pre>
	 * Appflow log
	 * </pre>
	 */
	public void set_appflowlog(String appflowlog)
	{
		this.appflowlog = appflowlog;
	}

	/**
	 * <pre>
	 * Appflow log
	 * </pre>
	 */
	public String get_appflowlog()
	{
		return this.appflowlog;
	}

	/**
	 * <pre>
	 * ESNS enable
	 * </pre>
	 */
	public void set_es4nslog(String es4nslog)
	{
		this.es4nslog = es4nslog;
	}

	/**
	 * <pre>
	 * ESNS enable
	 * </pre>
	 */
	public String get_es4nslog()
	{
		return this.es4nslog;
	}

	/**
	 * <pre>
	 * Virtual server name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Virtual server name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}


	/**
	 * <pre>
	 * Tells whether virtual server up/down
	 * </pre>
	 */
	public String get_state()
	{
		return this.state;
	}

	/**
	 * <pre>
	 * NetScaler IP Address
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NetScaler IP Address
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}

	/**
	 * <pre>
	 * Virtual server IP Address
	 * </pre>
	 */
	public void set_ip_address(String ip_address)
	{
		this.ip_address = ip_address;
	}

	/**
	 * <pre>
	 * Virtual server IP Address
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}

	/**
	 * <pre>
	 * Tells whether virtual server type
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * Tells whether virtual server type
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * servicetype
	 * </pre>
	 */
	public void set_servicetype(String servicetype)
	{
		this.servicetype = servicetype;
	}

	/**
	 * <pre>
	 * servicetype
	 * </pre>
	 */
	public String get_servicetype()
	{
		return this.servicetype;
	}


	/**
	 * <pre>
	 * modify virtual server.
	 * </pre>
	 */
	public static ns_vserver_appflow_config add(nitro_service client, ns_vserver_appflow_config resource) throws Exception
	{
		resource.validate("add");
		return ((ns_vserver_appflow_config[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * modify virtual server in bulk.
	 * </pre>
	 */
	public static ns_vserver_appflow_config[] add(nitro_service client, ns_vserver_appflow_config[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_vserver_appflow_config[]) resources[0].update_resource(client));
		
		return ((ns_vserver_appflow_config[]) update_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * get virtual server.
	 * </pre>
	 */
	public static ns_vserver_appflow_config[] get(nitro_service client) throws Exception
	{
		ns_vserver_appflow_config resource = new ns_vserver_appflow_config();
		resource.validate("get");
		return (ns_vserver_appflow_config[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of ns_vserver_appflow_config resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_vserver_appflow_config[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_vserver_appflow_config obj = new ns_vserver_appflow_config();
		options option = new options();
		option.set_filter(filter);
		ns_vserver_appflow_config[] response = (ns_vserver_appflow_config[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_vserver_appflow_config resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_vserver_appflow_config[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_vserver_appflow_config obj = new ns_vserver_appflow_config();
		options option = new options();
		option.set_filter(filter);
		ns_vserver_appflow_config[] response = (ns_vserver_appflow_config[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_vserver_appflow_config resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_vserver_appflow_config obj = new ns_vserver_appflow_config();
		options option = new options();
		option.set_count(true);
		ns_vserver_appflow_config[] response = (ns_vserver_appflow_config[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_vserver_appflow_config resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_vserver_appflow_config obj = new ns_vserver_appflow_config();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_vserver_appflow_config[] response = (ns_vserver_appflow_config[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_vserver_appflow_config resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_vserver_appflow_config obj = new ns_vserver_appflow_config();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_vserver_appflow_config[] response = (ns_vserver_appflow_config[])obj.get_resources(service, option);
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
		ns_vserver_appflow_config_response result = (ns_vserver_appflow_config_response) service.get_payload_formatter().string_to_resource(ns_vserver_appflow_config_response.class, response);
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
		return result.ns_vserver_appflow_config;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_vserver_appflow_config_responses result = (ns_vserver_appflow_config_responses) service.get_payload_formatter().string_to_resource(ns_vserver_appflow_config_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_vserver_appflow_config_response_array);
		}
		ns_vserver_appflow_config[] result_ns_vserver_appflow_config = new ns_vserver_appflow_config[result.ns_vserver_appflow_config_response_array.length];
		
		for(int i = 0; i < result.ns_vserver_appflow_config_response_array.length; i++)
		{
			result_ns_vserver_appflow_config[i] = result.ns_vserver_appflow_config_response_array[i].ns_vserver_appflow_config[0];
		}
		
		return result_ns_vserver_appflow_config;
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
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 2);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
		MPSString state_validator = new MPSString();
		state_validator.validate(operationType, state, "\"state\"");
		
		MPSString appflowlog_validator = new MPSString();
		appflowlog_validator.validate(operationType, appflowlog, "\"appflowlog\"");
		
		MPSString es4nslog_validator = new MPSString();
		es4nslog_validator.validate(operationType, es4nslog, "\"es4nslog\"");
		
		MPSString appflow_policy_rule_validator = new MPSString();
		appflow_policy_rule_validator.validate(operationType, appflow_policy_rule, "\"appflow_policy_rule\"");
		
		MPSString servicetype_validator = new MPSString();
		servicetype_validator.validate(operationType, servicetype, "\"servicetype\"");
		
	}
}
