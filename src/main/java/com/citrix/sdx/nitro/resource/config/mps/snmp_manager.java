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


class snmp_manager_response extends base_response
{
	public snmp_manager[] snmp_manager;
}

class snmp_manager_responses extends base_response
{
	public snmp_manager_response[] snmp_manager_response_array;
}

/**
 * Configuration for SNMP Agent Manager configuration resource
 */

public class snmp_manager extends base_resource
{
	private String community;
	private String ip_address;
	private Long __count;

	protected String get_object_type()
	{
		return "snmp_manager";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return ip_address;
	}

	/**
	 * <pre>
	 * Community Name
	 * </pre>
	 */
	public void set_community(String community)
	{
		this.community = community;
	}

	/**
	 * <pre>
	 * Community Name
	 * </pre>
	 */
	public String get_community()
	{
		return this.community;
	}

	/**
	 * <pre>
	 * Manager IPAddress
	 * </pre>
	 */
	public void set_ip_address(String ip_address)
	{
		this.ip_address = ip_address;
	}

	/**
	 * <pre>
	 * Manager IPAddress
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}


	/**
	 * <pre>
	 * Use this operation to add SNMP Manager.
	 * </pre>
	 */
	public static snmp_manager add(nitro_service client, snmp_manager resource) throws Exception
	{
		resource.validate("add");
		return ((snmp_manager[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add SNMP Manager in bulk.
	 * </pre>
	 */
	public static snmp_manager[] add(nitro_service client, snmp_manager[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((snmp_manager[]) resources[0].perform_operation(client, "add"));
		
		return ((snmp_manager[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete SNMP Manager.
	 * </pre>
	 */
	public static snmp_manager delete(nitro_service client, snmp_manager resource) throws Exception
	{
		resource.validate("delete");
		return ((snmp_manager[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete SNMP Manager in bulk.
	 * </pre>
	 */
	public static snmp_manager[] delete(nitro_service client, snmp_manager[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((snmp_manager[]) resources[0].delete_resource(client));
		
		return ((snmp_manager[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get SNMP Manager details.
	 * </pre>
	 */
	public static snmp_manager[] get(nitro_service client) throws Exception
	{
		snmp_manager resource = new snmp_manager();
		resource.validate("get");
		return (snmp_manager[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get SNMP Manager details.
	 */
	public static snmp_manager get(nitro_service client, snmp_manager resource) throws Exception
	{
		resource.validate("get");
		return ((snmp_manager[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get SNMP Manager details in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify SNMP Manager.
	 * </pre>
	 */
	public static snmp_manager update(nitro_service client, snmp_manager resource) throws Exception
	{
		resource.validate("modify");
		return ((snmp_manager[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify SNMP Manager in bulk.
	 * </pre>
	 */
	public static snmp_manager[] update(nitro_service client, snmp_manager[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((snmp_manager[]) resources[0].update_resource(client));
		
		return ((snmp_manager[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of snmp_manager resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static snmp_manager[] get_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_manager obj = new snmp_manager();
		options option = new options();
		option.set_filter(filter);
		snmp_manager[] response = (snmp_manager[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmp_manager resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmp_manager[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_manager obj = new snmp_manager();
		options option = new options();
		option.set_filter(filter);
		snmp_manager[] response = (snmp_manager[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmp_manager resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		snmp_manager obj = new snmp_manager();
		options option = new options();
		option.set_count(true);
		snmp_manager[] response = (snmp_manager[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_manager resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_manager obj = new snmp_manager();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_manager[] response = (snmp_manager[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_manager resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_manager obj = new snmp_manager();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_manager[] response = (snmp_manager[])obj.get_resources(service, option);
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
		snmp_manager_response result = (snmp_manager_response) service.get_payload_formatter().string_to_resource(snmp_manager_response.class, response);
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
		return result.snmp_manager;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		snmp_manager_responses result = (snmp_manager_responses) service.get_payload_formatter().string_to_resource(snmp_manager_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.snmp_manager_response_array);
		}
		snmp_manager[] result_snmp_manager = new snmp_manager[result.snmp_manager_response_array.length];
		
		for(int i = 0; i < result.snmp_manager_response_array.length; i++)
		{
			result_snmp_manager[i] = result.snmp_manager_response_array[i].snmp_manager[0];
		}
		
		return result_snmp_manager;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInternetHost ip_address_validator = new MPSInternetHost();
		ip_address_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		ip_address_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSString community_validator = new MPSString();
		community_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		community_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		community_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		community_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		community_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		community_validator.validate(operationType, community, "\"community\"");
		
	}
}
