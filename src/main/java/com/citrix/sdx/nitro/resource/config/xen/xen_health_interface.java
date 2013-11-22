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

class xen_health_interface_response extends base_response
{
	public xen_health_interface[] xen_health_interface;
}

class xen_health_interface_responses extends base_response
{
	public xen_health_interface_response[] xen_health_interface_response_array;
}

/**
 * Configuration for XenServer Interface Health resource
 */

public class xen_health_interface extends base_resource
{
	private Double rx_packets;
	private Double rx_errors;
	private Double tx_bytes;
	private Double rx_bytes;
	private Double tx_packets;
	private Double tx_errors;
	private String host_ip_address;
	private String mapped_port;
	private Integer vf_total;
	private String port;
	private Integer vf_assigned;
	private String state;
	private Long __count;

	protected String get_object_type()
	{
		return "xen_health_interface";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return mapped_port;
	}

	/**
	 * <pre>
	 * Received packets
	 * </pre>
	 */
	public void set_rx_packets(Double rx_packets)
	{
		this.rx_packets = rx_packets;
	}

	/**
	 * <pre>
	 * Received packets
	 * </pre>
	 */
	public Double get_rx_packets()
	{
		return this.rx_packets;
	}

	/**
	 * <pre>
	 * Receiving errors
	 * </pre>
	 */
	public void set_rx_errors(Double rx_errors)
	{
		this.rx_errors = rx_errors;
	}

	/**
	 * <pre>
	 * Receiving errors
	 * </pre>
	 */
	public Double get_rx_errors()
	{
		return this.rx_errors;
	}

	/**
	 * <pre>
	 * Transmitted bytes
	 * </pre>
	 */
	public void set_tx_bytes(Double tx_bytes)
	{
		this.tx_bytes = tx_bytes;
	}

	/**
	 * <pre>
	 * Transmitted bytes
	 * </pre>
	 */
	public Double get_tx_bytes()
	{
		return this.tx_bytes;
	}

	/**
	 * <pre>
	 * Received bytes
	 * </pre>
	 */
	public void set_rx_bytes(Double rx_bytes)
	{
		this.rx_bytes = rx_bytes;
	}

	/**
	 * <pre>
	 * Received bytes
	 * </pre>
	 */
	public Double get_rx_bytes()
	{
		return this.rx_bytes;
	}

	/**
	 * <pre>
	 * Transmitted packets
	 * </pre>
	 */
	public void set_tx_packets(Double tx_packets)
	{
		this.tx_packets = tx_packets;
	}

	/**
	 * <pre>
	 * Transmitted packets
	 * </pre>
	 */
	public Double get_tx_packets()
	{
		return this.tx_packets;
	}

	/**
	 * <pre>
	 * Transmission errors
	 * </pre>
	 */
	public void set_tx_errors(Double tx_errors)
	{
		this.tx_errors = tx_errors;
	}

