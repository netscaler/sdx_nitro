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


class ns_detail_vlan_response extends base_response
{
	public ns_detail_vlan[] ns_detail_vlan;
}

class ns_detail_vlan_responses extends base_response
{
	public ns_detail_vlan_response[] ns_detail_vlan_response_array;
}

/**
 * Configuration for NS Detail Vlan resource
 */

public class ns_detail_vlan extends base_resource
{
	private String ns_vlan_ip_address;
	private String if_ipv6_routing;
	private Integer ns_vlan_id;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_detail_vlan";
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
	 * VPX IP Address
	 * </pre>
	 */
	public void set_ns_vlan_ip_address(String ns_vlan_ip_address)
	{
		this.ns_vlan_ip_address = ns_vlan_ip_address;
	}

	/**
	 * <pre>
	 * VPX IP Address
	 * </pre>
	 */
	public String get_ns_vlan_ip_address()
	{
		return this.ns_vlan_ip_address;
	}

	/**
	 * <pre>
	 * VLAN for Network Interface on VM Instance
	 * </pre>
	 */
	public void set_if_ipv6_routing(String if_ipv6_routing)
	{
		this.if_ipv6_routing = if_ipv6_routing;
	}

	/**
	 * <pre>
	 * VLAN for Network Interface on VM Instance
	 * </pre>
	 */
	public String get_if_ipv6_routing()
	{
		return this.if_ipv6_routing;
	}

	/**
	 * <pre>
	 * VLAN Id
	 * </pre>
	 */
	public void set_ns_vlan_id(Integer ns_vlan_id)
	{
		this.ns_vlan_id = ns_vlan_id;
	}

	/**
	 * <pre>
	 * VLAN Id
	 * </pre>
	 */
	public Integer get_ns_vlan_id()
	{
		return this.ns_vlan_id;
	}


	/**
	 * <pre>
	 * Use this operation to configure vlan.
	 * </pre>
	 */
	public static ns_detail_vlan add(nitro_service client, ns_detail_vlan resource) throws Exception
	{
		resource.validate("add");
		return ((ns_detail_vlan[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to configure vlan in bulk.
	 * </pre>
	 */
	public static ns_detail_vlan[] add(nitro_service client, ns_detail_vlan[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_detail_vlan[]) resources[0].perform_operation(client, "add"));
		
		return ((ns_detail_vlan[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to get configured vlans.
	 * </pre>
	 */
	public static ns_detail_vlan[] get(nitro_service client) throws Exception
	{
		ns_detail_vlan resource = new ns_detail_vlan();
		resource.validate("get");
		return (ns_detail_vlan[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of ns_detail_vlan resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_detail_vlan[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_detail_vlan obj = new ns_detail_vlan();
		options option = new options();
		option.set_filter(filter);
		ns_detail_vlan[] response = (ns_detail_vlan[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_detail_vlan resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_detail_vlan[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_detail_vlan obj = new ns_detail_vlan();
		options option = new options();
		option.set_filter(filter);
		ns_detail_vlan[] response = (ns_detail_vlan[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_detail_vlan resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_detail_vlan obj = new ns_detail_vlan();
		options option = new options();
		option.set_count(true);
		ns_detail_vlan[] response = (ns_detail_vlan[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_detail_vlan resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_detail_vlan obj = new ns_detail_vlan();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_detail_vlan[] response = (ns_detail_vlan[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_detail_vlan resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_detail_vlan obj = new ns_detail_vlan();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_detail_vlan[] response = (ns_detail_vlan[])obj.get_resources(service, option);
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
		ns_detail_vlan_response result = (ns_detail_vlan_response) service.get_payload_formatter().string_to_resource(ns_detail_vlan_response.class, response);
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
		return result.ns_detail_vlan;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_detail_vlan_responses result = (ns_detail_vlan_responses) service.get_payload_formatter().string_to_resource(ns_detail_vlan_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_detail_vlan_response_array);
		}
		ns_detail_vlan[] result_ns_detail_vlan = new ns_detail_vlan[result.ns_detail_vlan_response_array.length];
		
		for(int i = 0; i < result.ns_detail_vlan_response_array.length; i++)
		{
			result_ns_detail_vlan[i] = result.ns_detail_vlan_response_array[i].ns_detail_vlan[0];
		}
		
		return result_ns_detail_vlan;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt ns_vlan_id_validator = new MPSInt();
		ns_vlan_id_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		ns_vlan_id_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		ns_vlan_id_validator.validate(operationType, ns_vlan_id, "\"ns_vlan_id\"");
		
		MPSString ns_vlan_ip_address_validator = new MPSString();
		ns_vlan_ip_address_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		ns_vlan_ip_address_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ns_vlan_ip_address_validator.validate(operationType, ns_vlan_ip_address, "\"ns_vlan_ip_address\"");
		
		MPSString if_ipv6_routing_validator = new MPSString();
		if_ipv6_routing_validator.validate(operationType, if_ipv6_routing, "\"if_ipv6_routing\"");
		
	}
}
