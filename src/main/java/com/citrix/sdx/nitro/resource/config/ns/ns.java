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

import com.citrix.sdx.nitro.resource.config.mps.*;

class ns_response extends base_response
{
	public ns[] ns;
}

class ns_responses extends base_response
{
	public ns_response[] ns_response_array;
}

/**
 * Configuration for NetScaler resource
 */

public class ns extends vm_device
{
	private Double ns_rx;
	private Boolean if_0_2;
	private String node_state;
	private String plugin_ip_address;
	private Boolean if_0_1;
	private Integer vlan_type;
	private String ns_ip_address;
	private Integer nsvlan_id;
	private String cmd_policy;
	private String password;
	private Boolean nsvlan_tagged;
	private Double ns_memory_usage;
	private String ha_master_state;
	private Double ns_mgmt_cpu_usage;
	private String upsince_persisted;
	private Double http_req;
	private Double pps;
	private String ha_sync;
	private Double ns_tx;
	private String license;
	private String ha_ip_address;
	private String username;
	private String config_progress_status;
	private Double ns_cpu_usage;
	private Integer number_of_ssl_cores_up;
	private String upsince;
	private String[] nsvlan_interfaces;
	private Long __count;

	protected String get_object_type()
	{
		return "ns";
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
	 * In Throughput of NetScaler Instance in Mbps
	 * </pre>
	 */
	public Double get_ns_rx()
	{
		return this.ns_rx;
	}

	/**
	 * <pre>
	 * Network 0/2 on VM Instance
	 * </pre>
	 */
	public void set_if_0_2(Boolean if_0_2)
	{
		this.if_0_2 = if_0_2;
	}

	/**
	 * <pre>
	 * Network 0/2 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_0_2()
	{
		return this.if_0_2;
	}


	/**
	 * <pre>
	 * Node State of NetScaler Instance
	 * </pre>
	 */
	public String get_node_state()
	{
		return this.node_state;
	}

	/**
	 * <pre>
	 * Signaling IP Address
	 * </pre>
	 */
	public void set_plugin_ip_address(String plugin_ip_address)
	{
		this.plugin_ip_address = plugin_ip_address;
	}

	/**
	 * <pre>
	 * Signaling IP Address
	 * </pre>
	 */
	public String get_plugin_ip_address()
	{
		return this.plugin_ip_address;
	}

	/**
	 * <pre>
	 * Network 0/1 on VM Instance
	 * </pre>
	 */
	public void set_if_0_1(Boolean if_0_1)
	{
		this.if_0_1 = if_0_1;
	}

	/**
	 * <pre>
	 * Network 0/1 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_0_1()
	{
		return this.if_0_1;
	}

	/**
	 * <pre>
	 * VLAN Type, NS or L2 VLAN
	 * </pre>
	 */
	public void set_vlan_type(Integer vlan_type)
	{
		this.vlan_type = vlan_type;
	}

	/**
	 * <pre>
	 * VLAN Type, NS or L2 VLAN
	 * </pre>
	 */
	public Integer get_vlan_type()
	{
		return this.vlan_type;
	}

	/**
	 * <pre>
	 * NS IP Address for this managed device
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NS IP Address for this managed device
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}

	/**
	 * <pre>
	 * VLAN Id
	 * </pre>
	 */
	public void set_nsvlan_id(Integer nsvlan_id)
	{
		this.nsvlan_id = nsvlan_id;
	}

	/**
	 * <pre>
	 * VLAN Id
	 * </pre>
	 */
	public Integer get_nsvlan_id()
	{
		return this.nsvlan_id;
	}

	/**
	 * <pre>
	 * true if you want to allow shell/sftp/scp access to NetScaler Instance administrator
	 * </pre>
	 */
	public void set_cmd_policy(String cmd_policy)
	{
		this.cmd_policy = cmd_policy;
	}

	/**
	 * <pre>
	 * true if you want to allow shell/sftp/scp access to NetScaler Instance administrator
	 * </pre>
	 */
	public String get_cmd_policy()
	{
		return this.cmd_policy;
	}

	/**
	 * <pre>
	 * Password for specified user on NetScaler Instance
	 * </pre>
	 */
	public void set_password(String password)
	{
		this.password = password;
	}

	/**
	 * <pre>
	 * Password for specified user on NetScaler Instance
	 * </pre>
	 */
	public String get_password()
	{
		return this.password;
	}

	/**
	 * <pre>
	 * NSVLAN Tagged
	 * </pre>
	 */
	public void set_nsvlan_tagged(Boolean nsvlan_tagged)
	{
		this.nsvlan_tagged = nsvlan_tagged;
	}

	/**
	 * <pre>
	 * NSVLAN Tagged
	 * </pre>
	 */
	public Boolean get_nsvlan_tagged()
	{
		return this.nsvlan_tagged;
	}


	/**
	 * <pre>
	 * Memory Usage (%) of NetScaler Instance
	 * </pre>
	 */
	public Double get_ns_memory_usage()
	{
		return this.ns_memory_usage;
	}


	/**
	 * <pre>
	 * Master State (Primary/Secondary) of NetScaler Instance
	 * </pre>
	 */
	public String get_ha_master_state()
	{
		return this.ha_master_state;
	}


	/**
	 * <pre>
	 * Management CPU Usage (%) of NetScaler Instance
	 * </pre>
	 */
	public Double get_ns_mgmt_cpu_usage()
	{
		return this.ns_mgmt_cpu_usage;
	}


	/**
	 * <pre>
	 * Upsince of NetScaler Instance
	 * </pre>
	 */
	public String get_upsince_persisted()
	{
		return this.upsince_persisted;
	}


	/**
	 * <pre>
	 * HTTP Requests/second on NetScaler Instance
	 * </pre>
	 */
	public Double get_http_req()
	{
		return this.http_req;
	}

	/**
	 * <pre>
	 * Assign packets per seconds to NetScaler Instance
	 * </pre>
	 */
	public void set_pps(Double pps)
	{
		this.pps = pps;
	}

	/**
	 * <pre>
	 * Assign packets per seconds to NetScaler Instance
	 * </pre>
	 */
	public Double get_pps()
	{
		return this.pps;
	}


	/**
	 * <pre>
	 * The state of synchronization of NetScaler Instance
	 * </pre>
	 */
	public String get_ha_sync()
	{
		return this.ha_sync;
	}


	/**
	 * <pre>
	 * Out Throughput of NetScaler Instance in Mbps
	 * </pre>
	 */
	public Double get_ns_tx()
	{
		return this.ns_tx;
	}

	/**
	 * <pre>
	 * Feature License for NetScaler Instance, needs to be set while provisioning (standard, enterprise, platinum)
	 * </pre>
	 */
	public void set_license(String license)
	{
		this.license = license;
	}

	/**
	 * <pre>
	 * Feature License for NetScaler Instance, needs to be set while provisioning (standard, enterprise, platinum)
	 * </pre>
	 */
	public String get_license()
	{
		return this.license;
	}


	/**
	 * <pre>
	 * Peer IP Address of NetScaler Instance
	 * </pre>
	 */
	public String get_ha_ip_address()
	{
		return this.ha_ip_address;
	}

	/**
	 * <pre>
	 * User Name (except nsroot) to be configured on NetScaler Instance
	 * </pre>
	 */
	public void set_username(String username)
	{
		this.username = username;
	}

	/**
	 * <pre>
	 * User Name (except nsroot) to be configured on NetScaler Instance
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}


	/**
	 * <pre>
	 * Config Progress Status
	 * </pre>
	 */
	public String get_config_progress_status()
	{
		return this.config_progress_status;
	}


	/**
	 * <pre>
	 * CPU Usage (%) of NetScaler Instance
	 * </pre>
	 */
	public Double get_ns_cpu_usage()
	{
		return this.ns_cpu_usage;
	}

	/**
	 * <pre>
	 * Number of SSL Cores Up
	 * </pre>
	 */
	public void set_number_of_ssl_cores_up(Integer number_of_ssl_cores_up)
	{
		this.number_of_ssl_cores_up = number_of_ssl_cores_up;
	}

	/**
	 * <pre>
	 * Number of SSL Cores Up
	 * </pre>
	 */
	public Integer get_number_of_ssl_cores_up()
	{
		return this.number_of_ssl_cores_up;
	}


	/**
	 * <pre>
	 * Upsince of NetScaler Instance
	 * </pre>
	 */
	public String get_upsince()
	{
		return this.upsince;
	}

	/**
	 * <pre>
	 * VLAN Interfaces
	 * </pre>
	 */
	public void set_nsvlan_interfaces(String[] nsvlan_interfaces)
	{
		this.nsvlan_interfaces = nsvlan_interfaces;
	}

	/**
	 * <pre>
	 * VLAN Interfaces
	 * </pre>
	 */
	public String[] get_nsvlan_interfaces()
	{
		return this.nsvlan_interfaces;
	}


	/**
	 * <pre>
	 * Use this operation to reboot NetScaler Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to reboot NetScaler Instance.
	 */
	public static ns reboot(nitro_service client, ns resource) throws Exception
	{
		return ((ns[]) resource.perform_operation(client, "reboot"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to reboot NetScaler Instance in bulk.
	 * </pre>
	 */

	public static ns[] reboot(nitro_service client, ns[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((ns[]) resources[0].perform_operation(client, "reboot"));
		
		return ((ns[]) perform_operation_bulk_request(client, resources, "reboot"));
	}

	/**
	 * <pre>
	 * Use this operation to stop NetScaler Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to stop NetScaler Instance.
	 */
	public static ns stop(nitro_service client, ns resource) throws Exception
	{
		return ((ns[]) resource.perform_operation(client, "stop"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to stop NetScaler Instance in bulk.
	 * </pre>
	 */

	public static ns[] stop(nitro_service client, ns[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((ns[]) resources[0].perform_operation(client, "stop"));
		
		return ((ns[]) perform_operation_bulk_request(client, resources, "stop"));
	}

	/**
	 * <pre>
	 * Use this operation to add NetScaler Instance.
	 * </pre>
	 */
	public static ns add(nitro_service client, ns resource) throws Exception
	{
		resource.validate("add");
		return ((ns[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add NetScaler Instance in bulk.
	 * </pre>
	 */
	public static ns[] add(nitro_service client, ns[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns[]) resources[0].perform_operation(client, "add"));
		
		return ((ns[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to force reboot NetScaler Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to force reboot NetScaler Instance.
	 */
	public static ns force_reboot(nitro_service client, ns resource) throws Exception
	{
		return ((ns[]) resource.perform_operation(client, "force_reboot"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to force reboot NetScaler Instance in bulk.
	 * </pre>
	 */

	public static ns[] force_reboot(nitro_service client, ns[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((ns[]) resources[0].perform_operation(client, "force_reboot"));
		
		return ((ns[]) perform_operation_bulk_request(client, resources, "force_reboot"));
	}

	/**
	 * <pre>
	 * Use this operation to get NetScaler Instance.
	 * </pre>
	 */
	public static ns[] get(nitro_service client) throws Exception
	{
		ns resource = new ns();
		resource.validate("get");
		return (ns[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get NetScaler Instance.
	 */
	public static ns get(nitro_service client, ns resource) throws Exception
	{
		resource.validate("get");
		return ((ns[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get NetScaler Instance in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to delete NetScaler Instances.
	 * </pre>
	 */
	public static ns delete(nitro_service client, ns resource) throws Exception
	{
		resource.validate("delete");
		return ((ns[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete NetScaler Instances in bulk.
	 * </pre>
	 */
	public static ns[] delete(nitro_service client, ns[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((ns[]) resources[0].delete_resource(client));
		
		return ((ns[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to modify NetScaler Instance.
	 * </pre>
	 */
	public static ns update(nitro_service client, ns resource) throws Exception
	{
		resource.validate("modify");
		return ((ns[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify NetScaler Instance in bulk.
	 * </pre>
	 */
	public static ns[] update(nitro_service client, ns[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((ns[]) resources[0].update_resource(client));
		
		return ((ns[]) update_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to force stop NetScaler Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to force stop NetScaler Instance.
	 */
	public static ns force_stop(nitro_service client, ns resource) throws Exception
	{
		return ((ns[]) resource.perform_operation(client, "force_stop"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to force stop NetScaler Instance in bulk.
	 * </pre>
	 */

	public static ns[] force_stop(nitro_service client, ns[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((ns[]) resources[0].perform_operation(client, "force_stop"));
		
		return ((ns[]) perform_operation_bulk_request(client, resources, "force_stop"));
	}

	/**
	 * <pre>
	 * Use this operation to start NetScaler Instance.
	 * </pre>
	 */

	/**
	 * Use this operation to start NetScaler Instance.
	 */
	public static ns start(nitro_service client, ns resource) throws Exception
	{
		return ((ns[]) resource.perform_operation(client, "start"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to start NetScaler Instance in bulk.
	 * </pre>
	 */

	public static ns[] start(nitro_service client, ns[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((ns[]) resources[0].perform_operation(client, "start"));
		
		return ((ns[]) perform_operation_bulk_request(client, resources, "start"));
	}

	/**
	* Use this API to fetch filtered set of ns resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns obj = new ns();
		options option = new options();
		option.set_filter(filter);
		ns[] response = (ns[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns obj = new ns();
		options option = new options();
		option.set_filter(filter);
		ns[] response = (ns[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns obj = new ns();
		options option = new options();
		option.set_count(true);
		ns[] response = (ns[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns obj = new ns();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns[] response = (ns[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns obj = new ns();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns[] response = (ns[])obj.get_resources(service, option);
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
		ns_response result = (ns_response) service.get_payload_formatter().string_to_resource(ns_response.class, response);
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
		return result.ns;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_responses result = (ns_responses) service.get_payload_formatter().string_to_resource(ns_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_response_array);
		}
		ns[] result_ns = new ns[result.ns_response_array.length];
		
		for(int i = 0; i < result.ns_response_array.length; i++)
		{
			result_ns[i] = result.ns_response_array[i].ns[0];
		}
		
		return result_ns;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSDouble ns_cpu_usage_validator = new MPSDouble();
		ns_cpu_usage_validator.validate(operationType, ns_cpu_usage, "\"ns_cpu_usage\"");
		
		MPSDouble ns_mgmt_cpu_usage_validator = new MPSDouble();
		ns_mgmt_cpu_usage_validator.validate(operationType, ns_mgmt_cpu_usage, "\"ns_mgmt_cpu_usage\"");
		
		MPSDouble ns_memory_usage_validator = new MPSDouble();
		ns_memory_usage_validator.validate(operationType, ns_memory_usage, "\"ns_memory_usage\"");
		
		MPSDouble ns_tx_validator = new MPSDouble();
		ns_tx_validator.validate(operationType, ns_tx, "\"ns_tx\"");
		
		MPSDouble ns_rx_validator = new MPSDouble();
		ns_rx_validator.validate(operationType, ns_rx, "\"ns_rx\"");
		
		MPSDouble http_req_validator = new MPSDouble();
		http_req_validator.validate(operationType, http_req, "\"http_req\"");
		
		MPSString upsince_validator = new MPSString();
		upsince_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		upsince_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		upsince_validator.validate(operationType, upsince, "\"upsince\"");
		
		MPSString license_validator = new MPSString();
		license_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		license_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		license_validator.validate(operationType, license, "\"license\"");
		
		MPSString ha_master_state_validator = new MPSString();
		ha_master_state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		ha_master_state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ha_master_state_validator.validate(operationType, ha_master_state, "\"ha_master_state\"");
		
		MPSIPAddress ha_ip_address_validator = new MPSIPAddress();
		ha_ip_address_validator.validate(operationType, ha_ip_address, "\"ha_ip_address\"");
		
		MPSString node_state_validator = new MPSString();
		node_state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		node_state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		node_state_validator.validate(operationType, node_state, "\"node_state\"");
		
		MPSString ha_sync_validator = new MPSString();
		ha_sync_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		ha_sync_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ha_sync_validator.validate(operationType, ha_sync, "\"ha_sync\"");
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		username_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSDoubleLong pps_validator = new MPSDoubleLong();
		pps_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		pps_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 2147483647);
		pps_validator.validate(operationType, pps, "\"pps\"");
		
		MPSString cmd_policy_validator = new MPSString();
		cmd_policy_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 1024);
		cmd_policy_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		cmd_policy_validator.validate(operationType, cmd_policy, "\"cmd_policy\"");
		
		MPSInt number_of_ssl_cores_up_validator = new MPSInt();
		number_of_ssl_cores_up_validator.validate(operationType, number_of_ssl_cores_up, "\"number_of_ssl_cores_up\"");
		
		MPSString config_progress_status_validator = new MPSString();
		config_progress_status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 512);
		config_progress_status_validator.validate(operationType, config_progress_status, "\"config_progress_status\"");
		
		MPSBoolean if_0_1_validator = new MPSBoolean();
		if_0_1_validator.validate(operationType, if_0_1, "\"if_0_1\"");
		
		MPSBoolean if_0_2_validator = new MPSBoolean();
		if_0_2_validator.validate(operationType, if_0_2, "\"if_0_2\"");
		
		MPSInt nsvlan_id_validator = new MPSInt();
		nsvlan_id_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		nsvlan_id_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		nsvlan_id_validator.validate(operationType, nsvlan_id, "\"nsvlan_id\"");
		
		MPSBoolean nsvlan_tagged_validator = new MPSBoolean();
		nsvlan_tagged_validator.validate(operationType, nsvlan_tagged, "\"nsvlan_tagged\"");
		
		MPSInt vlan_type_validator = new MPSInt();
		vlan_type_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_type_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 1);
		vlan_type_validator.validate(operationType, vlan_type, "\"vlan_type\"");
		
		MPSIPAddress plugin_ip_address_validator = new MPSIPAddress();
		plugin_ip_address_validator.validate(operationType, plugin_ip_address, "\"plugin_ip_address\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
		MPSString upsince_persisted_validator = new MPSString();
		upsince_persisted_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		upsince_persisted_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		upsince_persisted_validator.validate(operationType, upsince_persisted, "\"upsince_persisted\"");
		
		MPSString nsvlan_interfaces_validator = new MPSString();
		nsvlan_interfaces_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 50);
		nsvlan_interfaces_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		if(nsvlan_interfaces != null)
		{
			for(int i=0; i<nsvlan_interfaces.length; i++)
			{
				nsvlan_interfaces_validator.validate(operationType, nsvlan_interfaces[i], "nsvlan_interfaces["+i+"]");
			}
		}
		
	}
}
