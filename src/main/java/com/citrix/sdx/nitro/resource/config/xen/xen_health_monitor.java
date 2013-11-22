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

class xen_health_monitor_response extends base_response
{
	public xen_health_monitor[] xen_health_monitor;
}

class xen_health_monitor_responses extends base_response
{
	public xen_health_monitor_response[] xen_health_monitor_response_array;
}

/**
 * Configuration for XenServer Health Monitor (IPMI Sensor) resource
 */

public class xen_health_monitor extends base_resource
{
	private String unit;
	private String current_value;
	private String status;
	private String host_ip_address;
	private String name;
	private Long __count;

	protected String get_object_type()
	{
		return "xen_health_monitor";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return name;
	}

	/**
	 * <pre>
	 * Measurement Unit
	 * </pre>
	 */
	public void set_unit(String unit)
	{
		this.unit = unit;
	}

	/**
	 * <pre>
	 * Measurement Unit
	 * </pre>
	 */
	public String get_unit()
	{
		return this.unit;
	}

	/**
	 * <pre>
	 * Current Value of the IPMI Sensor
	 * </pre>
	 */
	public void set_current_value(String current_value)
	{
		this.current_value = current_value;
	}

	/**
	 * <pre>
	 * Current Value of the IPMI Sensor
	 * </pre>
	 */
	public String get_current_value()
	{
		return this.current_value;
	}

	/**
	 * <pre>
	 * IPMI Sensor Status - OK/ERROR/NA
	 * </pre>
	 */
	public void set_status(String status)
	{
		this.status = status;
	}

	/**
	 * <pre>
	 * IPMI Sensor Status - OK/ERROR/NA
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
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
	 * IPMI Sensor Name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * IPMI Sensor Name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}


	/**
	 * <pre>
	 * Use this operation to get the IPMI sensor data.
	 * </pre>
	 */
	public static xen_health_monitor[] get(nitro_service client) throws Exception
	{
		xen_health_monitor resource = new xen_health_monitor();
		resource.validate("get");
		return (xen_health_monitor[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get the IPMI sensor data.
	 */
	public static xen_health_monitor get(nitro_service client, xen_health_monitor resource) throws Exception
	{
		resource.validate("get");
		return ((xen_health_monitor[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get the IPMI sensor data in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of xen_health_monitor resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen_health_monitor[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_monitor obj = new xen_health_monitor();
		options option = new options();
		option.set_filter(filter);
		xen_health_monitor[] response = (xen_health_monitor[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen_health_monitor resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen_health_monitor[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_monitor obj = new xen_health_monitor();
		options option = new options();
		option.set_filter(filter);
		xen_health_monitor[] response = (xen_health_monitor[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen_health_monitor resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen_health_monitor obj = new xen_health_monitor();
		options option = new options();
		option.set_count(true);
		xen_health_monitor[] response = (xen_health_monitor[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_monitor resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_monitor obj = new xen_health_monitor();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_monitor[] response = (xen_health_monitor[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_monitor resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_monitor obj = new xen_health_monitor();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_monitor[] response = (xen_health_monitor[])obj.get_resources(service, option);
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
		xen_health_monitor_response result = (xen_health_monitor_response) service.get_payload_formatter().string_to_resource(xen_health_monitor_response.class, response);
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
		return result.xen_health_monitor;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_health_monitor_responses result = (xen_health_monitor_responses) service.get_payload_formatter().string_to_resource(xen_health_monitor_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_health_monitor_response_array);
		}
		xen_health_monitor[] result_xen_health_monitor = new xen_health_monitor[result.xen_health_monitor_response_array.length];
		
		for(int i = 0; i < result.xen_health_monitor_response_array.length; i++)
		{
			result_xen_health_monitor[i] = result.xen_health_monitor_response_array[i].xen_health_monitor[0];
		}
		
		return result_xen_health_monitor;
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
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSIPAddress host_ip_address_validator = new MPSIPAddress();
		host_ip_address_validator.validate(operationType, host_ip_address, "\"host_ip_address\"");
		
		MPSString current_value_validator = new MPSString();
		current_value_validator.validate(operationType, current_value, "\"current_value\"");
		
		MPSString unit_validator = new MPSString();
		unit_validator.validate(operationType, unit, "\"unit\"");
		
		MPSString status_validator = new MPSString();
		status_validator.validate(operationType, status, "\"status\"");
		
	}
}
