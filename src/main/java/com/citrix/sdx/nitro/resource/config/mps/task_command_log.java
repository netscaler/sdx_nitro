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


class task_command_log_response extends base_response
{
	public task_command_log[] task_command_log;
}

class task_command_log_responses extends base_response
{
	public task_command_log_response[] task_command_log_response_array;
}

/**
 * Configuration for Task Command Log resource
 */

public class task_command_log extends base_resource
{
	private String protocol;
	private String status;
	private Integer starttime;
	private String id;
	private String task_device_id;
	private Integer endtime;
	private String statusmessage;
	private String command;
	private Long __count;

	protected String get_object_type()
	{
		return "task_command_log";
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
	 * Protocol
	 * </pre>
	 */
	public String get_protocol()
	{
		return this.protocol;
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
	 * Id is system generated key for all the task command logs
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the task command logs
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Task Device ID
	 * </pre>
	 */
	public String get_task_device_id()
	{
		return this.task_device_id;
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
	 * Status Message
	 * </pre>
	 */
	public String get_statusmessage()
	{
		return this.statusmessage;
	}


	/**
	 * <pre>
	 * Command
	 * </pre>
	 */
	public String get_command()
	{
		return this.command;
	}


	/**
	 * <pre>
	 * Use this operation to get task log for each command.
	 * </pre>
	 */
	public static task_command_log[] get(nitro_service client) throws Exception
	{
		task_command_log resource = new task_command_log();
		resource.validate("get");
		return (task_command_log[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get task log for each command.
	 */
	public static task_command_log get(nitro_service client, task_command_log resource) throws Exception
	{
		resource.validate("get");
		return ((task_command_log[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get task log for each command in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of task_command_log resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static task_command_log[] get_filtered(nitro_service service, String filter) throws Exception
	{
		task_command_log obj = new task_command_log();
		options option = new options();
		option.set_filter(filter);
		task_command_log[] response = (task_command_log[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of task_command_log resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static task_command_log[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		task_command_log obj = new task_command_log();
		options option = new options();
		option.set_filter(filter);
		task_command_log[] response = (task_command_log[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the task_command_log resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		task_command_log obj = new task_command_log();
		options option = new options();
		option.set_count(true);
		task_command_log[] response = (task_command_log[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of task_command_log resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		task_command_log obj = new task_command_log();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		task_command_log[] response = (task_command_log[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of task_command_log resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		task_command_log obj = new task_command_log();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		task_command_log[] response = (task_command_log[])obj.get_resources(service, option);
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
		task_command_log_response result = (task_command_log_response) service.get_payload_formatter().string_to_resource(task_command_log_response.class, response);
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
		return result.task_command_log;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		task_command_log_responses result = (task_command_log_responses) service.get_payload_formatter().string_to_resource(task_command_log_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.task_command_log_response_array);
		}
		task_command_log[] result_task_command_log = new task_command_log[result.task_command_log_response_array.length];
		
		for(int i = 0; i < result.task_command_log_response_array.length; i++)
		{
			result_task_command_log[i] = result.task_command_log_response_array[i].task_command_log[0];
		}
		
		return result_task_command_log;
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
		
		MPSString task_device_id_validator = new MPSString();
		task_device_id_validator.validate(operationType, task_device_id, "\"task_device_id\"");
		
		MPSString command_validator = new MPSString();
		command_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 1024);
		command_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		command_validator.validate(operationType, command, "\"command\"");
		
		MPSString protocol_validator = new MPSString();
		protocol_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		protocol_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		protocol_validator.validate(operationType, protocol, "\"protocol\"");
		
		MPSInt starttime_validator = new MPSInt();
		starttime_validator.validate(operationType, starttime, "\"starttime\"");
		
		MPSInt endtime_validator = new MPSInt();
		endtime_validator.validate(operationType, endtime, "\"endtime\"");
		
		MPSString status_validator = new MPSString();
		status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSString statusmessage_validator = new MPSString();
		statusmessage_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 4096);
		statusmessage_validator.validate(operationType, statusmessage, "\"statusmessage\"");
		
	}
}
