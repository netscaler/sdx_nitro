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

class vm_device_response extends base_response
{
	public vm_device[] vm_device;
}

class vm_device_responses extends base_response
{
	public vm_device_response[] vm_device_response_array;
}

/**
 * Configuration for VM resource
 */

public class vm_device extends managed_device
{
	private Double domid;
	private String template_name;
	private String cpu_core_pe;
	private String vm_description;
	private String image_name;
	private network_interface[] network_interfaces;
	private String vm_state;
	private String uuid;
	private String mac_eth0;
	private Double vm_memory_total;
	private Double vm_rx;
	private String cpu_core_mgmt;
	private String ssl_virtual_functions;
	private String disk_allocation;
	private String uptime;
	private Double vm_tx;
	private Boolean provision_with_xva;
	private Integer number_of_cores;
	private Double disk_space;
	private String virtual_functions;
	private Double vm_memory_free;
	private Double vm_memory_usage;
	private Integer number_of_ssl_cores;
	private Double throughput;
	private Double vm_cpu_usage;
	private Integer vlan_1_2;
	private String[] vrid_list_ipv4_1_2;
	private Integer vlan_1_7;
	private String[] vrid_list_ipv6_1_2;
	private String[] vrid_list_ipv4_1_4;
	private String act_id;
	private String[] vrid_list_ipv6_10_6;
	private Boolean if_10_4;
	private Integer vlan_10_5;
	private String[] vrid_list_ipv6_10_3;
	private String[] vrid_list_ipv6_1_1;
	private Boolean if_1_5;
	private Boolean receiveuntagged_1_4;
	private String[] vrid_list_ipv6_10_4;
	private String[] vrid_list_ipv6_1_3;
	private Boolean if_10_3;
	private String[] vrid_list_ipv6_10_5;
	private Boolean receiveuntagged_10_4;
	private String[] vrid_list_ipv6_1_8;
	private Integer vlan_10_6;
	private Boolean if_10_5;
	private String[] vrid_list_ipv6_1_6;
	private Boolean if_10_7;
	private Boolean receiveuntagged_10_8;
	private String[] vrid_list_ipv6_1_4;
	private Boolean receiveuntagged_1_6;
	private Integer vlan_1_4;
	private Boolean if_1_2;
	private Boolean receiveuntagged_1_5;
	private Boolean receiveuntagged_10_6;
	private Boolean receiveuntagged_10_1;
	private String[] vrid_list_ipv6_1_5;
	private String[] vrid_list_ipv4_1_6;
	private String[] vrid_list_ipv6_10_8;
	private String[] vrid_list_ipv4_1_7;
	private Boolean receiveuntagged_10_2;
	private String[] vrid_list_ipv4_1_5;
	private Boolean receiveuntagged_1_7;
	private Integer vlan_10_4;
	private Boolean if_1_7;
	private Boolean receiveuntagged_1_1;
	private String[] vrid_list_ipv6_1_7;
	private Boolean if_10_1;
	private Boolean if_10_8;
	private Boolean l2_enabled;
	private Integer vlan_10_7;
	private Integer vlan_10_1;
	private Boolean receiveuntagged_1_2;
	private Boolean reboot_vm_on_cpu_change;
	private Integer vlan_1_6;
	private String[] vrid_list_ipv4_1_3;
	private Boolean receiveuntagged_10_7;
	private String[] vrid_list_ipv4_1_1;
	private Integer vlan_1_1;
	private String[] vrid_list_ipv6_10_7;
	private Integer vlan_1_8;
	private Integer vlan_10_2;
	private Boolean receiveuntagged_10_5;
	private String[] vrid_list_ipv4_10_3;
	private Boolean receiveuntagged_1_8;
	private String[] vrid_list_ipv4_1_8;
	private String[] vrid_list_ipv4_10_6;
	private Boolean sync_operation;
	private Integer vlan_1_3;
	private String[] vrid_list_ipv4_10_4;
	private Boolean if_1_6;
	private Boolean if_10_6;
	private Boolean receiveuntagged_10_3;
	private Integer vlan_10_3;
	private Integer vlan_1_5;
	private Boolean if_1_3;
	private Boolean if_1_4;
	private String[] vrid_list_ipv4_10_5;
	private String[] vrid_list_ipv4_10_8;
	private Boolean if_1_1;
	private Integer vlan_10_8;
	private String[] vrid_list_ipv4_10_7;
	private Boolean receiveuntagged_1_3;
	private String[] vrid_list_ipv4_10_2;
	private Boolean if_1_8;
	private String[] vrid_list_ipv4_10_1;
	private String[] vrid_list_ipv6_10_2;
	private Boolean if_10_2;
	private String[] vrid_list_ipv6_10_1;
	private Long __count;

