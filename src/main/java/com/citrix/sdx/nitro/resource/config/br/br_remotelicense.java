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

package com.citrix.sdx.nitro.resource.config.br;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class br_remotelicense_response extends base_response
{
	public br_remotelicense[] br_remotelicense;
}

class br_remotelicense_responses extends base_response
{
	public br_remotelicense_response[] br_remotelicense_response_array;
}

/**
 * Configuration for Remote License Server on Repeater Instance resource
 */

public class br_remotelicense extends base_resource
{
	private String model;
	private String[] br_ip_address_arr;
	private Integer port;
	private String server_ip;
	private Long __count;

	protected String get_object_type()
	{
		return "br_remotelicense";
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
	 * License Server Model
	 * </pre>
	 */
	public void set_model(String model)
	{
		this.model = model;
	}

	/**
	 * <pre>
	 * License Server Model
	 * </pre>
	 */
	public String get_model()
	{
		return this.model;
	}

	/**
	 * <pre>
	 * List of Repeater IP Address
	 * </pre>
	 */
	public void set_br_ip_address_arr(String[] br_ip_address_arr)
	{
		this.br_ip_address_arr = br_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of Repeater IP Address
	 * </pre>
	 */
	public String[] get_br_ip_address_arr()
	{
		return this.br_ip_address_arr;
	}

	/**
	 * <pre>
	 * Remote License Server Port number
	 * </pre>
	 */
	public void set_port(Integer port)
	{
		this.port = port;
	}

	/**
	 * <pre>
	 * Remote License Server Port number
	 * </pre>
	 */
	public Integer get_port()
	{
		return this.port;
	}

	/**
	 * <pre>
	 * Remote License Server IP Address
	 * </pre>
	 */
	public void set_server_ip(String server_ip)
	{
		this.server_ip = server_ip;
	}

	/**
	 * <pre>
	 * Remote License Server IP Address
	 * </pre>
	 */
	public String get_server_ip()
	{
		return this.server_ip;
	}


	/**
	 * <pre>
	 * Use this operation to configure Remote license server on Repeater Instances.
	 * </pre>
	 */
	public static br_remotelicense configureremotelicense(nitro_service client, br_remotelicense resource) throws Exception
	{
		return ((br_remotelicense[]) resource.perform_operation(client, "configureremotelicense"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to configure Remote license server on Repeater Instances in bulk.
	 * </pre>
	 */
	public static br_remotelicense[] configureremotelicense(nitro_service client, br_remotelicense[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((br_remotelicense[]) resources[0].perform_operation(client, "configureremotelicense"));
		
		return ((br_remotelicense[]) perform_operation_bulk_request(client, resources, "configureremotelicense"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_remotelicense_response result = (br_remotelicense_response) service.get_payload_formatter().string_to_resource(br_remotelicense_response.class, response);
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
		return result.br_remotelicense;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_remotelicense_responses result = (br_remotelicense_responses) service.get_payload_formatter().string_to_resource(br_remotelicense_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_remotelicense_response_array);
		}
		br_remotelicense[] result_br_remotelicense = new br_remotelicense[result.br_remotelicense_response_array.length];
		
		for(int i = 0; i < result.br_remotelicense_response_array.length; i++)
		{
			result_br_remotelicense[i] = result.br_remotelicense_response_array[i].br_remotelicense[0];
		}
		
		return result_br_remotelicense;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress server_ip_validator = new MPSIPAddress();
		server_ip_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		server_ip_validator.validate(operationType, server_ip, "\"server_ip\"");
		
		MPSInt port_validator = new MPSInt();
		port_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		port_validator.validate(operationType, port, "\"port\"");
		
		MPSString model_validator = new MPSString();
		model_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		model_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		model_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		model_validator.validate(operationType, model, "\"model\"");
		
		MPSIPAddress br_ip_address_arr_validator = new MPSIPAddress();
		br_ip_address_arr_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		if(br_ip_address_arr != null)
		{
			for(int i=0; i<br_ip_address_arr.length; i++)
			{
				br_ip_address_arr_validator.validate(operationType, br_ip_address_arr[i], "br_ip_address_arr["+i+"]");
			}
		}
		
	}
}
