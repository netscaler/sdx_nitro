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

package com.citrix.sdx.nitro.resource.config.br_broker;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;
import com.citrix.sdx.nitro.resource.config.mps.*;

class br_broker_response extends base_response
{
	public br_broker[] br_broker;
}

class br_broker_responses extends base_response
{
	public br_broker_response[] br_broker_response_array;
}

/**
 * Configuration for Unified Repeater Instance resource
 */

public class br_broker extends vm_device
{
	private Double lan_out;
	private Double br_broker_memory_usage;
	private String version;
	private Double system_load;
	private Double active_connections;
	private Double wan_out;
	private String ip_list;
	private Double wan_in;
	private Double lan_in;
	private String upsince;
	private Double br_broker_cpu_usage;
	private Long __count;

	protected String get_object_type()
	{
		return "br_broker";
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
	 * LAN Out of Repeater in Mbps
	 * </pre>
	 */
	public Double get_lan_out()
	{
		return this.lan_out;
	}


	/**
	 * <pre>
	 * Memory Usage (%) of Unified Repeater Instance
	 * </pre>
	 */
	public Double get_br_broker_memory_usage()
	{
		return this.br_broker_memory_usage;
	}


	/**
	 * <pre>
	 * Version of Unified Repeater Instance
	 * </pre>
	 */
	public String get_version()
	{
		return this.version;
	}


	/**
	 * <pre>
	 * System Load (%) on Repeater
	 * </pre>
	 */
	public Double get_system_load()
	{
		return this.system_load;
	}


	/**
	 * <pre>
	 * Total Active Connections on Repeater
	 * </pre>
	 */
	public Double get_active_connections()
	{
		return this.active_connections;
	}


	/**
	 * <pre>
	 * WAN Out of Repeater in Mbps
	 * </pre>
	 */
	public Double get_wan_out()
	{
		return this.wan_out;
	}

	/**
	 * <pre>
	 * Specify the list of Repeater IPs for which this device will act as a broker.
	 * </pre>
	 */
	public void set_ip_list(String ip_list)
	{
		this.ip_list = ip_list;
	}

	/**
	 * <pre>
	 * Specify the list of Repeater IPs for which this device will act as a broker.
	 * </pre>
	 */
	public String get_ip_list()
	{
		return this.ip_list;
	}


	/**
	 * <pre>
	 * WAN In of Repeater in Mbps
	 * </pre>
	 */
	public Double get_wan_in()
	{
		return this.wan_in;
	}


	/**
	 * <pre>
	 * Lan In of Repeater in Mbps
	 * </pre>
	 */
	public Double get_lan_in()
	{
		return this.lan_in;
	}


	/**
	 * <pre>
	 * Upsince of Unified Repeater Instance
	 * </pre>
	 */
	public String get_upsince()
	{
		return this.upsince;
	}


	/**
	 * <pre>
	 * CPU Usage (%) of Unified Repeater Instance
	 * </pre>
	 */
	public Double get_br_broker_cpu_usage()
	{
		return this.br_broker_cpu_usage;
	}


	/**
	 * <pre>
	 * Use this operation to reboot Unified Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to reboot Unified Repeater Instance.
	 */
	public static br_broker reboot(nitro_service client, br_broker resource) throws Exception
	{
		return ((br_broker[]) resource.perform_operation(client, "reboot"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to reboot Unified Repeater Instance in bulk.
	 * </pre>
	 */

	public static br_broker[] reboot(nitro_service client, br_broker[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br_broker[]) resources[0].perform_operation(client, "reboot"));
		
		return ((br_broker[]) perform_operation_bulk_request(client, resources, "reboot"));
	}

	/**
	 * <pre>
	 * Use this operation to stop Unified Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to stop Unified Repeater Instance.
	 */
	public static br_broker stop(nitro_service client, br_broker resource) throws Exception
	{
		return ((br_broker[]) resource.perform_operation(client, "stop"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to stop Unified Repeater Instance in bulk.
	 * </pre>
	 */

	public static br_broker[] stop(nitro_service client, br_broker[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br_broker[]) resources[0].perform_operation(client, "stop"));
		
		return ((br_broker[]) perform_operation_bulk_request(client, resources, "stop"));
	}

	/**
	 * <pre>
	 * Use this operation to add Unified Repeater Instance.
	 * </pre>
	 */
	public static br_broker add(nitro_service client, br_broker resource) throws Exception
	{
		resource.validate("add");
		return ((br_broker[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add Unified Repeater Instance in bulk.
	 * </pre>
	 */
	public static br_broker[] add(nitro_service client, br_broker[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((br_broker[]) resources[0].perform_operation(client, "add"));
		
		return ((br_broker[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to force reboot Unified Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to force reboot Unified Repeater Instance.
	 */
	public static br_broker force_reboot(nitro_service client, br_broker resource) throws Exception
	{
		return ((br_broker[]) resource.perform_operation(client, "force_reboot"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to force reboot Unified Repeater Instance in bulk.
	 * </pre>
	 */

	public static br_broker[] force_reboot(nitro_service client, br_broker[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br_broker[]) resources[0].perform_operation(client, "force_reboot"));
		
		return ((br_broker[]) perform_operation_bulk_request(client, resources, "force_reboot"));
	}

	/**
	 * <pre>
	 * Use this operation to get Unified Repeater Instance.
	 * </pre>
	 */
	public static br_broker[] get(nitro_service client) throws Exception
	{
		br_broker resource = new br_broker();
		resource.validate("get");
		return (br_broker[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get Unified Repeater Instance.
	 */
	public static br_broker get(nitro_service client, br_broker resource) throws Exception
	{
		resource.validate("get");
		return ((br_broker[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get Unified Repeater Instance in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to delete Unified Repeater Instances.
	 * </pre>
	 */
	public static br_broker delete(nitro_service client, br_broker resource) throws Exception
	{
		resource.validate("delete");
		return ((br_broker[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete Unified Repeater Instances in bulk.
	 * </pre>
	 */
	public static br_broker[] delete(nitro_service client, br_broker[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((br_broker[]) resources[0].delete_resource(client));
		
		return ((br_broker[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to modify Unified Repeater Instance.
	 * </pre>
	 */
	public static br_broker update(nitro_service client, br_broker resource) throws Exception
	{
		resource.validate("modify");
		return ((br_broker[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify Unified Repeater Instance in bulk.
	 * </pre>
	 */
	public static br_broker[] update(nitro_service client, br_broker[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((br_broker[]) resources[0].update_resource(client));
		
		return ((br_broker[]) update_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to force stop Unified Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to force stop Unified Repeater Instance.
	 */
	public static br_broker force_stop(nitro_service client, br_broker resource) throws Exception
	{
		return ((br_broker[]) resource.perform_operation(client, "force_stop"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to force stop Unified Repeater Instance in bulk.
	 * </pre>
	 */

	public static br_broker[] force_stop(nitro_service client, br_broker[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br_broker[]) resources[0].perform_operation(client, "force_stop"));
		
		return ((br_broker[]) perform_operation_bulk_request(client, resources, "force_stop"));
	}

	/**
	 * <pre>
	 * Use this operation to start Unified Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to start Unified Repeater Instance.
	 */
	public static br_broker start(nitro_service client, br_broker resource) throws Exception
	{
		return ((br_broker[]) resource.perform_operation(client, "start"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to start Unified Repeater Instance in bulk.
	 * </pre>
	 */

	public static br_broker[] start(nitro_service client, br_broker[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br_broker[]) resources[0].perform_operation(client, "start"));
		
		return ((br_broker[]) perform_operation_bulk_request(client, resources, "start"));
	}

	/**
	* Use this API to fetch filtered set of br_broker resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static br_broker[] get_filtered(nitro_service service, String filter) throws Exception
	{
		br_broker obj = new br_broker();
		options option = new options();
		option.set_filter(filter);
		br_broker[] response = (br_broker[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of br_broker resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static br_broker[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br_broker obj = new br_broker();
		options option = new options();
		option.set_filter(filter);
		br_broker[] response = (br_broker[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the br_broker resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		br_broker obj = new br_broker();
		options option = new options();
		option.set_count(true);
		br_broker[] response = (br_broker[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br_broker resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		br_broker obj = new br_broker();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br_broker[] response = (br_broker[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br_broker resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br_broker obj = new br_broker();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br_broker[] response = (br_broker[])obj.get_resources(service, option);
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
		br_broker_response result = (br_broker_response) service.get_payload_formatter().string_to_resource(br_broker_response.class, response);
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
		return result.br_broker;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_broker_responses result = (br_broker_responses) service.get_payload_formatter().string_to_resource(br_broker_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_broker_response_array);
		}
		br_broker[] result_br_broker = new br_broker[result.br_broker_response_array.length];
		
		for(int i = 0; i < result.br_broker_response_array.length; i++)
		{
			result_br_broker[i] = result.br_broker_response_array[i].br_broker[0];
		}
		
		return result_br_broker;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSDouble br_broker_cpu_usage_validator = new MPSDouble();
		br_broker_cpu_usage_validator.validate(operationType, br_broker_cpu_usage, "\"br_broker_cpu_usage\"");
		
		MPSDouble br_broker_memory_usage_validator = new MPSDouble();
		br_broker_memory_usage_validator.validate(operationType, br_broker_memory_usage, "\"br_broker_memory_usage\"");
		
		MPSString upsince_validator = new MPSString();
		upsince_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		upsince_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		upsince_validator.validate(operationType, upsince, "\"upsince\"");
		
		MPSString version_validator = new MPSString();
		version_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		version_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		version_validator.validate(operationType, version, "\"version\"");
		
		MPSString ip_list_validator = new MPSString();
		ip_list_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 1024);
		ip_list_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ip_list_validator.validate(operationType, ip_list, "\"ip_list\"");
		
		MPSDouble system_load_validator = new MPSDouble();
		system_load_validator.validate(operationType, system_load, "\"system_load\"");
		
		MPSDouble active_connections_validator = new MPSDouble();
		active_connections_validator.validate(operationType, active_connections, "\"active_connections\"");
		
		MPSDouble wan_in_validator = new MPSDouble();
		wan_in_validator.validate(operationType, wan_in, "\"wan_in\"");
		
		MPSDouble lan_in_validator = new MPSDouble();
		lan_in_validator.validate(operationType, lan_in, "\"lan_in\"");
		
		MPSDouble wan_out_validator = new MPSDouble();
		wan_out_validator.validate(operationType, wan_out, "\"wan_out\"");
		
		MPSDouble lan_out_validator = new MPSDouble();
		lan_out_validator.validate(operationType, lan_out, "\"lan_out\"");
		
	}
}
