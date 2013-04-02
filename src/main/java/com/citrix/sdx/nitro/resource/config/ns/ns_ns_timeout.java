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


class ns_ns_timeout_response extends base_response
{
	public ns_ns_timeout[] ns_ns_timeout;
}

class ns_ns_timeout_responses extends base_response
{
	public ns_ns_timeout_response[] ns_ns_timeout_response_array;
}

/**
 * Configuration for NS Timeout on NetScaler resource
 */

public class ns_ns_timeout extends base_resource
{
	private Integer timeout;
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_ns_timeout";
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
	 * Timeout
	 * </pre>
	 */
	public void set_timeout(Integer timeout)
	{
		this.timeout = timeout;
	}

	/**
	 * <pre>
	 * Timeout
	 * </pre>
	 */
	public Integer get_timeout()
	{
		return this.timeout;
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
	 * Use this operation to set timeout on NetScaler Instance.
	 * </pre>
	 */
	public static ns_ns_timeout set(nitro_service client, ns_ns_timeout resource) throws Exception
	{
		return ((ns_ns_timeout[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to set timeout on NetScaler Instance in bulk.
	 * </pre>
	 */
	public static ns_ns_timeout[] set(nitro_service client, ns_ns_timeout[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_ns_timeout[]) resources[0].update_resource(client));
		
		return ((ns_ns_timeout[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of ns_ns_timeout resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_ns_timeout[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ns_timeout obj = new ns_ns_timeout();
		options option = new options();
		option.set_filter(filter);
		ns_ns_timeout[] response = (ns_ns_timeout[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_ns_timeout resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_ns_timeout[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ns_timeout obj = new ns_ns_timeout();
		options option = new options();
		option.set_filter(filter);
		ns_ns_timeout[] response = (ns_ns_timeout[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_ns_timeout resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_ns_timeout obj = new ns_ns_timeout();
		options option = new options();
		option.set_count(true);
		ns_ns_timeout[] response = (ns_ns_timeout[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ns_timeout resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ns_timeout obj = new ns_ns_timeout();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ns_timeout[] response = (ns_ns_timeout[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ns_timeout resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ns_timeout obj = new ns_ns_timeout();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ns_timeout[] response = (ns_ns_timeout[])obj.get_resources(service, option);
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
		ns_ns_timeout_response result = (ns_ns_timeout_response) service.get_payload_formatter().string_to_resource(ns_ns_timeout_response.class, response);
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
		return result.ns_ns_timeout;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_ns_timeout_responses result = (ns_ns_timeout_responses) service.get_payload_formatter().string_to_resource(ns_ns_timeout_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_ns_timeout_response_array);
		}
		ns_ns_timeout[] result_ns_ns_timeout = new ns_ns_timeout[result.ns_ns_timeout_response_array.length];
		
		for(int i = 0; i < result.ns_ns_timeout_response_array.length; i++)
		{
			result_ns_ns_timeout[i] = result.ns_ns_timeout_response_array[i].ns_ns_timeout[0];
		}
		
		return result_ns_ns_timeout;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt timeout_validator = new MPSInt();
		timeout_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		timeout_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 18000);
		timeout_validator.validate(operationType, timeout, "\"timeout\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
	}
}
