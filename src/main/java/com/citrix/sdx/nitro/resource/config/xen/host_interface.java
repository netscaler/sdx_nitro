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

class host_interface_response extends base_response
{
	public host_interface[] host_interface;
}

class host_interface_responses extends base_response
{
	public host_interface_response[] host_interface_response_array;
}

/**
 * Configuration for XenServer Interface resource
 */

public class host_interface extends base_resource
{
	private String range;
	private Boolean channel_tag_all_vlans;
	private String mapped_port;
	private String lacp_channel_time;
	private String xen_bond_uuid;
	private String channel_interface_list;
	private String channel_alias;
	private Boolean is_mgmt_bond;
	private String lacp_channel_mac_address;
	private String channel_type;
	private String id;
	private Boolean add_mac_address;
	private Boolean apply_mac_address;
	private String channel_id;
	private String port;
	private Boolean static_channel_state;
	private Boolean channel_ha_monitoring;
	private String base_mac_address;
	private String interface_type;
	private Integer channel_throughput;
	private Integer channel_bandwidth_high;
	private Integer channel_bandwidth_normal;
	private Boolean flow_control_tx;
	private String[] supported_link_modes;
	private String state;
	private String device_name;
	private String act_id;
	private String speed;
	private Boolean support_auto_neg;
	private String port_type;
	private String[] supported_port_types;
	private Boolean flow_control_auto_neg;
	private String cpu_socket;
	private String duplex;
	private Boolean sync_operation;
	private Boolean adv_auto_neg;
	private Boolean flow_control_rx;
	private String[] adv_link_modes;
	private Long __count;

	protected String get_object_type()
	{
		return "host_interface";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return id;
	}

	/**
	 * <pre>
	 * Range for Base Mac Address
	 * </pre>
	 */
	public void set_range(String range)
	{
		this.range = range;
	}

	/**
	 * <pre>
	 * Range for Base Mac Address
	 * </pre>
	 */
	public String get_range()
	{
		return this.range;
	}

	/**
	 * <pre>
	 * If true then all the member interfaces of this channel are tagged. Possible values: true and false
	 * </pre>
	 */
	public void set_channel_tag_all_vlans(Boolean channel_tag_all_vlans)
	{
		this.channel_tag_all_vlans = channel_tag_all_vlans;
	}

	/**
	 * <pre>
	 * If true then all the member interfaces of this channel are tagged. Possible values: true and false
	 * </pre>
	 */
	public Boolean get_channel_tag_all_vlans()
	{
		return this.channel_tag_all_vlans;
	}

	/**
	 * <pre>
	 * Mapped Port Name Ex: eth0
	 * </pre>
	 */
	public void set_mapped_port(String mapped_port)
	{
		this.mapped_port = mapped_port;
	}

	/**
	 * <pre>
	 * Mapped Port Name Ex: eth0
	 * </pre>
	 */
	public String get_mapped_port()
	{
		return this.mapped_port;
	}

	/**
	 * <pre>
	 * LACP time. Possible values: fast and slow
	 * </pre>
	 */
	public void set_lacp_channel_time(String lacp_channel_time)
	{
		this.lacp_channel_time = lacp_channel_time;
	}

	/**
	 * <pre>
	 * LACP time. Possible values: fast and slow
	 * </pre>
	 */
	public String get_lacp_channel_time()
	{
		return this.lacp_channel_time;
	}


	/**
	 * <pre>
	 * UUID of the corrosponding bond in Xenserver
	 * </pre>
	 */
	public String get_xen_bond_uuid()
	{
		return this.xen_bond_uuid;
	}

	/**
	 * <pre>
	 * Comma separated list of interfaces that are part of this channel if this interface represents a channel (10/1, 10/4)
	 * </pre>
	 */
	public void set_channel_interface_list(String channel_interface_list)
	{
		this.channel_interface_list = channel_interface_list;
	}

	/**
	 * <pre>
	 * Comma separated list of interfaces that are part of this channel if this interface represents a channel (10/1, 10/4)
	 * </pre>
	 */
	public String get_channel_interface_list()
	{
		return this.channel_interface_list;
	}

