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


class network_interface_response extends base_response
{
	public network_interface[] network_interface;
}

class network_interface_responses extends base_response
{
	public network_interface_response[] network_interface_response_array;
}

/**
 * Configuration for VM device network interface resource
 */

public class network_interface extends base_resource
{
	private String port_name;
	private Boolean is_mgmt_ifc;
	private String name_server;
	private String vrid_list_ipv6;
	private String gateway;
	private Integer vlan;
	private String managed_device_id;
	private Boolean receiveuntagged;
	private String vrid_list_ipv4;
	private Boolean is_member_ifc;
	private Boolean l2_enabled;
	private String ip_address;
	private String netmask;
	private Integer vf_index;
	private String[] vrid_list_ipv4_array;
	private String[] vrid_list_ipv6_array;
	private String[] vlan_whitelist_array;
	private Boolean is_vlan_applied;
	private Long __count;

	protected String get_object_type()
	{
		return "network_interface";
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
	 * Port name of the interface on the host machine
	 * </pre>
	 */
	public void set_port_name(String port_name)
	{
		this.port_name = port_name;
	}

	/**
	 * <pre>
	 * Port name of the interface on the host machine
	 * </pre>
	 */
	public String get_port_name()
	{
		return this.port_name;
	}

	/**
	 * <pre>
	 * True if this is the management interface
	 * </pre>
	 */
	public void set_is_mgmt_ifc(Boolean is_mgmt_ifc)
	{
		this.is_mgmt_ifc = is_mgmt_ifc;
	}

	/**
	 * <pre>
	 * True if this is the management interface
	 * </pre>
	 */
	public Boolean get_is_mgmt_ifc()
	{
		return this.is_mgmt_ifc;
	}

	/**
	 * <pre>
	 * Name Server
	 * </pre>
	 */
	public void set_name_server(String name_server)
	{
		this.name_server = name_server;
	}

	/**
	 * <pre>
	 * Name Server
	 * </pre>
	 */
	public String get_name_server()
	{
		return this.name_server;
	}

	/**
	 * <pre>
	 * VRID List for Interface/Channel for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6(String vrid_list_ipv6)
	{
		this.vrid_list_ipv6 = vrid_list_ipv6;
	}

	/**
	 * <pre>
	 * VRID List for Interface/Channel for IPV6 VMAC Generation
	 * </pre>
	 */
	public String get_vrid_list_ipv6()
	{
		return this.vrid_list_ipv6;
	}

	/**
	 * <pre>
	 * gateway
	 * </pre>
	 */
	public void set_gateway(String gateway)
	{
		this.gateway = gateway;
	}

	/**
	 * <pre>
	 * gateway
	 * </pre>
	 */
	public String get_gateway()
	{
		return this.gateway;
	}

	/**
	 * <pre>
	 * VLAN Id
	 * </pre>
	 */
	public void set_vlan(Integer vlan)
	{
		this.vlan = vlan;
	}

	/**
	 * <pre>
	 * VLAN Id
	 * </pre>
	 */
	public Integer get_vlan()
	{
		return this.vlan;
	}

	/**
	 * <pre>
	 * managed_device_id
	 * </pre>
	 */
	public void set_managed_device_id(String managed_device_id)
	{
		this.managed_device_id = managed_device_id;
	}

	/**
	 * <pre>
	 * managed_device_id
	 * </pre>
	 */
	public String get_managed_device_id()
	{
		return this.managed_device_id;
	}

	/**
	 * <pre>
	 * Receive Untagged Packets on Interface/Channel
	 * </pre>
	 */
	public void set_receiveuntagged(Boolean receiveuntagged)
	{
		this.receiveuntagged = receiveuntagged;
	}

	/**
	 * <pre>
	 * Receive Untagged Packets on Interface/Channel
	 * </pre>
	 */
	public Boolean get_receiveuntagged()
	{
		return this.receiveuntagged;
	}

	/**
	 * <pre>
	 * VRID List for Interface/Channel for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4(String vrid_list_ipv4)
	{
		this.vrid_list_ipv4 = vrid_list_ipv4;
	}

	/**
	 * <pre>
	 * VRID List for Interface/Channel for IPV4 VMAC Generation
	 * </pre>
	 */
	public String get_vrid_list_ipv4()
	{
		return this.vrid_list_ipv4;
	}

	/**
	 * <pre>
	 * True if this interface is member of a channel
	 * </pre>
	 */
	public void set_is_member_ifc(Boolean is_member_ifc)
	{
		this.is_member_ifc = is_member_ifc;
	}

	/**
	 * <pre>
	 * True if this interface is member of a channel
	 * </pre>
	 */
	public Boolean get_is_member_ifc()
	{
		return this.is_member_ifc;
	}

	/**
	 * <pre>
	 * L2 mode status of Interface
	 * </pre>
	 */
	public void set_l2_enabled(Boolean l2_enabled)
	{
		this.l2_enabled = l2_enabled;
	}

	/**
	 * <pre>
	 * L2 mode status of Interface
	 * </pre>
	 */
	public Boolean get_l2_enabled()
	{
		return this.l2_enabled;
	}

	/**
	 * <pre>
	 * IP Address
	 * </pre>
	 */
	public void set_ip_address(String ip_address)
	{
		this.ip_address = ip_address;
	}

	/**
	 * <pre>
	 * IP Address
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}

	/**
	 * <pre>
	 * netmask
	 * </pre>
	 */
	public void set_netmask(String netmask)
	{
		this.netmask = netmask;
	}

	/**
	 * <pre>
	 * netmask
	 * </pre>
	 */
	public String get_netmask()
	{
		return this.netmask;
	}

	/**
	 * <pre>
	 * Index given by Xen when assigning free virtual function
	 * </pre>
	 */
	public void set_vf_index(Integer vf_index)
	{
		this.vf_index = vf_index;
	}

	/**
	 * <pre>
	 * Index given by Xen when assigning free virtual function
	 * </pre>
	 */
	public Integer get_vf_index()
	{
		return this.vf_index;
	}

	/**
	 * <pre>
	 * VRID List for Interface for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_array(String[] vrid_list_ipv4_array)
	{
		this.vrid_list_ipv4_array = vrid_list_ipv4_array;
	}

	/**
	 * <pre>
	 * VRID List for Interface for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_array()
	{
		return this.vrid_list_ipv4_array;
	}

	/**
	 * <pre>
	 * VRID List for Interface for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_array(String[] vrid_list_ipv6_array)
	{
		this.vrid_list_ipv6_array = vrid_list_ipv6_array;
	}

	/**
	 * <pre>
	 * VRID List for Interface for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_array()
	{
		return this.vrid_list_ipv6_array;
	}

	/**
	 * <pre>
	 * VLAN Whitelist for Interface on VM Instance
	 * </pre>
	 */
	public void set_vlan_whitelist_array(String[] vlan_whitelist_array)
	{
		this.vlan_whitelist_array = vlan_whitelist_array;
	}

	/**
	 * <pre>
	 * VLAN Whitelist for Interface on VM Instance
	 * </pre>
	 */
	public String[] get_vlan_whitelist_array()
	{
		return this.vlan_whitelist_array;
	}

	/**
	 * <pre>
	 * Is VLAN added on NetworkInterface of VM Instance
	 * </pre>
	 */
	public void set_is_vlan_applied(Boolean is_vlan_applied)
	{
		this.is_vlan_applied = is_vlan_applied;
	}

	/**
	 * <pre>
	 * Is VLAN added on NetworkInterface of VM Instance
	 * </pre>
	 */
	public Boolean get_is_vlan_applied()
	{
		return this.is_vlan_applied;
	}


	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		network_interface_response result = (network_interface_response) service.get_payload_formatter().string_to_resource(network_interface_response.class, response);
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
		return result.network_interface;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		network_interface_responses result = (network_interface_responses) service.get_payload_formatter().string_to_resource(network_interface_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.network_interface_response_array);
		}
		network_interface[] result_network_interface = new network_interface[result.network_interface_response_array.length];
		