	protected String get_object_type()
	{
		return "vm_device";
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
	 * DOM Id assigned to VM Instance
	 * </pre>
	 */
	public Double get_domid()
	{
		return this.domid;
	}

	/**
	 * <pre>
	 * Template Name, This parameter is used while provisioning VM Instance with template, template_name is given priority if provided along with image_name
	 * </pre>
	 */
	public void set_template_name(String template_name)
	{
		this.template_name = template_name;
	}

	/**
	 * <pre>
	 * Template Name, This parameter is used while provisioning VM Instance with template, template_name is given priority if provided along with image_name
	 * </pre>
	 */
	public String get_template_name()
	{
		return this.template_name;
	}


	/**
	 * <pre>
	 * Packet Engine cores assigned to VM Instance
	 * </pre>
	 */
	public String get_cpu_core_pe()
	{
		return this.cpu_core_pe;
	}


	/**
	 * <pre>
	 * Description of vm_device
	 * </pre>
	 */
	public String get_vm_description()
	{
		return this.vm_description;
	}

	/**
	 * <pre>
	 * Image Name, This parameter is used while provisioning VM Instance with XVA image, template_name is given priority if provided along with image_name
	 * </pre>
	 */
	public void set_image_name(String image_name)
	{
		this.image_name = image_name;
	}

	/**
	 * <pre>
	 * Image Name, This parameter is used while provisioning VM Instance with XVA image, template_name is given priority if provided along with image_name
	 * </pre>
	 */
	public String get_image_name()
	{
		return this.image_name;
	}

	/**
	 * <pre>
	 * Network Interfaces
	 * </pre>
	 */
	public void set_network_interfaces(network_interface[] network_interfaces)
	{
		this.network_interfaces = network_interfaces;
	}

	/**
	 * <pre>
	 * Network Interfaces
	 * </pre>
	 */
	public network_interface[] get_network_interfaces()
	{
		return this.network_interfaces;
	}


	/**
	 * <pre>
	 * State of Virtual Machine (Running | Halted)
	 * </pre>
	 */
	public String get_vm_state()
	{
		return this.vm_state;
	}


	/**
	 * <pre>
	 * UUID of VM Instance
	 * </pre>
	 */
	public String get_uuid()
	{
		return this.uuid;
	}


	/**
	 * <pre>
	 * MAC Address of eth0 on VM Instance
	 * </pre>
	 */
	public String get_mac_eth0()
	{
		return this.mac_eth0;
	}

	/**
	 * <pre>
	 * Total Memory of VM Instance in MB
	 * </pre>
	 */
	public void set_vm_memory_total(Double vm_memory_total)
	{
		this.vm_memory_total = vm_memory_total;
	}

	/**
	 * <pre>
	 * Total Memory of VM Instance in MB
	 * </pre>
	 */
	public Double get_vm_memory_total()
	{
		return this.vm_memory_total;
	}


	/**
	 * <pre>
	 * In Throughput of VM Instance in Mbps
	 * </pre>
	 */
	public Double get_vm_rx()
	{
		return this.vm_rx;
	}


	/**
	 * <pre>
	 * Management CPU cores assigned to VM Instance
	 * </pre>
	 */
	public String get_cpu_core_mgmt()
	{
		return this.cpu_core_mgmt;
	}


	/**
	 * <pre>
	 * SSL Virtual Functions assigned to VM Instance
	 * </pre>
	 */
	public String get_ssl_virtual_functions()
	{
		return this.ssl_virtual_functions;
	}


	/**
	 * <pre>
	 * Disk allocation for VM Instance
	 * </pre>
	 */
	public String get_disk_allocation()
	{
		return this.disk_allocation;
	}


	/**
	 * <pre>
	 * Uptime of VM Instance
	 * </pre>
	 */
	public String get_uptime()
	{
		return this.uptime;
	}


	/**
	 * <pre>
	 * Out Throughput of VM Instance in Mbps
	 * </pre>
	 */
	public Double get_vm_tx()
	{
		return this.vm_tx;
	}

	/**
	 * <pre>
	 * True if provision through XVA, false if provision through template
	 * </pre>
	 */
	public void set_provision_with_xva(Boolean provision_with_xva)
	{
		this.provision_with_xva = provision_with_xva;
	}

	/**
	 * <pre>
	 * True if provision through XVA, false if provision through template
	 * </pre>
	 */
	public Boolean get_provision_with_xva()
	{
		return this.provision_with_xva;
	}

	/**
	 * <pre>
	 * Number of cores that are assigned to VM Instance
	 * </pre>
	 */
	public void set_number_of_cores(Integer number_of_cores)
	{
		this.number_of_cores = number_of_cores;
	}

	/**
	 * <pre>
	 * Number of cores that are assigned to VM Instance
	 * </pre>
	 */
	public Integer get_number_of_cores()
	{
		return this.number_of_cores;
	}


	/**
	 * <pre>
	 * Show Disk Space (GB) available to VM Instance
	 * </pre>
	 */
	public Double get_disk_space()
	{
		return this.disk_space;
	}


	/**
	 * <pre>
	 * Virtual Functions assigned to VM Instance
	 * </pre>
	 */
	public String get_virtual_functions()
	{
		return this.virtual_functions;
	}


	/**
	 * <pre>
	 * Free Memory (MB) available in VM Instance
	 * </pre>
	 */
	public Double get_vm_memory_free()
	{
		return this.vm_memory_free;
	}


	/**
	 * <pre>
	 * Memory Usage (%) of VM Instance
	 * </pre>
	 */
	public Double get_vm_memory_usage()
	{
		return this.vm_memory_usage;
	}

	/**
	 * <pre>
	 * Assign number of ssl virtual functions to VM Instance
	 * </pre>
	 */
	public void set_number_of_ssl_cores(Integer number_of_ssl_cores)
	{
		this.number_of_ssl_cores = number_of_ssl_cores;
	}

	/**
	 * <pre>
	 * Assign number of ssl virtual functions to VM Instance
	 * </pre>
	 */
	public Integer get_number_of_ssl_cores()
	{
		return this.number_of_ssl_cores;
	}

	/**
	 * <pre>
	 * Assign throughput in Mbps to VM Instance
	 * </pre>
	 */
	public void set_throughput(Double throughput)
	{
		this.throughput = throughput;
	}

	/**
	 * <pre>
	 * Assign throughput in Mbps to VM Instance
	 * </pre>
	 */
	public Double get_throughput()
	{
		return this.throughput;
	}


	/**
	 * <pre>
	 * CPU Usage (%) of VM Instance
	 * </pre>
	 */
	public Double get_vm_cpu_usage()
	{
		return this.vm_cpu_usage;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/2 on VM Instance
	 * </pre>
	 */
	public void set_vlan_1_2(Integer vlan_1_2)
	{
		this.vlan_1_2 = vlan_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/2 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_1_2()
	{
		return this.vlan_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/2 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_1_2(String[] vrid_list_ipv4_1_2)
	{
		this.vrid_list_ipv4_1_2 = vrid_list_ipv4_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/2 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_1_2()
	{
		return this.vrid_list_ipv4_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/7 on VM Instance
	 * </pre>
	 */
	public void set_vlan_1_7(Integer vlan_1_7)
	{
		this.vlan_1_7 = vlan_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/7 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_1_7()
	{
		return this.vlan_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/2 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_1_2(String[] vrid_list_ipv6_1_2)
	{
		this.vrid_list_ipv6_1_2 = vrid_list_ipv6_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/2 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_1_2()
	{
		return this.vrid_list_ipv6_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/4 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_1_4(String[] vrid_list_ipv4_1_4)
	{
		this.vrid_list_ipv4_1_4 = vrid_list_ipv4_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/4 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_1_4()
	{
		return this.vrid_list_ipv4_1_4;
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
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/6 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_10_6(String[] vrid_list_ipv6_10_6)
	{
		this.vrid_list_ipv6_10_6 = vrid_list_ipv6_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/6 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_10_6()
	{
		return this.vrid_list_ipv6_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/4 on VM Instance
	 * </pre>
	 */
	public void set_if_10_4(Boolean if_10_4)
	{
		this.if_10_4 = if_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/4 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_10_4()
	{
		return this.if_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/5 on VM Instance
	 * </pre>
	 */
	public void set_vlan_10_5(Integer vlan_10_5)
	{
		this.vlan_10_5 = vlan_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/5 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_10_5()
	{
		return this.vlan_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/3 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_10_3(String[] vrid_list_ipv6_10_3)
	{
		this.vrid_list_ipv6_10_3 = vrid_list_ipv6_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/3 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_10_3()
	{
		return this.vrid_list_ipv6_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/1 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_1_1(String[] vrid_list_ipv6_1_1)
	{
		this.vrid_list_ipv6_1_1 = vrid_list_ipv6_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/1 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_1_1()
	{
		return this.vrid_list_ipv6_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/5 on VM Instance
	 * </pre>
	 */
	public void set_if_1_5(Boolean if_1_5)
	{
		this.if_1_5 = if_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/5 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_1_5()
	{
		return this.if_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/4 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_1_4(Boolean receiveuntagged_1_4)
	{
		this.receiveuntagged_1_4 = receiveuntagged_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/4 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_1_4()
	{
		return this.receiveuntagged_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/4 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_10_4(String[] vrid_list_ipv6_10_4)
	{
		this.vrid_list_ipv6_10_4 = vrid_list_ipv6_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/4 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_10_4()
	{
		return this.vrid_list_ipv6_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/3for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_1_3(String[] vrid_list_ipv6_1_3)
	{
		this.vrid_list_ipv6_1_3 = vrid_list_ipv6_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/3for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_1_3()
	{
		return this.vrid_list_ipv6_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/3 on VM Instance
	 * </pre>
	 */
	public void set_if_10_3(Boolean if_10_3)
	{
		this.if_10_3 = if_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/3 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_10_3()
	{
		return this.if_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/5 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_10_5(String[] vrid_list_ipv6_10_5)
	{
		this.vrid_list_ipv6_10_5 = vrid_list_ipv6_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/5 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_10_5()
	{
		return this.vrid_list_ipv6_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/4 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_10_4(Boolean receiveuntagged_10_4)
	{
		this.receiveuntagged_10_4 = receiveuntagged_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/4 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_10_4()
	{
		return this.receiveuntagged_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/8 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_1_8(String[] vrid_list_ipv6_1_8)
	{
		this.vrid_list_ipv6_1_8 = vrid_list_ipv6_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/8 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_1_8()
	{
		return this.vrid_list_ipv6_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/6 on VM Instance
	 * </pre>
	 */
	public void set_vlan_10_6(Integer vlan_10_6)
	{
		this.vlan_10_6 = vlan_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/6 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_10_6()
	{
		return this.vlan_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/5 on VM Instance
	 * </pre>
	 */
	public void set_if_10_5(Boolean if_10_5)
	{
		this.if_10_5 = if_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/5 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_10_5()
	{
		return this.if_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/6 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_1_6(String[] vrid_list_ipv6_1_6)
	{
		this.vrid_list_ipv6_1_6 = vrid_list_ipv6_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/6 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_1_6()
	{
		return this.vrid_list_ipv6_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/7 on VM Instance
	 * </pre>
	 */
	public void set_if_10_7(Boolean if_10_7)
	{
		this.if_10_7 = if_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/7 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_10_7()
	{
		return this.if_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/8 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_10_8(Boolean receiveuntagged_10_8)
	{
		this.receiveuntagged_10_8 = receiveuntagged_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/8 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_10_8()
	{
		return this.receiveuntagged_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/4 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_1_4(String[] vrid_list_ipv6_1_4)
	{
		this.vrid_list_ipv6_1_4 = vrid_list_ipv6_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/4 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_1_4()
	{
		return this.vrid_list_ipv6_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/6 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_1_6(Boolean receiveuntagged_1_6)
	{
		this.receiveuntagged_1_6 = receiveuntagged_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/6 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_1_6()
	{
		return this.receiveuntagged_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/4 on VM Instance
	 * </pre>
	 */
	public void set_vlan_1_4(Integer vlan_1_4)
	{
		this.vlan_1_4 = vlan_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/4 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_1_4()
	{
		return this.vlan_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/2 on VM Instance
	 * </pre>
	 */
	public void set_if_1_2(Boolean if_1_2)
	{
		this.if_1_2 = if_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/2 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_1_2()
	{
		return this.if_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/5 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_1_5(Boolean receiveuntagged_1_5)
	{
		this.receiveuntagged_1_5 = receiveuntagged_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/5 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_1_5()
	{
		return this.receiveuntagged_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/6 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_10_6(Boolean receiveuntagged_10_6)
	{
		this.receiveuntagged_10_6 = receiveuntagged_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/6 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_10_6()
	{
		return this.receiveuntagged_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/1 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_10_1(Boolean receiveuntagged_10_1)
	{
		this.receiveuntagged_10_1 = receiveuntagged_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/1 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_10_1()
	{
		return this.receiveuntagged_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/5 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_1_5(String[] vrid_list_ipv6_1_5)
	{
		this.vrid_list_ipv6_1_5 = vrid_list_ipv6_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/5 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_1_5()
	{
		return this.vrid_list_ipv6_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/6 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_1_6(String[] vrid_list_ipv4_1_6)
	{
		this.vrid_list_ipv4_1_6 = vrid_list_ipv4_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/6 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_1_6()
	{
		return this.vrid_list_ipv4_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/8 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_10_8(String[] vrid_list_ipv6_10_8)
	{
		this.vrid_list_ipv6_10_8 = vrid_list_ipv6_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/8 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_10_8()
	{
		return this.vrid_list_ipv6_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/7 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_1_7(String[] vrid_list_ipv4_1_7)
	{
		this.vrid_list_ipv4_1_7 = vrid_list_ipv4_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/7 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_1_7()
	{
		return this.vrid_list_ipv4_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/2 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_10_2(Boolean receiveuntagged_10_2)
	{
		this.receiveuntagged_10_2 = receiveuntagged_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/2 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_10_2()
	{
		return this.receiveuntagged_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/5 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_1_5(String[] vrid_list_ipv4_1_5)
	{
		this.vrid_list_ipv4_1_5 = vrid_list_ipv4_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/5 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_1_5()
	{
		return this.vrid_list_ipv4_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/7 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_1_7(Boolean receiveuntagged_1_7)
	{
		this.receiveuntagged_1_7 = receiveuntagged_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/7 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_1_7()
	{
		return this.receiveuntagged_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/4 on VM Instance
	 * </pre>
	 */
	public void set_vlan_10_4(Integer vlan_10_4)
	{
		this.vlan_10_4 = vlan_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/4 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_10_4()
	{
		return this.vlan_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/7 on VM Instance
	 * </pre>
	 */
	public void set_if_1_7(Boolean if_1_7)
	{
		this.if_1_7 = if_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/7 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_1_7()
	{
		return this.if_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/1 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_1_1(Boolean receiveuntagged_1_1)
	{
		this.receiveuntagged_1_1 = receiveuntagged_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/1 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_1_1()
	{
		return this.receiveuntagged_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/7 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_1_7(String[] vrid_list_ipv6_1_7)
	{
		this.vrid_list_ipv6_1_7 = vrid_list_ipv6_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/7 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_1_7()
	{
		return this.vrid_list_ipv6_1_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/1 on VM Instance
	 * </pre>
	 */
	public void set_if_10_1(Boolean if_10_1)
	{
		this.if_10_1 = if_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/1 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_10_1()
	{
		return this.if_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/8 on VM Instance
	 * </pre>
	 */
	public void set_if_10_8(Boolean if_10_8)
	{
		this.if_10_8 = if_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/8 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_10_8()
	{
		return this.if_10_8;
	}

	/**
	 * <pre>
	 * L2mode status of VM Instance
	 * </pre>
	 */
	public void set_l2_enabled(Boolean l2_enabled)
	{
		this.l2_enabled = l2_enabled;
	}

	/**
	 * <pre>
	 * L2mode status of VM Instance
	 * </pre>
	 */
	public Boolean get_l2_enabled()
	{
		return this.l2_enabled;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/7 on VM Instance
	 * </pre>
	 */
	public void set_vlan_10_7(Integer vlan_10_7)
	{
		this.vlan_10_7 = vlan_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/7 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_10_7()
	{
		return this.vlan_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/1 on VM Instance
	 * </pre>
	 */
	public void set_vlan_10_1(Integer vlan_10_1)
	{
		this.vlan_10_1 = vlan_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/1 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_10_1()
	{
		return this.vlan_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/2 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_1_2(Boolean receiveuntagged_1_2)
	{
		this.receiveuntagged_1_2 = receiveuntagged_1_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/2 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_1_2()
	{
		return this.receiveuntagged_1_2;
	}

	/**
	 * <pre>
	 * Reboot VMs on CPU change during resource allocation
	 * </pre>
	 */
	public void set_reboot_vm_on_cpu_change(Boolean reboot_vm_on_cpu_change)
	{
		this.reboot_vm_on_cpu_change = reboot_vm_on_cpu_change;
	}

	/**
	 * <pre>
	 * Reboot VMs on CPU change during resource allocation
	 * </pre>
	 */
	public Boolean get_reboot_vm_on_cpu_change()
	{
		return this.reboot_vm_on_cpu_change;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/6 on VM Instance
	 * </pre>
	 */
	public void set_vlan_1_6(Integer vlan_1_6)
	{
		this.vlan_1_6 = vlan_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/6 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_1_6()
	{
		return this.vlan_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/3for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_1_3(String[] vrid_list_ipv4_1_3)
	{
		this.vrid_list_ipv4_1_3 = vrid_list_ipv4_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/3for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_1_3()
	{
		return this.vrid_list_ipv4_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/7 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_10_7(Boolean receiveuntagged_10_7)
	{
		this.receiveuntagged_10_7 = receiveuntagged_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/7 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_10_7()
	{
		return this.receiveuntagged_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/1 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_1_1(String[] vrid_list_ipv4_1_1)
	{
		this.vrid_list_ipv4_1_1 = vrid_list_ipv4_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/1 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_1_1()
	{
		return this.vrid_list_ipv4_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/1 on VM Instance
	 * </pre>
	 */
	public void set_vlan_1_1(Integer vlan_1_1)
	{
		this.vlan_1_1 = vlan_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/1 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_1_1()
	{
		return this.vlan_1_1;
	}

	/**
	 * <pre>
	 * VRID List for Interface 10/7 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_10_7(String[] vrid_list_ipv6_10_7)
	{
		this.vrid_list_ipv6_10_7 = vrid_list_ipv6_10_7;
	}

	/**
	 * <pre>
	 * VRID List for Interface 10/7 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_10_7()
	{
		return this.vrid_list_ipv6_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/8 on VM Instance
	 * </pre>
	 */
	public void set_vlan_1_8(Integer vlan_1_8)
	{
		this.vlan_1_8 = vlan_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/8 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_1_8()
	{
		return this.vlan_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/2 on VM Instance
	 * </pre>
	 */
	public void set_vlan_10_2(Integer vlan_10_2)
	{
		this.vlan_10_2 = vlan_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/2 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_10_2()
	{
		return this.vlan_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/5 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_10_5(Boolean receiveuntagged_10_5)
	{
		this.receiveuntagged_10_5 = receiveuntagged_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/5 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_10_5()
	{
		return this.receiveuntagged_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/3 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_10_3(String[] vrid_list_ipv4_10_3)
	{
		this.vrid_list_ipv4_10_3 = vrid_list_ipv4_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/3 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_10_3()
	{
		return this.vrid_list_ipv4_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/8 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_1_8(Boolean receiveuntagged_1_8)
	{
		this.receiveuntagged_1_8 = receiveuntagged_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/8 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_1_8()
	{
		return this.receiveuntagged_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/8 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_1_8(String[] vrid_list_ipv4_1_8)
	{
		this.vrid_list_ipv4_1_8 = vrid_list_ipv4_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 1/8 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_1_8()
	{
		return this.vrid_list_ipv4_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/6 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_10_6(String[] vrid_list_ipv4_10_6)
	{
		this.vrid_list_ipv4_10_6 = vrid_list_ipv4_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/6 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_10_6()
	{
		return this.vrid_list_ipv4_10_6;
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
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/3 on VM Instance
	 * </pre>
	 */
	public void set_vlan_1_3(Integer vlan_1_3)
	{
		this.vlan_1_3 = vlan_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/3 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_1_3()
	{
		return this.vlan_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/4 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_10_4(String[] vrid_list_ipv4_10_4)
	{
		this.vrid_list_ipv4_10_4 = vrid_list_ipv4_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/4 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_10_4()
	{
		return this.vrid_list_ipv4_10_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/6 on VM Instance
	 * </pre>
	 */
	public void set_if_1_6(Boolean if_1_6)
	{
		this.if_1_6 = if_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/6 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_1_6()
	{
		return this.if_1_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/6 on VM Instance
	 * </pre>
	 */
	public void set_if_10_6(Boolean if_10_6)
	{
		this.if_10_6 = if_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/6 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_10_6()
	{
		return this.if_10_6;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/3 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_10_3(Boolean receiveuntagged_10_3)
	{
		this.receiveuntagged_10_3 = receiveuntagged_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 10/3 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_10_3()
	{
		return this.receiveuntagged_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/3 on VM Instance
	 * </pre>
	 */
	public void set_vlan_10_3(Integer vlan_10_3)
	{
		this.vlan_10_3 = vlan_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/3 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_10_3()
	{
		return this.vlan_10_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/5 on VM Instance
	 * </pre>
	 */
	public void set_vlan_1_5(Integer vlan_1_5)
	{
		this.vlan_1_5 = vlan_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 1/5 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_1_5()
	{
		return this.vlan_1_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/3 on VM Instance
	 * </pre>
	 */
	public void set_if_1_3(Boolean if_1_3)
	{
		this.if_1_3 = if_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/3 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_1_3()
	{
		return this.if_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/4 on VM Instance
	 * </pre>
	 */
	public void set_if_1_4(Boolean if_1_4)
	{
		this.if_1_4 = if_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/4 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_1_4()
	{
		return this.if_1_4;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/5 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_10_5(String[] vrid_list_ipv4_10_5)
	{
		this.vrid_list_ipv4_10_5 = vrid_list_ipv4_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/5 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_10_5()
	{
		return this.vrid_list_ipv4_10_5;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/8 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_10_8(String[] vrid_list_ipv4_10_8)
	{
		this.vrid_list_ipv4_10_8 = vrid_list_ipv4_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/8 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_10_8()
	{
		return this.vrid_list_ipv4_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/1 on VM Instance
	 * </pre>
	 */
	public void set_if_1_1(Boolean if_1_1)
	{
		this.if_1_1 = if_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/1 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_1_1()
	{
		return this.if_1_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/8 on VM Instance
	 * </pre>
	 */
	public void set_vlan_10_8(Integer vlan_10_8)
	{
		this.vlan_10_8 = vlan_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VLAN for Network 10/8 on VM Instance
	 * </pre>
	 */
	public Integer get_vlan_10_8()
	{
		return this.vlan_10_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/7 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_10_7(String[] vrid_list_ipv4_10_7)
	{
		this.vrid_list_ipv4_10_7 = vrid_list_ipv4_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/7 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_10_7()
	{
		return this.vrid_list_ipv4_10_7;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/3 on VM Instance
	 * </pre>
	 */
	public void set_receiveuntagged_1_3(Boolean receiveuntagged_1_3)
	{
		this.receiveuntagged_1_3 = receiveuntagged_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Receive Untagged Packets on 1/3 on VM Instance
	 * </pre>
	 */
	public Boolean get_receiveuntagged_1_3()
	{
		return this.receiveuntagged_1_3;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/2 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_10_2(String[] vrid_list_ipv4_10_2)
	{
		this.vrid_list_ipv4_10_2 = vrid_list_ipv4_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/2 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_10_2()
	{
		return this.vrid_list_ipv4_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/8 on VM Instance
	 * </pre>
	 */
	public void set_if_1_8(Boolean if_1_8)
	{
		this.if_1_8 = if_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 1/8 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_1_8()
	{
		return this.if_1_8;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/1 for IPV4 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv4_10_1(String[] vrid_list_ipv4_10_1)
	{
		this.vrid_list_ipv4_10_1 = vrid_list_ipv4_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/1 for IPV4 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv4_10_1()
	{
		return this.vrid_list_ipv4_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/2 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_10_2(String[] vrid_list_ipv6_10_2)
	{
		this.vrid_list_ipv6_10_2 = vrid_list_ipv6_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/2 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_10_2()
	{
		return this.vrid_list_ipv6_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/2 on VM Instance
	 * </pre>
	 */
	public void set_if_10_2(Boolean if_10_2)
	{
		this.if_10_2 = if_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * Network 10/2 on VM Instance
	 * </pre>
	 */
	public Boolean get_if_10_2()
	{
		return this.if_10_2;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/1 for IPV6 VMAC Generation
	 * </pre>
	 */
	public void set_vrid_list_ipv6_10_1(String[] vrid_list_ipv6_10_1)
	{
		this.vrid_list_ipv6_10_1 = vrid_list_ipv6_10_1;
	}

	/**
	 * <pre>
	 * This property is deprecated by network_interfaces
	 * VRID List for Interface 10/1 for IPV6 VMAC Generation
	 * </pre>
	 */
	public String[] get_vrid_list_ipv6_10_1()
	{
		return this.vrid_list_ipv6_10_1;
	}


	/**
	 * <pre>
	 * Use this operation to get VM Instance.
	 * </pre>
	 */
	public static vm_device[] get(nitro_service client) throws Exception
	{
		vm_device resource = new vm_device();
		resource.validate("get");
		return (vm_device[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get VM Instance.
	 */
	public static vm_device get(nitro_service client, vm_device resource) throws Exception
	{
		resource.validate("get");
		return ((vm_device[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get VM Instance in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of vm_device resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static vm_device[] get_filtered(nitro_service service, String filter) throws Exception
	{
		vm_device obj = new vm_device();
		options option = new options();
		option.set_filter(filter);
		vm_device[] response = (vm_device[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vm_device resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vm_device[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		vm_device obj = new vm_device();
		options option = new options();
		option.set_filter(filter);
		vm_device[] response = (vm_device[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vm_device resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		vm_device obj = new vm_device();
		options option = new options();
		option.set_count(true);
		vm_device[] response = (vm_device[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of vm_device resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		vm_device obj = new vm_device();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vm_device[] response = (vm_device[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of vm_device resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		vm_device obj = new vm_device();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vm_device[] response = (vm_device[])obj.get_resources(service, option);
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
		vm_device_response result = (vm_device_response) service.get_payload_formatter().string_to_resource(vm_device_response.class, response);
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
		return result.vm_device;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		vm_device_responses result = (vm_device_responses) service.get_payload_formatter().string_to_resource(vm_device_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.vm_device_response_array);
		}
		vm_device[] result_vm_device = new vm_device[result.vm_device_response_array.length];
		
		for(int i = 0; i < result.vm_device_response_array.length; i++)
		{
			result_vm_device[i] = result.vm_device_response_array[i].vm_device[0];
		}
		
		return result_vm_device;
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
		
		MPSString template_name_validator = new MPSString();
		template_name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		template_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		template_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		template_name_validator.validate(operationType, template_name, "\"template_name\"");
		
		MPSString image_name_validator = new MPSString();
		image_name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		image_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		image_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		image_name_validator.validate(operationType, image_name, "\"image_name\"");
		
		MPSString virtual_functions_validator = new MPSString();
		virtual_functions_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 512);
		virtual_functions_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		virtual_functions_validator.validate(operationType, virtual_functions, "\"virtual_functions\"");
		
		MPSString ssl_virtual_functions_validator = new MPSString();
		ssl_virtual_functions_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		ssl_virtual_functions_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ssl_virtual_functions_validator.validate(operationType, ssl_virtual_functions, "\"ssl_virtual_functions\"");
		
		MPSString vm_state_validator = new MPSString();
		vm_state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		vm_state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		vm_state_validator.validate(operationType, vm_state, "\"vm_state\"");
		
		MPSDouble vm_cpu_usage_validator = new MPSDouble();
		vm_cpu_usage_validator.validate(operationType, vm_cpu_usage, "\"vm_cpu_usage\"");
		
		MPSDoubleLong vm_memory_total_validator = new MPSDoubleLong();
		vm_memory_total_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 2048);
		vm_memory_total_validator.validate(operationType, vm_memory_total, "\"vm_memory_total\"");
		
		MPSDoubleLong vm_memory_free_validator = new MPSDoubleLong();
		vm_memory_free_validator.validate(operationType, vm_memory_free, "\"vm_memory_free\"");
		
		MPSDouble vm_memory_usage_validator = new MPSDouble();
		vm_memory_usage_validator.validate(operationType, vm_memory_usage, "\"vm_memory_usage\"");
		
		MPSDouble vm_tx_validator = new MPSDouble();
		vm_tx_validator.validate(operationType, vm_tx, "\"vm_tx\"");
		
		MPSDouble vm_rx_validator = new MPSDouble();
		vm_rx_validator.validate(operationType, vm_rx, "\"vm_rx\"");
		
		MPSString uptime_validator = new MPSString();
		uptime_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		uptime_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		uptime_validator.validate(operationType, uptime, "\"uptime\"");
		
		MPSInt number_of_ssl_cores_validator = new MPSInt();
		number_of_ssl_cores_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		number_of_ssl_cores_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 16);
		number_of_ssl_cores_validator.validate(operationType, number_of_ssl_cores, "\"number_of_ssl_cores\"");
		
		MPSString cpu_core_mgmt_validator = new MPSString();
		cpu_core_mgmt_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		cpu_core_mgmt_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		cpu_core_mgmt_validator.validate(operationType, cpu_core_mgmt, "\"cpu_core_mgmt\"");
		
		MPSString cpu_core_pe_validator = new MPSString();
		cpu_core_pe_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		cpu_core_pe_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		cpu_core_pe_validator.validate(operationType, cpu_core_pe, "\"cpu_core_pe\"");
		
		MPSDoubleLong domid_validator = new MPSDoubleLong();
		domid_validator.validate(operationType, domid, "\"domid\"");
		
		MPSString mac_eth0_validator = new MPSString();
		mac_eth0_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		mac_eth0_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		mac_eth0_validator.validate(operationType, mac_eth0, "\"mac_eth0\"");
		
		MPSString vm_description_validator = new MPSString();
		vm_description_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		vm_description_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		vm_description_validator.validate(operationType, vm_description, "\"vm_description\"");
		
		MPSDoubleLong throughput_validator = new MPSDoubleLong();
		throughput_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		throughput_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 35000);
		throughput_validator.validate(operationType, throughput, "\"throughput\"");
		
		MPSDoubleLong disk_space_validator = new MPSDoubleLong();
		disk_space_validator.validate(operationType, disk_space, "\"disk_space\"");
		
		MPSString disk_allocation_validator = new MPSString();
		disk_allocation_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 512);
		disk_allocation_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		disk_allocation_validator.validate(operationType, disk_allocation, "\"disk_allocation\"");
		
		MPSInt number_of_cores_validator = new MPSInt();
		number_of_cores_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 5);
		number_of_cores_validator.validate(operationType, number_of_cores, "\"number_of_cores\"");
		
		MPSBoolean provision_with_xva_validator = new MPSBoolean();
		provision_with_xva_validator.validate(operationType, provision_with_xva, "\"provision_with_xva\"");
		
		if(network_interfaces != null)
		{
			for(int i=0; i<network_interfaces.length; i++)
			{
				network_interfaces[i].validate(operationType);
			}
		}
		
		MPSInt vlan_10_1_validator = new MPSInt();
		vlan_10_1_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_10_1_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_10_1_validator.validate(operationType, vlan_10_1, "\"vlan_10_1\"");
		
		MPSInt vlan_10_2_validator = new MPSInt();
		vlan_10_2_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_10_2_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_10_2_validator.validate(operationType, vlan_10_2, "\"vlan_10_2\"");
		
		MPSInt vlan_10_3_validator = new MPSInt();
		vlan_10_3_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_10_3_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_10_3_validator.validate(operationType, vlan_10_3, "\"vlan_10_3\"");
		
		MPSInt vlan_10_4_validator = new MPSInt();
		vlan_10_4_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_10_4_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_10_4_validator.validate(operationType, vlan_10_4, "\"vlan_10_4\"");
		
		MPSInt vlan_10_5_validator = new MPSInt();
		vlan_10_5_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_10_5_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_10_5_validator.validate(operationType, vlan_10_5, "\"vlan_10_5\"");
		
		MPSInt vlan_10_6_validator = new MPSInt();
		vlan_10_6_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_10_6_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_10_6_validator.validate(operationType, vlan_10_6, "\"vlan_10_6\"");
		
		MPSInt vlan_10_7_validator = new MPSInt();
		vlan_10_7_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_10_7_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_10_7_validator.validate(operationType, vlan_10_7, "\"vlan_10_7\"");
		
		MPSInt vlan_10_8_validator = new MPSInt();
		vlan_10_8_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_10_8_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_10_8_validator.validate(operationType, vlan_10_8, "\"vlan_10_8\"");
		
		MPSInt vlan_1_1_validator = new MPSInt();
		vlan_1_1_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_1_1_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_1_1_validator.validate(operationType, vlan_1_1, "\"vlan_1_1\"");
		
		MPSInt vlan_1_2_validator = new MPSInt();
		vlan_1_2_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_1_2_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_1_2_validator.validate(operationType, vlan_1_2, "\"vlan_1_2\"");
		
		MPSInt vlan_1_3_validator = new MPSInt();
		vlan_1_3_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_1_3_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_1_3_validator.validate(operationType, vlan_1_3, "\"vlan_1_3\"");
		
		MPSInt vlan_1_4_validator = new MPSInt();
		vlan_1_4_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_1_4_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_1_4_validator.validate(operationType, vlan_1_4, "\"vlan_1_4\"");
		
		MPSInt vlan_1_5_validator = new MPSInt();
		vlan_1_5_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_1_5_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_1_5_validator.validate(operationType, vlan_1_5, "\"vlan_1_5\"");
		
		MPSInt vlan_1_6_validator = new MPSInt();
		vlan_1_6_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_1_6_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_1_6_validator.validate(operationType, vlan_1_6, "\"vlan_1_6\"");
		
		MPSInt vlan_1_7_validator = new MPSInt();
		vlan_1_7_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_1_7_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_1_7_validator.validate(operationType, vlan_1_7, "\"vlan_1_7\"");
		
		MPSInt vlan_1_8_validator = new MPSInt();
		vlan_1_8_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		vlan_1_8_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 4095);
		vlan_1_8_validator.validate(operationType, vlan_1_8, "\"vlan_1_8\"");
		
		MPSBoolean if_1_1_validator = new MPSBoolean();
		if_1_1_validator.validate(operationType, if_1_1, "\"if_1_1\"");
		
		MPSBoolean if_1_2_validator = new MPSBoolean();
		if_1_2_validator.validate(operationType, if_1_2, "\"if_1_2\"");
		
		MPSBoolean if_1_3_validator = new MPSBoolean();
		if_1_3_validator.validate(operationType, if_1_3, "\"if_1_3\"");
		
		MPSBoolean if_1_4_validator = new MPSBoolean();
		if_1_4_validator.validate(operationType, if_1_4, "\"if_1_4\"");
		
		MPSBoolean if_1_5_validator = new MPSBoolean();
		if_1_5_validator.validate(operationType, if_1_5, "\"if_1_5\"");
		
		MPSBoolean if_1_6_validator = new MPSBoolean();
		if_1_6_validator.validate(operationType, if_1_6, "\"if_1_6\"");
		
		MPSBoolean if_1_7_validator = new MPSBoolean();
		if_1_7_validator.validate(operationType, if_1_7, "\"if_1_7\"");
		
		MPSBoolean if_1_8_validator = new MPSBoolean();
		if_1_8_validator.validate(operationType, if_1_8, "\"if_1_8\"");
		
		MPSBoolean if_10_1_validator = new MPSBoolean();
		if_10_1_validator.validate(operationType, if_10_1, "\"if_10_1\"");
		
		MPSBoolean if_10_2_validator = new MPSBoolean();
		if_10_2_validator.validate(operationType, if_10_2, "\"if_10_2\"");
		
		MPSBoolean if_10_3_validator = new MPSBoolean();
		if_10_3_validator.validate(operationType, if_10_3, "\"if_10_3\"");
		
		MPSBoolean if_10_4_validator = new MPSBoolean();
		if_10_4_validator.validate(operationType, if_10_4, "\"if_10_4\"");
		
		MPSBoolean if_10_5_validator = new MPSBoolean();
		if_10_5_validator.validate(operationType, if_10_5, "\"if_10_5\"");
		
		MPSBoolean if_10_6_validator = new MPSBoolean();
		if_10_6_validator.validate(operationType, if_10_6, "\"if_10_6\"");
		
		MPSBoolean if_10_7_validator = new MPSBoolean();
		if_10_7_validator.validate(operationType, if_10_7, "\"if_10_7\"");
		
		MPSBoolean if_10_8_validator = new MPSBoolean();
		if_10_8_validator.validate(operationType, if_10_8, "\"if_10_8\"");
		
		MPSBoolean l2_enabled_validator = new MPSBoolean();
		l2_enabled_validator.validate(operationType, l2_enabled, "\"l2_enabled\"");
		
		MPSBoolean receiveuntagged_1_1_validator = new MPSBoolean();
		receiveuntagged_1_1_validator.validate(operationType, receiveuntagged_1_1, "\"receiveuntagged_1_1\"");
		
		MPSBoolean receiveuntagged_1_2_validator = new MPSBoolean();
		receiveuntagged_1_2_validator.validate(operationType, receiveuntagged_1_2, "\"receiveuntagged_1_2\"");
		
		MPSBoolean receiveuntagged_1_3_validator = new MPSBoolean();
		receiveuntagged_1_3_validator.validate(operationType, receiveuntagged_1_3, "\"receiveuntagged_1_3\"");
		
		MPSBoolean receiveuntagged_1_4_validator = new MPSBoolean();
		receiveuntagged_1_4_validator.validate(operationType, receiveuntagged_1_4, "\"receiveuntagged_1_4\"");
		
		MPSBoolean receiveuntagged_1_5_validator = new MPSBoolean();
		receiveuntagged_1_5_validator.validate(operationType, receiveuntagged_1_5, "\"receiveuntagged_1_5\"");
		
		MPSBoolean receiveuntagged_1_6_validator = new MPSBoolean();
		receiveuntagged_1_6_validator.validate(operationType, receiveuntagged_1_6, "\"receiveuntagged_1_6\"");
		
		MPSBoolean receiveuntagged_1_7_validator = new MPSBoolean();
		receiveuntagged_1_7_validator.validate(operationType, receiveuntagged_1_7, "\"receiveuntagged_1_7\"");
		
		MPSBoolean receiveuntagged_1_8_validator = new MPSBoolean();
		receiveuntagged_1_8_validator.validate(operationType, receiveuntagged_1_8, "\"receiveuntagged_1_8\"");
		
		MPSBoolean receiveuntagged_10_1_validator = new MPSBoolean();
		receiveuntagged_10_1_validator.validate(operationType, receiveuntagged_10_1, "\"receiveuntagged_10_1\"");
		
		MPSBoolean receiveuntagged_10_2_validator = new MPSBoolean();
		receiveuntagged_10_2_validator.validate(operationType, receiveuntagged_10_2, "\"receiveuntagged_10_2\"");
		
		MPSBoolean receiveuntagged_10_3_validator = new MPSBoolean();
		receiveuntagged_10_3_validator.validate(operationType, receiveuntagged_10_3, "\"receiveuntagged_10_3\"");
		
		MPSBoolean receiveuntagged_10_4_validator = new MPSBoolean();
		receiveuntagged_10_4_validator.validate(operationType, receiveuntagged_10_4, "\"receiveuntagged_10_4\"");
		
		MPSBoolean receiveuntagged_10_5_validator = new MPSBoolean();
		receiveuntagged_10_5_validator.validate(operationType, receiveuntagged_10_5, "\"receiveuntagged_10_5\"");
		
		MPSBoolean receiveuntagged_10_6_validator = new MPSBoolean();
		receiveuntagged_10_6_validator.validate(operationType, receiveuntagged_10_6, "\"receiveuntagged_10_6\"");
		
		MPSBoolean receiveuntagged_10_7_validator = new MPSBoolean();
		receiveuntagged_10_7_validator.validate(operationType, receiveuntagged_10_7, "\"receiveuntagged_10_7\"");
		
		MPSBoolean receiveuntagged_10_8_validator = new MPSBoolean();
		receiveuntagged_10_8_validator.validate(operationType, receiveuntagged_10_8, "\"receiveuntagged_10_8\"");
		
		MPSString vrid_list_ipv4_1_1_validator = new MPSString();
		if(vrid_list_ipv4_1_1 != null)
		{
			for(int i=0; i<vrid_list_ipv4_1_1.length; i++)
			{
				vrid_list_ipv4_1_1_validator.validate(operationType, vrid_list_ipv4_1_1[i], "vrid_list_ipv4_1_1["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_1_2_validator = new MPSString();
		if(vrid_list_ipv4_1_2 != null)
		{
			for(int i=0; i<vrid_list_ipv4_1_2.length; i++)
			{
				vrid_list_ipv4_1_2_validator.validate(operationType, vrid_list_ipv4_1_2[i], "vrid_list_ipv4_1_2["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_1_3_validator = new MPSString();
		if(vrid_list_ipv4_1_3 != null)
		{
			for(int i=0; i<vrid_list_ipv4_1_3.length; i++)
			{
				vrid_list_ipv4_1_3_validator.validate(operationType, vrid_list_ipv4_1_3[i], "vrid_list_ipv4_1_3["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_1_4_validator = new MPSString();
		if(vrid_list_ipv4_1_4 != null)
		{
			for(int i=0; i<vrid_list_ipv4_1_4.length; i++)
			{
				vrid_list_ipv4_1_4_validator.validate(operationType, vrid_list_ipv4_1_4[i], "vrid_list_ipv4_1_4["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_1_5_validator = new MPSString();
		if(vrid_list_ipv4_1_5 != null)
		{
			for(int i=0; i<vrid_list_ipv4_1_5.length; i++)
			{
				vrid_list_ipv4_1_5_validator.validate(operationType, vrid_list_ipv4_1_5[i], "vrid_list_ipv4_1_5["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_1_6_validator = new MPSString();
		if(vrid_list_ipv4_1_6 != null)
		{
			for(int i=0; i<vrid_list_ipv4_1_6.length; i++)
			{
				vrid_list_ipv4_1_6_validator.validate(operationType, vrid_list_ipv4_1_6[i], "vrid_list_ipv4_1_6["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_1_7_validator = new MPSString();
		if(vrid_list_ipv4_1_7 != null)
		{
			for(int i=0; i<vrid_list_ipv4_1_7.length; i++)
			{
				vrid_list_ipv4_1_7_validator.validate(operationType, vrid_list_ipv4_1_7[i], "vrid_list_ipv4_1_7["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_1_8_validator = new MPSString();
		if(vrid_list_ipv4_1_8 != null)
		{
			for(int i=0; i<vrid_list_ipv4_1_8.length; i++)
			{
				vrid_list_ipv4_1_8_validator.validate(operationType, vrid_list_ipv4_1_8[i], "vrid_list_ipv4_1_8["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_10_1_validator = new MPSString();
		if(vrid_list_ipv4_10_1 != null)
		{
			for(int i=0; i<vrid_list_ipv4_10_1.length; i++)
			{
				vrid_list_ipv4_10_1_validator.validate(operationType, vrid_list_ipv4_10_1[i], "vrid_list_ipv4_10_1["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_10_2_validator = new MPSString();
		if(vrid_list_ipv4_10_2 != null)
		{
			for(int i=0; i<vrid_list_ipv4_10_2.length; i++)
			{
				vrid_list_ipv4_10_2_validator.validate(operationType, vrid_list_ipv4_10_2[i], "vrid_list_ipv4_10_2["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_10_3_validator = new MPSString();
		if(vrid_list_ipv4_10_3 != null)
		{
			for(int i=0; i<vrid_list_ipv4_10_3.length; i++)
			{
				vrid_list_ipv4_10_3_validator.validate(operationType, vrid_list_ipv4_10_3[i], "vrid_list_ipv4_10_3["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_10_4_validator = new MPSString();
		if(vrid_list_ipv4_10_4 != null)
		{
			for(int i=0; i<vrid_list_ipv4_10_4.length; i++)
			{
				vrid_list_ipv4_10_4_validator.validate(operationType, vrid_list_ipv4_10_4[i], "vrid_list_ipv4_10_4["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_10_5_validator = new MPSString();
		if(vrid_list_ipv4_10_5 != null)
		{
			for(int i=0; i<vrid_list_ipv4_10_5.length; i++)
			{
				vrid_list_ipv4_10_5_validator.validate(operationType, vrid_list_ipv4_10_5[i], "vrid_list_ipv4_10_5["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_10_6_validator = new MPSString();
		if(vrid_list_ipv4_10_6 != null)
		{
			for(int i=0; i<vrid_list_ipv4_10_6.length; i++)
			{
				vrid_list_ipv4_10_6_validator.validate(operationType, vrid_list_ipv4_10_6[i], "vrid_list_ipv4_10_6["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_10_7_validator = new MPSString();
		if(vrid_list_ipv4_10_7 != null)
		{
			for(int i=0; i<vrid_list_ipv4_10_7.length; i++)
			{
				vrid_list_ipv4_10_7_validator.validate(operationType, vrid_list_ipv4_10_7[i], "vrid_list_ipv4_10_7["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv4_10_8_validator = new MPSString();
		if(vrid_list_ipv4_10_8 != null)
		{
			for(int i=0; i<vrid_list_ipv4_10_8.length; i++)
			{
				vrid_list_ipv4_10_8_validator.validate(operationType, vrid_list_ipv4_10_8[i], "vrid_list_ipv4_10_8["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_1_1_validator = new MPSString();
		if(vrid_list_ipv6_1_1 != null)
		{
			for(int i=0; i<vrid_list_ipv6_1_1.length; i++)
			{
				vrid_list_ipv6_1_1_validator.validate(operationType, vrid_list_ipv6_1_1[i], "vrid_list_ipv6_1_1["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_1_2_validator = new MPSString();
		if(vrid_list_ipv6_1_2 != null)
		{
			for(int i=0; i<vrid_list_ipv6_1_2.length; i++)
			{
				vrid_list_ipv6_1_2_validator.validate(operationType, vrid_list_ipv6_1_2[i], "vrid_list_ipv6_1_2["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_1_3_validator = new MPSString();
		if(vrid_list_ipv6_1_3 != null)
		{
			for(int i=0; i<vrid_list_ipv6_1_3.length; i++)
			{
				vrid_list_ipv6_1_3_validator.validate(operationType, vrid_list_ipv6_1_3[i], "vrid_list_ipv6_1_3["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_1_4_validator = new MPSString();
		if(vrid_list_ipv6_1_4 != null)
		{
			for(int i=0; i<vrid_list_ipv6_1_4.length; i++)
			{
				vrid_list_ipv6_1_4_validator.validate(operationType, vrid_list_ipv6_1_4[i], "vrid_list_ipv6_1_4["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_1_5_validator = new MPSString();
		if(vrid_list_ipv6_1_5 != null)
		{
			for(int i=0; i<vrid_list_ipv6_1_5.length; i++)
			{
				vrid_list_ipv6_1_5_validator.validate(operationType, vrid_list_ipv6_1_5[i], "vrid_list_ipv6_1_5["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_1_6_validator = new MPSString();
		if(vrid_list_ipv6_1_6 != null)
		{
			for(int i=0; i<vrid_list_ipv6_1_6.length; i++)
			{
				vrid_list_ipv6_1_6_validator.validate(operationType, vrid_list_ipv6_1_6[i], "vrid_list_ipv6_1_6["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_1_7_validator = new MPSString();
		if(vrid_list_ipv6_1_7 != null)
		{
			for(int i=0; i<vrid_list_ipv6_1_7.length; i++)
			{
				vrid_list_ipv6_1_7_validator.validate(operationType, vrid_list_ipv6_1_7[i], "vrid_list_ipv6_1_7["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_1_8_validator = new MPSString();
		if(vrid_list_ipv6_1_8 != null)
		{
			for(int i=0; i<vrid_list_ipv6_1_8.length; i++)
			{
				vrid_list_ipv6_1_8_validator.validate(operationType, vrid_list_ipv6_1_8[i], "vrid_list_ipv6_1_8["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_10_1_validator = new MPSString();
		if(vrid_list_ipv6_10_1 != null)
		{
			for(int i=0; i<vrid_list_ipv6_10_1.length; i++)
			{
				vrid_list_ipv6_10_1_validator.validate(operationType, vrid_list_ipv6_10_1[i], "vrid_list_ipv6_10_1["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_10_2_validator = new MPSString();
		if(vrid_list_ipv6_10_2 != null)
		{
			for(int i=0; i<vrid_list_ipv6_10_2.length; i++)
			{
				vrid_list_ipv6_10_2_validator.validate(operationType, vrid_list_ipv6_10_2[i], "vrid_list_ipv6_10_2["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_10_3_validator = new MPSString();
		if(vrid_list_ipv6_10_3 != null)
		{
			for(int i=0; i<vrid_list_ipv6_10_3.length; i++)
			{
				vrid_list_ipv6_10_3_validator.validate(operationType, vrid_list_ipv6_10_3[i], "vrid_list_ipv6_10_3["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_10_4_validator = new MPSString();
		if(vrid_list_ipv6_10_4 != null)
		{
			for(int i=0; i<vrid_list_ipv6_10_4.length; i++)
			{
				vrid_list_ipv6_10_4_validator.validate(operationType, vrid_list_ipv6_10_4[i], "vrid_list_ipv6_10_4["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_10_5_validator = new MPSString();
		if(vrid_list_ipv6_10_5 != null)
		{
			for(int i=0; i<vrid_list_ipv6_10_5.length; i++)
			{
				vrid_list_ipv6_10_5_validator.validate(operationType, vrid_list_ipv6_10_5[i], "vrid_list_ipv6_10_5["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_10_6_validator = new MPSString();
		if(vrid_list_ipv6_10_6 != null)
		{
			for(int i=0; i<vrid_list_ipv6_10_6.length; i++)
			{
				vrid_list_ipv6_10_6_validator.validate(operationType, vrid_list_ipv6_10_6[i], "vrid_list_ipv6_10_6["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_10_7_validator = new MPSString();
		if(vrid_list_ipv6_10_7 != null)
		{
			for(int i=0; i<vrid_list_ipv6_10_7.length; i++)
			{
				vrid_list_ipv6_10_7_validator.validate(operationType, vrid_list_ipv6_10_7[i], "vrid_list_ipv6_10_7["+i+"]");
			}
		}
		
		MPSString vrid_list_ipv6_10_8_validator = new MPSString();
		if(vrid_list_ipv6_10_8 != null)
		{
			for(int i=0; i<vrid_list_ipv6_10_8.length; i++)
			{
				vrid_list_ipv6_10_8_validator.validate(operationType, vrid_list_ipv6_10_8[i], "vrid_list_ipv6_10_8["+i+"]");
			}
		}
		
		MPSBoolean reboot_vm_on_cpu_change_validator = new MPSBoolean();
		reboot_vm_on_cpu_change_validator.validate(operationType, reboot_vm_on_cpu_change, "\"reboot_vm_on_cpu_change\"");
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
		MPSBoolean sync_operation_validator = new MPSBoolean();
		sync_operation_validator.validate(operationType, sync_operation, "\"sync_operation\"");
		
	}
}
