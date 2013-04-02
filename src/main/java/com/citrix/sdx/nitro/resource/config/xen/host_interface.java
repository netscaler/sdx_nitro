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
	private Boolean flow_control_tx;
	private Boolean flow_control_auto_neg;
	private String mapped_port;
	private String port;
	private String duplex;
	private String state;
	private Boolean adv_auto_neg;
	private String speed;
	private Boolean support_auto_neg;
	private Boolean flow_control_rx;
	private String port_type;
	private String[] supported_port_types;
	private String[] supported_link_modes;
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
		return mapped_port;
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
	 * State of the port.
	 * </pre>
	 */
	public String get_state()
	{
		return this.state;
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
	 * Supported Link Modes
	 * </pre>
	 */
	public String[] get_supported_link_modes()
	{
		return this.supported_link_modes;
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
	 * Use this operation to get interface.
	 * </pre>
	 */
	public static host_interface[] get(nitro_service client) throws Exception
	{
		host_interface resource = new host_interface();
		resource.validate("get");
		return (host_interface[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get interface.
	 */
	public static host_interface get(nitro_service client, host_interface resource) throws Exception
	{
		resource.validate("get");
		return ((host_interface[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get interface in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify interface.
	 * </pre>
	 */
	public static host_interface update(nitro_service client, host_interface resource) throws Exception
	{
		resource.validate("modify");
		return ((host_interface[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify interface in bulk.
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

		MPSString mapped_port_validator = new MPSString();
		mapped_port_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 50);
		mapped_port_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		mapped_port_validator.validate(operationType, mapped_port, "\"mapped_port\"");
		
		MPSString port_validator = new MPSString();
		port_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 50);
		port_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		port_validator.validate(operationType, port, "\"port\"");
		
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
		
	}
}
