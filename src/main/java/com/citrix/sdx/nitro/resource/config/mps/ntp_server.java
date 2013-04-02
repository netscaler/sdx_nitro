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


class ntp_server_response extends base_response
{
	public ntp_server[] ntp_server;
}

class ntp_server_responses extends base_response
{
	public ntp_server_response[] ntp_server_response_array;
}

/**
 * Configuration for NTP Server resource
 */

public class ntp_server extends base_resource
{
	private Boolean preferred_server;
	private Integer maxpoll;
	private Integer minpoll;
	private Boolean autokey;
	private Integer key_id;
	private String server;
	private Long __count;

	protected String get_object_type()
	{
		return "ntp_server";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return server;
	}

	/**
	 * <pre>
	 * NTP Server Preferred
	 * </pre>
	 */
	public void set_preferred_server(Boolean preferred_server)
	{
		this.preferred_server = preferred_server;
	}

	/**
	 * <pre>
	 * NTP Server Preferred
	 * </pre>
	 */
	public Boolean get_preferred_server()
	{
		return this.preferred_server;
	}

	/**
	 * <pre>
	 * Maximum Poll Interval
	 * </pre>
	 */
	public void set_maxpoll(Integer maxpoll)
	{
		this.maxpoll = maxpoll;
	}

	/**
	 * <pre>
	 * Maximum Poll Interval
	 * </pre>
	 */
	public Integer get_maxpoll()
	{
		return this.maxpoll;
	}

	/**
	 * <pre>
	 * Minimum Poll Interval
	 * </pre>
	 */
	public void set_minpoll(Integer minpoll)
	{
		this.minpoll = minpoll;
	}

	/**
	 * <pre>
	 * Minimum Poll Interval
	 * </pre>
	 */
	public Integer get_minpoll()
	{
		return this.minpoll;
	}

	/**
	 * <pre>
	 * Autokey Public Key Authentication
	 * </pre>
	 */
	public void set_autokey(Boolean autokey)
	{
		this.autokey = autokey;
	}

	/**
	 * <pre>
	 * Autokey Public Key Authentication
	 * </pre>
	 */
	public Boolean get_autokey()
	{
		return this.autokey;
	}

	/**
	 * <pre>
	 * Key Identifier for Symmetric Key Authentication
	 * </pre>
	 */
	public void set_key_id(Integer key_id)
	{
		this.key_id = key_id;
	}

	/**
	 * <pre>
	 * Key Identifier for Symmetric Key Authentication
	 * </pre>
	 */
	public Integer get_key_id()
	{
		return this.key_id;
	}

	/**
	 * <pre>
	 * NTP Time Server Address
	 * </pre>
	 */
	public void set_server(String server)
	{
		this.server = server;
	}

	/**
	 * <pre>
	 * NTP Time Server Address
	 * </pre>
	 */
	public String get_server()
	{
		return this.server;
	}


	/**
	 * <pre>
	 * Use this operation to add NTP Server.
	 * </pre>
	 */
	public static ntp_server add(nitro_service client, ntp_server resource) throws Exception
	{
		resource.validate("add");
		return ((ntp_server[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add NTP Server in bulk.
	 * </pre>
	 */
	public static ntp_server[] add(nitro_service client, ntp_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ntp_server[]) resources[0].perform_operation(client, "add"));
		
		return ((ntp_server[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete NTP Server.
	 * </pre>
	 */
	public static ntp_server delete(nitro_service client, ntp_server resource) throws Exception
	{
		resource.validate("delete");
		return ((ntp_server[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete NTP Server in bulk.
	 * </pre>
	 */
	public static ntp_server[] delete(nitro_service client, ntp_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((ntp_server[]) resources[0].delete_resource(client));
		
		return ((ntp_server[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get NTP Server.
	 * </pre>
	 */
	public static ntp_server[] get(nitro_service client) throws Exception
	{
		ntp_server resource = new ntp_server();
		resource.validate("get");
		return (ntp_server[]) resource.get_resources(client);
	}

	/**
	 * <pre>
	 * Use this operation to modify NTP Server.
	 * </pre>
	 */
	public static ntp_server update(nitro_service client, ntp_server resource) throws Exception
	{
		resource.validate("modify");
		return ((ntp_server[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify NTP Server in bulk.
	 * </pre>
	 */
	public static ntp_server[] update(nitro_service client, ntp_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((ntp_server[]) resources[0].update_resource(client));
		
		return ((ntp_server[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of ntp_server resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ntp_server[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ntp_server obj = new ntp_server();
		options option = new options();
		option.set_filter(filter);
		ntp_server[] response = (ntp_server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ntp_server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ntp_server[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ntp_server obj = new ntp_server();
		options option = new options();
		option.set_filter(filter);
		ntp_server[] response = (ntp_server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ntp_server resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ntp_server obj = new ntp_server();
		options option = new options();
		option.set_count(true);
		ntp_server[] response = (ntp_server[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ntp_server resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ntp_server obj = new ntp_server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ntp_server[] response = (ntp_server[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ntp_server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ntp_server obj = new ntp_server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ntp_server[] response = (ntp_server[])obj.get_resources(service, option);
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
		ntp_server_response result = (ntp_server_response) service.get_payload_formatter().string_to_resource(ntp_server_response.class, response);
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
		return result.ntp_server;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ntp_server_responses result = (ntp_server_responses) service.get_payload_formatter().string_to_resource(ntp_server_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ntp_server_response_array);
		}
		ntp_server[] result_ntp_server = new ntp_server[result.ntp_server_response_array.length];
		
		for(int i = 0; i < result.ntp_server_response_array.length; i++)
		{
			result_ntp_server[i] = result.ntp_server_response_array[i].ntp_server[0];
		}
		
		return result_ntp_server;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInternetHost server_validator = new MPSInternetHost();
		server_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		server_validator.validate(operationType, server, "\"server\"");
		
		MPSInt minpoll_validator = new MPSInt();
		minpoll_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		minpoll_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 6);
		minpoll_validator.validate(operationType, minpoll, "\"minpoll\"");
		
		MPSInt maxpoll_validator = new MPSInt();
		maxpoll_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		maxpoll_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 17);
		maxpoll_validator.validate(operationType, maxpoll, "\"maxpoll\"");
		
		MPSInt key_id_validator = new MPSInt();
		key_id_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		key_id_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 65534);
		key_id_validator.validate(operationType, key_id, "\"key_id\"");
		
		MPSBoolean autokey_validator = new MPSBoolean();
		autokey_validator.validate(operationType, autokey, "\"autokey\"");
		
		MPSBoolean preferred_server_validator = new MPSBoolean();
		preferred_server_validator.validate(operationType, preferred_server, "\"preferred_server\"");
		
	}
}
