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


class snmp_user_response extends base_response
{
	public snmp_user[] snmp_user;
}

class snmp_user_responses extends base_response
{
	public snmp_user_response[] snmp_user_response_array;
}

/**
 * Configuration for SNMP User resource
 */

public class snmp_user extends base_resource
{
	private Integer security_level;
	private String auth_password;
	private Integer privacy_protocol;
	private String name;
	private String privacy_password;
	private String view_name;
	private Integer auth_protocol;
	private String security_level_str;
	private String privacy_protocol_str;
	private String auth_protocol_str;
	private Long __count;

	protected String get_object_type()
	{
		return "snmp_user";
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
	 * Security Level of SNMP User. Values: 0: noAuthNoPriv, 1: authNoPriv, 2: authPriv
	 * </pre>
	 */
	public void set_security_level(Integer security_level)
	{
		this.security_level = security_level;
	}

	/**
	 * <pre>
	 * Security Level of SNMP User. Values: 0: noAuthNoPriv, 1: authNoPriv, 2: authPriv
	 * </pre>
	 */
	public Integer get_security_level()
	{
		return this.security_level;
	}

	/**
	 * <pre>
	 * Authentication Password of SNMP User
	 * </pre>
	 */
	public void set_auth_password(String auth_password)
	{
		this.auth_password = auth_password;
	}

	/**
	 * <pre>
	 * Authentication Password of SNMP User
	 * </pre>
	 */
	public String get_auth_password()
	{
		return this.auth_password;
	}

	/**
	 * <pre>
	 * Privacy Protocol of SNMP User. Values: 0:noValue, 1: DES, 2: AES
	 * </pre>
	 */
	public void set_privacy_protocol(Integer privacy_protocol)
	{
		this.privacy_protocol = privacy_protocol;
	}

	/**
	 * <pre>
	 * Privacy Protocol of SNMP User. Values: 0:noValue, 1: DES, 2: AES
	 * </pre>
	 */
	public Integer get_privacy_protocol()
	{
		return this.privacy_protocol;
	}

	/**
	 * <pre>
	 * Name of SNMP User
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Name of SNMP User
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Privacy Password of SNMP User
	 * </pre>
	 */
	public void set_privacy_password(String privacy_password)
	{
		this.privacy_password = privacy_password;
	}

	/**
	 * <pre>
	 * Privacy Password of SNMP User
	 * </pre>
	 */
	public String get_privacy_password()
	{
		return this.privacy_password;
	}

	/**
	 * <pre>
	 * SNMP View Name attached to the SNMP User
	 * </pre>
	 */
	public void set_view_name(String view_name)
	{
		this.view_name = view_name;
	}

	/**
	 * <pre>
	 * SNMP View Name attached to the SNMP User
	 * </pre>
	 */
	public String get_view_name()
	{
		return this.view_name;
	}

	/**
	 * <pre>
	 * Authentication Protocol of SNMP User. Values: 0:noValue, 1: MD5, 2: SHA1
	 * </pre>
	 */
	public void set_auth_protocol(Integer auth_protocol)
	{
		this.auth_protocol = auth_protocol;
	}

	/**
	 * <pre>
	 * Authentication Protocol of SNMP User. Values: 0:noValue, 1: MD5, 2: SHA1
	 * </pre>
	 */
	public Integer get_auth_protocol()
	{
		return this.auth_protocol;
	}

	/**
	 * <pre>
	 * Security Level of SNMP User in string format.(Only for GET request)
	 * </pre>
	 */
	public void set_security_level_str(String security_level_str)
	{
		this.security_level_str = security_level_str;
	}

	/**
	 * <pre>
	 * Security Level of SNMP User in string format.(Only for GET request)
	 * </pre>
	 */
	public String get_security_level_str()
	{
		return this.security_level_str;
	}

	/**
	 * <pre>
	 * Privacy Protocol of SNMP User in string format.(Only for GET request)
	 * </pre>
	 */
	public void set_privacy_protocol_str(String privacy_protocol_str)
	{
		this.privacy_protocol_str = privacy_protocol_str;
	}

	/**
	 * <pre>
	 * Privacy Protocol of SNMP User in string format.(Only for GET request)
	 * </pre>
	 */
	public String get_privacy_protocol_str()
	{
		return this.privacy_protocol_str;
	}

	/**
	 * <pre>
	 * Authentication Protocol of SNMP User in string format.(Only for GET request)
	 * </pre>
	 */
	public void set_auth_protocol_str(String auth_protocol_str)
	{
		this.auth_protocol_str = auth_protocol_str;
	}

	/**
	 * <pre>
	 * Authentication Protocol of SNMP User in string format.(Only for GET request)
	 * </pre>
	 */
	public String get_auth_protocol_str()
	{
		return this.auth_protocol_str;
	}


	/**
	 * <pre>
	 * Use this operation to add SNMP User.
	 * </pre>
	 */
	public static snmp_user add(nitro_service client, snmp_user resource) throws Exception
	{
		resource.validate("add");
		return ((snmp_user[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add SNMP User in bulk.
	 * </pre>
	 */
	public static snmp_user[] add(nitro_service client, snmp_user[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((snmp_user[]) resources[0].perform_operation(client, "add"));
		
		return ((snmp_user[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete SNMP User.
	 * </pre>
	 */
	public static snmp_user delete(nitro_service client, snmp_user resource) throws Exception
	{
		resource.validate("delete");
		return ((snmp_user[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete SNMP User in bulk.
	 * </pre>
	 */
	public static snmp_user[] delete(nitro_service client, snmp_user[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((snmp_user[]) resources[0].delete_resource(client));
		
		return ((snmp_user[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get SNMP User details.
	 * </pre>
	 */
	public static snmp_user[] get(nitro_service client) throws Exception
	{
		snmp_user resource = new snmp_user();
		resource.validate("get");
		return (snmp_user[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get SNMP User details.
	 */
	public static snmp_user get(nitro_service client, snmp_user resource) throws Exception
	{
		resource.validate("get");
		return ((snmp_user[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get SNMP User details in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify SNMP User.
	 * </pre>
	 */
	public static snmp_user update(nitro_service client, snmp_user resource) throws Exception
	{
		resource.validate("modify");
		return ((snmp_user[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify SNMP User in bulk.
	 * </pre>
	 */
	public static snmp_user[] update(nitro_service client, snmp_user[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((snmp_user[]) resources[0].update_resource(client));
		
		return ((snmp_user[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of snmp_user resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static snmp_user[] get_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_user obj = new snmp_user();
		options option = new options();
		option.set_filter(filter);
		snmp_user[] response = (snmp_user[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmp_user resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmp_user[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_user obj = new snmp_user();
		options option = new options();
		option.set_filter(filter);
		snmp_user[] response = (snmp_user[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmp_user resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		snmp_user obj = new snmp_user();
		options option = new options();
		option.set_count(true);
		snmp_user[] response = (snmp_user[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_user resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_user obj = new snmp_user();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_user[] response = (snmp_user[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_user resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_user obj = new snmp_user();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_user[] response = (snmp_user[])obj.get_resources(service, option);
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
		snmp_user_response result = (snmp_user_response) service.get_payload_formatter().string_to_resource(snmp_user_response.class, response);
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
		return result.snmp_user;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		snmp_user_responses result = (snmp_user_responses) service.get_payload_formatter().string_to_resource(snmp_user_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.snmp_user_response_array);
		}
		snmp_user[] result_snmp_user = new snmp_user[result.snmp_user_response_array.length];
		
		for(int i = 0; i < result.snmp_user_response_array.length; i++)
		{
			result_snmp_user[i] = result.snmp_user_response_array[i].snmp_user[0];
		}
		
		return result_snmp_user;
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
		
		MPSInt security_level_validator = new MPSInt();
		security_level_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		security_level_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 2);
		security_level_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		security_level_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		security_level_validator.validate(operationType, security_level, "\"security_level\"");
		
		MPSInt auth_protocol_validator = new MPSInt();
		auth_protocol_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		auth_protocol_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 2);
		auth_protocol_validator.validate(operationType, auth_protocol, "\"auth_protocol\"");
		
		MPSString auth_password_validator = new MPSString();
		auth_password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		auth_password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 8);
		auth_password_validator.validate(operationType, auth_password, "\"auth_password\"");
		
		MPSInt privacy_protocol_validator = new MPSInt();
		privacy_protocol_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		privacy_protocol_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 2);
		privacy_protocol_validator.validate(operationType, privacy_protocol, "\"privacy_protocol\"");
		
		MPSString privacy_password_validator = new MPSString();
		privacy_password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		privacy_password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 8);
		privacy_password_validator.validate(operationType, privacy_password, "\"privacy_password\"");
		
		MPSString view_name_validator = new MPSString();
		view_name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		view_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		view_name_validator.validate(operationType, view_name, "\"view_name\"");
		
		MPSString security_level_str_validator = new MPSString();
		security_level_str_validator.validate(operationType, security_level_str, "\"security_level_str\"");
		
		MPSString auth_protocol_str_validator = new MPSString();
		auth_protocol_str_validator.validate(operationType, auth_protocol_str, "\"auth_protocol_str\"");
		
		MPSString privacy_protocol_str_validator = new MPSString();
		privacy_protocol_str_validator.validate(operationType, privacy_protocol_str, "\"privacy_protocol_str\"");
		
	}
}
