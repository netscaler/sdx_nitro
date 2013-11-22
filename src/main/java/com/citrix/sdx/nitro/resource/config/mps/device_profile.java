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


class device_profile_response extends base_response
{
	public device_profile[] device_profile;
}

class device_profile_responses extends base_response
{
	public device_profile_response[] device_profile_response_array;
}

/**
 * Configuration for Device Profile resource
 */

public class device_profile extends base_resource
{
	private Boolean is_default;
	private String name;
	private String type;
	private String id;
	private String snmpauthprotocol;
	private String snmpsecurityname;
	private String snmpprivprotocol;
	private String username;
	private String password;
	private String snmpsecuritylevel;
	private String snmpcommunity;
	private String snmpprivpassword;
	private String snmpversion;
	private String snmpauthpassword;
	private Long __count;

	protected String get_object_type()
	{
		return "device_profile";
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
	 * True, if this profile is system generated and can not be deleted
	 * </pre>
	 */
	public Boolean get_is_default()
	{
		return this.is_default;
	}

	/**
	 * <pre>
	 * Profile Name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Profile Name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Profile Type, This must be with in specified supported profiles (NS / Xen)
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * Profile Type, This must be with in specified supported profiles (NS / Xen)
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the device profiles
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the device profiles
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * SNMP v3 auth protocol for this profile
	 * </pre>
	 */
	public void set_snmpauthprotocol(String snmpauthprotocol)
	{
		this.snmpauthprotocol = snmpauthprotocol;
	}

	/**
	 * <pre>
	 * SNMP v3 auth protocol for this profile
	 * </pre>
	 */
	public String get_snmpauthprotocol()
	{
		return this.snmpauthprotocol;
	}

	/**
	 * <pre>
	 * SNMP v3 security name for this profile
	 * </pre>
	 */
	public void set_snmpsecurityname(String snmpsecurityname)
	{
		this.snmpsecurityname = snmpsecurityname;
	}

	/**
	 * <pre>
	 * SNMP v3 security name for this profile
	 * </pre>
	 */
	public String get_snmpsecurityname()
	{
		return this.snmpsecurityname;
	}

	/**
	 * <pre>
	 * SNMP v3 priv protocol for this profile
	 * </pre>
	 */
	public void set_snmpprivprotocol(String snmpprivprotocol)
	{
		this.snmpprivprotocol = snmpprivprotocol;
	}

	/**
	 * <pre>
	 * SNMP v3 priv protocol for this profile
	 * </pre>
	 */
	public String get_snmpprivprotocol()
	{
		return this.snmpprivprotocol;
	}

	/**
	 * <pre>
	 * User Name for this profile
	 * </pre>
	 */
	public void set_username(String username)
	{
		this.username = username;
	}

	/**
	 * <pre>
	 * User Name for this profile
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}

	/**
	 * <pre>
	 * Password for this profile
	 * </pre>
	 */
	public void set_password(String password)
	{
		this.password = password;
	}

	/**
	 * <pre>
	 * Password for this profile
	 * </pre>
	 */
	public String get_password()
	{
		return this.password;
	}

	/**
	 * <pre>
	 * SNMP v3 security level for this profile
	 * </pre>
	 */
	public void set_snmpsecuritylevel(String snmpsecuritylevel)
	{
		this.snmpsecuritylevel = snmpsecuritylevel;
	}

	/**
	 * <pre>
	 * SNMP v3 security level for this profile
	 * </pre>
	 */
	public String get_snmpsecuritylevel()
	{
		return this.snmpsecuritylevel;
	}

	/**
	 * <pre>
	 * SNMP community for this profile
	 * </pre>
	 */
	public void set_snmpcommunity(String snmpcommunity)
	{
		this.snmpcommunity = snmpcommunity;
	}

	/**
	 * <pre>
	 * SNMP community for this profile
	 * </pre>
	 */
	public String get_snmpcommunity()
	{
		return this.snmpcommunity;
	}

	/**
	 * <pre>
	 * SNMP v3 priv password for this profile
	 * </pre>
	 */
	public void set_snmpprivpassword(String snmpprivpassword)
	{
		this.snmpprivpassword = snmpprivpassword;
	}

	/**
	 * <pre>
	 * SNMP v3 priv password for this profile
	 * </pre>
	 */
	public String get_snmpprivpassword()
	{
		return this.snmpprivpassword;
	}

	/**
	 * <pre>
	 * SNMP version for this profile
	 * </pre>
	 */
	public void set_snmpversion(String snmpversion)
	{
		this.snmpversion = snmpversion;
	}

	/**
	 * <pre>
	 * SNMP version for this profile
	 * </pre>
	 */
	public String get_snmpversion()
	{
		return this.snmpversion;
	}

	/**
	 * <pre>
	 * SNMP v3 auth password for this profile
	 * </pre>
	 */
	public void set_snmpauthpassword(String snmpauthpassword)
	{
		this.snmpauthpassword = snmpauthpassword;
	}

	/**
	 * <pre>
	 * SNMP v3 auth password for this profile
	 * </pre>
	 */
	public String get_snmpauthpassword()
	{
		return this.snmpauthpassword;
	}


	/**
	 * <pre>
	 * Use this operation to add device profile.
	 * </pre>
	 */
	public static device_profile add(nitro_service client, device_profile resource) throws Exception
	{
		resource.validate("add");
		return ((device_profile[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add device profile in bulk.
	 * </pre>
	 */
	public static device_profile[] add(nitro_service client, device_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((device_profile[]) resources[0].perform_operation(client, "add"));
		
		return ((device_profile[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete device profile(s).
	 * </pre>
	 */
	public static device_profile delete(nitro_service client, device_profile resource) throws Exception
	{
		resource.validate("delete");
		return ((device_profile[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete device profile(s) in bulk.
	 * </pre>
	 */
	public static device_profile[] delete(nitro_service client, device_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((device_profile[]) resources[0].delete_resource(client));
		
		return ((device_profile[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get device profiles.
	 * </pre>
	 */
	public static device_profile[] get(nitro_service client) throws Exception
	{
		device_profile resource = new device_profile();
		resource.validate("get");
		return (device_profile[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get device profiles.
	 */
	public static device_profile get(nitro_service client, device_profile resource) throws Exception
	{
		resource.validate("get");
		return ((device_profile[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get device profiles in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify device profile.
	 * </pre>
	 */
	public static device_profile update(nitro_service client, device_profile resource) throws Exception
	{
		resource.validate("modify");
		return ((device_profile[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify device profile in bulk.
	 * </pre>
	 */
	public static device_profile[] update(nitro_service client, device_profile[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((device_profile[]) resources[0].update_resource(client));
		
		return ((device_profile[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of device_profile resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static device_profile[] get_filtered(nitro_service service, String filter) throws Exception
	{
		device_profile obj = new device_profile();
		options option = new options();
		option.set_filter(filter);
		device_profile[] response = (device_profile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of device_profile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static device_profile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		device_profile obj = new device_profile();
		options option = new options();
		option.set_filter(filter);
		device_profile[] response = (device_profile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the device_profile resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		device_profile obj = new device_profile();
		options option = new options();
		option.set_count(true);
		device_profile[] response = (device_profile[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of device_profile resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		device_profile obj = new device_profile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		device_profile[] response = (device_profile[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of device_profile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		device_profile obj = new device_profile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		device_profile[] response = (device_profile[])obj.get_resources(service, option);
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
		device_profile_response result = (device_profile_response) service.get_payload_formatter().string_to_resource(device_profile_response.class, response);
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
		return result.device_profile;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		device_profile_responses result = (device_profile_responses) service.get_payload_formatter().string_to_resource(device_profile_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.device_profile_response_array);
		}
		device_profile[] result_device_profile = new device_profile[result.device_profile_response_array.length];
		
		for(int i = 0; i < result.device_profile_response_array.length; i++)
		{
			result_device_profile[i] = result.device_profile_response_array[i].device_profile[0];
		}
		
		return result_device_profile;
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
		
		MPSString name_validator = new MPSString();
		name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSBoolean is_default_validator = new MPSBoolean();
		is_default_validator.validate(operationType, is_default, "\"is_default\"");
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 127);
		username_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		username_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 127);
		password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		password_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSString snmpversion_validator = new MPSString();
		snmpversion_validator.validate(operationType, snmpversion, "\"snmpversion\"");
		
		MPSString snmpcommunity_validator = new MPSString();
		snmpcommunity_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 31);
		snmpcommunity_validator.validate(operationType, snmpcommunity, "\"snmpcommunity\"");
		
		MPSString snmpsecurityname_validator = new MPSString();
		snmpsecurityname_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 31);
		snmpsecurityname_validator.validate(operationType, snmpsecurityname, "\"snmpsecurityname\"");
		
		MPSString snmpsecuritylevel_validator = new MPSString();
		snmpsecuritylevel_validator.validate(operationType, snmpsecuritylevel, "\"snmpsecuritylevel\"");
		
		MPSString snmpauthprotocol_validator = new MPSString();
		snmpauthprotocol_validator.validate(operationType, snmpauthprotocol, "\"snmpauthprotocol\"");
		
		MPSString snmpauthpassword_validator = new MPSString();
		snmpauthpassword_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 31);
		snmpauthpassword_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 8);
		snmpauthpassword_validator.validate(operationType, snmpauthpassword, "\"snmpauthpassword\"");
		
		MPSString snmpprivprotocol_validator = new MPSString();
		snmpprivprotocol_validator.validate(operationType, snmpprivprotocol, "\"snmpprivprotocol\"");
		
		MPSString snmpprivpassword_validator = new MPSString();
		snmpprivpassword_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 31);
		snmpprivpassword_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 8);
		snmpprivpassword_validator.validate(operationType, snmpprivpassword, "\"snmpprivpassword\"");
		
	}
}
