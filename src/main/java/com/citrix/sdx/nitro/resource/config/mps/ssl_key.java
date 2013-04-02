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


class ssl_key_response extends base_response
{
	public ssl_key[] ssl_key;
}

class ssl_key_responses extends base_response
{
	public ssl_key_response[] ssl_key_response_array;
}

/**
 * Configuration for SSL key File resource
 */

public class ssl_key extends base_resource
{
	private Integer file_size;
	private String file_name;
	private String file_last_modified;
	private Long __count;

	protected String get_object_type()
	{
		return "ssl_key";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return file_name;
	}


	/**
	 * <pre>
	 * file_size
	 * </pre>
	 */
	public Integer get_file_size()
	{
		return this.file_size;
	}

	/**
	 * <pre>
	 * File Name
	 * </pre>
	 */
	public void set_file_name(String file_name)
	{
		this.file_name = file_name;
	}

	/**
	 * <pre>
	 * File Name
	 * </pre>
	 */
	public String get_file_name()
	{
		return this.file_name;
	}


	/**
	 * <pre>
	 * Last Modified
	 * </pre>
	 */
	public String get_file_last_modified()
	{
		return this.file_last_modified;
	}


	/**
	 * <pre>
	 * Use this operation to delete ssl key file.
	 * </pre>
	 */
	public static ssl_key delete(nitro_service client, ssl_key resource) throws Exception
	{
		resource.validate("delete");
		return ((ssl_key[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete ssl key file in bulk.
	 * </pre>
	 */
	public static ssl_key[] delete(nitro_service client, ssl_key[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((ssl_key[]) resources[0].delete_resource(client));
		
		return ((ssl_key[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get ssl key file.
	 * </pre>
	 */
	public static ssl_key[] get(nitro_service client) throws Exception
	{
		ssl_key resource = new ssl_key();
		resource.validate("get");
		return (ssl_key[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get ssl key file.
	 */
	public static ssl_key get(nitro_service client, ssl_key resource) throws Exception
	{
		resource.validate("get");
		return ((ssl_key[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get ssl key file in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of ssl_key resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ssl_key[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ssl_key obj = new ssl_key();
		options option = new options();
		option.set_filter(filter);
		ssl_key[] response = (ssl_key[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ssl_key resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ssl_key[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ssl_key obj = new ssl_key();
		options option = new options();
		option.set_filter(filter);
		ssl_key[] response = (ssl_key[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ssl_key resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ssl_key obj = new ssl_key();
		options option = new options();
		option.set_count(true);
		ssl_key[] response = (ssl_key[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ssl_key resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ssl_key obj = new ssl_key();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ssl_key[] response = (ssl_key[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ssl_key resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ssl_key obj = new ssl_key();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ssl_key[] response = (ssl_key[])obj.get_resources(service, option);
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
		ssl_key_response result = (ssl_key_response) service.get_payload_formatter().string_to_resource(ssl_key_response.class, response);
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
		return result.ssl_key;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ssl_key_responses result = (ssl_key_responses) service.get_payload_formatter().string_to_resource(ssl_key_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ssl_key_response_array);
		}
		ssl_key[] result_ssl_key = new ssl_key[result.ssl_key_response_array.length];
		
		for(int i = 0; i < result.ssl_key_response_array.length; i++)
		{
			result_ssl_key[i] = result.ssl_key_response_array[i].ssl_key[0];
		}
		
		return result_ssl_key;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString file_name_validator = new MPSString();
		file_name_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		file_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		file_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		file_name_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		file_name_validator.validate(operationType, file_name, "\"file_name\"");
		
		MPSString file_last_modified_validator = new MPSString();
		file_last_modified_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		file_last_modified_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		file_last_modified_validator.validate(operationType, file_last_modified, "\"file_last_modified\"");
		
		MPSInt file_size_validator = new MPSInt();
		file_size_validator.validate(operationType, file_size, "\"file_size\"");
		
	}
}
