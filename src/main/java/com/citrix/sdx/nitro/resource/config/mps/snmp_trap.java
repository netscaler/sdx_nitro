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


class snmp_trap_response extends base_response
{
	public snmp_trap[] snmp_trap;
}

class snmp_trap_responses extends base_response
{
	public snmp_trap_response[] snmp_trap_response_array;
}

/**
 * Configuration for SNMP Trap Destinations resource
 */

public class snmp_trap extends base_resource
{
	private String community;
	private String dest_server;
	private Integer dest_port;
	private Long __count;

	protected String get_object_type()
	{
		return "snmp_trap";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return dest_server;
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
	 * Trap Destination Server Address
	 * </pre>
	 */
	public void set_dest_server(String dest_server)
	{
		this.dest_server = dest_server;
	}

	/**
	 * <pre>
	 * Trap Destination Server Address
	 * </pre>
	 */
	public String get_dest_server()
	{
		return this.dest_server;
	}

	/**
	 * <pre>
	 * Destination Port
	 * </pre>
	 */
	public void set_dest_port(Integer dest_port)
	{
		this.dest_port = dest_port;
	}

	/**
	 * <pre>
	 * Destination Port
	 * </pre>
	 */
	public Integer get_dest_port()
	{
		return this.dest_port;
	}


	/**
	 * <pre>
	 * Use this operation to add snmp trap destination.
	 * </pre>
	 */
	public static snmp_trap add(nitro_service client, snmp_trap resource) throws Exception
	{
		resource.validate("add");
		return ((snmp_trap[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add snmp trap destination in bulk.
	 * </pre>
	 */
	public static snmp_trap[] add(nitro_service client, snmp_trap[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((snmp_trap[]) resources[0].perform_operation(client, "add"));
		
		return ((snmp_trap[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete snmp trap destination.
	 * </pre>
	 */
	public static snmp_trap delete(nitro_service client, snmp_trap resource) throws Exception
	{
		resource.validate("delete");
		return ((snmp_trap[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete snmp trap destination in bulk.
	 * </pre>
	 */
	public static snmp_trap[] delete(nitro_service client, snmp_trap[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((snmp_trap[]) resources[0].delete_resource(client));
		
		return ((snmp_trap[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get snmp trap destination details.
	 * </pre>
	 */
	public static snmp_trap[] get(nitro_service client) throws Exception
	{
		snmp_trap resource = new snmp_trap();
		resource.validate("get");
		return (snmp_trap[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get snmp trap destination details.
	 */
	public static snmp_trap get(nitro_service client, snmp_trap resource) throws Exception
	{
		resource.validate("get");
		return ((snmp_trap[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get snmp trap destination details in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify snmp trap destination.
	 * </pre>
	 */
	public static snmp_trap update(nitro_service client, snmp_trap resource) throws Exception
	{
		resource.validate("modify");
		return ((snmp_trap[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify snmp trap destination in bulk.
	 * </pre>
	 */
	public static snmp_trap[] update(nitro_service client, snmp_trap[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((snmp_trap[]) resources[0].update_resource(client));
		
		return ((snmp_trap[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of snmp_trap resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static snmp_trap[] get_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_trap obj = new snmp_trap();
		options option = new options();
		option.set_filter(filter);
		snmp_trap[] response = (snmp_trap[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmp_trap resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmp_trap[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_trap obj = new snmp_trap();
		options option = new options();
		option.set_filter(filter);
		snmp_trap[] response = (snmp_trap[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmp_trap resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		snmp_trap obj = new snmp_trap();
		options option = new options();
		option.set_count(true);
		snmp_trap[] response = (snmp_trap[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_trap resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_trap obj = new snmp_trap();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_trap[] response = (snmp_trap[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_trap resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_trap obj = new snmp_trap();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_trap[] response = (snmp_trap[])obj.get_resources(service, option);
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
		snmp_trap_response result = (snmp_trap_response) service.get_payload_formatter().string_to_resource(snmp_trap_response.class, response);
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
		return result.snmp_trap;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		snmp_trap_responses result = (snmp_trap_responses) service.get_payload_formatter().string_to_resource(snmp_trap_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.snmp_trap_response_array);
		}
		snmp_trap[] result_snmp_trap = new snmp_trap[result.snmp_trap_response_array.length];
		
		for(int i = 0; i < result.snmp_trap_response_array.length; i++)
		{
			result_snmp_trap[i] = result.snmp_trap_response_array[i].snmp_trap[0];
		}
		
		return result_snmp_trap;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInternetHost dest_server_validator = new MPSInternetHost();
		dest_server_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		dest_server_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		dest_server_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		dest_server_validator.validate(operationType, dest_server, "\"dest_server\"");
		
		MPSInt dest_port_validator = new MPSInt();
		dest_port_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 65535);
		dest_port_validator.validate(operationType, dest_port, "\"dest_port\"");
		
		MPSString community_validator = new MPSString();
		community_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		community_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		community_validator.validate(operationType, community, "\"community\"");
		
	}
}
