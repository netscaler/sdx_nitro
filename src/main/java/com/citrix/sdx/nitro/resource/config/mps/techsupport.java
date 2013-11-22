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


class techsupport_response extends base_response
{
	public techsupport[] techsupport;
}

class techsupport_responses extends base_response
{
	public techsupport_response[] techsupport_response_array;
}

/**
 * Configuration for Technical Support resource
 */

public class techsupport extends base_resource
{
	private Integer file_size;
	private String[] vpx_list_for_techsupport;
	private String act_id;
	private String file_name;
	private String mode;
	private String file_last_modified;
	private Long __count;

	protected String get_object_type()
	{
		return "techsupport";
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
	 * File Size
	 * </pre>
	 */
	public Integer get_file_size()
	{
		return this.file_size;
	}

	/**
	 * <pre>
	 * List of VPX for which the techsupport is required
	 * </pre>
	 */
	public void set_vpx_list_for_techsupport(String[] vpx_list_for_techsupport)
	{
		this.vpx_list_for_techsupport = vpx_list_for_techsupport;
	}

	/**
	 * <pre>
	 * List of VPX for which the techsupport is required
	 * </pre>
	 */
	public String[] get_vpx_list_for_techsupport()
	{
		return this.vpx_list_for_techsupport;
	}


	/**
	 * <pre>
	 * Activity Id
	 * </pre>
	 */
	public String get_act_id()
	{
		return this.act_id;
	}

	/**
	 * <pre>
	 * Technical support File Name
	 * </pre>
	 */
	public void set_file_name(String file_name)
	{
		this.file_name = file_name;
	}

	/**
	 * <pre>
	 * Technical support File Name
	 * </pre>
	 */
	public String get_file_name()
	{
		return this.file_name;
	}

	/**
	 * <pre>
	 * Technical support Mode, Possible values Appliance | XenServer | Management Service | NetScaler Insight | Appliance_full | Instances
	 * </pre>
	 */
	public void set_mode(String mode)
	{
		this.mode = mode;
	}

	/**
	 * <pre>
	 * Technical support Mode, Possible values Appliance | XenServer | Management Service | NetScaler Insight | Appliance_full | Instances
	 * </pre>
	 */
	public String get_mode()
	{
		return this.mode;
	}


	/**
	 * <pre>
	 * Last Modified Time
	 * </pre>
	 */
	public String get_file_last_modified()
	{
		return this.file_last_modified;
	}


	/**
	 * <pre>
	 * Use this operation to generate technical support archive.
	 * </pre>
	 */
	public static techsupport[] start(nitro_service client, techsupport resource) throws Exception
	{
		return ((techsupport[]) resource.perform_operation(client, "start"));
	}

	/**
	 * <pre>
	 * Use this operation to delete technical support file.
	 * </pre>
	 */
	public static techsupport delete(nitro_service client, techsupport resource) throws Exception
	{
		resource.validate("delete");
		return ((techsupport[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete technical support file in bulk.
	 * </pre>
	 */
	public static techsupport[] delete(nitro_service client, techsupport[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((techsupport[]) resources[0].delete_resource(client));
		
		return ((techsupport[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get technical support file.
	 * </pre>
	 */
	public static techsupport[] get(nitro_service client) throws Exception
	{
		techsupport resource = new techsupport();
		resource.validate("get");
		return (techsupport[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get technical support file.
	 */
	public static techsupport get(nitro_service client, techsupport resource) throws Exception
	{
		resource.validate("get");
		return ((techsupport[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get technical support file in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of techsupport resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static techsupport[] get_filtered(nitro_service service, String filter) throws Exception
	{
		techsupport obj = new techsupport();
		options option = new options();
		option.set_filter(filter);
		techsupport[] response = (techsupport[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of techsupport resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static techsupport[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		techsupport obj = new techsupport();
		options option = new options();
		option.set_filter(filter);
		techsupport[] response = (techsupport[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the techsupport resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		techsupport obj = new techsupport();
		options option = new options();
		option.set_count(true);
		techsupport[] response = (techsupport[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of techsupport resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		techsupport obj = new techsupport();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		techsupport[] response = (techsupport[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of techsupport resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		techsupport obj = new techsupport();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		techsupport[] response = (techsupport[])obj.get_resources(service, option);
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
		techsupport_response result = (techsupport_response) service.get_payload_formatter().string_to_resource(techsupport_response.class, response);
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
		return result.techsupport;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		techsupport_responses result = (techsupport_responses) service.get_payload_formatter().string_to_resource(techsupport_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.techsupport_response_array);
		}
		techsupport[] result_techsupport = new techsupport[result.techsupport_response_array.length];
		
		for(int i = 0; i < result.techsupport_response_array.length; i++)
		{
			result_techsupport[i] = result.techsupport_response_array[i].techsupport[0];
		}
		
		return result_techsupport;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString mode_validator = new MPSString();
		mode_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		mode_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		mode_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		mode_validator.validate(operationType, mode, "\"mode\"");
		
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
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
		MPSString vpx_list_for_techsupport_validator = new MPSString();
		vpx_list_for_techsupport_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 50);
		vpx_list_for_techsupport_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		if(vpx_list_for_techsupport != null)
		{
			for(int i=0; i<vpx_list_for_techsupport.length; i++)
			{
				vpx_list_for_techsupport_validator.validate(operationType, vpx_list_for_techsupport[i], "vpx_list_for_techsupport["+i+"]");
			}
		}
		
	}
}
