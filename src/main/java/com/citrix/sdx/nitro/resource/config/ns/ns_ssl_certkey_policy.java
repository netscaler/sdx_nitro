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


class ns_ssl_certkey_policy_response extends base_response
{
	public ns_ssl_certkey_policy[] ns_ssl_certkey_policy;
}

class ns_ssl_certkey_policy_responses extends base_response
{
	public ns_ssl_certkey_policy_response[] ns_ssl_certkey_policy_response_array;
}

/**
 * Configuration for NetScaler SSL Cert-Key Polling Policy resource
 */

public class ns_ssl_certkey_policy extends base_resource
{
	private String interval_unit;
	private Integer polling_interval;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_ssl_certkey_policy";
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
	 * Frequency unit (Hours/Minutes)
	 * </pre>
	 */
	public void set_interval_unit(String interval_unit)
	{
		this.interval_unit = interval_unit;
	}

	/**
	 * <pre>
	 * Frequency unit (Hours/Minutes)
	 * </pre>
	 */
	public String get_interval_unit()
	{
		return this.interval_unit;
	}

	/**
	 * <pre>
	 * Frequency of polling
	 * </pre>
	 */
	public void set_polling_interval(Integer polling_interval)
	{
		this.polling_interval = polling_interval;
	}

	/**
	 * <pre>
	 * Frequency of polling
	 * </pre>
	 */
	public Integer get_polling_interval()
	{
		return this.polling_interval;
	}


	/**
	 * <pre>
	 * Use this operation to poll all SSL certificates from all NetScalers and update the database.
	 * </pre>
	 */
	public static ns_ssl_certkey_policy do_poll(nitro_service client, ns_ssl_certkey_policy resource) throws Exception
	{
		return ((ns_ssl_certkey_policy[]) resource.perform_operation(client, "do_poll"))[0];
	}

	/**
	 * Use this operation to get the polling frequency of the NetScaler SSL certificates.
	 */
	public static ns_ssl_certkey_policy get(nitro_service client) throws Exception
	{
		ns_ssl_certkey_policy resource = new ns_ssl_certkey_policy();
		resource.validate("get");
		return ((ns_ssl_certkey_policy[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to set the polling frequency of the NetScaler SSL certificates.
	 * </pre>
	 */
	public static ns_ssl_certkey_policy update(nitro_service client, ns_ssl_certkey_policy resource) throws Exception
	{
		resource.validate("modify");
		return ((ns_ssl_certkey_policy[]) resource.update_resource(client))[0];
	}

	/**
	* Use this API to fetch filtered set of ns_ssl_certkey_policy resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_ssl_certkey_policy[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ssl_certkey_policy obj = new ns_ssl_certkey_policy();
		options option = new options();
		option.set_filter(filter);
		ns_ssl_certkey_policy[] response = (ns_ssl_certkey_policy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_ssl_certkey_policy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_ssl_certkey_policy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ssl_certkey_policy obj = new ns_ssl_certkey_policy();
		options option = new options();
		option.set_filter(filter);
		ns_ssl_certkey_policy[] response = (ns_ssl_certkey_policy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_ssl_certkey_policy resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_ssl_certkey_policy obj = new ns_ssl_certkey_policy();
		options option = new options();
		option.set_count(true);
		ns_ssl_certkey_policy[] response = (ns_ssl_certkey_policy[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ssl_certkey_policy resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ssl_certkey_policy obj = new ns_ssl_certkey_policy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ssl_certkey_policy[] response = (ns_ssl_certkey_policy[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ssl_certkey_policy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ssl_certkey_policy obj = new ns_ssl_certkey_policy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ssl_certkey_policy[] response = (ns_ssl_certkey_policy[])obj.get_resources(service, option);
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
		ns_ssl_certkey_policy_response result = (ns_ssl_certkey_policy_response) service.get_payload_formatter().string_to_resource(ns_ssl_certkey_policy_response.class, response);
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
		return result.ns_ssl_certkey_policy;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_ssl_certkey_policy_responses result = (ns_ssl_certkey_policy_responses) service.get_payload_formatter().string_to_resource(ns_ssl_certkey_policy_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_ssl_certkey_policy_response_array);
		}
		ns_ssl_certkey_policy[] result_ns_ssl_certkey_policy = new ns_ssl_certkey_policy[result.ns_ssl_certkey_policy_response_array.length];
		
		for(int i = 0; i < result.ns_ssl_certkey_policy_response_array.length; i++)
		{
			result_ns_ssl_certkey_policy[i] = result.ns_ssl_certkey_policy_response_array[i].ns_ssl_certkey_policy[0];
		}
		
		return result_ns_ssl_certkey_policy;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt polling_interval_validator = new MPSInt();
		polling_interval_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 1);
		polling_interval_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 1000);
		polling_interval_validator.validate(operationType, polling_interval, "\"polling_interval\"");
		
		MPSString interval_unit_validator = new MPSString();
		interval_unit_validator.validate(operationType, interval_unit, "\"interval_unit\"");
		
	}
}
