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


class prune_policy_response extends base_response
{
	public prune_policy[] prune_policy;
}

class prune_policy_responses extends base_response
{
	public prune_policy_response[] prune_policy_response_array;
}

/**
 * Configuration for Prune Policy resource
 */

public class prune_policy extends base_resource
{
	private String policy_name;
	private Integer data_to_keep_in_days;
	private Long __count;

	protected String get_object_type()
	{
		return "prune_policy";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return policy_name;
	}

	/**
	 * <pre>
	 * Policy Name
	 * </pre>
	 */
	public void set_policy_name(String policy_name)
	{
		this.policy_name = policy_name;
	}

	/**
	 * <pre>
	 * Policy Name
	 * </pre>
	 */
	public String get_policy_name()
	{
		return this.policy_name;
	}

	/**
	 * <pre>
	 * Number of days data to retain
	 * </pre>
	 */
	public void set_data_to_keep_in_days(Integer data_to_keep_in_days)
	{
		this.data_to_keep_in_days = data_to_keep_in_days;
	}

	/**
	 * <pre>
	 * Number of days data to retain
	 * </pre>
	 */
	public Integer get_data_to_keep_in_days()
	{
		return this.data_to_keep_in_days;
	}


	/**
	 * Use this operation to get the prune policy to view number of days data to retain.
	 */
	public static prune_policy get(nitro_service client, prune_policy resource) throws Exception
	{
		resource.validate("get");
		return ((prune_policy[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify the number of days data to retain.
	 * </pre>
	 */
	public static prune_policy update(nitro_service client, prune_policy resource) throws Exception
	{
		resource.validate("modify");
		return ((prune_policy[]) resource.update_resource(client))[0];
	}

	/**
	* Use this API to fetch filtered set of prune_policy resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static prune_policy[] get_filtered(nitro_service service, String filter) throws Exception
	{
		prune_policy obj = new prune_policy();
		options option = new options();
		option.set_filter(filter);
		prune_policy[] response = (prune_policy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of prune_policy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static prune_policy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		prune_policy obj = new prune_policy();
		options option = new options();
		option.set_filter(filter);
		prune_policy[] response = (prune_policy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the prune_policy resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		prune_policy obj = new prune_policy();
		options option = new options();
		option.set_count(true);
		prune_policy[] response = (prune_policy[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of prune_policy resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		prune_policy obj = new prune_policy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		prune_policy[] response = (prune_policy[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of prune_policy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		prune_policy obj = new prune_policy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		prune_policy[] response = (prune_policy[])obj.get_resources(service, option);
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
		prune_policy_response result = (prune_policy_response) service.get_payload_formatter().string_to_resource(prune_policy_response.class, response);
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
		return result.prune_policy;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		prune_policy_responses result = (prune_policy_responses) service.get_payload_formatter().string_to_resource(prune_policy_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.prune_policy_response_array);
		}
		prune_policy[] result_prune_policy = new prune_policy[result.prune_policy_response_array.length];
		
		for(int i = 0; i < result.prune_policy_response_array.length; i++)
		{
			result_prune_policy[i] = result.prune_policy_response_array[i].prune_policy[0];
		}
		
		return result_prune_policy;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString policy_name_validator = new MPSString();
		policy_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		policy_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		policy_name_validator.validate(operationType, policy_name, "\"policy_name\"");
		
		MPSInt data_to_keep_in_days_validator = new MPSInt();
		data_to_keep_in_days_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 1);
		data_to_keep_in_days_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 60);
		data_to_keep_in_days_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		data_to_keep_in_days_validator.validate(operationType, data_to_keep_in_days, "\"data_to_keep_in_days\"");
		
	}
}
