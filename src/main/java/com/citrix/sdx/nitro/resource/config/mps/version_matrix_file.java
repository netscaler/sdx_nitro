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


class version_matrix_file_response extends base_response
{
	public version_matrix_file[] version_matrix_file;
}

class version_matrix_file_responses extends base_response
{
	public version_matrix_file_response[] version_matrix_file_response_array;
}

/**
 * Configuration for Version Matrix Manifest File resource
 */

public class version_matrix_file extends base_resource
{
	private String formation_version;
	private String file_name;
	private String file_last_modified;
	private String formation_name;
	private Long __count;

	protected String get_object_type()
	{
		return "version_matrix_file";
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
	 * formation_version
	 * </pre>
	 */
	public String get_formation_version()
	{
		return this.formation_version;
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
	 * formation_name
	 * </pre>
	 */
	public String get_formation_name()
	{
		return this.formation_name;
	}


	/**
	 * <pre>
	 * Use this operation to delete Management Service build file.
	 * </pre>
	 */
	public static version_matrix_file delete(nitro_service client, version_matrix_file resource) throws Exception
	{
		resource.validate("delete");
		return ((version_matrix_file[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete Management Service build file in bulk.
	 * </pre>
	 */
	public static version_matrix_file[] delete(nitro_service client, version_matrix_file[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((version_matrix_file[]) resources[0].delete_resource(client));
		
		return ((version_matrix_file[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get Management Service build file.
	 * </pre>
	 */
	public static version_matrix_file[] get(nitro_service client) throws Exception
	{
		version_matrix_file resource = new version_matrix_file();
		resource.validate("get");
		return (version_matrix_file[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get Management Service build file.
	 */
	public static version_matrix_file get(nitro_service client, version_matrix_file resource) throws Exception
	{
		resource.validate("get");
		return ((version_matrix_file[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get Management Service build file in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of version_matrix_file resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static version_matrix_file[] get_filtered(nitro_service service, String filter) throws Exception
	{
		version_matrix_file obj = new version_matrix_file();
		options option = new options();
		option.set_filter(filter);
		version_matrix_file[] response = (version_matrix_file[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of version_matrix_file resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static version_matrix_file[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		version_matrix_file obj = new version_matrix_file();
		options option = new options();
		option.set_filter(filter);
		version_matrix_file[] response = (version_matrix_file[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the version_matrix_file resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		version_matrix_file obj = new version_matrix_file();
		options option = new options();
		option.set_count(true);
		version_matrix_file[] response = (version_matrix_file[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of version_matrix_file resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		version_matrix_file obj = new version_matrix_file();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		version_matrix_file[] response = (version_matrix_file[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of version_matrix_file resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		version_matrix_file obj = new version_matrix_file();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		version_matrix_file[] response = (version_matrix_file[])obj.get_resources(service, option);
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
		version_matrix_file_response result = (version_matrix_file_response) service.get_payload_formatter().string_to_resource(version_matrix_file_response.class, response);
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
		return result.version_matrix_file;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		version_matrix_file_responses result = (version_matrix_file_responses) service.get_payload_formatter().string_to_resource(version_matrix_file_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.version_matrix_file_response_array);
		}
		version_matrix_file[] result_version_matrix_file = new version_matrix_file[result.version_matrix_file_response_array.length];
		
		for(int i = 0; i < result.version_matrix_file_response_array.length; i++)
		{
			result_version_matrix_file[i] = result.version_matrix_file_response_array[i].version_matrix_file[0];
		}
		
		return result_version_matrix_file;
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
		
		MPSString formation_name_validator = new MPSString();
		formation_name_validator.validate(operationType, formation_name, "\"formation_name\"");
		
		MPSString formation_version_validator = new MPSString();
		formation_version_validator.validate(operationType, formation_version, "\"formation_version\"");
		
	}
}
