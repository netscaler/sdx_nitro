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

package com.citrix.sdx.nitro.resource.config.br;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;
import com.citrix.sdx.nitro.resource.config.mps.*;

class br_response extends base_response
{
	public br[] br;
}

class br_responses extends base_response
{
	public br_response[] br_response_array;
}

/**
 * Configuration for Repeater Instance resource
 */

public class br extends vm_device
{
	private String connected_plugins;
	private String bandwidth_mode;
	private String ha_peer_ip_address;
	private Double wan_out_prev;
	private String ha_peer_state;
	private String havmip;
	private Double lan_in_prev;
	private Double wan_in_prev;
	private Double lan_out_prev;
	private Double lan_in;
	private String bypass;
	private Double ha_peer_id;
	private String upsince;
	private Double lan_out;
	private String plugin_ip_address;
	private String max_plugins;
	private Double active_connections;
	private Double wan_out;
	private Double wan_in;
	private Double br_cpu_usage;
	private String unacl_connections;
	private Double prev_poll_time;
	private Double system_load;
	private String apa_ip_address;
	private String apa_netmask;
	private String apa_gateway;
	private String acl_connections;
	private Double bandwidth_limit;
	private String ha_state;
	private Double br_memory_usage;
	private String operation_status;
	private Long __count;