		for(int i = 0; i < result.network_interface_response_array.length; i++)
		{
			result_network_interface[i] = result.network_interface_response_array[i].network_interface[0];
		}
		
		return result_network_interface;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString port_name_validator = new MPSString();
		port_name_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		port_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		port_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		port_name_validator.validate(operationType, port_name, "\"port_name\"");
		
		MPSString managed_device_id_validator = new MPSString();
		managed_device_id_validator.validate(operationType, managed_device_id, "\"managed_device_id\"");
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSIPAddress netmask_validator = new MPSIPAddress();
		netmask_validator.validate(operationType, netmask, "\"netmask\"");
		
		MPSIPAddress gateway_validator = new MPSIPAddress();
		gateway_validator.validate(operationType, gateway, "\"gateway\"");
		
		MPSInt vlan_validator = new MPSInt();
		vlan_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_validator.validate(operationType, vlan, "\"vlan\"");
		
		MPSString name_server_validator = new MPSString();
		name_server_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		name_server_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_server_validator.validate(operationType, name_server, "\"name_server\"");
		
		MPSBoolean is_mgmt_ifc_validator = new MPSBoolean();
		is_mgmt_ifc_validator.validate(operationType, is_mgmt_ifc, "\"is_mgmt_ifc\"");
		
		MPSBoolean is_member_ifc_validator = new MPSBoolean();
		is_member_ifc_validator.validate(operationType, is_member_ifc, "\"is_member_ifc\"");
		
