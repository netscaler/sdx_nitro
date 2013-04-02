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

class br_configurebandwidth6x_response extends base_response
{
	public br_configurebandwidth6x[] br_configurebandwidth6x;
}

class br_configurebandwidth6x_responses extends base_response
{
	public br_configurebandwidth6x_response[] br_configurebandwidth6x_response_array;
}

/**
 * Configuration for Configure Bandwidth for Repeater devices of version 6x or later resource
 */

public class br_configurebandwidth6x extends base_resource
{
	private Integer receive_limit;
	private String boostmode;
	private String[] br_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "br_configurebandwidth6x";
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
	 * Receive Limit
	 * </pre>
	 */
	public void set_receive_limit(Integer receive_limit)
	{
		this.receive_limit = receive_limit;
	}

	/**
	 * <pre>
	 * Receive Limit
	 * </pre>
	 */
	public Integer get_receive_limit()
	{
		return this.receive_limit;
	}

	/**
	 * <pre>
	 * Boost Mode
	 * </pre>
	 */
	public void set_boostmode(String boostmode)
	{
		this.boostmode = boostmode;
	}

	/**
	 * <pre>
	 * Boost Mode
	 * </pre>
	 */
	public String get_boostmode()
	{
		return this.boostmode;
	}

	/**
	 * <pre>
	 * List of BR IP Address
	 * </pre>
	 */
	public void set_br_ip_address_arr(String[] br_ip_address_arr)
	{
		this.br_ip_address_arr = br_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of BR IP Address
	 * </pre>
	 */
	public String[] get_br_ip_address_arr()
	{
		return this.br_ip_address_arr;
	}


	/**
	 * <pre>
	 * Use this operation to configure Repeater bandwidth of devices of version 6.x or later.
	 * </pre>
	 */
	public static br_configurebandwidth6x configurebandwidth6x(nitro_service client, br_configurebandwidth6x resource) throws Exception
	{
		return ((br_configurebandwidth6x[]) resource.perform_operation(client, "configurebandwidth6x"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to configure Repeater bandwidth of devices of version 6.x or later in bulk.
	 * </pre>
	 */
	public static br_configurebandwidth6x[] configurebandwidth6x(nitro_service client, br_configurebandwidth6x[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((br_configurebandwidth6x[]) resources[0].perform_operation(client, "configurebandwidth6x"));
		
		return ((br_configurebandwidth6x[]) perform_operation_bulk_request(client, resources, "configurebandwidth6x"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_configurebandwidth6x_response result = (br_configurebandwidth6x_response) service.get_payload_formatter().string_to_resource(br_configurebandwidth6x_response.class, response);
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
		return result.br_configurebandwidth6x;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_configurebandwidth6x_responses result = (br_configurebandwidth6x_responses) service.get_payload_formatter().string_to_resource(br_configurebandwidth6x_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_configurebandwidth6x_response_array);
		}
		br_configurebandwidth6x[] result_br_configurebandwidth6x = new br_configurebandwidth6x[result.br_configurebandwidth6x_response_array.length];
		
		for(int i = 0; i < result.br_configurebandwidth6x_response_array.length; i++)
		{
			result_br_configurebandwidth6x[i] = result.br_configurebandwidth6x_response_array[i].br_configurebandwidth6x[0];
		}
		
		return result_br_configurebandwidth6x;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString boostmode_validator = new MPSString();
		boostmode_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		boostmode_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		boostmode_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		boostmode_validator.validate(operationType, boostmode, "\"boostmode\"");
		
		MPSInt receive_limit_validator = new MPSInt();
		receive_limit_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		receive_limit_validator.validate(operationType, receive_limit, "\"receive_limit\"");
		
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
