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
import com.citrix.sdx.nitro.resource.config.mps.*;

class xen_health_monitor_fan_speed_response extends base_response
{
	public xen_health_monitor_fan_speed[] xen_health_monitor_fan_speed;
}

class xen_health_monitor_fan_speed_responses extends base_response
{
	public xen_health_monitor_fan_speed_response[] xen_health_monitor_fan_speed_response_array;
}

/**
 * Configuration for Xen Health Monitor (IPMI Sensor) - Fan Speed resource
 */

public class xen_health_monitor_fan_speed extends xen_health_monitor
{
	private Long __count;

	protected String get_object_type()
	{
		return "xen_health_monitor_fan_speed";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return super.get_object_id();
	}


	/**
	 * <pre>
	 * Use this operation to get the IPMI sensor data (for all fan-speed sensors).
	 * </pre>
	 */
	public static xen_health_monitor_fan_speed[] get(nitro_service client) throws Exception
	{
		xen_health_monitor_fan_speed resource = new xen_health_monitor_fan_speed();
		resource.validate("get");
		return (xen_health_monitor_fan_speed[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of xen_health_monitor_fan_speed resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen_health_monitor_fan_speed[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_monitor_fan_speed obj = new xen_health_monitor_fan_speed();
		options option = new options();
		option.set_filter(filter);
		xen_health_monitor_fan_speed[] response = (xen_health_monitor_fan_speed[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen_health_monitor_fan_speed resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen_health_monitor_fan_speed[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_monitor_fan_speed obj = new xen_health_monitor_fan_speed();
		options option = new options();
		option.set_filter(filter);
		xen_health_monitor_fan_speed[] response = (xen_health_monitor_fan_speed[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen_health_monitor_fan_speed resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen_health_monitor_fan_speed obj = new xen_health_monitor_fan_speed();
		options option = new options();
		option.set_count(true);
		xen_health_monitor_fan_speed[] response = (xen_health_monitor_fan_speed[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_monitor_fan_speed resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_monitor_fan_speed obj = new xen_health_monitor_fan_speed();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_monitor_fan_speed[] response = (xen_health_monitor_fan_speed[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_monitor_fan_speed resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_monitor_fan_speed obj = new xen_health_monitor_fan_speed();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_monitor_fan_speed[] response = (xen_health_monitor_fan_speed[])obj.get_resources(service, option);
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
		xen_health_monitor_fan_speed_response result = (xen_health_monitor_fan_speed_response) service.get_payload_formatter().string_to_resource(xen_health_monitor_fan_speed_response.class, response);
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
		return result.xen_health_monitor_fan_speed;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_health_monitor_fan_speed_responses result = (xen_health_monitor_fan_speed_responses) service.get_payload_formatter().string_to_resource(xen_health_monitor_fan_speed_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_health_monitor_fan_speed_response_array);
		}
		xen_health_monitor_fan_speed[] result_xen_health_monitor_fan_speed = new xen_health_monitor_fan_speed[result.xen_health_monitor_fan_speed_response_array.length];
		
		for(int i = 0; i < result.xen_health_monitor_fan_speed_response_array.length; i++)
		{
			result_xen_health_monitor_fan_speed[i] = result.xen_health_monitor_fan_speed_response_array[i].xen_health_monitor_fan_speed[0];
		}
		
		return result_xen_health_monitor_fan_speed;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

	}
}
