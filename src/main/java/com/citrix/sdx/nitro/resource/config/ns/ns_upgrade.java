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


class ns_upgrade_response extends base_response
{
	public ns_upgrade[] ns_upgrade;
}

class ns_upgrade_responses extends base_response
{
	public ns_upgrade_response[] ns_upgrade_response_array;
}

/**
 * Configuration for Upgrade NetScaler resource
 */

public class ns_upgrade extends base_resource
{
	private String act_id;
	private String image_name;
	private String doc_file;
	private String[] ns_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_upgrade";
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
	 * Activity Id
	 * </pre>
	 */
	public String get_act_id()
	{
		return this.act_id;
	}

	/**
	 * <pre>
	 * image_name
	 * </pre>
	 */
	public void set_image_name(String image_name)
	{
		this.image_name = image_name;
	}

	/**
	 * <pre>
	 * image_name
	 * </pre>
	 */
	public String get_image_name()
	{
		return this.image_name;
	}

	/**
	 * <pre>
	 * Documentation File Name
	 * </pre>
	 */
	public void set_doc_file(String doc_file)
	{
		this.doc_file = doc_file;
	}

	/**
	 * <pre>
	 * Documentation File Name
	 * </pre>
	 */
	public String get_doc_file()
	{
		return this.doc_file;
	}

	/**
	 * <pre>
	 * List of NS IP Address
	 * </pre>
	 */
	public void set_ns_ip_address_arr(String[] ns_ip_address_arr)
	{
		this.ns_ip_address_arr = ns_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of NS IP Address
	 * </pre>
	 */
	public String[] get_ns_ip_address_arr()
	{
		return this.ns_ip_address_arr;
	}


	/**
	 * <pre>
	 * Use this operation to upgrade NetScaler.
	 * </pre>
	 */
	public static ns_upgrade upgrade(nitro_service client, ns_upgrade resource) throws Exception
	{
		return ((ns_upgrade[]) resource.perform_operation(client, "upgrade"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to upgrade NetScaler in bulk.
	 * </pre>
	 */
	public static ns_upgrade[] upgrade(nitro_service client, ns_upgrade[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_upgrade[]) resources[0].perform_operation(client, "upgrade"));
		
		return ((ns_upgrade[]) perform_operation_bulk_request(client, resources, "upgrade"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		ns_upgrade_response result = (ns_upgrade_response) service.get_payload_formatter().string_to_resource(ns_upgrade_response.class, response);
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
		return result.ns_upgrade;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_upgrade_responses result = (ns_upgrade_responses) service.get_payload_formatter().string_to_resource(ns_upgrade_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_upgrade_response_array);
		}
		ns_upgrade[] result_ns_upgrade = new ns_upgrade[result.ns_upgrade_response_array.length];
		
		for(int i = 0; i < result.ns_upgrade_response_array.length; i++)
		{
			result_ns_upgrade[i] = result.ns_upgrade_response_array[i].ns_upgrade[0];
		}
		
		return result_ns_upgrade;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString image_name_validator = new MPSString();
		image_name_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		image_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		image_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		image_name_validator.validate(operationType, image_name, "\"image_name\"");
		
		MPSString doc_file_validator = new MPSString();
		doc_file_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		doc_file_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		doc_file_validator.validate(operationType, doc_file, "\"doc_file\"");
		
		MPSIPAddress ns_ip_address_arr_validator = new MPSIPAddress();
		ns_ip_address_arr_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		if(ns_ip_address_arr != null)
		{
			for(int i=0; i<ns_ip_address_arr.length; i++)
			{
				ns_ip_address_arr_validator.validate(operationType, ns_ip_address_arr[i], "ns_ip_address_arr["+i+"]");
			}
		}
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
	}
}
