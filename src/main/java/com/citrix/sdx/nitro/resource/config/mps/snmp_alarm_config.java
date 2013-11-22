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


class snmp_alarm_config_response extends base_response
{
	public snmp_alarm_config[] snmp_alarm_config;
}

class snmp_alarm_config_responses extends base_response
{
	public snmp_alarm_config_response[] snmp_alarm_config_response_array;
}

/**
 * Configuration for SNMP Alarm Configurations resource
 */

public class snmp_alarm_config extends base_resource
{
	private Boolean enable;
	private String name;
	private String severity;
	private Long __count;

	protected String get_object_type()
	{
		return "snmp_alarm_config";
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
	 * Enable Alarm
	 * </pre>
	 */
	public void set_enable(Boolean enable)
	{
		this.enable = enable;
	}

	/**
	 * <pre>
	 * Enable Alarm
	 * </pre>
	 */
	public Boolean get_enable()
	{
		return this.enable;
	}

	/**
	 * <pre>
	 * Alarm Name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Alarm Name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Alarm severity. Supported values: Critical, Major, Minor, Warning, Informational 
	 * </pre>
	 */
	public void set_severity(String severity)
	{
		this.severity = severity;
	}

	/**
	 * <pre>
	 * Alarm severity. Supported values: Critical, Major, Minor, Warning, Informational 
	 * </pre>
	 */
	public String get_severity()
	{
		return this.severity;
	}


	/**
	 * <pre>
	 * Use this operation to get snmp alarm configuration.
	 * </pre>
	 */
	public static snmp_alarm_config[] get(nitro_service client) throws Exception
	{
		snmp_alarm_config resource = new snmp_alarm_config();
		resource.validate("get");
		return (snmp_alarm_config[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get snmp alarm configuration.
	 */
	public static snmp_alarm_config get(nitro_service client, snmp_alarm_config resource) throws Exception
	{
		resource.validate("get");
		return ((snmp_alarm_config[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get snmp alarm configuration in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify snmp alarm configuration.
	 * </pre>
	 */
	public static snmp_alarm_config update(nitro_service client, snmp_alarm_config resource) throws Exception
	{
		resource.validate("modify");
		return ((snmp_alarm_config[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify snmp alarm configuration in bulk.
	 * </pre>
	 */
	public static snmp_alarm_config[] update(nitro_service client, snmp_alarm_config[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((snmp_alarm_config[]) resources[0].update_resource(client));
		
		return ((snmp_alarm_config[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of snmp_alarm_config resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static snmp_alarm_config[] get_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_alarm_config obj = new snmp_alarm_config();
		options option = new options();
		option.set_filter(filter);
		snmp_alarm_config[] response = (snmp_alarm_config[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmp_alarm_config resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmp_alarm_config[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_alarm_config obj = new snmp_alarm_config();
		options option = new options();
		option.set_filter(filter);
		snmp_alarm_config[] response = (snmp_alarm_config[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmp_alarm_config resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		snmp_alarm_config obj = new snmp_alarm_config();
		options option = new options();
		option.set_count(true);
		snmp_alarm_config[] response = (snmp_alarm_config[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_alarm_config resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		snmp_alarm_config obj = new snmp_alarm_config();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_alarm_config[] response = (snmp_alarm_config[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmp_alarm_config resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		snmp_alarm_config obj = new snmp_alarm_config();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmp_alarm_config[] response = (snmp_alarm_config[])obj.get_resources(service, option);
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
		snmp_alarm_config_response result = (snmp_alarm_config_response) service.get_payload_formatter().string_to_resource(snmp_alarm_config_response.class, response);
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
		return result.snmp_alarm_config;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		snmp_alarm_config_responses result = (snmp_alarm_config_responses) service.get_payload_formatter().string_to_resource(snmp_alarm_config_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.snmp_alarm_config_response_array);
		}
		snmp_alarm_config[] result_snmp_alarm_config = new snmp_alarm_config[result.snmp_alarm_config_response_array.length];
		
		for(int i = 0; i < result.snmp_alarm_config_response_array.length; i++)
		{
			result_snmp_alarm_config[i] = result.snmp_alarm_config_response_array[i].snmp_alarm_config[0];
		}
		
		return result_snmp_alarm_config;
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
		name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSBoolean enable_validator = new MPSBoolean();
		enable_validator.validate(operationType, enable, "\"enable\"");
		
		MPSString severity_validator = new MPSString();
		severity_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		severity_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		severity_validator.validate(operationType, severity, "\"severity\"");
		
	}
}
