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

package com.citrix.sdx.nitro.resource.config.ns;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;


class ns_snmp_config_response extends base_response
{
	public ns_snmp_config[] ns_snmp_config;
}

class ns_snmp_config_responses extends base_response
{
	public ns_snmp_config_response[] ns_snmp_config_response_array;
}

/**
 * Configuration for SNMP configuration resource
 */

public class ns_snmp_config extends base_resource
{
	private Boolean save_config;
	private String snmpauthprotocol;
	private String snmpsecurityname;
	private String snmpprivprotocol;
	private String[] ns_ip_address_arr;
	private String snmpsecuritylevel;
	private String snmpcommunity;
	private String snmpprivpassword;
	private String snmpversion;
	private String snmpauthpassword;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_snmp_config";
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
	 * true, if save config is required
	 * </pre>
	 */
	public void set_save_config(Boolean save_config)
	{
		this.save_config = save_config;
	}

	/**
	 * <pre>
	 * true, if save config is required
	 * </pre>
	 */
	public Boolean get_save_config()
	{
		return this.save_config;
	}

	/**
	 * <pre>
	 * SNMP v3 auth protocol
	 * </pre>
	 */
	public void set_snmpauthprotocol(String snmpauthprotocol)
	{
		this.snmpauthprotocol = snmpauthprotocol;
	}

	/**
	 * <pre>
	 * SNMP v3 auth protocol
	 * </pre>
	 */
	public String get_snmpauthprotocol()
	{
		return this.snmpauthprotocol;
	}

	/**
	 * <pre>
	 * SNMP v3 security name
	 * </pre>
	 */
	public void set_snmpsecurityname(String snmpsecurityname)
	{
		this.snmpsecurityname = snmpsecurityname;
	}

	/**
	 * <pre>
	 * SNMP v3 security name
	 * </pre>
	 */
	public String get_snmpsecurityname()
	{
		return this.snmpsecurityname;
	}

	/**
	 * <pre>
	 * SNMP v3 priv protocol
	 * </pre>
	 */
	public void set_snmpprivprotocol(String snmpprivprotocol)
	{
		this.snmpprivprotocol = snmpprivprotocol;
	}

	/**
	 * <pre>
	 * SNMP v3 priv protocol
	 * </pre>
	 */
	public String get_snmpprivprotocol()
	{
		return this.snmpprivprotocol;
	}

	/**
	 * <pre>
	 * List of NS IP Address
	 * </pre>
	 */
	public void set_ns_ip_address_arr(String[] ns_ip_address_arr)
	{
		this.ns_ip_address_arr = ns_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of NS IP Address
	 * </pre>
	 */
	public String[] get_ns_ip_address_arr()
	{
		return this.ns_ip_address_arr;
	}

	/**
	 * <pre>
	 * SNMP v3 security level
	 * </pre>
	 */
	public void set_snmpsecuritylevel(String snmpsecuritylevel)
	{
		this.snmpsecuritylevel = snmpsecuritylevel;
	}

	/**
	 * <pre>
	 * SNMP v3 security level
	 * </pre>
	 */
	public String get_snmpsecuritylevel()
	{
		return this.snmpsecuritylevel;
	}

	/**
	 * <pre>
	 * SNMP community
	 * </pre>
	 */
	public void set_snmpcommunity(String snmpcommunity)
	{
		this.snmpcommunity = snmpcommunity;
	}

	/**
	 * <pre>
	 * SNMP community
	 * </pre>
	 */
	public String get_snmpcommunity()
	{
		return this.snmpcommunity;
	}

	/**
	 * <pre>
	 * SNMP v3 priv password
	 * </pre>
	 */
	public void set_snmpprivpassword(String snmpprivpassword)
	{
		this.snmpprivpassword = snmpprivpassword;
	}

	/**
	 * <pre>
	 * SNMP v3 priv password
	 * </pre>
	 */
	public String get_snmpprivpassword()
	{
		return this.snmpprivpassword;
	}

	/**
	 * <pre>
	 * SNMP version
	 * </pre>
	 */
	public void set_snmpversion(String snmpversion)
	{
		this.snmpversion = snmpversion;
	}

	/**
	 * <pre>
	 * SNMP version
	 * </pre>
	 */
	public String get_snmpversion()
	{
		return this.snmpversion;
	}

	/**
	 * <pre>
	 * SNMP v3 auth password
	 * </pre>
	 */
	public void set_snmpauthpassword(String snmpauthpassword)
	{
		this.snmpauthpassword = snmpauthpassword;
	}

	/**
	 * <pre>
	 * SNMP v3 auth password
	 * </pre>
	 */
	public String get_snmpauthpassword()
	{
		return this.snmpauthpassword;
	}


	/**
	 * <pre>
	 * add ns snmp configuration.
	 * </pre>
	 */
	public static ns_snmp_config add(nitro_service client, ns_snmp_config resource) throws Exception
	{
		resource.validate("add");
		return ((ns_snmp_config[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * add ns snmp configuration in bulk.
	 * </pre>
	 */
	public static ns_snmp_config[] add(nitro_service client, ns_snmp_config[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_snmp_config[]) resources[0].perform_operation(client, "add"));
		
		return ((ns_snmp_config[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		ns_snmp_config_response result = (ns_snmp_config_response) service.get_payload_formatter().string_to_resource(ns_snmp_config_response.class, response);
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
		return result.ns_snmp_config;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_snmp_config_responses result = (ns_snmp_config_responses) service.get_payload_formatter().string_to_resource(ns_snmp_config_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_snmp_config_response_array);
		}
		ns_snmp_config[] result_ns_snmp_config = new ns_snmp_config[result.ns_snmp_config_response_array.length];
		
		for(int i = 0; i < result.ns_snmp_config_response_array.length; i++)
		{
			result_ns_snmp_config[i] = result.ns_snmp_config_response_array[i].ns_snmp_config[0];
		}
		
		return result_ns_snmp_config;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString snmpversion_validator = new MPSString();
		snmpversion_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
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
		
		MPSBoolean save_config_validator = new MPSBoolean();
		save_config_validator.validate(operationType, save_config, "\"save_config\"");
		
		MPSIPAddress ns_ip_address_arr_validator = new MPSIPAddress();
		if(ns_ip_address_arr != null)
		{
			for(int i=0; i<ns_ip_address_arr.length; i++)
			{
				ns_ip_address_arr_validator.validate(operationType, ns_ip_address_arr[i], "ns_ip_address_arr["+i+"]");
			}
		}
		
	}
}
