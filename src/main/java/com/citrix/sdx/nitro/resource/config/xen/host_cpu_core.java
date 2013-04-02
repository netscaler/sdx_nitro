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

class host_cpu_core_response extends base_response
{
	public host_cpu_core[] host_cpu_core;
}

class host_cpu_core_responses extends base_response
{
	public host_cpu_core_response[] host_cpu_core_response_array;
}

/**
 * Configuration for Host CPU Cores resource
 */

public class host_cpu_core extends base_resource
{
	private String instances;
	private Integer cpu;
	private Integer core_number;
	private Double avg_usage;
	private String hyper_threads;
	private Long __count;

	protected String get_object_type()
	{
		return "host_cpu_core";
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
	 * VM Instances running on this Core
	 * </pre>
	 */
	public String get_instances()
	{
		return this.instances;
	}


	/**
	 * <pre>
	 * Physical CPU to which the Core belongs to (0 or 1)
	 * </pre>
	 */
	public Integer get_cpu()
	{
		return this.cpu;
	}


	/**
	 * <pre>
	 * Core Number
	 * </pre>
	 */
	public Integer get_core_number()
	{
		return this.core_number;
	}


	/**
	 * <pre>
	 * Average CPU Usage (%)
	 * </pre>
	 */
	public Double get_avg_usage()
	{
		return this.avg_usage;
	}


	/**
	 * <pre>
	 * Hyper-threads assoicated with this Core
	 * </pre>
	 */
	public String get_hyper_threads()
	{
		return this.hyper_threads;
	}


	/**
	 * <pre>
	 * Use this operation to get CPU Cores.
	 * </pre>
	 */
	public static host_cpu_core[] get(nitro_service client) throws Exception
	{
		host_cpu_core resource = new host_cpu_core();
		resource.validate("get");
		return (host_cpu_core[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of host_cpu_core resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static host_cpu_core[] get_filtered(nitro_service service, String filter) throws Exception
	{
		host_cpu_core obj = new host_cpu_core();
		options option = new options();
		option.set_filter(filter);
		host_cpu_core[] response = (host_cpu_core[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of host_cpu_core resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static host_cpu_core[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		host_cpu_core obj = new host_cpu_core();
		options option = new options();
		option.set_filter(filter);
		host_cpu_core[] response = (host_cpu_core[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the host_cpu_core resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		host_cpu_core obj = new host_cpu_core();
		options option = new options();
		option.set_count(true);
		host_cpu_core[] response = (host_cpu_core[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of host_cpu_core resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		host_cpu_core obj = new host_cpu_core();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		host_cpu_core[] response = (host_cpu_core[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of host_cpu_core resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		host_cpu_core obj = new host_cpu_core();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		host_cpu_core[] response = (host_cpu_core[])obj.get_resources(service, option);
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
		host_cpu_core_response result = (host_cpu_core_response) service.get_payload_formatter().string_to_resource(host_cpu_core_response.class, response);
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
		return result.host_cpu_core;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		host_cpu_core_responses result = (host_cpu_core_responses) service.get_payload_formatter().string_to_resource(host_cpu_core_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.host_cpu_core_response_array);
		}
		host_cpu_core[] result_host_cpu_core = new host_cpu_core[result.host_cpu_core_response_array.length];
		
		for(int i = 0; i < result.host_cpu_core_response_array.length; i++)
		{
			result_host_cpu_core[i] = result.host_cpu_core_response_array[i].host_cpu_core[0];
		}
		
		return result_host_cpu_core;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt core_number_validator = new MPSInt();
		core_number_validator.validate(operationType, core_number, "\"core_number\"");
		
		MPSInt cpu_validator = new MPSInt();
		cpu_validator.validate(operationType, cpu, "\"cpu\"");
		
		MPSString hyper_threads_validator = new MPSString();
		hyper_threads_validator.validate(operationType, hyper_threads, "\"hyper_threads\"");
		
		MPSString instances_validator = new MPSString();
		instances_validator.validate(operationType, instances, "\"instances\"");
		
		MPSDouble avg_usage_validator = new MPSDouble();
		avg_usage_validator.validate(operationType, avg_usage, "\"avg_usage\"");
		
	}
}