	/**
	 * <pre>
	 * Alias name for this channel
	 * </pre>
	 */
	public void set_channel_alias(String channel_alias)
	{
		this.channel_alias = channel_alias;
	}

	/**
	 * <pre>
	 * Alias name for this channel
	 * </pre>
	 */
	public String get_channel_alias()
	{
		return this.channel_alias;
	}


	/**
	 * <pre>
	 * True if this bond is on management interface
	 * </pre>
	 */
	public Boolean get_is_mgmt_bond()
	{
		return this.is_mgmt_bond;
	}


	/**
	 * <pre>
	 * Mac address of the bond on Xenserver
	 * </pre>
	 */
	public String get_lacp_channel_mac_address()
	{
		return this.lacp_channel_mac_address;
	}

	/**
	 * <pre>
	 * Channel type if this interface represents a channel (LACP or Static)
	 * </pre>
	 */
	public void set_channel_type(String channel_type)
	{
		this.channel_type = channel_type;
	}

	/**
	 * <pre>
	 * Channel type if this interface represents a channel (LACP or Static)
	 * </pre>
	 */
	public String get_channel_type()
	{
		return this.channel_type;
	}

	/**
	 * <pre>
	 * Id is system generated key 
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key 
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Add Mac Address
	 * </pre>
	 */
	public Boolean get_add_mac_address()
	{
		return this.add_mac_address;
	}


	/**
	 * <pre>
	 * Apply Mac Address
	 * </pre>
	 */
	public Boolean get_apply_mac_address()
	{
		return this.apply_mac_address;
	}

	/**
	 * <pre>
	 * Channel ID if this interface represents a channel (LA/1, LA/2 ...)
	 * </pre>
	 */
	public void set_channel_id(String channel_id)
	{
		this.channel_id = channel_id;
	}

	/**
	 * <pre>
	 * Channel ID if this interface represents a channel (LA/1, LA/2 ...)
	 * </pre>
	 */
	public String get_channel_id()
	{
		return this.channel_id;
	}

	/**
	 * <pre>
	 * Port Name Ex: 10/1
	 * </pre>
	 */
	public void set_port(String port)
	{
		this.port = port;
	}

	/**
	 * <pre>
	 * Port Name Ex: 10/1
	 * </pre>
	 */
	public String get_port()
	{
		return this.port;
	}

	/**
	 * <pre>
	 * Static channel state (Enabled/Disabled)
	 * </pre>
	 */
	public void set_static_channel_state(Boolean static_channel_state)
	{
		this.static_channel_state = static_channel_state;
	}

	/**
	 * <pre>
	 * Static channel state (Enabled/Disabled)
	 * </pre>
	 */
	public Boolean get_static_channel_state()
	{
		return this.static_channel_state;
	}

	/**
	 * <pre>
	 * HA-monitoring control for the channel. Possible values: true and false
	 * </pre>
	 */
	public void set_channel_ha_monitoring(Boolean channel_ha_monitoring)
	{
		this.channel_ha_monitoring = channel_ha_monitoring;
	}

	/**
	 * <pre>
	 * HA-monitoring control for the channel. Possible values: true and false
	 * </pre>
	 */
	public Boolean get_channel_ha_monitoring()
	{
		return this.channel_ha_monitoring;
	}

	/**
	 * <pre>
	 * Mac Address
	 * </pre>
	 */
	public void set_base_mac_address(String base_mac_address)
	{
		this.base_mac_address = base_mac_address;
	}

	/**
	 * <pre>
	 * Mac Address
	 * </pre>
	 */
	public String get_base_mac_address()
	{
		return this.base_mac_address;
	}


	/**
	 * <pre>
	 * Indicates if this is an interface or a channel or a member interface of a channel
	 * </pre>
	 */
	public String get_interface_type()
	{
		return this.interface_type;
	}

	/**
	 * <pre>
	 * Minimum required throughput in Mbps for this channel
	 * </pre>
	 */
	public void set_channel_throughput(Integer channel_throughput)
	{
		this.channel_throughput = channel_throughput;
	}

