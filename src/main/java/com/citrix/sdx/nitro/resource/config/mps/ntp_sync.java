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


class ntp_sync_response extends base_response
{
	public ntp_sync[] ntp_sync;
}

class ntp_sync_responses extends base_response
{
	public ntp_sync_response[] ntp_sync_response_array;
}

/**
 * Configuration for NTP Sync resource
 */

public class ntp_sync extends base_resource
{
	private Boolean ntpd_status;
	private Long __count;

	protected String get_object_type()
	{
		return "ntp_sync";
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
	 * ntpd status
	 * </pre>
	 */
	public void set_ntpd_status(Boolean ntpd_status)
	{
		this.ntpd_status = ntpd_status;
	}

	/**
	 * <pre>
	 * ntpd status
	 * </pre>
	 */
	public Boolean get_ntpd_status()
	{
		return this.ntpd_status;
	}


	/**
	 * <pre>
	 * Use this operation to get status of ntpd.
	 * </pre>
	 */
	public static ntp_sync[] get(nitro_service client) throws Exception
	{
		ntp_sync resource = new ntp_sync();
		resource.validate("get");
		return (ntp_sync[]) resource.get_resources(client);
	}

	/**
	 * <pre>
	 * Use this operation to enable/disable ntpd.
	 * </pre>
	 */
	public static ntp_sync update(nitro_service client, ntp_sync resource) throws Exception
	{
		resource.validate("modify");
		return ((ntp_sync[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to enable/disable ntpd in bulk.
	 * </pre>
	 */
	public static ntp_sync[] update(nitro_service client, ntp_sync[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((ntp_sync[]) resources[0].update_resource(client));
		
		return ((ntp_sync[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of ntp_sync resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ntp_sync[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ntp_sync obj = new ntp_sync();
		options option = new options();
		option.set_filter(filter);
		ntp_sync[] response = (ntp_sync[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ntp_sync resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ntp_sync[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ntp_sync obj = new ntp_sync();
		options option = new options();
		option.set_filter(filter);
		ntp_sync[] response = (ntp_sync[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ntp_sync resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ntp_sync obj = new ntp_sync();
		options option = new options();
		option.set_count(true);
		ntp_sync[] response = (ntp_sync[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ntp_sync resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ntp_sync obj = new ntp_sync();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ntp_sync[] response = (ntp_sync[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ntp_sync resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ntp_sync obj = new ntp_sync();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ntp_sync[] response = (ntp_sync[])obj.get_resources(service, option);
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
		ntp_sync_response result = (ntp_sync_response) service.get_payload_formatter().string_to_resource(ntp_sync_response.class, response);
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
		return result.ntp_sync;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ntp_sync_responses result = (ntp_sync_responses) service.get_payload_formatter().string_to_resource(ntp_sync_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ntp_sync_response_array);
		}
		ntp_sync[] result_ntp_sync = new ntp_sync[result.ntp_sync_response_array.length];
		
		for(int i = 0; i < result.ntp_sync_response_array.length; i++)
		{
			result_ntp_sync[i] = result.ntp_sync_response_array[i].ntp_sync[0];
		}
		
		return result_ntp_sync;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSBoolean ntpd_status_validator = new MPSBoolean();
		ntpd_status_validator.validate(operationType, ntpd_status, "\"ntpd_status\"");
		
	}
}
