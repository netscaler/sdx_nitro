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


class ns_conf_response extends base_response
{
	public ns_conf[] ns_conf;
}

class ns_conf_responses extends base_response
{
	public ns_conf_response[] ns_conf_response_array;
}

/**
 * Configuration for ns.conf file on NetScaler resource
 */

public class ns_conf extends base_resource
{
	private Integer last_updated_time;
	private String device_name;
	private String diff_status;
	private String id;
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_conf";
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
	 * Last Updated Time
	 * </pre>
	 */
	public void set_last_updated_time(Integer last_updated_time)
	{
		this.last_updated_time = last_updated_time;
	}

	/**
	 * <pre>
	 * Last Updated Time
	 * </pre>
	 */
	public Integer get_last_updated_time()
	{
		return this.last_updated_time;
	}


	/**
	 * <pre>
	 * Name of the device
	 * </pre>
	 */
	public String get_device_name()
	{
		return this.device_name;
	}

	/**
	 * <pre>
	 * Tells whether a diff exists between running and saved configuration on NS
	 * </pre>
	 */
	public void set_diff_status(String diff_status)
	{
		this.diff_status = diff_status;
	}

	/**
	 * <pre>
	 * Tells whether a diff exists between running and saved configuration on NS
	 * </pre>
	 */
	public String get_diff_status()
	{
		return this.diff_status;
	}

	/**
	 * <pre>
	 * Id is system generated key for all ns.conf files
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all ns.conf files
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * List of NetScaler IP Address
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * List of NetScaler IP Address
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}


	/**
	 * <pre>
	 * Get ns.conf information from NS Instance(s).
	 * </pre>
	 */
	public static ns_conf[] get(nitro_service client) throws Exception
	{
		ns_conf resource = new ns_conf();
		resource.validate("get");
		return (ns_conf[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of ns_conf resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_conf[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_conf obj = new ns_conf();
		options option = new options();
		option.set_filter(filter);
		ns_conf[] response = (ns_conf[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_conf resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_conf[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_conf obj = new ns_conf();
		options option = new options();
		option.set_filter(filter);
		ns_conf[] response = (ns_conf[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_conf resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_conf obj = new ns_conf();
		options option = new options();
		option.set_count(true);
		ns_conf[] response = (ns_conf[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_conf resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_conf obj = new ns_conf();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_conf[] response = (ns_conf[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_conf resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_conf obj = new ns_conf();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_conf[] response = (ns_conf[])obj.get_resources(service, option);
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
		ns_conf_response result = (ns_conf_response) service.get_payload_formatter().string_to_resource(ns_conf_response.class, response);
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
		return result.ns_conf;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_conf_responses result = (ns_conf_responses) service.get_payload_formatter().string_to_resource(ns_conf_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_conf_response_array);
		}
		ns_conf[] result_ns_conf = new ns_conf[result.ns_conf_response_array.length];
		
		for(int i = 0; i < result.ns_conf_response_array.length; i++)
		{
			result_ns_conf[i] = result.ns_conf_response_array[i].ns_conf[0];
		}
		
		return result_ns_conf;
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
		
		MPSInt last_updated_time_validator = new MPSInt();
		last_updated_time_validator.validate(operationType, last_updated_time, "\"last_updated_time\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
		MPSString diff_status_validator = new MPSString();
		diff_status_validator.validate(operationType, diff_status, "\"diff_status\"");
		
		MPSString device_name_validator = new MPSString();
		device_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		device_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		device_name_validator.validate(operationType, device_name, "\"device_name\"");
		
	}
}
