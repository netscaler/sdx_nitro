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

package com.citrix.sdx.nitro.resource.config.br_broker;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class br_broker_snmpmanager_response extends base_response
{
	public br_broker_snmpmanager[] br_broker_snmpmanager;
}

class br_broker_snmpmanager_responses extends base_response
{
	public br_broker_snmpmanager_response[] br_broker_snmpmanager_response_array;
}

/**
 * Configuration for Add SNMP Manager resource
 */

public class br_broker_snmpmanager extends base_resource
{
	private String community;
	private String netmask;
	private String manager_ip;
	private String[] br_broker_ip_address_arr;
	private Long __count;

	protected String get_object_type()
	{
		return "br_broker_snmpmanager";
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
	 * SNMP Community
	 * </pre>
	 */
	public void set_community(String community)
	{
		this.community = community;
	}

	/**
	 * <pre>
	 * SNMP Community
	 * </pre>
	 */
	public String get_community()
	{
		return this.community;
	}

	/**
	 * <pre>
	 * SNMP Manager Netmask
	 * </pre>
	 */
	public void set_netmask(String netmask)
	{
		this.netmask = netmask;
	}

	/**
	 * <pre>
	 * SNMP Manager Netmask
	 * </pre>
	 */
	public String get_netmask()
	{
		return this.netmask;
	}

	/**
	 * <pre>
	 * SNMP Manager IP
	 * </pre>
	 */
	public void set_manager_ip(String manager_ip)
	{
		this.manager_ip = manager_ip;
	}

	/**
	 * <pre>
	 * SNMP Manager IP
	 * </pre>
	 */
	public String get_manager_ip()
	{
		return this.manager_ip;
	}

	/**
	 * <pre>
	 * List of BR IP Address
	 * </pre>
	 */
	public void set_br_broker_ip_address_arr(String[] br_broker_ip_address_arr)
	{
		this.br_broker_ip_address_arr = br_broker_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of BR IP Address
	 * </pre>
	 */
	public String[] get_br_broker_ip_address_arr()
	{
		return this.br_broker_ip_address_arr;
	}


	/**
	 * <pre>
	 * Use this operation to add snmp manager to Repeater.
	 * </pre>
	 */
	public static br_broker_snmpmanager addmanager(nitro_service client, br_broker_snmpmanager resource) throws Exception
	{
		return ((br_broker_snmpmanager[]) resource.perform_operation(client, "addmanager"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add snmp manager to Repeater in bulk.
	 * </pre>
	 */
	public static br_broker_snmpmanager[] addmanager(nitro_service client, br_broker_snmpmanager[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((br_broker_snmpmanager[]) resources[0].perform_operation(client, "addmanager"));
		
		return ((br_broker_snmpmanager[]) perform_operation_bulk_request(client, resources, "addmanager"));
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		br_broker_snmpmanager_response result = (br_broker_snmpmanager_response) service.get_payload_formatter().string_to_resource(br_broker_snmpmanager_response.class, response);
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
		return result.br_broker_snmpmanager;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		br_broker_snmpmanager_responses result = (br_broker_snmpmanager_responses) service.get_payload_formatter().string_to_resource(br_broker_snmpmanager_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.br_broker_snmpmanager_response_array);
		}
		br_broker_snmpmanager[] result_br_broker_snmpmanager = new br_broker_snmpmanager[result.br_broker_snmpmanager_response_array.length];
		
		for(int i = 0; i < result.br_broker_snmpmanager_response_array.length; i++)
		{
			result_br_broker_snmpmanager[i] = result.br_broker_snmpmanager_response_array[i].br_broker_snmpmanager[0];
		}
		
		return result_br_broker_snmpmanager;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString manager_ip_validator = new MPSString();
		manager_ip_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		manager_ip_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		manager_ip_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		manager_ip_validator.validate(operationType, manager_ip, "\"manager_ip\"");
		
		MPSString community_validator = new MPSString();
		community_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		community_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		community_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		community_validator.validate(operationType, community, "\"community\"");
		
		MPSString netmask_validator = new MPSString();
		netmask_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		netmask_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 50);
		netmask_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		netmask_validator.validate(operationType, netmask, "\"netmask\"");
		
		MPSIPAddress br_broker_ip_address_arr_validator = new MPSIPAddress();
		br_broker_ip_address_arr_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		if(br_broker_ip_address_arr != null)
		{
			for(int i=0; i<br_broker_ip_address_arr.length; i++)
			{
				br_broker_ip_address_arr_validator.validate(operationType, br_broker_ip_address_arr[i], "br_broker_ip_address_arr["+i+"]");
			}
		}
		
	}
}
