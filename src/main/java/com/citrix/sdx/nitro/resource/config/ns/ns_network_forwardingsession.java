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


class ns_network_forwardingsession_response extends base_response
{
	public ns_network_forwardingsession[] ns_network_forwardingsession;
}

class ns_network_forwardingsession_responses extends base_response
{
	public ns_network_forwardingsession_response[] ns_network_forwardingsession_response_array;
}

/**
 * Configuration for Forwarding Session on NetScaler resource
 */

public class ns_network_forwardingsession extends base_resource
{
	private String network;
	private String name;
	private String netmask;
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_network_forwardingsession";
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
	 * Network that needs to be created
	 * </pre>
	 */
	public void set_network(String network)
	{
		this.network = network;
	}

	/**
	 * <pre>
	 * Network that needs to be created
	 * </pre>
	 */
	public String get_network()
	{
		return this.network;
	}

	/**
	 * <pre>
	 * name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
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
	 * NetScaler IP Address where forwarding session needs to be created
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NetScaler IP Address where forwarding session needs to be created
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}


	/**
	 * <pre>
	 * Use this operation to add forwarding session on NetScaler Instance.
	 * </pre>
	 */
	public static ns_network_forwardingsession add(nitro_service client, ns_network_forwardingsession resource) throws Exception
	{
		resource.validate("add");
		return ((ns_network_forwardingsession[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add forwarding session on NetScaler Instance in bulk.
	 * </pre>
	 */
	public static ns_network_forwardingsession[] add(nitro_service client, ns_network_forwardingsession[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_network_forwardingsession[]) resources[0].perform_operation(client, "add"));
		
		return ((ns_network_forwardingsession[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	* Use this API to fetch filtered set of ns_network_forwardingsession resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_network_forwardingsession[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_network_forwardingsession obj = new ns_network_forwardingsession();
		options option = new options();
		option.set_filter(filter);
		ns_network_forwardingsession[] response = (ns_network_forwardingsession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_network_forwardingsession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_network_forwardingsession[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_network_forwardingsession obj = new ns_network_forwardingsession();
		options option = new options();
		option.set_filter(filter);
		ns_network_forwardingsession[] response = (ns_network_forwardingsession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_network_forwardingsession resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_network_forwardingsession obj = new ns_network_forwardingsession();
		options option = new options();
		option.set_count(true);
		ns_network_forwardingsession[] response = (ns_network_forwardingsession[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_network_forwardingsession resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_network_forwardingsession obj = new ns_network_forwardingsession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_network_forwardingsession[] response = (ns_network_forwardingsession[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_network_forwardingsession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_network_forwardingsession obj = new ns_network_forwardingsession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_network_forwardingsession[] response = (ns_network_forwardingsession[])obj.get_resources(service, option);
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
		ns_network_forwardingsession_response result = (ns_network_forwardingsession_response) service.get_payload_formatter().string_to_resource(ns_network_forwardingsession_response.class, response);
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
		return result.ns_network_forwardingsession;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_network_forwardingsession_responses result = (ns_network_forwardingsession_responses) service.get_payload_formatter().string_to_resource(ns_network_forwardingsession_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_network_forwardingsession_response_array);
		}
		ns_network_forwardingsession[] result_ns_network_forwardingsession = new ns_network_forwardingsession[result.ns_network_forwardingsession_response_array.length];
		
		for(int i = 0; i < result.ns_network_forwardingsession_response_array.length; i++)
		{
			result_ns_network_forwardingsession[i] = result.ns_network_forwardingsession_response_array[i].ns_network_forwardingsession[0];
		}
		
		return result_ns_network_forwardingsession;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress network_validator = new MPSIPAddress();
		network_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		network_validator.validate(operationType, network, "\"network\"");
		
		MPSIPAddress netmask_validator = new MPSIPAddress();
		netmask_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		netmask_validator.validate(operationType, netmask, "\"netmask\"");
		
		MPSString name_validator = new MPSString();
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
	}
}