		MPSString vrid_list_ipv6_validator = new MPSString();
		vrid_list_ipv6_validator.validate(operationType, vrid_list_ipv6, "\"vrid_list_ipv6\"");
		
		MPSString vrid_list_ipv4_validator = new MPSString();
		vrid_list_ipv4_validator.validate(operationType, vrid_list_ipv4, "\"vrid_list_ipv4\"");
		
		MPSBoolean receiveuntagged_validator = new MPSBoolean();
		receiveuntagged_validator.validate(operationType, receiveuntagged, "\"receiveuntagged\"");
		
		MPSBoolean l2_enabled_validator = new MPSBoolean();
		l2_enabled_validator.validate(operationType, l2_enabled, "\"l2_enabled\"");
		
		MPSInt vf_index_validator = new MPSInt();
		vf_index_validator.validate(operationType, vf_index, "\"vf_index\"");
		
		MPSString vrid_list_ipv4_array_validator = new MPSString();
		if(vrid_list_ipv4_array != null)
		{
			for(int i=0; i<vrid_list_ipv4_array.length; i++)
			{
				vrid_list_ipv4_array_validator.validate(operationType, vrid_list_ipv4_array[i], "vrid_list_ipv4_array["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_array_validator = new MPSString();
		if(vrid_list_ipv6_array != null)
		{
			for(int i=0; i<vrid_list_ipv6_array.length; i++)
			{
				vrid_list_ipv6_array_validator.validate(operationType, vrid_list_ipv6_array[i], "vrid_list_ipv6_array["+i+"]");
			}
		}
		
		MPSString vlan_whitelist_array_validator = new MPSString();
		if(vlan_whitelist_array != null)
		{
			for(int i=0; i<vlan_whitelist_array.length; i++)
			{
				vlan_whitelist_array_validator.validate(operationType, vlan_whitelist_array[i], "vlan_whitelist_array["+i+"]");
			}
		}
		
		MPSBoolean is_vlan_applied_validator = new MPSBoolean();
		is_vlan_applied_validator.validate(operationType, is_vlan_applied, "\"is_vlan_applied\"");
		
	}
}