	/**
	 * <pre>
	 * Minimum required throughput in Mbps for this channel
	 * </pre>
	 */
	public Integer get_channel_throughput()
	{
		return this.channel_throughput;
	}

	/**
	 * <pre>
	 * Higher end threshold of the channel bandwidth usage in Mbps
	 * </pre>
	 */
	public void set_channel_bandwidth_high(Integer channel_bandwidth_high)
	{
		this.channel_bandwidth_high = channel_bandwidth_high;
	}

	/**
	 * <pre>
	 * Higher end threshold of the channel bandwidth usage in Mbps
	 * </pre>
	 */
	public Integer get_channel_bandwidth_high()
	{
		return this.channel_bandwidth_high;
	}

	/**
	 * <pre>
	 * Lower end threshold of the channel bandwidth usage in Mbps
	 * </pre>
	 */
	public void set_channel_bandwidth_normal(Integer channel_bandwidth_normal)
	{
		this.channel_bandwidth_normal = channel_bandwidth_normal;
	}

	/**
	 * <pre>
	 * Lower end threshold of the channel bandwidth usage in Mbps
	 * </pre>
	 */
	public Integer get_channel_bandwidth_normal()
	{
		return this.channel_bandwidth_normal;
	}

	/**
	 * <pre>
	 * TX Pause
	 * </pre>
	 */
	public void set_flow_control_tx(Boolean flow_control_tx)
	{
		this.flow_control_tx = flow_control_tx;
	}

	/**
	 * <pre>
	 * TX Pause
	 * </pre>
	 */
	public Boolean get_flow_control_tx()
	{
		return this.flow_control_tx;
	}


	/**
	 * <pre>
	 * Supported Link Modes
	 * </pre>
	 */
	public String[] get_supported_link_modes()
	{
		return this.supported_link_modes;
	}


	/**
	 * <pre>
	 * State of the port.
	 * </pre>
	 */
	public String get_state()
	{
		return this.state;
	}


	/**
	 * <pre>
	 * Device Name
	 * </pre>
	 */
	public String get_device_name()
	{
		return this.device_name;
	}


	/**
	 * <pre>
	 * Activity Id
	 * </pre>
	 */
	public String get_act_id()
	{
		return this.act_id;
	}

	/**
	 * <pre>
	 * Actual speed 
	 * </pre>
	 */
	public void set_speed(String speed)
	{
		this.speed = speed;
	}

	/**
	 * <pre>
	 * Actual speed 
	 * </pre>
	 */
	public String get_speed()
	{
		return this.speed;
	}

	/**
	 * <pre>
	 * true if the port supports auto-negotiation
	 * </pre>
	 */
	public void set_support_auto_neg(Boolean support_auto_neg)
	{
		this.support_auto_neg = support_auto_neg;
	}

	/**
	 * <pre>
	 * true if the port supports auto-negotiation
	 * </pre>
	 */
	public Boolean get_support_auto_neg()
	{
		return this.support_auto_neg;
	}


	/**
	 * <pre>
	 * Port Type
	 * </pre>
	 */
	public String get_port_type()
	{
		return this.port_type;
	}


	/**
	 * <pre>
	 * Supported Port Types
	 * </pre>
	 */
	public String[] get_supported_port_types()
	{
		return this.supported_port_types;
	}

	/**
	 * <pre>
	 * Auto Negotiation For Flow Control
	 * </pre>
	 */
	public void set_flow_control_auto_neg(Boolean flow_control_auto_neg)
	{
		this.flow_control_auto_neg = flow_control_auto_neg;
	}

	/**
	 * <pre>
	 * Auto Negotiation For Flow Control
	 * </pre>
	 */
	public Boolean get_flow_control_auto_neg()
	{
		return this.flow_control_auto_neg;
	}


	/**
	 * <pre>
	 * CPU Socket to which this interface belong to
	 * </pre>
	 */
	public String get_cpu_socket()
	{
		return this.cpu_socket;
	}

	/**
	 * <pre>
	 * Duplex
	 * </pre>
	 */
	public void set_duplex(String duplex)
	{
		this.duplex = duplex;
	}

	/**
	 * <pre>
	 * Duplex
	 * </pre>
	 */
	public String get_duplex()
	{
		return this.duplex;
	}