	protected String get_object_type()
	{
		return "br";
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
	 * connected plugins
	 * </pre>
	 */
	public String get_connected_plugins()
	{
		return this.connected_plugins;
	}


	/**
	 * <pre>
	 * Boost status : Bandwidth Mode of Repeater Instance
	 * </pre>
	 */
	public String get_bandwidth_mode()
	{
		return this.bandwidth_mode;
	}


	/**
	 * <pre>
	 * Peer IP Address of Repeater Instance
	 * </pre>
	 */
	public String get_ha_peer_ip_address()
	{
		return this.ha_peer_ip_address;
	}


	/**
	 * <pre>
	 * WAN In of Repeater Instance in Mbps
	 * </pre>
	 */
	public Double get_wan_out_prev()
	{
		return this.wan_out_prev;
	}


	/**
	 * <pre>
	 * Peer State of Repeater Instance in HA mode
	 * </pre>
	 */
	public String get_ha_peer_state()
	{
		return this.ha_peer_state;
	}


	/**
	 * <pre>
	 * HA VM IPAddress
	 * </pre>
	 */
	public String get_havmip()
	{
		return this.havmip;
	}


	/**
	 * <pre>
	 * Lan In of Repeater Instance in Mbps
	 * </pre>
	 */
	public Double get_lan_in_prev()
	{
		return this.lan_in_prev;
	}


	/**
	 * <pre>
	 * WAN In of Repeater Instance in Mbps
	 * </pre>
	 */
	public Double get_wan_in_prev()
	{
		return this.wan_in_prev;
	}


	/**
	 * <pre>
	 * Lan In of Repeater Instance in Mbps
	 * </pre>
	 */
	public Double get_lan_out_prev()
	{
		return this.lan_out_prev;
	}


	/**
	 * <pre>
	 * Lan In of Repeater Instance in Mbps
	 * </pre>
	 */
	public Double get_lan_in()
	{
		return this.lan_in;
	}


	/**
	 * <pre>
	 * bypass value of Repeater Instance
	 * </pre>
	 */
	public String get_bypass()
	{
		return this.bypass;
	}


	/**
	 * <pre>
	 * Id of the Peer in an HA setup
	 * </pre>
	 */
	public Double get_ha_peer_id()
	{
		return this.ha_peer_id;
	}


	/**
	 * <pre>
	 * Upsince of Repeater Instance
	 * </pre>
	 */
	public String get_upsince()
	{
		return this.upsince;
	}


	/**
	 * <pre>
	 * LAN Out of Repeater Instance in Mbps
	 * </pre>
	 */
	public Double get_lan_out()
	{
		return this.lan_out;
	}

	/**
	 * <pre>
	 * Plugin IP Address
	 * </pre>
	 */
	public void set_plugin_ip_address(String plugin_ip_address)
	{
		this.plugin_ip_address = plugin_ip_address;
	}

	/**
	 * <pre>
	 * Plugin IP Address
	 * </pre>
	 */
	public String get_plugin_ip_address()
	{
		return this.plugin_ip_address;
	}


	/**
	 * <pre>
	 * Maximum plugins
	 * </pre>
	 */
	public String get_max_plugins()
	{
		return this.max_plugins;
	}


	/**
	 * <pre>
	 * Total Active Connections on Repeater Instance
	 * </pre>
	 */
	public Double get_active_connections()
	{
		return this.active_connections;
	}


	/**
	 * <pre>
	 * WAN Out of Repeater Instance in Mbps
	 * </pre>
	 */
	public Double get_wan_out()
	{
		return this.wan_out;
	}


	/**
	 * <pre>
	 * WAN In of Repeater Instance in Mbps
	 * </pre>
	 */
	public Double get_wan_in()
	{
		return this.wan_in;
	}


	/**
	 * <pre>
	 * CPU Usage (%) of Repeater Instance
	 * </pre>
	 */
	public Double get_br_cpu_usage()
	{
		return this.br_cpu_usage;
	}


	/**
	 * <pre>
	 * non-accelerated connections
	 * </pre>
	 */
	public String get_unacl_connections()
	{
		return this.unacl_connections;
	}


	/**
	 * <pre>
	 * Previous time
	 * </pre>
	 */
	public Double get_prev_poll_time()
	{
		return this.prev_poll_time;
	}


	/**
	 * <pre>
	 * System Load (%) on Repeater Instance
	 * </pre>
	 */
	public Double get_system_load()
	{
		return this.system_load;
	}

	/**
	 * <pre>
	 * aPA IP Address
	 * </pre>
	 */
	public void set_apa_ip_address(String apa_ip_address)
	{
		this.apa_ip_address = apa_ip_address;
	}

	/**
	 * <pre>
	 * aPA IP Address
	 * </pre>
	 */
	public String get_apa_ip_address()
	{
		return this.apa_ip_address;
	}

	/**
	 * <pre>
	 * aPA Netmask
	 * </pre>
	 */
	public void set_apa_netmask(String apa_netmask)
	{
		this.apa_netmask = apa_netmask;
	}

	/**
	 * <pre>
	 * aPA Netmask
	 * </pre>
	 */
	public String get_apa_netmask()
	{
		return this.apa_netmask;
	}

	/**
	 * <pre>
	 * aPA Gateway
	 * </pre>
	 */
	public void set_apa_gateway(String apa_gateway)
	{
		this.apa_gateway = apa_gateway;
	}

	/**
	 * <pre>
	 * aPA Gateway
	 * </pre>
	 */
	public String get_apa_gateway()
	{
		return this.apa_gateway;
	}


	/**
	 * <pre>
	 * Accelerated Connections
	 * </pre>
	 */
	public String get_acl_connections()
	{
		return this.acl_connections;
	}


	/**
	 * <pre>
	 * bandwidth limit of Repeater Instance (K-Bits/sec)
	 * </pre>
	 */
	public Double get_bandwidth_limit()
	{
		return this.bandwidth_limit;
	}


	/**
	 * <pre>
	 * State of Repeater Instance in HA mode
	 * </pre>
	 */
	public String get_ha_state()
	{
		return this.ha_state;
	}


	/**
	 * <pre>
	 * Memory Usage (%) of Repeater Instance
	 * </pre>
	 */
	public Double get_br_memory_usage()
	{
		return this.br_memory_usage;
	}


	/**
	 * <pre>
	 * Operation status of Repeater Instance
	 * </pre>
	 */
	public String get_operation_status()
	{
		return this.operation_status;
	}


	/**
	 * <pre>
	 * Use this operation to reboot Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to reboot Repeater Instance.
	 */
	public static br reboot(nitro_service client, br resource) throws Exception
	{
		return ((br[]) resource.perform_operation(client, "reboot"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to reboot Repeater Instance in bulk.
	 * </pre>
	 */

	public static br[] reboot(nitro_service client, br[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br[]) resources[0].perform_operation(client, "reboot"));
		
		return ((br[]) perform_operation_bulk_request(client, resources, "reboot"));
	}

	/**
	 * <pre>
	 * Use this operation to stop Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to stop Repeater Instance.
	 */
	public static br stop(nitro_service client, br resource) throws Exception
	{
		return ((br[]) resource.perform_operation(client, "stop"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to stop Repeater Instance in bulk.
	 * </pre>
	 */

	public static br[] stop(nitro_service client, br[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br[]) resources[0].perform_operation(client, "stop"));
		
		return ((br[]) perform_operation_bulk_request(client, resources, "stop"));
	}

	/**
	 * <pre>
	 * Use this operation to add Repeater Instance.
	 * </pre>
	 */
	public static br add(nitro_service client, br resource) throws Exception
	{
		resource.validate("add");
		return ((br[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add Repeater Instance in bulk.
	 * </pre>
	 */
	public static br[] add(nitro_service client, br[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((br[]) resources[0].perform_operation(client, "add"));
		
		return ((br[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to force reboot Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to force reboot Repeater Instance.
	 */
	public static br force_reboot(nitro_service client, br resource) throws Exception
	{
		return ((br[]) resource.perform_operation(client, "force_reboot"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to force reboot Repeater Instance in bulk.
	 * </pre>
	 */

	public static br[] force_reboot(nitro_service client, br[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br[]) resources[0].perform_operation(client, "force_reboot"));
		
		return ((br[]) perform_operation_bulk_request(client, resources, "force_reboot"));
	}

	/**
	 * <pre>
	 * Use this operation to get Repeater Instance.
	 * </pre>
	 */
	public static br[] get(nitro_service client) throws Exception
	{
		br resource = new br();
		resource.validate("get");
		return (br[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get Repeater Instance.
	 */
	public static br get(nitro_service client, br resource) throws Exception
	{
		resource.validate("get");
		return ((br[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get Repeater Instance in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to delete Repeater Instances.
	 * </pre>
	 */
	public static br delete(nitro_service client, br resource) throws Exception
	{
		resource.validate("delete");
		return ((br[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete Repeater Instances in bulk.
	 * </pre>
	 */
	public static br[] delete(nitro_service client, br[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((br[]) resources[0].delete_resource(client));
		
		return ((br[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to modify Repeater Instance.
	 * </pre>
	 */
	public static br update(nitro_service client, br resource) throws Exception
	{
		resource.validate("modify");
		return ((br[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify Repeater Instance in bulk.
	 * </pre>
	 */
	public static br[] update(nitro_service client, br[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((br[]) resources[0].update_resource(client));
		
		return ((br[]) update_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to force stop Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to force stop Repeater Instance.
	 */
	public static br force_stop(nitro_service client, br resource) throws Exception
	{
		return ((br[]) resource.perform_operation(client, "force_stop"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to force stop Repeater Instance in bulk.
	 * </pre>
	 */

	public static br[] force_stop(nitro_service client, br[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br[]) resources[0].perform_operation(client, "force_stop"));
		
		return ((br[]) perform_operation_bulk_request(client, resources, "force_stop"));
	}

	/**
	 * <pre>
	 * Use this operation to start Repeater Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to start Repeater Instance.
	 */
	public static br start(nitro_service client, br resource) throws Exception
	{
		return ((br[]) resource.perform_operation(client, "start"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to start Repeater Instance in bulk.
	 * </pre>
	 */

	public static br[] start(nitro_service client, br[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((br[]) resources[0].perform_operation(client, "start"));
		
		return ((br[]) perform_operation_bulk_request(client, resources, "start"));
	}

	/**
	* Use this API to fetch filtered set of br resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static br[] get_filtered(nitro_service service, String filter) throws Exception
	{
		br obj = new br();
		options option = new options();
		option.set_filter(filter);
		br[] response = (br[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of br resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static br[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br obj = new br();
		options option = new options();
		option.set_filter(filter);
		br[] response = (br[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the br resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		br obj = new br();
		options option = new options();
		option.set_count(true);
		br[] response = (br[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		br obj = new br();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br[] response = (br[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br obj = new br();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br[] response = (br[])obj.get_resources(service, option);
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
		br_response result = (br_response) service.get_payload_formatter().string_to_resource(br_response.class, response);
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
		return result.br;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_responses result = (br_responses) service.get_payload_formatter().string_to_resource(br_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_response_array);
		}
		br[] result_br = new br[result.br_response_array.length];
		
		for(int i = 0; i < result.br_response_array.length; i++)
		{
			result_br[i] = result.br_response_array[i].br[0];
		}
		
		return result_br;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSDouble br_cpu_usage_validator = new MPSDouble();
		br_cpu_usage_validator.validate(operationType, br_cpu_usage, "\"br_cpu_usage\"");
		
		MPSDouble br_memory_usage_validator = new MPSDouble();
		br_memory_usage_validator.validate(operationType, br_memory_usage, "\"br_memory_usage\"");
		
		MPSDouble wan_out_validator = new MPSDouble();
		wan_out_validator.validate(operationType, wan_out, "\"wan_out\"");
		
		MPSDouble lan_out_validator = new MPSDouble();
		lan_out_validator.validate(operationType, lan_out, "\"lan_out\"");
		
		MPSString upsince_validator = new MPSString();
		upsince_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		upsince_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		upsince_validator.validate(operationType, upsince, "\"upsince\"");
		
		MPSString ha_peer_state_validator = new MPSString();
		ha_peer_state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		ha_peer_state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ha_peer_state_validator.validate(operationType, ha_peer_state, "\"ha_peer_state\"");
		
		MPSString ha_state_validator = new MPSString();
		ha_state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		ha_state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ha_state_validator.validate(operationType, ha_state, "\"ha_state\"");
		
		MPSIPAddress ha_peer_ip_address_validator = new MPSIPAddress();
		ha_peer_ip_address_validator.validate(operationType, ha_peer_ip_address, "\"ha_peer_ip_address\"");
		
		MPSDouble ha_peer_id_validator = new MPSDouble();
		ha_peer_id_validator.validate(operationType, ha_peer_id, "\"ha_peer_id\"");
		
		MPSString operation_status_validator = new MPSString();
		operation_status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		operation_status_validator.validate(operationType, operation_status, "\"operation_status\"");
		
		MPSString bypass_validator = new MPSString();
		bypass_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		bypass_validator.validate(operationType, bypass, "\"bypass\"");
		
		MPSString bandwidth_mode_validator = new MPSString();
		bandwidth_mode_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		bandwidth_mode_validator.validate(operationType, bandwidth_mode, "\"bandwidth_mode\"");
		
		MPSDoubleLong bandwidth_limit_validator = new MPSDoubleLong();
		bandwidth_limit_validator.validate(operationType, bandwidth_limit, "\"bandwidth_limit\"");
		
		MPSIPAddress havmip_validator = new MPSIPAddress();
		havmip_validator.validate(operationType, havmip, "\"havmip\"");
		
		MPSString acl_connections_validator = new MPSString();
		acl_connections_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		acl_connections_validator.validate(operationType, acl_connections, "\"acl_connections\"");
		
		MPSString unacl_connections_validator = new MPSString();
		unacl_connections_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		unacl_connections_validator.validate(operationType, unacl_connections, "\"unacl_connections\"");
		
		MPSString connected_plugins_validator = new MPSString();
		connected_plugins_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		connected_plugins_validator.validate(operationType, connected_plugins, "\"connected_plugins\"");
		
		MPSString max_plugins_validator = new MPSString();
		max_plugins_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		max_plugins_validator.validate(operationType, max_plugins, "\"max_plugins\"");
		
		MPSDouble wan_in_validator = new MPSDouble();
		wan_in_validator.validate(operationType, wan_in, "\"wan_in\"");
		
		MPSDouble lan_in_validator = new MPSDouble();
		lan_in_validator.validate(operationType, lan_in, "\"lan_in\"");
		
		MPSDouble wan_out_prev_validator = new MPSDouble();
		wan_out_prev_validator.validate(operationType, wan_out_prev, "\"wan_out_prev\"");
		
		MPSDouble lan_out_prev_validator = new MPSDouble();
		lan_out_prev_validator.validate(operationType, lan_out_prev, "\"lan_out_prev\"");
		
		MPSDouble wan_in_prev_validator = new MPSDouble();
		wan_in_prev_validator.validate(operationType, wan_in_prev, "\"wan_in_prev\"");
		
		MPSDouble lan_in_prev_validator = new MPSDouble();
		lan_in_prev_validator.validate(operationType, lan_in_prev, "\"lan_in_prev\"");
		
		MPSDouble prev_poll_time_validator = new MPSDouble();
		prev_poll_time_validator.validate(operationType, prev_poll_time, "\"prev_poll_time\"");
		
		MPSIPAddress apa_ip_address_validator = new MPSIPAddress();
		apa_ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		apa_ip_address_validator.validate(operationType, apa_ip_address, "\"apa_ip_address\"");
		
		MPSIPAddress apa_netmask_validator = new MPSIPAddress();
		apa_netmask_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		apa_netmask_validator.validate(operationType, apa_netmask, "\"apa_netmask\"");
		
		MPSIPAddress apa_gateway_validator = new MPSIPAddress();
		apa_gateway_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		apa_gateway_validator.validate(operationType, apa_gateway, "\"apa_gateway\"");
		
		MPSIPAddress plugin_ip_address_validator = new MPSIPAddress();
		plugin_ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		plugin_ip_address_validator.validate(operationType, plugin_ip_address, "\"plugin_ip_address\"");
		
		MPSDouble system_load_validator = new MPSDouble();
		system_load_validator.validate(operationType, system_load, "\"system_load\"");
		
		MPSDouble active_connections_validator = new MPSDouble();
		active_connections_validator.validate(operationType, active_connections, "\"active_connections\"");
		
	}
}
