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


class ns_vpnicaconnection_response extends base_response
{
	public ns_vpnicaconnection[] ns_vpnicaconnection;
}

class ns_vpnicaconnection_responses extends base_response
{
	public ns_vpnicaconnection_response[] ns_vpnicaconnection_response_array;
}

/**
 * Configuration for ns vpn ica connection on NetScaler resource
 */

public class ns_vpnicaconnection extends base_resource
{
	private String id;
	private String ns_ip_address;
	private Integer ica_license_in_use;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_vpnicaconnection";
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
	 * ica_license_in_use
	 * </pre>
	 */
	public void set_ica_license_in_use(Integer ica_license_in_use)
	{
		this.ica_license_in_use = ica_license_in_use;
	}

	/**
	 * <pre>
	 * ica_license_in_use
	 * </pre>
	 */
	public Integer get_ica_license_in_use()
	{
		return this.ica_license_in_use;
	}


	/**
	 * <pre>
	 * Get ns vpnicaconnection information from NS Instance(s).
	 * </pre>
	 */
	public static ns_vpnicaconnection[] get(nitro_service client) throws Exception
	{
		ns_vpnicaconnection resource = new ns_vpnicaconnection();
		resource.validate("get");
		return (ns_vpnicaconnection[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of ns_vpnicaconnection resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_vpnicaconnection[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_vpnicaconnection obj = new ns_vpnicaconnection();
		options option = new options();
		option.set_filter(filter);
		ns_vpnicaconnection[] response = (ns_vpnicaconnection[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_vpnicaconnection resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_vpnicaconnection[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_vpnicaconnection obj = new ns_vpnicaconnection();
		options option = new options();
		option.set_filter(filter);
		ns_vpnicaconnection[] response = (ns_vpnicaconnection[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_vpnicaconnection resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_vpnicaconnection obj = new ns_vpnicaconnection();
		options option = new options();
		option.set_count(true);
		ns_vpnicaconnection[] response = (ns_vpnicaconnection[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_vpnicaconnection resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_vpnicaconnection obj = new ns_vpnicaconnection();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_vpnicaconnection[] response = (ns_vpnicaconnection[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_vpnicaconnection resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_vpnicaconnection obj = new ns_vpnicaconnection();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_vpnicaconnection[] response = (ns_vpnicaconnection[])obj.get_resources(service, option);
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
		ns_vpnicaconnection_response result = (ns_vpnicaconnection_response) service.get_payload_formatter().string_to_resource(ns_vpnicaconnection_response.class, response);
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
		return result.ns_vpnicaconnection;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_vpnicaconnection_responses result = (ns_vpnicaconnection_responses) service.get_payload_formatter().string_to_resource(ns_vpnicaconnection_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_vpnicaconnection_response_array);
		}
		ns_vpnicaconnection[] result_ns_vpnicaconnection = new ns_vpnicaconnection[result.ns_vpnicaconnection_response_array.length];
		
		for(int i = 0; i < result.ns_vpnicaconnection_response_array.length; i++)
		{
			result_ns_vpnicaconnection[i] = result.ns_vpnicaconnection_response_array[i].ns_vpnicaconnection[0];
		}
		
		return result_ns_vpnicaconnection;
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
		
		MPSInt ica_license_in_use_validator = new MPSInt();
		ica_license_in_use_validator.validate(operationType, ica_license_in_use, "\"ica_license_in_use\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
	}
}