	/**
	 * <pre>
	 * sync operation
	 * </pre>
	 */
	public void set_sync_operation(Boolean sync_operation)
	{
		this.sync_operation = sync_operation;
	}

	/**
	 * <pre>
	 * sync operation
	 * </pre>
	 */
	public Boolean get_sync_operation()
	{
		return this.sync_operation;
	}

	/**
	 * <pre>
	 * true if the advertised auto-negotiation for the port is true
	 * </pre>
	 */
	public void set_adv_auto_neg(Boolean adv_auto_neg)
	{
		this.adv_auto_neg = adv_auto_neg;
	}

	/**
	 * <pre>
	 * true if the advertised auto-negotiation for the port is true
	 * </pre>
	 */
	public Boolean get_adv_auto_neg()
	{
		return this.adv_auto_neg;
	}

	/**
	 * <pre>
	 * RX Pause
	 * </pre>
	 */
	public void set_flow_control_rx(Boolean flow_control_rx)
	{
		this.flow_control_rx = flow_control_rx;
	}

	/**
	 * <pre>
	 * RX Pause
	 * </pre>
	 */
	public Boolean get_flow_control_rx()
	{
		return this.flow_control_rx;
	}


	/**
	 * <pre>
	 * Advertised Link Modes
	 * </pre>
	 */
	public String[] get_adv_link_modes()
	{
		return this.adv_link_modes;
	}


