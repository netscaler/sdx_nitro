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

class xen_health_ftw_response extends base_response
{
	public xen_health_ftw[] xen_health_ftw;
}

class xen_health_ftw_responses extends base_response
{
	public xen_health_ftw_response[] xen_health_ftw_response_array;
}

/**
 * Configuration for FTW Health resource
 */

public class xen_health_ftw extends base_resource
{
	private String pair_port;
	private String mode;
	private String host_ip_address;
	private String mapped_port;
	private String port;
	private String state;
	private Long __count;

	protected String get_object_type()
	{
		return "xen_health_ftw";
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
	 * Pair Name
	 * </pre>
	 */
	public void set_pair_port(String pair_port)
	{
		this.pair_port = pair_port;
	}

	/**
	 * <pre>
	 * Pair Name
	 * </pre>
	 */
	public String get_pair_port()
	{
		return this.pair_port;
	}

	/**
	 * <pre>
	 * Mode
	 * </pre>
	 */
	public void set_mode(String mode)
	{
		this.mode = mode;
	}

	/**
	 * <pre>
	 * Mode
	 * </pre>
	 */
	public String get_mode()
	{
		return this.mode;
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
	 * State of the Interface - UP/DOWN
	 * </pre>
	 */
	public String get_state()
	{
		return this.state;
	}


	/**
	 * <pre>
	 * Use this operation to get FTW Status.
	 * </pre>
	 */
	public static xen_health_ftw[] get(nitro_service client) throws Exception
	{
		xen_health_ftw resource = new xen_health_ftw();
		resource.validate("get");
		return (xen_health_ftw[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of xen_health_ftw resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen_health_ftw[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_ftw obj = new xen_health_ftw();
		options option = new options();
		option.set_filter(filter);
		xen_health_ftw[] response = (xen_health_ftw[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen_health_ftw resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen_health_ftw[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_ftw obj = new xen_health_ftw();
		options option = new options();
		option.set_filter(filter);
		xen_health_ftw[] response = (xen_health_ftw[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen_health_ftw resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen_health_ftw obj = new xen_health_ftw();
		options option = new options();
		option.set_count(true);
		xen_health_ftw[] response = (xen_health_ftw[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_ftw resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_ftw obj = new xen_health_ftw();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_ftw[] response = (xen_health_ftw[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_ftw resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_ftw obj = new xen_health_ftw();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_ftw[] response = (xen_health_ftw[])obj.get_resources(service, option);
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
		xen_health_ftw_response result = (xen_health_ftw_response) service.get_payload_formatter().string_to_resource(xen_health_ftw_response.class, response);
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
		return result.xen_health_ftw;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_health_ftw_responses result = (xen_health_ftw_responses) service.get_payload_formatter().string_to_resource(xen_health_ftw_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_health_ftw_response_array);
		}
		xen_health_ftw[] result_xen_health_ftw = new xen_health_ftw[result.xen_health_ftw_response_array.length];
		
		for(int i = 0; i < result.xen_health_ftw_response_array.length; i++)
		{
			result_xen_health_ftw[i] = result.xen_health_ftw_response_array[i].xen_health_ftw[0];
		}
		
		return result_xen_health_ftw;
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
		
		MPSString pair_port_validator = new MPSString();
		pair_port_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		pair_port_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		pair_port_validator.validate(operationType, pair_port, "\"pair_port\"");
		
		MPSString mode_validator = new MPSString();
		mode_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		mode_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		mode_validator.validate(operationType, mode, "\"mode\"");
		
	}
}
