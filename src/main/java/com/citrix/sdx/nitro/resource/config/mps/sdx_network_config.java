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


class sdx_network_config_response extends base_response
{
	public sdx_network_config[] sdx_network_config;
}

class sdx_network_config_responses extends base_response
{
	public sdx_network_config_response[] sdx_network_config_response_array;
}

/**
 * Configuration for SDX Network Configuration resource
 */

public class sdx_network_config extends base_resource
{
	private String svm_ip_address;
	private String dns;
	private String gateway;
	private String xen_ip_address;
	private String network_interface;
	private String netmask;
	private Long __count;

	protected String get_object_type()
	{
		return "sdx_network_config";
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
	 * SVM IP Address
	 * </pre>
	 */
	public void set_svm_ip_address(String svm_ip_address)
	{
		this.svm_ip_address = svm_ip_address;
	}

	/**
	 * <pre>
	 * SVM IP Address
	 * </pre>
	 */
	public String get_svm_ip_address()
	{
		return this.svm_ip_address;
	}

	/**
	 * <pre>
	 * DNS Server
	 * </pre>
	 */
	public void set_dns(String dns)
	{
		this.dns = dns;
	}

	/**
	 * <pre>
	 * DNS Server
	 * </pre>
	 */
	public String get_dns()
	{
		return this.dns;
	}

	/**
	 * <pre>
	 * Gateway 
	 * </pre>
	 */
	public void set_gateway(String gateway)
	{
		this.gateway = gateway;
	}

	/**
	 * <pre>
	 * Gateway 
	 * </pre>
	 */
	public String get_gateway()
	{
		return this.gateway;
	}

	/**
	 * <pre>
	 * XenServer IP Address
	 * </pre>
	 */
	public void set_xen_ip_address(String xen_ip_address)
	{
		this.xen_ip_address = xen_ip_address;
	}

	/**
	 * <pre>
	 * XenServer IP Address
	 * </pre>
	 */
	public String get_xen_ip_address()
	{
		return this.xen_ip_address;
	}

	/**
	 * <pre>
	 * Interface on which management needs to be enabled
	 * </pre>
	 */
	public void set_network_interface(String network_interface)
	{
		this.network_interface = network_interface;
	}

	/**
	 * <pre>
	 * Interface on which management needs to be enabled
	 * </pre>
	 */
	public String get_network_interface()
	{
		return this.network_interface;
	}

	/**
	 * <pre>
	 * Netmask
	 * </pre>
	 */
	public void set_netmask(String netmask)
	{
		this.netmask = netmask;
	}

	/**
	 * <pre>
	 * Netmask
	 * </pre>
	 */
	public String get_netmask()
	{
		return this.netmask;
	}


	/**
	 * Use this operation to get SDX network configuration.
	 */
	public static sdx_network_config get(nitro_service client) throws Exception
	{
		sdx_network_config resource = new sdx_network_config();
		resource.validate("get");
		return ((sdx_network_config[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify SDX network configuration.
	 * </pre>
	 */
	public static sdx_network_config update(nitro_service client, sdx_network_config resource) throws Exception
	{
		resource.validate("modify");
		return ((sdx_network_config[]) resource.update_resource(client))[0];
	}

	/**
	* Use this API to fetch filtered set of sdx_network_config resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static sdx_network_config[] get_filtered(nitro_service service, String filter) throws Exception
	{
		sdx_network_config obj = new sdx_network_config();
		options option = new options();
		option.set_filter(filter);
		sdx_network_config[] response = (sdx_network_config[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sdx_network_config resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sdx_network_config[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sdx_network_config obj = new sdx_network_config();
		options option = new options();
		option.set_filter(filter);
		sdx_network_config[] response = (sdx_network_config[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sdx_network_config resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		sdx_network_config obj = new sdx_network_config();
		options option = new options();
		option.set_count(true);
		sdx_network_config[] response = (sdx_network_config[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sdx_network_config resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		sdx_network_config obj = new sdx_network_config();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sdx_network_config[] response = (sdx_network_config[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sdx_network_config resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sdx_network_config obj = new sdx_network_config();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sdx_network_config[] response = (sdx_network_config[])obj.get_resources(service, option);
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
		sdx_network_config_response result = (sdx_network_config_response) service.get_payload_formatter().string_to_resource(sdx_network_config_response.class, response);
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
		return result.sdx_network_config;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		sdx_network_config_responses result = (sdx_network_config_responses) service.get_payload_formatter().string_to_resource(sdx_network_config_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.sdx_network_config_response_array);
		}
		sdx_network_config[] result_sdx_network_config = new sdx_network_config[result.sdx_network_config_response_array.length];
		
		for(int i = 0; i < result.sdx_network_config_response_array.length; i++)
		{
			result_sdx_network_config[i] = result.sdx_network_config_response_array[i].sdx_network_config[0];
		}
		
		return result_sdx_network_config;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress xen_ip_address_validator = new MPSIPAddress();
		xen_ip_address_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		xen_ip_address_validator.validate(operationType, xen_ip_address, "\"xen_ip_address\"");
		
		MPSIPAddress netmask_validator = new MPSIPAddress();
		netmask_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		netmask_validator.validate(operationType, netmask, "\"netmask\"");
		
		MPSIPAddress gateway_validator = new MPSIPAddress();
		gateway_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		gateway_validator.validate(operationType, gateway, "\"gateway\"");
		
		MPSIPAddress svm_ip_address_validator = new MPSIPAddress();
		svm_ip_address_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		svm_ip_address_validator.validate(operationType, svm_ip_address, "\"svm_ip_address\"");
		
		MPSIPAddress dns_validator = new MPSIPAddress();
		dns_validator.validate(operationType, dns, "\"dns\"");
		
		MPSString network_interface_validator = new MPSString();
		network_interface_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 15);
		network_interface_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		network_interface_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		network_interface_validator.validate(operationType, network_interface, "\"network_interface\"");
		
	}
}
