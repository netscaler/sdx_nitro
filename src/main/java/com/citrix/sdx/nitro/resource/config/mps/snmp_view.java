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


class snmp_view_response extends base_response
{
	public snmp_view[] snmp_view;
}

class snmp_view_responses extends base_response
{
	public snmp_view_response[] snmp_view_response_array;
}

/**
 * Configuration for SNMP view resource
 */

public class snmp_view extends base_resource
{
	private String subtree;
	private String name;
	private Boolean type;
	private String type_str;
	private Long __count;

	protected String get_object_type()
	{
		return "snmp_view";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return name;
	}

	/**
	 * <pre>
	 * Subtree associated with the SNMP view
	 * </pre>
	 */
	public void set_subtree(String subtree)
	{
		this.subtree = subtree;
	}

	/**
	 * <pre>
	 * Subtree associated with the SNMP view
	 * </pre>
	 */
	public String get_subtree()
	{
		return this.subtree;
	}

	/**
	 * <pre>
	 * Name of SNMP view
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Name of SNMP view
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Include or Exclude the associated subtree . Values. true:Include, false: Exclude
	 * </pre>
	 */
	public void set_type(Boolean type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * Include or Exclude the associated subtree . Values. true:Include, false: Exclude
	 * </pre>
	 */
	public Boolean get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * Type value in string format.(Only for GET request)
	 * </pre>
	 */
	public void set_type_str(String type_str)
	{
		this.type_str = type_str;
	}

	/**
	 * <pre>
	 * Type value in string format.(Only for GET request)
	 * </pre>
	 */
	public String get_type_str()
	{
		return this.type_str;
	}


	/**
	 * <pre>
	 * Use this operation to add SNMP View.
	 * </pre>
	 */
	public static snmp_view add(nitro_service client, snmp_view resource) throws Exception
	{
		resource.validate("add");
		return ((snmp_view[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add SNMP View in bulk.
	 * </pre>
	 */
	public static snmp_view[] add(nitro_service client, snmp_view[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((snmp_view[]) resources[0].perform_operation(client, "add"));
		
		return ((snmp_view[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete SNMP View.
	 * </pre>
	 */
	public static snmp_view delete(nitro_service client, snmp_view resource) throws Exception
	{
		resource.validate("delete");
		return ((snmp_view[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete SNMP View in bulk.
	 * </pre>
	 */
	public static snmp_view[] delete(nitro_service client, snmp_view[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((snmp_view[]) resources[0].delete_resource(client));
		
		return ((snmp_view[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get SNMP View details.
	 * </pre>
	 */
	public static snmp_view[] get(nitro_service client) throws Exception
	{
		snmp_view resource = new snmp_view();
		resource.validate("get");
		return (snmp_view[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get SNMP View details.
	 */
	public static snmp_view get(nitro_service client, snmp_view resource) throws Exception
	{
		resource.validate("get");
		return ((snmp_view[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get SNMP View details in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify SNMP View.
	 * </pre>
	 */
	public static snmp_view update(nitro_service client, snmp_view resource) throws Exception
	{
		resource.validate("modify");
		return ((snmp_view[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify SNMP View in bulk.
	 * </pre>
	 */
	public static snmp_view[] update(nitro_service client, snmp_view[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((snmp_view[]) resources[0].update_resource(client));
		
		return ((snmp_view[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of snmp_view resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static snmp_view[] get_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_view obj = new snmp_view();
		options option = new options();
		option.set_filter(filter);
		snmp_view[] response = (snmp_view[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmp_view resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmp_view[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_view obj = new snmp_view();
		options option = new options();
		option.set_filter(filter);
		snmp_view[] response = (snmp_view[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmp_view resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		snmp_view obj = new snmp_view();
		options option = new options();
		option.set_count(true);
		snmp_view[] response = (snmp_view[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_view resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_view obj = new snmp_view();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_view[] response = (snmp_view[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_view resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_view obj = new snmp_view();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_view[] response = (snmp_view[])obj.get_resources(service, option);
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
		snmp_view_response result = (snmp_view_response) service.get_payload_formatter().string_to_resource(snmp_view_response.class, response);
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
		return result.snmp_view;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		snmp_view_responses result = (snmp_view_responses) service.get_payload_formatter().string_to_resource(snmp_view_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.snmp_view_response_array);
		}
		snmp_view[] result_snmp_view = new snmp_view[result.snmp_view_response_array.length];
		
		for(int i = 0; i < result.snmp_view_response_array.length; i++)
		{
			result_snmp_view[i] = result.snmp_view_response_array[i].snmp_view[0];
		}
		
		return result_snmp_view;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString name_validator = new MPSString();
		name_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		name_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSString subtree_validator = new MPSString();
		subtree_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		subtree_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		subtree_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		subtree_validator.validate(operationType, subtree, "\"subtree\"");
		
		MPSBoolean type_validator = new MPSBoolean();
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSString type_str_validator = new MPSString();
		type_str_validator.validate(operationType, type_str, "\"type_str\"");
		
	}
}
