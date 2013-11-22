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

import com.citrix.sdx.nitro.resource.config.mps.*;

class ns_vm_template_response extends base_response
{
	public ns_vm_template[] ns_vm_template;
}

class ns_vm_template_responses extends base_response
{
	public ns_vm_template_response[] ns_vm_template_response_array;
}

/**
 * Configuration for NS VM Template resource
 */

public class ns_vm_template extends vm_template
{
	private Long __count;

	protected String get_object_type()
	{
		return "ns_vm_template";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return super.get_object_id();
	}


	/**
	 * <pre>
	 * Use this operation to get NS VM Template.
	 * </pre>
	 */
	public static ns_vm_template[] get(nitro_service client) throws Exception
	{
		ns_vm_template resource = new ns_vm_template();
		resource.validate("get");
		return (ns_vm_template[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of ns_vm_template resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_vm_template[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_vm_template obj = new ns_vm_template();
		options option = new options();
		option.set_filter(filter);
		ns_vm_template[] response = (ns_vm_template[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_vm_template resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_vm_template[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_vm_template obj = new ns_vm_template();
		options option = new options();
		option.set_filter(filter);
		ns_vm_template[] response = (ns_vm_template[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_vm_template resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_vm_template obj = new ns_vm_template();
		options option = new options();
		option.set_count(true);
		ns_vm_template[] response = (ns_vm_template[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_vm_template resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_vm_template obj = new ns_vm_template();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_vm_template[] response = (ns_vm_template[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_vm_template resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_vm_template obj = new ns_vm_template();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_vm_template[] response = (ns_vm_template[])obj.get_resources(service, option);
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
		ns_vm_template_response result = (ns_vm_template_response) service.get_payload_formatter().string_to_resource(ns_vm_template_response.class, response);
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
		return result.ns_vm_template;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_vm_template_responses result = (ns_vm_template_responses) service.get_payload_formatter().string_to_resource(ns_vm_template_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_vm_template_response_array);
		}
		ns_vm_template[] result_ns_vm_template = new ns_vm_template[result.ns_vm_template_response_array.length];
		
		for(int i = 0; i < result.ns_vm_template_response_array.length; i++)
		{
			result_ns_vm_template[i] = result.ns_vm_template_response_array[i].ns_vm_template[0];
		}
		
		return result_ns_vm_template;
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
