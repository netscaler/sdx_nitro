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


class task_device_log_response extends base_response
{
	public task_device_log[] task_device_log;
}

class task_device_log_responses extends base_response
{
	public task_device_log_response[] task_device_log_response_array;
}

/**
 * Configuration for Task Device Log resource
 */

public class task_device_log extends base_resource
{
	private String status;
	private Integer starttime;
	private Integer endtime;
	private String ip_address;
	private String id;
	private String task_id;
	private Long __count;

	protected String get_object_type()
	{
		return "task_device_log";
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
	 * Status
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
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
	 * End Time
	 * </pre>
	 */
	public Integer get_endtime()
	{
		return this.endtime;
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
	 * Id is system generated key for all the task device logs
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the task device logs
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Task ID
	 * </pre>
	 */
	public String get_task_id()
	{
		return this.task_id;
	}


	/**
	 * <pre>
	 * Use this operation to get task log for each device.
	 * </pre>
	 */
	public static task_device_log[] get(nitro_service client) throws Exception
	{
		task_device_log resource = new task_device_log();
		resource.validate("get");
		return (task_device_log[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get task log for each device.
	 */
	public static task_device_log get(nitro_service client, task_device_log resource) throws Exception
	{
		resource.validate("get");
		return ((task_device_log[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get task log for each device in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of task_device_log resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static task_device_log[] get_filtered(nitro_service service, String filter) throws Exception
	{
		task_device_log obj = new task_device_log();
		options option = new options();
		option.set_filter(filter);
		task_device_log[] response = (task_device_log[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of task_device_log resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static task_device_log[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		task_device_log obj = new task_device_log();
		options option = new options();
		option.set_filter(filter);
		task_device_log[] response = (task_device_log[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the task_device_log resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		task_device_log obj = new task_device_log();
		options option = new options();
		option.set_count(true);
		task_device_log[] response = (task_device_log[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of task_device_log resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		task_device_log obj = new task_device_log();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		task_device_log[] response = (task_device_log[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of task_device_log resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		task_device_log obj = new task_device_log();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		task_device_log[] response = (task_device_log[])obj.get_resources(service, option);
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
		task_device_log_response result = (task_device_log_response) service.get_payload_formatter().string_to_resource(task_device_log_response.class, response);
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
		return result.task_device_log;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		task_device_log_responses result = (task_device_log_responses) service.get_payload_formatter().string_to_resource(task_device_log_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.task_device_log_response_array);
		}
		task_device_log[] result_task_device_log = new task_device_log[result.task_device_log_response_array.length];
		
		for(int i = 0; i < result.task_device_log_response_array.length; i++)
		{
			result_task_device_log[i] = result.task_device_log_response_array[i].task_device_log[0];
		}
		
		return result_task_device_log;
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
		id_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		id_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSString task_id_validator = new MPSString();
		task_id_validator.validate(operationType, task_id, "\"task_id\"");
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSInt starttime_validator = new MPSInt();
		starttime_validator.validate(operationType, starttime, "\"starttime\"");
		
		MPSInt endtime_validator = new MPSInt();
		endtime_validator.validate(operationType, endtime, "\"endtime\"");
		
		MPSString status_validator = new MPSString();
		status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		status_validator.validate(operationType, status, "\"status\"");
		
	}
}
