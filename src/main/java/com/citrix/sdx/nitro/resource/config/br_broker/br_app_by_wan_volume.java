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

package com.citrix.sdx.nitro.resource.config.br_broker;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class br_app_by_wan_volume_response extends base_response
{
	public br_app_by_wan_volume[] br_app_by_wan_volume;
}

class br_app_by_wan_volume_responses extends base_response
{
	public br_app_by_wan_volume_response[] br_app_by_wan_volume_response_array;
}

/**
 * Configuration for Top Apps by wan volume resource
 */

public class br_app_by_wan_volume extends base_resource
{
	private String app_name;
	private Double total_wan_volume;
	private String ip_address;
	private String id;
	private Double total_received_wan_volume;
	private Double total_sent_wan_volume;
	private Long __count;

	protected String get_object_type()
	{
		return "br_app_by_wan_volume";
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
	 * app name
	 * </pre>
	 */
	public String get_app_name()
	{
		return this.app_name;
	}


	/**
	 * <pre>
	 * Total WAN volume for an app in Mbps
	 * </pre>
	 */
	public Double get_total_wan_volume()
	{
		return this.total_wan_volume;
	}

	/**
	 * <pre>
	 * IP Address
	 * </pre>
	 */
	public void set_ip_address(String ip_address)
	{
		this.ip_address = ip_address;
	}

	/**
	 * <pre>
	 * IP Address
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}

	/**
	 * <pre>
	 * Id is system generated key for all apps.
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all apps.
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Total Received WAN Volume for an app in Mbps
	 * </pre>
	 */
	public Double get_total_received_wan_volume()
	{
		return this.total_received_wan_volume;
	}


	/**
	 * <pre>
	 * Total Sent WAN Volume for an app in Mbps
	 * </pre>
	 */
	public Double get_total_sent_wan_volume()
	{
		return this.total_sent_wan_volume;
	}


	/**
	 * <pre>
	 * Use this operation to get top apps by WAN volume.
	 * </pre>
	 */
	public static br_app_by_wan_volume[] get(nitro_service client) throws Exception
	{
		br_app_by_wan_volume resource = new br_app_by_wan_volume();
		resource.validate("get");
		return (br_app_by_wan_volume[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of br_app_by_wan_volume resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static br_app_by_wan_volume[] get_filtered(nitro_service service, String filter) throws Exception
	{
		br_app_by_wan_volume obj = new br_app_by_wan_volume();
		options option = new options();
		option.set_filter(filter);
		br_app_by_wan_volume[] response = (br_app_by_wan_volume[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of br_app_by_wan_volume resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static br_app_by_wan_volume[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br_app_by_wan_volume obj = new br_app_by_wan_volume();
		options option = new options();
		option.set_filter(filter);
		br_app_by_wan_volume[] response = (br_app_by_wan_volume[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the br_app_by_wan_volume resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		br_app_by_wan_volume obj = new br_app_by_wan_volume();
		options option = new options();
		option.set_count(true);
		br_app_by_wan_volume[] response = (br_app_by_wan_volume[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br_app_by_wan_volume resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		br_app_by_wan_volume obj = new br_app_by_wan_volume();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br_app_by_wan_volume[] response = (br_app_by_wan_volume[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br_app_by_wan_volume resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br_app_by_wan_volume obj = new br_app_by_wan_volume();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br_app_by_wan_volume[] response = (br_app_by_wan_volume[])obj.get_resources(service, option);
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
		br_app_by_wan_volume_response result = (br_app_by_wan_volume_response) service.get_payload_formatter().string_to_resource(br_app_by_wan_volume_response.class, response);
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
		return result.br_app_by_wan_volume;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_app_by_wan_volume_responses result = (br_app_by_wan_volume_responses) service.get_payload_formatter().string_to_resource(br_app_by_wan_volume_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_app_by_wan_volume_response_array);
		}
		br_app_by_wan_volume[] result_br_app_by_wan_volume = new br_app_by_wan_volume[result.br_app_by_wan_volume_response_array.length];
		
		for(int i = 0; i < result.br_app_by_wan_volume_response_array.length; i++)
		{
			result_br_app_by_wan_volume[i] = result.br_app_by_wan_volume_response_array[i].br_app_by_wan_volume[0];
		}
		
		return result_br_app_by_wan_volume;
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
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSString app_name_validator = new MPSString();
		app_name_validator.validate(operationType, app_name, "\"app_name\"");
		
		MPSDouble total_wan_volume_validator = new MPSDouble();
		total_wan_volume_validator.validate(operationType, total_wan_volume, "\"total_wan_volume\"");
		
		MPSDouble total_sent_wan_volume_validator = new MPSDouble();
		total_sent_wan_volume_validator.validate(operationType, total_sent_wan_volume, "\"total_sent_wan_volume\"");
		
		MPSDouble total_received_wan_volume_validator = new MPSDouble();
		total_received_wan_volume_validator.validate(operationType, total_received_wan_volume, "\"total_received_wan_volume\"");
		
	}
}
