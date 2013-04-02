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

import com.citrix.sdx.nitro.resource.config.mps.*;

class host_device_response extends base_response
{
	public host_device[] host_device;
}

class host_device_responses extends base_response
{
	public host_device_response[] host_device_response_array;
}

/**
 * Configuration for host resource
 */

public class host_device extends managed_device
{
	private Double tx;
	private Double memory_total;
	private Integer ssl_cores_total;
	private Double rx;
	private Double memory_usage;
	private String uuid;
	private Integer number_of_cpu;
	private Double memory_free;
	private String uptime;
	private Double cpu_usage;
	private Boolean enabled;
	private Integer ssl_cores_free;
	private Long __count;

	protected String get_object_type()
	{
		return "host_device";
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
	 * Out Throughput (Mbps) of host
	 * </pre>
	 */
	public Double get_tx()
	{
		return this.tx;
	}


	/**
	 * <pre>
	 * Total memory of host in MB
	 * </pre>
	 */
	public Double get_memory_total()
	{
		return this.memory_total;
	}


	/**
	 * <pre>
	 * Total SSL Cores available in host
	 * </pre>
	 */
	public Integer get_ssl_cores_total()
	{
		return this.ssl_cores_total;
	}


	/**
	 * <pre>
	 * In Throughput (Mbps) of host
	 * </pre>
	 */
	public Double get_rx()
	{
		return this.rx;
	}


	/**
	 * <pre>
	 * Memory Usage (%) of host
	 * </pre>
	 */
	public Double get_memory_usage()
	{
		return this.memory_usage;
	}


	/**
	 * <pre>
	 * UUID of host
	 * </pre>
	 */
	public String get_uuid()
	{
		return this.uuid;
	}


	/**
	 * <pre>
	 * Number of total CPU of host
	 * </pre>
	 */
	public Integer get_number_of_cpu()
	{
		return this.number_of_cpu;
	}


	/**
	 * <pre>
	 * Free memory available (MB) in host
	 * </pre>
	 */
	public Double get_memory_free()
	{
		return this.memory_free;
	}


	/**
	 * <pre>
	 * Uptime of host
	 * </pre>
	 */
	public String get_uptime()
	{
		return this.uptime;
	}


	/**
	 * <pre>
	 * CPU Usage (%) of host
	 * </pre>
	 */
	public Double get_cpu_usage()
	{
		return this.cpu_usage;
	}


	/**
	 * <pre>
	 * host State
	 * </pre>
	 */
	public Boolean get_enabled()
	{
		return this.enabled;
	}


	/**
	 * <pre>
	 * Free SSL Cores available in XenServer
	 * </pre>
	 */
	public Integer get_ssl_cores_free()
	{
		return this.ssl_cores_free;
	}


	/**
	 * <pre>
	 * Use this operation to get host.
	 * </pre>
	 */
	public static host_device[] get(nitro_service client) throws Exception
	{
		host_device resource = new host_device();
		resource.validate("get");
		return (host_device[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get host.
	 */
	public static host_device get(nitro_service client, host_device resource) throws Exception
	{
		resource.validate("get");
		return ((host_device[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get host in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of host_device resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static host_device[] get_filtered(nitro_service service, String filter) throws Exception
	{
		host_device obj = new host_device();
		options option = new options();
		option.set_filter(filter);
		host_device[] response = (host_device[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of host_device resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static host_device[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		host_device obj = new host_device();
		options option = new options();
		option.set_filter(filter);
		host_device[] response = (host_device[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the host_device resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		host_device obj = new host_device();
		options option = new options();
		option.set_count(true);
		host_device[] response = (host_device[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of host_device resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		host_device obj = new host_device();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		host_device[] response = (host_device[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of host_device resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		host_device obj = new host_device();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		host_device[] response = (host_device[])obj.get_resources(service, option);
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
		host_device_response result = (host_device_response) service.get_payload_formatter().string_to_resource(host_device_response.class, response);
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
		return result.host_device;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		host_device_responses result = (host_device_responses) service.get_payload_formatter().string_to_resource(host_device_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.host_device_response_array);
		}
		host_device[] result_host_device = new host_device[result.host_device_response_array.length];
		
		for(int i = 0; i < result.host_device_response_array.length; i++)
		{
			result_host_device[i] = result.host_device_response_array[i].host_device[0];
		}
		
		return result_host_device;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString uuid_validator = new MPSString();
		uuid_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		uuid_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		uuid_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		uuid_validator.validate(operationType, uuid, "\"uuid\"");
		
		MPSBoolean enabled_validator = new MPSBoolean();
		enabled_validator.validate(operationType, enabled, "\"enabled\"");
		
		MPSInt number_of_cpu_validator = new MPSInt();
		number_of_cpu_validator.validate(operationType, number_of_cpu, "\"number_of_cpu\"");
		
		MPSDouble cpu_usage_validator = new MPSDouble();
		cpu_usage_validator.validate(operationType, cpu_usage, "\"cpu_usage\"");
		
		MPSDoubleLong memory_total_validator = new MPSDoubleLong();
		memory_total_validator.validate(operationType, memory_total, "\"memory_total\"");
		
		MPSDoubleLong memory_free_validator = new MPSDoubleLong();
		memory_free_validator.validate(operationType, memory_free, "\"memory_free\"");
		
		MPSDouble memory_usage_validator = new MPSDouble();
		memory_usage_validator.validate(operationType, memory_usage, "\"memory_usage\"");
		
		MPSDouble tx_validator = new MPSDouble();
		tx_validator.validate(operationType, tx, "\"tx\"");
		
		MPSDouble rx_validator = new MPSDouble();
		rx_validator.validate(operationType, rx, "\"rx\"");
		
		MPSString uptime_validator = new MPSString();
		uptime_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		uptime_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		uptime_validator.validate(operationType, uptime, "\"uptime\"");
		
		MPSInt ssl_cores_total_validator = new MPSInt();
		ssl_cores_total_validator.validate(operationType, ssl_cores_total, "\"ssl_cores_total\"");
		
		MPSInt ssl_cores_free_validator = new MPSInt();
		ssl_cores_free_validator.validate(operationType, ssl_cores_free, "\"ssl_cores_free\"");
		
	}
}
