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


class ns_command_response extends base_response
{
	public ns_command[] ns_command;
}

class ns_command_responses extends base_response
{
	public ns_command_response[] ns_command_response_array;
}

/**
 * Configuration for NetScaler configuration template command resource
 */

public class ns_command extends base_resource
{
	private String command;
	private Integer cmd_index;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_command";
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
	 * NS Command
	 * </pre>
	 */
	public void set_command(String command)
	{
		this.command = command;
	}

	/**
	 * <pre>
	 * NS Command
	 * </pre>
	 */
	public String get_command()
	{
		return this.command;
	}


	/**
	 * <pre>
	 * Command Index
	 * </pre>
	 */
	public Integer get_cmd_index()
	{
		return this.cmd_index;
	}


	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		ns_command_response result = (ns_command_response) service.get_payload_formatter().string_to_resource(ns_command_response.class, response);
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
		return result.ns_command;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_command_responses result = (ns_command_responses) service.get_payload_formatter().string_to_resource(ns_command_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_command_response_array);
		}
		ns_command[] result_ns_command = new ns_command[result.ns_command_response_array.length];
		
		for(int i = 0; i < result.ns_command_response_array.length; i++)
		{
			result_ns_command[i] = result.ns_command_response_array[i].ns_command[0];
		}
		
		return result_ns_command;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt cmd_index_validator = new MPSInt();
		cmd_index_validator.validate(operationType, cmd_index, "\"cmd_index\"");
		
		MPSString command_validator = new MPSString();
		command_validator.validate(operationType, command, "\"command\"");
		
	}
}
