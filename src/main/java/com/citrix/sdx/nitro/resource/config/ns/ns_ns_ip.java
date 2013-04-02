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


class ns_ns_ip_response extends base_response
{
	public ns_ns_ip[] ns_ns_ip;
}

class ns_ns_ip_responses extends base_response
{
	public ns_ns_ip_response[] ns_ns_ip_response_array;
}

/**
 * Configuration for NS IP on NetScaler resource
 */

public class ns_ns_ip extends base_resource
{
	private Boolean save_config;
	private String type;
	private String netmask;
	private String ipaddress;
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_ns_ip";
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
	 * true, if save config is required
	 * </pre>
	 */
	public void set_save_config(Boolean save_config)
	{
		this.save_config = save_config;
	}

	/**
	 * <pre>
	 * true, if save config is required
	 * </pre>
	 */
	public Boolean get_save_config()
	{
		return this.save_config;
	}

	/**
	 * <pre>
	 * type
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * type
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * netmask
	 * </pre>
	 */
	public void set_netmask(String netmask)
	{
		this.netmask = netmask;
	}

	/**
	 * <pre>
	 * netmask
	 * </pre>
	 */
	public String get_netmask()
	{
		return this.netmask;
	}

	/**
	 * <pre>
	 * NS ipaddress that needs to be created
	 * </pre>
	 */
	public void set_ipaddress(String ipaddress)
	{
		this.ipaddress = ipaddress;
	}

	/**
	 * <pre>
	 * NS ipaddress that needs to be created
	 * </pre>
	 */
	public String get_ipaddress()
	{
		return this.ipaddress;
	}

	/**
	 * <pre>
	 * NetScaler IP Address where NSIP needs to be created
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NetScaler IP Address where NSIP needs to be created
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}


	/**
	 * <pre>
	 * Use this operation to add ns ip on NS Instance.
	 * </pre>
	 */
	public static ns_ns_ip add(nitro_service client, ns_ns_ip resource) throws Exception
	{
		resource.validate("add");
		return ((ns_ns_ip[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add ns ip on NS Instance in bulk.
	 * </pre>
	 */
	public static ns_ns_ip[] add(nitro_service client, ns_ns_ip[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_ns_ip[]) resources[0].perform_operation(client, "add"));
		
		return ((ns_ns_ip[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	* Use this API to fetch filtered set of ns_ns_ip resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_ns_ip[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ns_ip obj = new ns_ns_ip();
		options option = new options();
		option.set_filter(filter);
		ns_ns_ip[] response = (ns_ns_ip[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_ns_ip resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_ns_ip[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ns_ip obj = new ns_ns_ip();
		options option = new options();
		option.set_filter(filter);
		ns_ns_ip[] response = (ns_ns_ip[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_ns_ip resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_ns_ip obj = new ns_ns_ip();
		options option = new options();
		option.set_count(true);
		ns_ns_ip[] response = (ns_ns_ip[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ns_ip resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ns_ip obj = new ns_ns_ip();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ns_ip[] response = (ns_ns_ip[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ns_ip resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ns_ip obj = new ns_ns_ip();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ns_ip[] response = (ns_ns_ip[])obj.get_resources(service, option);
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
		ns_ns_ip_response result = (ns_ns_ip_response) service.get_payload_formatter().string_to_resource(ns_ns_ip_response.class, response);
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
		return result.ns_ns_ip;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_ns_ip_responses result = (ns_ns_ip_responses) service.get_payload_formatter().string_to_resource(ns_ns_ip_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_ns_ip_response_array);
		}
		ns_ns_ip[] result_ns_ns_ip = new ns_ns_ip[result.ns_ns_ip_response_array.length];
		
		for(int i = 0; i < result.ns_ns_ip_response_array.length; i++)
		{
			result_ns_ns_ip[i] = result.ns_ns_ip_response_array[i].ns_ns_ip[0];
		}
		
		return result_ns_ns_ip;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress ipaddress_validator = new MPSIPAddress();
		ipaddress_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		ipaddress_validator.validate(operationType, ipaddress, "\"ipaddress\"");
		
		MPSIPAddress netmask_validator = new MPSIPAddress();
		netmask_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		netmask_validator.validate(operationType, netmask, "\"netmask\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		type_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
		MPSBoolean save_config_validator = new MPSBoolean();
		save_config_validator.validate(operationType, save_config, "\"save_config\"");
		
	}
}
