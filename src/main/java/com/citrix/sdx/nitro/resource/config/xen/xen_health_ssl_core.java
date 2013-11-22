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

package com.citrix.sdx.nitro.resource.config.xen;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class xen_health_ssl_core_response extends base_response
{
	public xen_health_ssl_core[] xen_health_ssl_core;
}

class xen_health_ssl_core_responses extends base_response
{
	public xen_health_ssl_core_response[] xen_health_ssl_core_response_array;
}

/**
 * Configuration for XenServer SSL Core Health resource
 */

public class xen_health_ssl_core extends base_resource
{
	private String host_ip_address;
	private Integer vf_total;
	private Integer vf_assigned;
	private Integer cpu_socket;
	private Long __count;

	protected String get_object_type()
	{
		return "xen_health_ssl_core";
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
	 * Host IP Address
	 * </pre>
	 */
	public void set_host_ip_address(String host_ip_address)
	{
		this.host_ip_address = host_ip_address;
	}

	/**
	 * <pre>
	 * Host IP Address
	 * </pre>
	 */
	public String get_host_ip_address()
	{
		return this.host_ip_address;
	}

	/**
	 * <pre>
	 * Total SSL Virtual Functions
	 * </pre>
	 */
	public void set_vf_total(Integer vf_total)
	{
		this.vf_total = vf_total;
	}

	/**
	 * <pre>
	 * Total SSL Virtual Functions
	 * </pre>
	 */
	public Integer get_vf_total()
	{
		return this.vf_total;
	}

	/**
	 * <pre>
	 * Assigned SSL Virtual Functions
	 * </pre>
	 */
	public void set_vf_assigned(Integer vf_assigned)
	{
		this.vf_assigned = vf_assigned;
	}

	/**
	 * <pre>
	 * Assigned SSL Virtual Functions
	 * </pre>
	 */
	public Integer get_vf_assigned()
	{
		return this.vf_assigned;
	}

	/**
	 * <pre>
	 * CPU Socket for the SSL Core
	 * </pre>
	 */
	public void set_cpu_socket(Integer cpu_socket)
	{
		this.cpu_socket = cpu_socket;
	}

	/**
	 * <pre>
	 * CPU Socket for the SSL Core
	 * </pre>
	 */
	public Integer get_cpu_socket()
	{
		return this.cpu_socket;
	}


	/**
	 * <pre>
	 * Use this operation to get health and ssl virtual function statistics for the CPU Socket.
	 * </pre>
	 */
	public static xen_health_ssl_core[] get(nitro_service client) throws Exception
	{
		xen_health_ssl_core resource = new xen_health_ssl_core();
		resource.validate("get");
		return (xen_health_ssl_core[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of xen_health_ssl_core resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen_health_ssl_core[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_ssl_core obj = new xen_health_ssl_core();
		options option = new options();
		option.set_filter(filter);
		xen_health_ssl_core[] response = (xen_health_ssl_core[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen_health_ssl_core resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen_health_ssl_core[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_ssl_core obj = new xen_health_ssl_core();
		options option = new options();
		option.set_filter(filter);
		xen_health_ssl_core[] response = (xen_health_ssl_core[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen_health_ssl_core resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen_health_ssl_core obj = new xen_health_ssl_core();
		options option = new options();
		option.set_count(true);
		xen_health_ssl_core[] response = (xen_health_ssl_core[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_ssl_core resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_ssl_core obj = new xen_health_ssl_core();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_ssl_core[] response = (xen_health_ssl_core[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_ssl_core resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_ssl_core obj = new xen_health_ssl_core();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_ssl_core[] response = (xen_health_ssl_core[])obj.get_resources(service, option);
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
		xen_health_ssl_core_response result = (xen_health_ssl_core_response) service.get_payload_formatter().string_to_resource(xen_health_ssl_core_response.class, response);
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
		return result.xen_health_ssl_core;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_health_ssl_core_responses result = (xen_health_ssl_core_responses) service.get_payload_formatter().string_to_resource(xen_health_ssl_core_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_health_ssl_core_response_array);
		}
		xen_health_ssl_core[] result_xen_health_ssl_core = new xen_health_ssl_core[result.xen_health_ssl_core_response_array.length];
		
		for(int i = 0; i < result.xen_health_ssl_core_response_array.length; i++)
		{
			result_xen_health_ssl_core[i] = result.xen_health_ssl_core_response_array[i].xen_health_ssl_core[0];
		}
		
		return result_xen_health_ssl_core;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt cpu_socket_validator = new MPSInt();
		cpu_socket_validator.validate(operationType, cpu_socket, "\"cpu_socket\"");
		
		MPSIPAddress host_ip_address_validator = new MPSIPAddress();
		host_ip_address_validator.validate(operationType, host_ip_address, "\"host_ip_address\"");
		
		MPSInt vf_total_validator = new MPSInt();
		vf_total_validator.validate(operationType, vf_total, "\"vf_total\"");
		
		MPSInt vf_assigned_validator = new MPSInt();
		vf_assigned_validator.validate(operationType, vf_assigned, "\"vf_assigned\"");
		
	}
}
