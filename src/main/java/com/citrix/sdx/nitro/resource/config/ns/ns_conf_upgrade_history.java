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


class ns_conf_upgrade_history_response extends base_response
{
	public ns_conf_upgrade_history[] ns_conf_upgrade_history;
}

class ns_conf_upgrade_history_responses extends base_response
{
	public ns_conf_upgrade_history_response[] ns_conf_upgrade_history_response_array;
}

/**
 * Configuration for ns.conf file upgrade history on NetScaler resource
 */

public class ns_conf_upgrade_history extends base_resource
{
	private String ns_conf_upgradefile;
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_conf_upgrade_history";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return ns_ip_address;
	}


	/**
	 * <pre>
	 * ns.conf upgrade history file
	 * </pre>
	 */
	public String get_ns_conf_upgradefile()
	{
		return this.ns_conf_upgradefile;
	}

	/**
	 * <pre>
	 * NS IP Address
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NS IP Address
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}


	/**
	 * <pre>
	 * Use this operation to get ns.conf file upgrade history.
	 * </pre>
	 */
	public static ns_conf_upgrade_history[] get(nitro_service client) throws Exception
	{
		ns_conf_upgrade_history resource = new ns_conf_upgrade_history();
		resource.validate("get");
		return (ns_conf_upgrade_history[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get ns.conf file upgrade history.
	 */
	public static ns_conf_upgrade_history[] get(nitro_service client, ns_conf_upgrade_history resource) throws Exception
	{
		resource.validate("get");
		return ((ns_conf_upgrade_history[]) resource.get_resources(client));
	}

	/**
	 * <pre>
	 * Use this operation to get ns.conf file upgrade history in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of ns_conf_upgrade_history resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_conf_upgrade_history[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_conf_upgrade_history obj = new ns_conf_upgrade_history();
		options option = new options();
		option.set_filter(filter);
		ns_conf_upgrade_history[] response = (ns_conf_upgrade_history[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_conf_upgrade_history resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_conf_upgrade_history[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_conf_upgrade_history obj = new ns_conf_upgrade_history();
		options option = new options();
		option.set_filter(filter);
		ns_conf_upgrade_history[] response = (ns_conf_upgrade_history[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_conf_upgrade_history resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_conf_upgrade_history obj = new ns_conf_upgrade_history();
		options option = new options();
		option.set_count(true);
		ns_conf_upgrade_history[] response = (ns_conf_upgrade_history[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_conf_upgrade_history resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_conf_upgrade_history obj = new ns_conf_upgrade_history();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_conf_upgrade_history[] response = (ns_conf_upgrade_history[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_conf_upgrade_history resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_conf_upgrade_history obj = new ns_conf_upgrade_history();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_conf_upgrade_history[] response = (ns_conf_upgrade_history[])obj.get_resources(service, option);
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
		ns_conf_upgrade_history_response result = (ns_conf_upgrade_history_response) service.get_payload_formatter().string_to_resource(ns_conf_upgrade_history_response.class, response);
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
		return result.ns_conf_upgrade_history;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_conf_upgrade_history_responses result = (ns_conf_upgrade_history_responses) service.get_payload_formatter().string_to_resource(ns_conf_upgrade_history_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_conf_upgrade_history_response_array);
		}
		ns_conf_upgrade_history[] result_ns_conf_upgrade_history = new ns_conf_upgrade_history[result.ns_conf_upgrade_history_response_array.length];
		
		for(int i = 0; i < result.ns_conf_upgrade_history_response_array.length; i++)
		{
			result_ns_conf_upgrade_history[i] = result.ns_conf_upgrade_history_response_array[i].ns_conf_upgrade_history[0];
		}
		
		return result_ns_conf_upgrade_history;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString ns_conf_upgradefile_validator = new MPSString();
		ns_conf_upgradefile_validator.validate(operationType, ns_conf_upgradefile, "\"ns_conf_upgradefile\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
	}
}
