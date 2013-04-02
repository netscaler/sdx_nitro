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


class inventory_response extends base_response
{
	public inventory[] inventory;
}

class inventory_responses extends base_response
{
	public inventory_response[] inventory_response_array;
}

/**
 * Configuration for Inventory resource
 */

public class inventory extends base_resource
{
	private String device_ipaddress;
	private String inventory_status;
	private Long __count;

	protected String get_object_type()
	{
		return "inventory";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return device_ipaddress;
	}

	/**
	 * <pre>
	 * Device IP Address
	 * </pre>
	 */
	public void set_device_ipaddress(String device_ipaddress)
	{
		this.device_ipaddress = device_ipaddress;
	}

	/**
	 * <pre>
	 * Device IP Address
	 * </pre>
	 */
	public String get_device_ipaddress()
	{
		return this.device_ipaddress;
	}


	/**
	 * <pre>
	 * Status of inventory
	 * </pre>
	 */
	public String get_inventory_status()
	{
		return this.inventory_status;
	}


	/**
	 * Use this operation to start inventory of a given device. All devices if device IP Address is not specified..
	 */
	public static inventory get(nitro_service client, inventory resource) throws Exception
	{
		resource.validate("get");
		return ((inventory[]) resource.get_resources(client))[0];
	}

	/**
	* Use this API to fetch filtered set of inventory resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static inventory[] get_filtered(nitro_service service, String filter) throws Exception
	{
		inventory obj = new inventory();
		options option = new options();
		option.set_filter(filter);
		inventory[] response = (inventory[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of inventory resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static inventory[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		inventory obj = new inventory();
		options option = new options();
		option.set_filter(filter);
		inventory[] response = (inventory[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the inventory resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		inventory obj = new inventory();
		options option = new options();
		option.set_count(true);
		inventory[] response = (inventory[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of inventory resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		inventory obj = new inventory();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		inventory[] response = (inventory[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of inventory resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		inventory obj = new inventory();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		inventory[] response = (inventory[])obj.get_resources(service, option);
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
		inventory_response result = (inventory_response) service.get_payload_formatter().string_to_resource(inventory_response.class, response);
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
		return result.inventory;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		inventory_responses result = (inventory_responses) service.get_payload_formatter().string_to_resource(inventory_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.inventory_response_array);
		}
		inventory[] result_inventory = new inventory[result.inventory_response_array.length];
		
		for(int i = 0; i < result.inventory_response_array.length; i++)
		{
			result_inventory[i] = result.inventory_response_array[i].inventory[0];
		}
		
		return result_inventory;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress device_ipaddress_validator = new MPSIPAddress();
		device_ipaddress_validator.validate(operationType, device_ipaddress, "\"device_ipaddress\"");
		
		MPSString inventory_status_validator = new MPSString();
		inventory_status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 1024);
		inventory_status_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		inventory_status_validator.validate(operationType, inventory_status, "\"inventory_status\"");
		
	}
}
