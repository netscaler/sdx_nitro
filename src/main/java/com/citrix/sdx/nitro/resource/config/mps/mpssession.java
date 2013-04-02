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


class mpssession_response extends base_response
{
	public mpssession[] mpssession;
}

class mpssession_responses extends base_response
{
	public mpssession_response[] mpssession_response_array;
}

/**
 * Configuration for Client Session resource
 */

public class mpssession extends base_resource
{
	private Integer expire_after;
	private Integer login_time;
	private Integer session_timeout;
	private Integer port;
	private String username;
	private Integer last_activity_time;
	private String id;
	private String ip_address;
	private String sessionid;
	private Boolean is_self;
	private Long __count;

	protected String get_object_type()
	{
		return "mpssession";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return id;
	}


	/**
	 * <pre>
	 * Session will expire after these many seconds
	 * </pre>
	 */
	public Integer get_expire_after()
	{
		return this.expire_after;
	}


	/**
	 * <pre>
	 * Session was initiated at this time
	 * </pre>
	 */
	public Integer get_login_time()
	{
		return this.login_time;
	}


	/**
	 * <pre>
	 * Session Timeout set for this session
	 * </pre>
	 */
	public Integer get_session_timeout()
	{
		return this.session_timeout;
	}


	/**
	 * <pre>
	 * Port from where this session was initiated
	 * </pre>
	 */
	public Integer get_port()
	{
		return this.port;
	}


	/**
	 * <pre>
	 * User Name who initiated this session
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}


	/**
	 * <pre>
	 * Last Activity Time for this session
	 * </pre>
	 */
	public Integer get_last_activity_time()
	{
		return this.last_activity_time;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the client sessions
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the client sessions
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * IP Aaddress from where this session was initiated
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}

	/**
	 * <pre>
	 * Session ID for this session
	 * </pre>
	 */
	public void set_sessionid(String sessionid)
	{
		this.sessionid = sessionid;
	}

	/**
	 * <pre>
	 * Session ID for this session
	 * </pre>
	 */
	public String get_sessionid()
	{
		return this.sessionid;
	}


	/**
	 * <pre>
	 * true, if this session is for current logged-in user
	 * </pre>
	 */
	public Boolean get_is_self()
	{
		return this.is_self;
	}


	/**
	 * <pre>
	 * Use this operation to get client sessions.
	 * </pre>
	 */
	public static mpssession[] get(nitro_service client) throws Exception
	{
		mpssession resource = new mpssession();
		resource.validate("get");
		return (mpssession[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get client sessions.
	 */
	public static mpssession get(nitro_service client, mpssession resource) throws Exception
	{
		resource.validate("get");
		return ((mpssession[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get client sessions in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Kill client session by providing id.
	 * </pre>
	 */
	public static mpssession delete(nitro_service client, mpssession resource) throws Exception
	{
		resource.validate("delete");
		return ((mpssession[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Kill client session by providing id in bulk.
	 * </pre>
	 */
	public static mpssession[] delete(nitro_service client, mpssession[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((mpssession[]) resources[0].delete_resource(client));
		
		return ((mpssession[]) delete_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of mpssession resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static mpssession[] get_filtered(nitro_service service, String filter) throws Exception
	{
		mpssession obj = new mpssession();
		options option = new options();
		option.set_filter(filter);
		mpssession[] response = (mpssession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of mpssession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static mpssession[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mpssession obj = new mpssession();
		options option = new options();
		option.set_filter(filter);
		mpssession[] response = (mpssession[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the mpssession resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		mpssession obj = new mpssession();
		options option = new options();
		option.set_count(true);
		mpssession[] response = (mpssession[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mpssession resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		mpssession obj = new mpssession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mpssession[] response = (mpssession[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mpssession resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mpssession obj = new mpssession();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mpssession[] response = (mpssession[])obj.get_resources(service, option);
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
		mpssession_response result = (mpssession_response) service.get_payload_formatter().string_to_resource(mpssession_response.class, response);
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
		return result.mpssession;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		mpssession_responses result = (mpssession_responses) service.get_payload_formatter().string_to_resource(mpssession_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.mpssession_response_array);
		}
		mpssession[] result_mpssession = new mpssession[result.mpssession_response_array.length];
		
		for(int i = 0; i < result.mpssession_response_array.length; i++)
		{
			result_mpssession[i] = result.mpssession_response_array[i].mpssession[0];
		}
		
		return result_mpssession;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString id_validator = new MPSString();
		id_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		id_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSString sessionid_validator = new MPSString();
		sessionid_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		sessionid_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		sessionid_validator.validate(operationType, sessionid, "\"sessionid\"");
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		username_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSInt port_validator = new MPSInt();
		port_validator.validate(operationType, port, "\"port\"");
		
		MPSInt session_timeout_validator = new MPSInt();
		session_timeout_validator.validate(operationType, session_timeout, "\"session_timeout\"");
		
		MPSInt login_time_validator = new MPSInt();
		login_time_validator.validate(operationType, login_time, "\"login_time\"");
		
		MPSInt last_activity_time_validator = new MPSInt();
		last_activity_time_validator.validate(operationType, last_activity_time, "\"last_activity_time\"");
		
		MPSInt expire_after_validator = new MPSInt();
		expire_after_validator.validate(operationType, expire_after, "\"expire_after\"");
		
		MPSBoolean is_self_validator = new MPSBoolean();
		is_self_validator.validate(operationType, is_self, "\"is_self\"");
		
	}
}
