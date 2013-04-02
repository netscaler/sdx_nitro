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


class af_config_info_response extends base_response
{
	public af_config_info[] af_config_info;
}

class af_config_info_responses extends base_response
{
	public af_config_info_response[] af_config_info_response_array;
}

/**
 * Configuration for This table holds generic config info to be persisted across reboots for appflow feature. resource
 */

public class af_config_info extends base_resource
{
	private String propkey;
	private String propvalue;
	private Long __count;

	protected String get_object_type()
	{
		return "af_config_info";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return propkey;
	}

	/**
	 * <pre>
	 * Key of the property.
	 * </pre>
	 */
	public void set_propkey(String propkey)
	{
		this.propkey = propkey;
	}

	/**
	 * <pre>
	 * Key of the property.
	 * </pre>
	 */
	public String get_propkey()
	{
		return this.propkey;
	}

	/**
	 * <pre>
	 * Value of the property.
	 * </pre>
	 */
	public void set_propvalue(String propvalue)
	{
		this.propvalue = propvalue;
	}

	/**
	 * <pre>
	 * Value of the property.
	 * </pre>
	 */
	public String get_propvalue()
	{
		return this.propvalue;
	}


	/**
	 * <pre>
	 * Use this operation to delete a property.
	 * </pre>
	 */
	public static af_config_info delete(nitro_service client, af_config_info resource) throws Exception
	{
		resource.validate("delete");
		return ((af_config_info[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete a property in bulk.
	 * </pre>
	 */
	public static af_config_info[] delete(nitro_service client, af_config_info[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((af_config_info[]) resources[0].delete_resource(client));
		
		return ((af_config_info[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get a value for a Property based on Key..
	 * </pre>
	 */
	public static af_config_info[] get(nitro_service client) throws Exception
	{
		af_config_info resource = new af_config_info();
		resource.validate("get");
		return (af_config_info[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get a value for a Property based on Key..
	 */
	public static af_config_info get(nitro_service client, af_config_info resource) throws Exception
	{
		resource.validate("get");
		return ((af_config_info[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get a value for a Property based on Key. in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of af_config_info resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static af_config_info[] get_filtered(nitro_service service, String filter) throws Exception
	{
		af_config_info obj = new af_config_info();
		options option = new options();
		option.set_filter(filter);
		af_config_info[] response = (af_config_info[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of af_config_info resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static af_config_info[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		af_config_info obj = new af_config_info();
		options option = new options();
		option.set_filter(filter);
		af_config_info[] response = (af_config_info[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the af_config_info resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		af_config_info obj = new af_config_info();
		options option = new options();
		option.set_count(true);
		af_config_info[] response = (af_config_info[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of af_config_info resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		af_config_info obj = new af_config_info();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		af_config_info[] response = (af_config_info[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of af_config_info resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		af_config_info obj = new af_config_info();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		af_config_info[] response = (af_config_info[])obj.get_resources(service, option);
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
		af_config_info_response result = (af_config_info_response) service.get_payload_formatter().string_to_resource(af_config_info_response.class, response);
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
		return result.af_config_info;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		af_config_info_responses result = (af_config_info_responses) service.get_payload_formatter().string_to_resource(af_config_info_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.af_config_info_response_array);
		}
		af_config_info[] result_af_config_info = new af_config_info[result.af_config_info_response_array.length];
		
		for(int i = 0; i < result.af_config_info_response_array.length; i++)
		{
			result_af_config_info[i] = result.af_config_info_response_array[i].af_config_info[0];
		}
		
		return result_af_config_info;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString propkey_validator = new MPSString();
		propkey_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		propkey_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		propkey_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		propkey_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		propkey_validator.validate(operationType, propkey, "\"propkey\"");
		
		MPSString propvalue_validator = new MPSString();
		propvalue_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 2000);
		propvalue_validator.validate(operationType, propvalue, "\"propvalue\"");
		
	}
}
