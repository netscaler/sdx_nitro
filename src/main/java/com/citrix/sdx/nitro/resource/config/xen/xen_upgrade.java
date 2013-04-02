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

package com.citrix.sdx.nitro.resource.config.xen;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class xen_upgrade_response extends base_response
{
	public xen_upgrade[] xen_upgrade;
}

class xen_upgrade_responses extends base_response
{
	public xen_upgrade_response[] xen_upgrade_response_array;
}

/**
 * Configuration for Xen Upgrade resource
 */

public class xen_upgrade extends base_resource
{
	private String image_name;
	private String xen_version;
	private Long __count;

	protected String get_object_type()
	{
		return "xen_upgrade";
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
	 * xen version
	 * </pre>
	 */
	public void set_xen_version(String xen_version)
	{
		this.xen_version = xen_version;
	}

	/**
	 * <pre>
	 * xen version
	 * </pre>
	 */
	public String get_xen_version()
	{
		return this.xen_version;
	}


	/**
	 * <pre>
	 * Use this operation to upgrade XenServer.
	 * </pre>
	 */
	public static xen_upgrade upgrade(nitro_service client, xen_upgrade resource) throws Exception
	{
		return ((xen_upgrade[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to upgrade XenServer in bulk.
	 * </pre>
	 */
	public static xen_upgrade[] upgrade(nitro_service client, xen_upgrade[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((xen_upgrade[]) resources[0].update_resource(client));
		
		return ((xen_upgrade[]) update_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get version of xenserver.
	 * </pre>
	 */
	public static xen_upgrade[] get(nitro_service client) throws Exception
	{
		xen_upgrade resource = new xen_upgrade();
		resource.validate("get");
		return (xen_upgrade[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of xen_upgrade resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen_upgrade[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen_upgrade obj = new xen_upgrade();
		options option = new options();
		option.set_filter(filter);
		xen_upgrade[] response = (xen_upgrade[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen_upgrade resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen_upgrade[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_upgrade obj = new xen_upgrade();
		options option = new options();
		option.set_filter(filter);
		xen_upgrade[] response = (xen_upgrade[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen_upgrade resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen_upgrade obj = new xen_upgrade();
		options option = new options();
		option.set_count(true);
		xen_upgrade[] response = (xen_upgrade[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_upgrade resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen_upgrade obj = new xen_upgrade();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_upgrade[] response = (xen_upgrade[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_upgrade resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_upgrade obj = new xen_upgrade();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_upgrade[] response = (xen_upgrade[])obj.get_resources(service, option);
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
		xen_upgrade_response result = (xen_upgrade_response) service.get_payload_formatter().string_to_resource(xen_upgrade_response.class, response);
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
		return result.xen_upgrade;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_upgrade_responses result = (xen_upgrade_responses) service.get_payload_formatter().string_to_resource(xen_upgrade_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_upgrade_response_array);
		}
		xen_upgrade[] result_xen_upgrade = new xen_upgrade[result.xen_upgrade_response_array.length];
		
		for(int i = 0; i < result.xen_upgrade_response_array.length; i++)
		{
			result_xen_upgrade[i] = result.xen_upgrade_response_array[i].xen_upgrade[0];
		}
		
		return result_xen_upgrade;
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
		image_name_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		image_name_validator.setConstraintMaxStrLen(MPSConstants.MODIFY_CONSTRAINT, 128);
		image_name_validator.setConstraintMinStrLen(MPSConstants.MODIFY_CONSTRAINT, 1);
		image_name_validator.validate(operationType, image_name, "\"image_name\"");
		
		MPSString xen_version_validator = new MPSString();
		xen_version_validator.validate(operationType, xen_version, "\"xen_version\"");
		
	}
}
