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


class ntp_param_response extends base_response
{
	public ntp_param[] ntp_param;
}

class ntp_param_responses extends base_response
{
	public ntp_param_response[] ntp_param_response_array;
}

/**
 * Configuration for NTP Parameters resource
 */

public class ntp_param extends base_resource
{
	private Integer[] trusted_key_list;
	private Integer automax_logsec;
	private Integer revoke_logsec;
	private Boolean authentication;
	private Long __count;

	protected String get_object_type()
	{
		return "ntp_param";
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
	 * List of Trusted Key Identifiers for Symmetric Key Cryptography
	 * </pre>
	 */
	public void set_trusted_key_list(Integer[] trusted_key_list)
	{
		this.trusted_key_list = trusted_key_list;
	}

	/**
	 * <pre>
	 * List of Trusted Key Identifiers for Symmetric Key Cryptography
	 * </pre>
	 */
	public Integer[] get_trusted_key_list()
	{
		return this.trusted_key_list;
	}

	/**
	 * <pre>
	 * Automax Interval (as power of 2 in seconds)
	 * </pre>
	 */
	public void set_automax_logsec(Integer automax_logsec)
	{
		this.automax_logsec = automax_logsec;
	}

	/**
	 * <pre>
	 * Automax Interval (as power of 2 in seconds)
	 * </pre>
	 */
	public Integer get_automax_logsec()
	{
		return this.automax_logsec;
	}

	/**
	 * <pre>
	 * Revoke Interval (as power of 2 in seconds)
	 * </pre>
	 */
	public void set_revoke_logsec(Integer revoke_logsec)
	{
		this.revoke_logsec = revoke_logsec;
	}

	/**
	 * <pre>
	 * Revoke Interval (as power of 2 in seconds)
	 * </pre>
	 */
	public Integer get_revoke_logsec()
	{
		return this.revoke_logsec;
	}

	/**
	 * <pre>
	 * Authentication Enabled
	 * </pre>
	 */
	public void set_authentication(Boolean authentication)
	{
		this.authentication = authentication;
	}

	/**
	 * <pre>
	 * Authentication Enabled
	 * </pre>
	 */
	public Boolean get_authentication()
	{
		return this.authentication;
	}


	/**
	 * <pre>
	 * Use this operation to get NTP Server.
	 * </pre>
	 */
	public static ntp_param[] get(nitro_service client) throws Exception
	{
		ntp_param resource = new ntp_param();
		resource.validate("get");
		return (ntp_param[]) resource.get_resources(client);
	}

	/**
	 * <pre>
	 * Use this operation to modify NTP Server.
	 * </pre>
	 */
	public static ntp_param update(nitro_service client, ntp_param resource) throws Exception
	{
		resource.validate("modify");
		return ((ntp_param[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify NTP Server in bulk.
	 * </pre>
	 */
	public static ntp_param[] update(nitro_service client, ntp_param[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((ntp_param[]) resources[0].update_resource(client));
		
		return ((ntp_param[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of ntp_param resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ntp_param[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ntp_param obj = new ntp_param();
		options option = new options();
		option.set_filter(filter);
		ntp_param[] response = (ntp_param[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ntp_param resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ntp_param[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ntp_param obj = new ntp_param();
		options option = new options();
		option.set_filter(filter);
		ntp_param[] response = (ntp_param[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ntp_param resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ntp_param obj = new ntp_param();
		options option = new options();
		option.set_count(true);
		ntp_param[] response = (ntp_param[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ntp_param resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ntp_param obj = new ntp_param();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ntp_param[] response = (ntp_param[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ntp_param resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ntp_param obj = new ntp_param();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ntp_param[] response = (ntp_param[])obj.get_resources(service, option);
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
		ntp_param_response result = (ntp_param_response) service.get_payload_formatter().string_to_resource(ntp_param_response.class, response);
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
		return result.ntp_param;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ntp_param_responses result = (ntp_param_responses) service.get_payload_formatter().string_to_resource(ntp_param_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ntp_param_response_array);
		}
		ntp_param[] result_ntp_param = new ntp_param[result.ntp_param_response_array.length];
		
		for(int i = 0; i < result.ntp_param_response_array.length; i++)
		{
			result_ntp_param[i] = result.ntp_param_response_array[i].ntp_param[0];
		}
		
		return result_ntp_param;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSBoolean authentication_validator = new MPSBoolean();
		authentication_validator.validate(operationType, authentication, "\"authentication\"");
		
		MPSInt trusted_key_list_validator = new MPSInt();
		trusted_key_list_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		trusted_key_list_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 1);
		trusted_key_list_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 65534);
		if(trusted_key_list != null)
		{
			for(int i=0; i<trusted_key_list.length; i++)
			{
				trusted_key_list_validator.validate(operationType, trusted_key_list[i], "trusted_key_list["+i+"]");
			}
		}
		
		MPSInt revoke_logsec_validator = new MPSInt();
		revoke_logsec_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		revoke_logsec_validator.validate(operationType, revoke_logsec, "\"revoke_logsec\"");
		
		MPSInt automax_logsec_validator = new MPSInt();
		automax_logsec_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		automax_logsec_validator.validate(operationType, automax_logsec, "\"automax_logsec\"");
		
	}
}
