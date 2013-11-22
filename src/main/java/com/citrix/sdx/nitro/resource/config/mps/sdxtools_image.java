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


class sdxtools_image_response extends base_response
{
	public sdxtools_image[] sdxtools_image;
}

class sdxtools_image_responses extends base_response
{
	public sdxtools_image_response[] sdxtools_image_response_array;
}

/**
 * Configuration for SDXTools Build File resource
 */

public class sdxtools_image extends base_resource
{
	private Integer file_size;
	private String file_name;
	private String file_last_modified;
	private Long __count;

	protected String get_object_type()
	{
		return "sdxtools_image";
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
	 * Use this operation to delete SDXTools build file.
	 * </pre>
	 */
	public static sdxtools_image delete(nitro_service client, sdxtools_image resource) throws Exception
	{
		resource.validate("delete");
		return ((sdxtools_image[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete SDXTools build file in bulk.
	 * </pre>
	 */
	public static sdxtools_image[] delete(nitro_service client, sdxtools_image[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((sdxtools_image[]) resources[0].delete_resource(client));
		
		return ((sdxtools_image[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get SDXTools build file.
	 * </pre>
	 */
	public static sdxtools_image[] get(nitro_service client) throws Exception
	{
		sdxtools_image resource = new sdxtools_image();
		resource.validate("get");
		return (sdxtools_image[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get SDXTools build file.
	 */
	public static sdxtools_image get(nitro_service client, sdxtools_image resource) throws Exception
	{
		resource.validate("get");
		return ((sdxtools_image[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get SDXTools build file in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of sdxtools_image resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static sdxtools_image[] get_filtered(nitro_service service, String filter) throws Exception
	{
		sdxtools_image obj = new sdxtools_image();
		options option = new options();
		option.set_filter(filter);
		sdxtools_image[] response = (sdxtools_image[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sdxtools_image resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sdxtools_image[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sdxtools_image obj = new sdxtools_image();
		options option = new options();
		option.set_filter(filter);
		sdxtools_image[] response = (sdxtools_image[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sdxtools_image resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		sdxtools_image obj = new sdxtools_image();
		options option = new options();
		option.set_count(true);
		sdxtools_image[] response = (sdxtools_image[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sdxtools_image resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		sdxtools_image obj = new sdxtools_image();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sdxtools_image[] response = (sdxtools_image[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sdxtools_image resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sdxtools_image obj = new sdxtools_image();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sdxtools_image[] response = (sdxtools_image[])obj.get_resources(service, option);
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
		sdxtools_image_response result = (sdxtools_image_response) service.get_payload_formatter().string_to_resource(sdxtools_image_response.class, response);
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
		return result.sdxtools_image;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		sdxtools_image_responses result = (sdxtools_image_responses) service.get_payload_formatter().string_to_resource(sdxtools_image_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.sdxtools_image_response_array);
		}
		sdxtools_image[] result_sdxtools_image = new sdxtools_image[result.sdxtools_image_response_array.length];
		
		for(int i = 0; i < result.sdxtools_image_response_array.length; i++)
		{
			result_sdxtools_image[i] = result.sdxtools_image_response_array[i].sdxtools_image[0];
		}
		
		return result_sdxtools_image;
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
