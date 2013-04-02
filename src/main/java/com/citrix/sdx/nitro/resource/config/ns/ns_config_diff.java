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


class ns_config_diff_response extends base_response
{
	public ns_config_diff[] ns_config_diff;
}

class ns_config_diff_responses extends base_response
{
	public ns_config_diff_response[] ns_config_diff_response_array;
}

/**
 * Configuration for NetScaler Configuration Diff resource
 */

public class ns_config_diff extends base_resource
{
	private String target_file;
	private String corrective_command;
	private String source_file;
	private String target_command;
	private String diff_response;
	private String source_command;
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_config_diff";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return ns_ip_address;
	}

	/**
	 * <pre>
	 * NS configuration target file
	 * </pre>
	 */
	public void set_target_file(String target_file)
	{
		this.target_file = target_file;
	}

	/**
	 * <pre>
	 * NS configuration target file
	 * </pre>
	 */
	public String get_target_file()
	{
		return this.target_file;
	}


	/**
	 * <pre>
	 * Corrective command
	 * </pre>
	 */
	public String get_corrective_command()
	{
		return this.corrective_command;
	}

	/**
	 * <pre>
	 * NS configuration source file
	 * </pre>
	 */
	public void set_source_file(String source_file)
	{
		this.source_file = source_file;
	}

	/**
	 * <pre>
	 * NS configuration source file
	 * </pre>
	 */
	public String get_source_file()
	{
		return this.source_file;
	}


	/**
	 * <pre>
	 * Diff command ouput present in target
	 * </pre>
	 */
	public String get_target_command()
	{
		return this.target_command;
	}


	/**
	 * <pre>
	 * Diff between source and target file
	 * </pre>
	 */
	public String get_diff_response()
	{
		return this.diff_response;
	}


	/**
	 * <pre>
	 * Diff command ouput present in source
	 * </pre>
	 */
	public String get_source_command()
	{
		return this.source_command;
	}

	/**
	 * <pre>
	 * NS IP Address
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NS IP Address
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}


	/**
	 * <pre>
	 *  Use this operation to get config diff between source and target configuration files in the tabular format.
	 * </pre>
	 */
	public static ns_config_diff diff_table(nitro_service client, ns_config_diff resource) throws Exception
	{
		return ((ns_config_diff[]) resource.perform_operation(client, "diff_table"))[0];
	}

	/**
	 * <pre>
	 *  Use this operation to get config diff between source and target configuration files in the tabular format in bulk.
	 * </pre>
	 */
	public static ns_config_diff[] diff_table(nitro_service client, ns_config_diff[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_config_diff[]) resources[0].perform_operation(client, "diff_table"));
		
		return ((ns_config_diff[]) perform_operation_bulk_request(client, resources, "diff_table"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		ns_config_diff_response result = (ns_config_diff_response) service.get_payload_formatter().string_to_resource(ns_config_diff_response.class, response);
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
		return result.ns_config_diff;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_config_diff_responses result = (ns_config_diff_responses) service.get_payload_formatter().string_to_resource(ns_config_diff_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_config_diff_response_array);
		}
		ns_config_diff[] result_ns_config_diff = new ns_config_diff[result.ns_config_diff_response_array.length];
		
		for(int i = 0; i < result.ns_config_diff_response_array.length; i++)
		{
			result_ns_config_diff[i] = result.ns_config_diff_response_array[i].ns_config_diff[0];
		}
		
		return result_ns_config_diff;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString diff_response_validator = new MPSString();
		diff_response_validator.validate(operationType, diff_response, "\"diff_response\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
		MPSString source_file_validator = new MPSString();
		source_file_validator.validate(operationType, source_file, "\"source_file\"");
		
		MPSString target_file_validator = new MPSString();
		target_file_validator.validate(operationType, target_file, "\"target_file\"");
		
		MPSString source_command_validator = new MPSString();
		source_command_validator.validate(operationType, source_command, "\"source_command\"");
		
		MPSString target_command_validator = new MPSString();
		target_command_validator.validate(operationType, target_command, "\"target_command\"");
		
	}
}
