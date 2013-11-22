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


class ns_aaasession_response extends base_response
{
	public ns_aaasession[] ns_aaasession;
}

class ns_aaasession_responses extends base_response
{
	public ns_aaasession_response[] ns_aaasession_response_array;
}

/**
 * Configuration for ns aaasession on NetScaler resource
 */

public class ns_aaasession extends base_resource
{
	private Integer vpn_license_in_use;
	private String id;
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_aaasession";
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
	 * vpn_license_in_use
	 * </pre>
	 */
	public void set_vpn_license_in_use(Integer vpn_license_in_use)
	{
		this.vpn_license_in_use = vpn_license_in_use;
	}

	/**
	 * <pre>
	 * vpn_license_in_use
	 * </pre>
	 */
	public Integer get_vpn_license_in_use()
	{
		return this.vpn_license_in_use;
	}

	/**
	 * <pre>
	 * Id is NetScaler IP
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is NetScaler IP
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * NetScaler IP Address
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NetScaler IP Address
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}


	/**
	 * <pre>
	 * Get ns aaasession information from NS Instance.
	 * </pre>
	 */
	public static ns_aaasession[] get(nitro_service client) throws Exception
	{
		ns_aaasession resource = new ns_aaasession();
		resource.validate("get");
		return (ns_aaasession[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of ns_aaasession resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_aaasession[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_aaasession obj = new ns_aaasession();
		options option = new options();
		option.set_filter(filter);
		ns_aaasession[] response = (ns_aaasession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_aaasession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_aaasession[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_aaasession obj = new ns_aaasession();
		options option = new options();
		option.set_filter(filter);
		ns_aaasession[] response = (ns_aaasession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_aaasession resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_aaasession obj = new ns_aaasession();
		options option = new options();
		option.set_count(true);
		ns_aaasession[] response = (ns_aaasession[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_aaasession resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_aaasession obj = new ns_aaasession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_aaasession[] response = (ns_aaasession[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_aaasession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_aaasession obj = new ns_aaasession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_aaasession[] response = (ns_aaasession[])obj.get_resources(service, option);
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
		ns_aaasession_response result = (ns_aaasession_response) service.get_payload_formatter().string_to_resource(ns_aaasession_response.class, response);
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
		return result.ns_aaasession;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_aaasession_responses result = (ns_aaasession_responses) service.get_payload_formatter().string_to_resource(ns_aaasession_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_aaasession_response_array);
		}
		ns_aaasession[] result_ns_aaasession = new ns_aaasession[result.ns_aaasession_response_array.length];
		
		for(int i = 0; i < result.ns_aaasession_response_array.length; i++)
		{
			result_ns_aaasession[i] = result.ns_aaasession_response_array[i].ns_aaasession[0];
		}
		
		return result_ns_aaasession;
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
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSInt vpn_license_in_use_validator = new MPSInt();
		vpn_license_in_use_validator.validate(operationType, vpn_license_in_use, "\"vpn_license_in_use\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
	}
}
