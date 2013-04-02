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


class ns_ns_feature_response extends base_response
{
	public ns_ns_feature[] ns_ns_feature;
}

class ns_ns_feature_responses extends base_response
{
	public ns_ns_feature_response[] ns_ns_feature_response_array;
}

/**
 * Configuration for NS feature resource
 */

public class ns_ns_feature extends base_resource
{
	private Boolean appflow;
	private Boolean htmlinjection;
	private String ns_ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_ns_feature";
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
	 * true, if appflow feature is enabled
	 * </pre>
	 */
	public void set_appflow(Boolean appflow)
	{
		this.appflow = appflow;
	}

	/**
	 * <pre>
	 * true, if appflow feature is enabled
	 * </pre>
	 */
	public Boolean get_appflow()
	{
		return this.appflow;
	}

	/**
	 * <pre>
	 * true, if htmlinjection feature is enabled
	 * </pre>
	 */
	public void set_htmlinjection(Boolean htmlinjection)
	{
		this.htmlinjection = htmlinjection;
	}

	/**
	 * <pre>
	 * true, if htmlinjection feature is enabled
	 * </pre>
	 */
	public Boolean get_htmlinjection()
	{
		return this.htmlinjection;
	}

	/**
	 * <pre>
	 * NetScaler IP Address
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * NetScaler IP Address
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
	}


	/**
	* Use this API to fetch filtered set of ns_ns_feature resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_ns_feature[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ns_feature obj = new ns_ns_feature();
		options option = new options();
		option.set_filter(filter);
		ns_ns_feature[] response = (ns_ns_feature[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_ns_feature resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_ns_feature[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ns_feature obj = new ns_ns_feature();
		options option = new options();
		option.set_filter(filter);
		ns_ns_feature[] response = (ns_ns_feature[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_ns_feature resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_ns_feature obj = new ns_ns_feature();
		options option = new options();
		option.set_count(true);
		ns_ns_feature[] response = (ns_ns_feature[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ns_feature resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ns_feature obj = new ns_ns_feature();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ns_feature[] response = (ns_ns_feature[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ns_feature resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ns_feature obj = new ns_ns_feature();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ns_feature[] response = (ns_ns_feature[])obj.get_resources(service, option);
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
		ns_ns_feature_response result = (ns_ns_feature_response) service.get_payload_formatter().string_to_resource(ns_ns_feature_response.class, response);
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
		return result.ns_ns_feature;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_ns_feature_responses result = (ns_ns_feature_responses) service.get_payload_formatter().string_to_resource(ns_ns_feature_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_ns_feature_response_array);
		}
		ns_ns_feature[] result_ns_ns_feature = new ns_ns_feature[result.ns_ns_feature_response_array.length];
		
		for(int i = 0; i < result.ns_ns_feature_response_array.length; i++)
		{
			result_ns_ns_feature[i] = result.ns_ns_feature_response_array[i].ns_ns_feature[0];
		}
		
		return result_ns_ns_feature;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
		MPSBoolean appflow_validator = new MPSBoolean();
		appflow_validator.validate(operationType, appflow, "\"appflow\"");
		
		MPSBoolean htmlinjection_validator = new MPSBoolean();
		htmlinjection_validator.validate(operationType, htmlinjection, "\"htmlinjection\"");
		
	}
}