	/**
	 * <pre>
	 * Transmission errors
	 * </pre>
	 */
	public Double get_tx_errors()
	{
		return this.tx_errors;
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
	 * Total Virtual Functions
	 * </pre>
	 */
	public void set_vf_total(Integer vf_total)
	{
		this.vf_total = vf_total;
	}

	/**
	 * <pre>
	 * Total Virtual Functions
	 * </pre>
	 */
	public Integer get_vf_total()
	{
		return this.vf_total;
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
	 * Assigned Virtual Functions
	 * </pre>
	 */
	public void set_vf_assigned(Integer vf_assigned)
	{
		this.vf_assigned = vf_assigned;
	}

	/**
	 * <pre>
	 * Assigned Virtual Functions
	 * </pre>
	 */
	public Integer get_vf_assigned()
	{
		return this.vf_assigned;
	}


	/**
	 * <pre>
	 * State of the Interface - UP/DOWN
	 * </pre>
	 */
	public String get_state()
	{
		return this.state;
	}


	/**
	 * <pre>
	 * Use this operation to get health and virtual function statistics for the interface.
	 * </pre>
	 */
	public static xen_health_interface[] get(nitro_service client) throws Exception
	{
		xen_health_interface resource = new xen_health_interface();
		resource.validate("get");
		return (xen_health_interface[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get health and virtual function statistics for the interface.
	 */
	public static xen_health_interface get(nitro_service client, xen_health_interface resource) throws Exception
	{
		resource.validate("get");
		return ((xen_health_interface[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get health and virtual function statistics for the interface in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of xen_health_interface resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen_health_interface[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_interface obj = new xen_health_interface();
		options option = new options();
		option.set_filter(filter);
		xen_health_interface[] response = (xen_health_interface[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen_health_interface resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen_health_interface[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_interface obj = new xen_health_interface();
		options option = new options();
		option.set_filter(filter);
		xen_health_interface[] response = (xen_health_interface[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen_health_interface resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen_health_interface obj = new xen_health_interface();
		options option = new options();
		option.set_count(true);
		xen_health_interface[] response = (xen_health_interface[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_interface resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_interface obj = new xen_health_interface();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_interface[] response = (xen_health_interface[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_interface resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_interface obj = new xen_health_interface();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_interface[] response = (xen_health_interface[])obj.get_resources(service, option);
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
		xen_health_interface_response result = (xen_health_interface_response) service.get_payload_formatter().string_to_resource(xen_health_interface_response.class, response);
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
		return result.xen_health_interface;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_health_interface_responses result = (xen_health_interface_responses) service.get_payload_formatter().string_to_resource(xen_health_interface_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_health_interface_response_array);
		}
		xen_health_interface[] result_xen_health_interface = new xen_health_interface[result.xen_health_interface_response_array.length];
		
		for(int i = 0; i < result.xen_health_interface_response_array.length; i++)
		{
			result_xen_health_interface[i] = result.xen_health_interface_response_array[i].xen_health_interface[0];
		}
		
		return result_xen_health_interface;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString mapped_port_validator = new MPSString();
		mapped_port_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		mapped_port_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		mapped_port_validator.validate(operationType, mapped_port, "\"mapped_port\"");
		
		MPSIPAddress host_ip_address_validator = new MPSIPAddress();
		host_ip_address_validator.validate(operationType, host_ip_address, "\"host_ip_address\"");
		
		MPSString port_validator = new MPSString();
		port_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		port_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		port_validator.validate(operationType, port, "\"port\"");
		
		MPSString state_validator = new MPSString();
		state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		state_validator.validate(operationType, state, "\"state\"");
		
		MPSDouble rx_packets_validator = new MPSDouble();
		rx_packets_validator.validate(operationType, rx_packets, "\"rx_packets\"");
		
		MPSDouble tx_packets_validator = new MPSDouble();
		tx_packets_validator.validate(operationType, tx_packets, "\"tx_packets\"");
		
		MPSDouble rx_bytes_validator = new MPSDouble();
		rx_bytes_validator.validate(operationType, rx_bytes, "\"rx_bytes\"");
		
		MPSDouble tx_bytes_validator = new MPSDouble();
		tx_bytes_validator.validate(operationType, tx_bytes, "\"tx_bytes\"");
		
		MPSDouble rx_errors_validator = new MPSDouble();
		rx_errors_validator.validate(operationType, rx_errors, "\"rx_errors\"");
		
		MPSDouble tx_errors_validator = new MPSDouble();
		tx_errors_validator.validate(operationType, tx_errors, "\"tx_errors\"");
		
		MPSInt vf_total_validator = new MPSInt();
		vf_total_validator.validate(operationType, vf_total, "\"vf_total\"");
		
		MPSInt vf_assigned_validator = new MPSInt();
		vf_assigned_validator.validate(operationType, vf_assigned, "\"vf_assigned\"");
		
	}
}
