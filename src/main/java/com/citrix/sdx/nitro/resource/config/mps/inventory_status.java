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


class inventory_status_response extends base_response
{
	public inventory_status[] inventory_status;
}

class inventory_status_responses extends base_response
{
	public inventory_status_response[] inventory_status_response_array;
}

/**
 * Configuration for Inventory Status resource
 */

public class inventory_status extends base_resource
{
	private Boolean is_last;
	private String act_id;
	private Integer starttime;
	private String status;
	private String type;
	private String id;
	private String activity;
	private String device_ip_address;
	private String message;
	private Long __count;

	protected String get_object_type()
	{
		return "inventory_status";
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
	 * is_last
	 * </pre>
	 */
	public Boolean get_is_last()
	{
		return this.is_last;
	}


	/**
	 * <pre>
	 * Activity Id
	 * </pre>
	 */
	public String get_act_id()
	{
		return this.act_id;
	}


	/**
	 * <pre>
	 * Start Time
	 * </pre>
	 */
	public Integer get_starttime()
	{
		return this.starttime;
	}


	/**
	 * <pre>
	 * Status
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
	}

	/**
	 * <pre>
	 * Type of device, (Xen | NS | Any VPX)
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * Type of device, (Xen | NS | Any VPX)
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the task logs
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the task logs
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Activity
	 * </pre>
	 */
	public String get_activity()
	{
		return this.activity;
	}

	/**
	 * <pre>
	 * IP Address for device(XEN | ANY GUEST VPX)
	 * </pre>
	 */
	public void set_device_ip_address(String device_ip_address)
	{
		this.device_ip_address = device_ip_address;
	}

	/**
	 * <pre>
	 * IP Address for device(XEN | ANY GUEST VPX)
	 * </pre>
	 */
	public String get_device_ip_address()
	{
		return this.device_ip_address;
	}


	/**
	 * <pre>
	 * Message
	 * </pre>
	 */
	public String get_message()
	{
		return this.message;
	}


	/**
	 * <pre>
	 * Use this operation to get inventory status.
	 * </pre>
	 */
	public static inventory_status[] get(nitro_service client) throws Exception
	{
		inventory_status resource = new inventory_status();
		resource.validate("get");
		return (inventory_status[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get inventory status.
	 */
	public static inventory_status get(nitro_service client, inventory_status resource) throws Exception
	{
		resource.validate("get");
		return ((inventory_status[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get inventory status in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of inventory_status resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static inventory_status[] get_filtered(nitro_service service, String filter) throws Exception
	{
		inventory_status obj = new inventory_status();
		options option = new options();
		option.set_filter(filter);
		inventory_status[] response = (inventory_status[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of inventory_status resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static inventory_status[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		inventory_status obj = new inventory_status();
		options option = new options();
		option.set_filter(filter);
		inventory_status[] response = (inventory_status[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the inventory_status resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		inventory_status obj = new inventory_status();
		options option = new options();
		option.set_count(true);
		inventory_status[] response = (inventory_status[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of inventory_status resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		inventory_status obj = new inventory_status();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		inventory_status[] response = (inventory_status[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of inventory_status resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		inventory_status obj = new inventory_status();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		inventory_status[] response = (inventory_status[])obj.get_resources(service, option);
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
		inventory_status_response result = (inventory_status_response) service.get_payload_formatter().string_to_resource(inventory_status_response.class, response);
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
		return result.inventory_status;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		inventory_status_responses result = (inventory_status_responses) service.get_payload_formatter().string_to_resource(inventory_status_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.inventory_status_response_array);
		}
		inventory_status[] result_inventory_status = new inventory_status[result.inventory_status_response_array.length];
		
		for(int i = 0; i < result.inventory_status_response_array.length; i++)
		{
			result_inventory_status[i] = result.inventory_status_response_array[i].inventory_status[0];
		}
		
		return result_inventory_status;
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
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
		MPSString activity_validator = new MPSString();
		activity_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		activity_validator.validate(operationType, activity, "\"activity\"");
		
		MPSString status_validator = new MPSString();
		status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSString message_validator = new MPSString();
		message_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		message_validator.validate(operationType, message, "\"message\"");
		
		MPSBoolean is_last_validator = new MPSBoolean();
		is_last_validator.validate(operationType, is_last, "\"is_last\"");
		
		MPSInt starttime_validator = new MPSInt();
		starttime_validator.validate(operationType, starttime, "\"starttime\"");
		
		MPSIPAddress device_ip_address_validator = new MPSIPAddress();
		device_ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		device_ip_address_validator.validate(operationType, device_ip_address, "\"device_ip_address\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		type_validator.validate(operationType, type, "\"type\"");
		
	}
}