	/**
	 * <pre>
	 * Use this operation to create channel.
	 * </pre>
	 */
	public static host_interface add(nitro_service client, host_interface resource) throws Exception
	{
		resource.validate("add");
		return ((host_interface[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to create channel in bulk.
	 * </pre>
	 */
	public static host_interface[] add(nitro_service client, host_interface[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((host_interface[]) resources[0].perform_operation(client, "add"));
		
		return ((host_interface[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to reset interface settings.
	 * </pre>
	 */

	/**
	 * Use this operation to reset interface settings.
	 */
	public static host_interface reset(nitro_service client, host_interface resource) throws Exception
	{
		return ((host_interface[]) resource.perform_operation(client, "reset"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to reset interface settings in bulk.
	 * </pre>
	 */

	public static host_interface[] reset(nitro_service client, host_interface[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((host_interface[]) resources[0].perform_operation(client, "reset"));
		
		return ((host_interface[]) perform_operation_bulk_request(client, resources, "reset"));
	}

	/**
	 * <pre>
	 * Use this operation to delete channels.
	 * </pre>
	 */
	public static host_interface delete(nitro_service client, host_interface resource) throws Exception
	{
		resource.validate("delete");
		return ((host_interface[]) resource.perform_operation(client, "delete"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete channels in bulk.
	 * </pre>
	 */
	public static host_interface[] delete(nitro_service client, host_interface[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((host_interface[]) resources[0].perform_operation(client, "delete"));
		
		return ((host_interface[]) perform_operation_bulk_request(client, resources, "delete"));
	}

	/**
	 * <pre>
	 * Use this operation to get interface/channel.
	 * </pre>
	 */
	public static host_interface[] get(nitro_service client) throws Exception
	{
		host_interface resource = new host_interface();
		resource.validate("get");
		return (host_interface[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get interface/channel.
	 */
	public static host_interface get(nitro_service client, host_interface resource) throws Exception
	{
		resource.validate("get");
		return ((host_interface[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get interface/channel in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify interface/channel.
	 * </pre>
	 */
	public static host_interface update(nitro_service client, host_interface resource) throws Exception
	{
		resource.validate("modify");
		return ((host_interface[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify interface/channel in bulk.
	 * </pre>
	 */
	public static host_interface[] update(nitro_service client, host_interface[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((host_interface[]) resources[0].update_resource(client));
		
		return ((host_interface[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of host_interface resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static host_interface[] get_filtered(nitro_service service, String filter) throws Exception
	{
		host_interface obj = new host_interface();
		options option = new options();
		option.set_filter(filter);
		host_interface[] response = (host_interface[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of host_interface resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static host_interface[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		host_interface obj = new host_interface();
		options option = new options();
		option.set_filter(filter);
		host_interface[] response = (host_interface[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the host_interface resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		host_interface obj = new host_interface();
		options option = new options();
		option.set_count(true);
		host_interface[] response = (host_interface[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of host_interface resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		host_interface obj = new host_interface();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		host_interface[] response = (host_interface[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of host_interface resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		host_interface obj = new host_interface();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		host_interface[] response = (host_interface[])obj.get_resources(service, option);
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
		host_interface_response result = (host_interface_response) service.get_payload_formatter().string_to_resource(host_interface_response.class, response);
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
		return result.host_interface;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		host_interface_responses result = (host_interface_responses) service.get_payload_formatter().string_to_resource(host_interface_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.host_interface_response_array);
		}
		host_interface[] result_host_interface = new host_interface[result.host_interface_response_array.length];
		
		for(int i = 0; i < result.host_interface_response_array.length; i++)
		{
			result_host_interface[i] = result.host_interface_response_array[i].host_interface[0];
		}
		
		return result_host_interface;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString id_validator = new MPSString();
		id_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		id_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSString mapped_port_validator = new MPSString();
		mapped_port_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 50);
		mapped_port_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		mapped_port_validator.validate(operationType, mapped_port, "\"mapped_port\"");
		
		MPSString port_validator = new MPSString();
		port_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 50);
		port_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		port_validator.validate(operationType, port, "\"port\"");
		
		MPSString base_mac_address_validator = new MPSString();
		base_mac_address_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		base_mac_address_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		base_mac_address_validator.validate(operationType, base_mac_address, "\"base_mac_address\"");
		
		MPSString range_validator = new MPSString();
		range_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 50);
		range_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		range_validator.validate(operationType, range, "\"range\"");
		
		MPSBoolean add_mac_address_validator = new MPSBoolean();
		add_mac_address_validator.validate(operationType, add_mac_address, "\"add_mac_address\"");
		
		MPSBoolean apply_mac_address_validator = new MPSBoolean();
		apply_mac_address_validator.validate(operationType, apply_mac_address, "\"apply_mac_address\"");
		
		MPSString interface_type_validator = new MPSString();
		interface_type_validator.validate(operationType, interface_type, "\"interface_type\"");
		
		MPSString channel_id_validator = new MPSString();
		channel_id_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 5);
		channel_id_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 4);
		channel_id_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		channel_id_validator.validate(operationType, channel_id, "\"channel_id\"");
		
		MPSString channel_type_validator = new MPSString();
		channel_type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 16);
		channel_type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 4);
		channel_type_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		channel_type_validator.validate(operationType, channel_type, "\"channel_type\"");
		
		MPSString channel_interface_list_validator = new MPSString();
		channel_interface_list_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		channel_interface_list_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		channel_interface_list_validator.validate(operationType, channel_interface_list, "\"channel_interface_list\"");
		
		MPSBoolean static_channel_state_validator = new MPSBoolean();
		static_channel_state_validator.validate(operationType, static_channel_state, "\"static_channel_state\"");
		
		MPSInt channel_throughput_validator = new MPSInt();
		channel_throughput_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		channel_throughput_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 80000);
		channel_throughput_validator.validate(operationType, channel_throughput, "\"channel_throughput\"");
		
		MPSInt channel_bandwidth_high_validator = new MPSInt();
		channel_bandwidth_high_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		channel_bandwidth_high_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 80000);
		channel_bandwidth_high_validator.validate(operationType, channel_bandwidth_high, "\"channel_bandwidth_high\"");
		
		MPSInt channel_bandwidth_normal_validator = new MPSInt();
		channel_bandwidth_normal_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		channel_bandwidth_normal_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 80000);
		channel_bandwidth_normal_validator.validate(operationType, channel_bandwidth_normal, "\"channel_bandwidth_normal\"");
		
		MPSBoolean channel_ha_monitoring_validator = new MPSBoolean();
		channel_ha_monitoring_validator.validate(operationType, channel_ha_monitoring, "\"channel_ha_monitoring\"");
		
		MPSBoolean channel_tag_all_vlans_validator = new MPSBoolean();
		channel_tag_all_vlans_validator.validate(operationType, channel_tag_all_vlans, "\"channel_tag_all_vlans\"");
		
		MPSString channel_alias_validator = new MPSString();
		channel_alias_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 31);
		channel_alias_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 4);
		channel_alias_validator.validate(operationType, channel_alias, "\"channel_alias\"");
		
		MPSString xen_bond_uuid_validator = new MPSString();
		xen_bond_uuid_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		xen_bond_uuid_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 5);
		xen_bond_uuid_validator.validate(operationType, xen_bond_uuid, "\"xen_bond_uuid\"");
		
		MPSString lacp_channel_mac_address_validator = new MPSString();
		lacp_channel_mac_address_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		lacp_channel_mac_address_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		lacp_channel_mac_address_validator.validate(operationType, lacp_channel_mac_address, "\"lacp_channel_mac_address\"");
		
		MPSBoolean is_mgmt_bond_validator = new MPSBoolean();
		is_mgmt_bond_validator.validate(operationType, is_mgmt_bond, "\"is_mgmt_bond\"");
		
		MPSString lacp_channel_time_validator = new MPSString();
		lacp_channel_time_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		lacp_channel_time_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 4);
		lacp_channel_time_validator.validate(operationType, lacp_channel_time, "\"lacp_channel_time\"");
		
		MPSString supported_port_types_validator = new MPSString();
		supported_port_types_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		supported_port_types_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		if(supported_port_types != null)
		{
			for(int i=0; i<supported_port_types.length; i++)
			{
				supported_port_types_validator.validate(operationType, supported_port_types[i], "supported_port_types["+i+"]");
			}
		}
		
		MPSString supported_link_modes_validator = new MPSString();
		if(supported_link_modes != null)
		{
			for(int i=0; i<supported_link_modes.length; i++)
			{
				supported_link_modes_validator.validate(operationType, supported_link_modes[i], "supported_link_modes["+i+"]");
			}
		}
		
		MPSString adv_link_modes_validator = new MPSString();
		if(adv_link_modes != null)
		{
			for(int i=0; i<adv_link_modes.length; i++)
			{
				adv_link_modes_validator.validate(operationType, adv_link_modes[i], "adv_link_modes["+i+"]");
			}
		}
		
		MPSString state_validator = new MPSString();
		state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 30);
		state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		state_validator.validate(operationType, state, "\"state\"");
		
		MPSBoolean support_auto_neg_validator = new MPSBoolean();
		support_auto_neg_validator.validate(operationType, support_auto_neg, "\"support_auto_neg\"");
		
		MPSBoolean adv_auto_neg_validator = new MPSBoolean();
		adv_auto_neg_validator.validate(operationType, adv_auto_neg, "\"adv_auto_neg\"");
		
		MPSString speed_validator = new MPSString();
		speed_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		speed_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		speed_validator.validate(operationType, speed, "\"speed\"");
		
		MPSString duplex_validator = new MPSString();
		duplex_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		duplex_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		duplex_validator.validate(operationType, duplex, "\"duplex\"");
		
		MPSString port_type_validator = new MPSString();
		port_type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		port_type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		port_type_validator.validate(operationType, port_type, "\"port_type\"");
		
		MPSBoolean flow_control_auto_neg_validator = new MPSBoolean();
		flow_control_auto_neg_validator.validate(operationType, flow_control_auto_neg, "\"flow_control_auto_neg\"");
		
		MPSBoolean flow_control_rx_validator = new MPSBoolean();
		flow_control_rx_validator.validate(operationType, flow_control_rx, "\"flow_control_rx\"");
		
		MPSBoolean flow_control_tx_validator = new MPSBoolean();
		flow_control_tx_validator.validate(operationType, flow_control_tx, "\"flow_control_tx\"");
		
		MPSString device_name_validator = new MPSString();
		device_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		device_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		device_name_validator.validate(operationType, device_name, "\"device_name\"");
		
		MPSBoolean sync_operation_validator = new MPSBoolean();
		sync_operation_validator.validate(operationType, sync_operation, "\"sync_operation\"");
		
	}
}
