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
import com.citrix.sdx.nitro.resource.config.mps.*;

class br_vm_template_response extends base_response
{
	public br_vm_template[] br_vm_template;
}

class br_vm_template_responses extends base_response
{
	public br_vm_template_response[] br_vm_template_response_array;
}

/**
 * Configuration for BR VM Template resource
 */

public class br_vm_template extends vm_template
{
	private Long __count;

	protected String get_object_type()
	{
		return "br_vm_template";
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
	 * Use this operation to get BR VM Template.
	 * </pre>
	 */
	public static br_vm_template[] get(nitro_service client) throws Exception
	{
		br_vm_template resource = new br_vm_template();
		resource.validate("get");
		return (br_vm_template[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of br_vm_template resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static br_vm_template[] get_filtered(nitro_service service, String filter) throws Exception
	{
		br_vm_template obj = new br_vm_template();
		options option = new options();
		option.set_filter(filter);
		br_vm_template[] response = (br_vm_template[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of br_vm_template resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static br_vm_template[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br_vm_template obj = new br_vm_template();
		options option = new options();
		option.set_filter(filter);
		br_vm_template[] response = (br_vm_template[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the br_vm_template resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		br_vm_template obj = new br_vm_template();
		options option = new options();
		option.set_count(true);
		br_vm_template[] response = (br_vm_template[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br_vm_template resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		br_vm_template obj = new br_vm_template();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br_vm_template[] response = (br_vm_template[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of br_vm_template resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		br_vm_template obj = new br_vm_template();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		br_vm_template[] response = (br_vm_template[])obj.get_resources(service, option);
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
		br_vm_template_response result = (br_vm_template_response) service.get_payload_formatter().string_to_resource(br_vm_template_response.class, response);
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
		return result.br_vm_template;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_vm_template_responses result = (br_vm_template_responses) service.get_payload_formatter().string_to_resource(br_vm_template_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_vm_template_response_array);
		}
		br_vm_template[] result_br_vm_template = new br_vm_template[result.br_vm_template_response_array.length];
		
		for(int i = 0; i < result.br_vm_template_response_array.length; i++)
		{
			result_br_vm_template[i] = result.br_vm_template_response_array[i].br_vm_template[0];
		}
		
		return result_br_vm_template;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

	}
}
