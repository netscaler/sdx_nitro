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

class xen_health_sr_response extends base_response
{
	public xen_health_sr[] xen_health_sr;
}

class xen_health_sr_responses extends base_response
{
	public xen_health_sr_response[] xen_health_sr_response_array;
}

/**
 * Configuration for Storage Repository resource
 */

public class xen_health_sr extends base_resource
{
	private String status;
	private String bay_number;
	private String host_ip_address;
	private String name;
	private Double utilized;
	private Double size;
	private Long __count;

	protected String get_object_type()
	{
		return "xen_health_sr";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return bay_number;
	}

	/**
	 * <pre>
	 * Status of the storage repository - OK/ERROR
	 * </pre>
	 */
	public void set_status(String status)
	{
		this.status = status;
	}

	/**
	 * <pre>
	 * Status of the storage repository - OK/ERROR
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
	}

	/**
	 * <pre>
	 * Bay number
	 * </pre>
	 */
	public void set_bay_number(String bay_number)
	{
		this.bay_number = bay_number;
	}

	/**
	 * <pre>
	 * Bay number
	 * </pre>
	 */
	public String get_bay_number()
	{
		return this.bay_number;
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
	 * Name of the storage repository
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Name of the storage repository
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Physical utilization of the storage repository
	 * </pre>
	 */
	public void set_utilized(Double utilized)
	{
		this.utilized = utilized;
	}

	/**
	 * <pre>
	 * Physical utilization of the storage repository
	 * </pre>
	 */
	public Double get_utilized()
	{
		return this.utilized;
	}

	/**
	 * <pre>
	 * Physical size of the storage repository
	 * </pre>
	 */
	public void set_size(Double size)
	{
		this.size = size;
	}

	/**
	 * <pre>
	 * Physical size of the storage repository
	 * </pre>
	 */
	public Double get_size()
	{
		return this.size;
	}


	/**
	 * <pre>
	 * Use this operation to get details of the storage repositories.
	 * </pre>
	 */
	public static xen_health_sr[] get(nitro_service client) throws Exception
	{
		xen_health_sr resource = new xen_health_sr();
		resource.validate("get");
		return (xen_health_sr[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get details of the storage repositories.
	 */
	public static xen_health_sr get(nitro_service client, xen_health_sr resource) throws Exception
	{
		resource.validate("get");
		return ((xen_health_sr[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get details of the storage repositories in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of xen_health_sr resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen_health_sr[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_sr obj = new xen_health_sr();
		options option = new options();
		option.set_filter(filter);
		xen_health_sr[] response = (xen_health_sr[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen_health_sr resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen_health_sr[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_sr obj = new xen_health_sr();
		options option = new options();
		option.set_filter(filter);
		xen_health_sr[] response = (xen_health_sr[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen_health_sr resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen_health_sr obj = new xen_health_sr();
		options option = new options();
		option.set_count(true);
		xen_health_sr[] response = (xen_health_sr[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_sr resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_sr obj = new xen_health_sr();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_sr[] response = (xen_health_sr[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_sr resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_sr obj = new xen_health_sr();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_sr[] response = (xen_health_sr[])obj.get_resources(service, option);
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
		xen_health_sr_response result = (xen_health_sr_response) service.get_payload_formatter().string_to_resource(xen_health_sr_response.class, response);
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
		return result.xen_health_sr;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_health_sr_responses result = (xen_health_sr_responses) service.get_payload_formatter().string_to_resource(xen_health_sr_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_health_sr_response_array);
		}
		xen_health_sr[] result_xen_health_sr = new xen_health_sr[result.xen_health_sr_response_array.length];
		
		for(int i = 0; i < result.xen_health_sr_response_array.length; i++)
		{
			result_xen_health_sr[i] = result.xen_health_sr_response_array[i].xen_health_sr[0];
		}
		
		return result_xen_health_sr;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString bay_number_validator = new MPSString();
		bay_number_validator.validate(operationType, bay_number, "\"bay_number\"");
		
		MPSString name_validator = new MPSString();
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSDoubleLong utilized_validator = new MPSDoubleLong();
		utilized_validator.validate(operationType, utilized, "\"utilized\"");
		
		MPSDoubleLong size_validator = new MPSDoubleLong();
		size_validator.validate(operationType, size, "\"size\"");
		
		MPSString status_validator = new MPSString();
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSIPAddress host_ip_address_validator = new MPSIPAddress();
		host_ip_address_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		host_ip_address_validator.validate(operationType, host_ip_address, "\"host_ip_address\"");
		
	}
}
