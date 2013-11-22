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


class syslog_server_response extends base_response
{
	public syslog_server[] syslog_server;
}

class syslog_server_responses extends base_response
{
	public syslog_server_response[] syslog_server_response_array;
}

/**
 * Configuration for Syslog Server resource
 */

public class syslog_server extends base_resource
{
	private Boolean log_level_all;
	private Boolean log_level_alert;
	private String name;
	private Boolean log_level_debug;
	private Boolean log_level_warning;
	private Boolean log_level_error;
	private Integer port;
	private String log_levels;
	private Boolean log_level_info;
	private Boolean log_level_notice;
	private Boolean log_level_critical;
	private String ip_address;
	private Boolean log_level_none;
	private Boolean log_level_emergency;
	private Long __count;

	protected String get_object_type()
	{
		return "syslog_server";
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
	 * Send logs of all levels to this syslog server
	 * </pre>
	 */
	public void set_log_level_all(Boolean log_level_all)
	{
		this.log_level_all = log_level_all;
	}

	/**
	 * <pre>
	 * Send logs of all levels to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_all()
	{
		return this.log_level_all;
	}

	/**
	 * <pre>
	 * Send logs of level alert to this syslog server
	 * </pre>
	 */
	public void set_log_level_alert(Boolean log_level_alert)
	{
		this.log_level_alert = log_level_alert;
	}

	/**
	 * <pre>
	 * Send logs of level alert to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_alert()
	{
		return this.log_level_alert;
	}

	/**
	 * <pre>
	 * Syslog server name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Syslog server name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Send logs of level debug to this syslog server
	 * </pre>
	 */
	public void set_log_level_debug(Boolean log_level_debug)
	{
		this.log_level_debug = log_level_debug;
	}

	/**
	 * <pre>
	 * Send logs of level debug to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_debug()
	{
		return this.log_level_debug;
	}

	/**
	 * <pre>
	 * Send logs of level warning to this syslog server
	 * </pre>
	 */
	public void set_log_level_warning(Boolean log_level_warning)
	{
		this.log_level_warning = log_level_warning;
	}

	/**
	 * <pre>
	 * Send logs of level warning to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_warning()
	{
		return this.log_level_warning;
	}

	/**
	 * <pre>
	 * Send logs of level error to this syslog server
	 * </pre>
	 */
	public void set_log_level_error(Boolean log_level_error)
	{
		this.log_level_error = log_level_error;
	}

	/**
	 * <pre>
	 * Send logs of level error to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_error()
	{
		return this.log_level_error;
	}

	/**
	 * <pre>
	 * Syslog server port
	 * </pre>
	 */
	public void set_port(Integer port)
	{
		this.port = port;
	}

	/**
	 * <pre>
	 * Syslog server port
	 * </pre>
	 */
	public Integer get_port()
	{
		return this.port;
	}


	/**
	 * <pre>
	 * Set of all log levels at which messages are sent to this syslog server
	 * </pre>
	 */
	public String get_log_levels()
	{
		return this.log_levels;
	}

	/**
	 * <pre>
	 * Send logs of level info to this syslog server
	 * </pre>
	 */
	public void set_log_level_info(Boolean log_level_info)
	{
		this.log_level_info = log_level_info;
	}

	/**
	 * <pre>
	 * Send logs of level info to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_info()
	{
		return this.log_level_info;
	}

	/**
	 * <pre>
	 * Send logs of level notice to this syslog server
	 * </pre>
	 */
	public void set_log_level_notice(Boolean log_level_notice)
	{
		this.log_level_notice = log_level_notice;
	}

	/**
	 * <pre>
	 * Send logs of level notice to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_notice()
	{
		return this.log_level_notice;
	}

	/**
	 * <pre>
	 * Send logs of level critical to this syslog server
	 * </pre>
	 */
	public void set_log_level_critical(Boolean log_level_critical)
	{
		this.log_level_critical = log_level_critical;
	}

	/**
	 * <pre>
	 * Send logs of level critical to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_critical()
	{
		return this.log_level_critical;
	}

	/**
	 * <pre>
	 * Syslog server IP address
	 * </pre>
	 */
	public void set_ip_address(String ip_address)
	{
		this.ip_address = ip_address;
	}

	/**
	 * <pre>
	 * Syslog server IP address
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}

	/**
	 * <pre>
	 * Send no logs to this syslog server
	 * </pre>
	 */
	public void set_log_level_none(Boolean log_level_none)
	{
		this.log_level_none = log_level_none;
	}

	/**
	 * <pre>
	 * Send no logs to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_none()
	{
		return this.log_level_none;
	}

	/**
	 * <pre>
	 * Send logs of level emergency to this syslog server
	 * </pre>
	 */
	public void set_log_level_emergency(Boolean log_level_emergency)
	{
		this.log_level_emergency = log_level_emergency;
	}

	/**
	 * <pre>
	 * Send logs of level emergency to this syslog server
	 * </pre>
	 */
	public Boolean get_log_level_emergency()
	{
		return this.log_level_emergency;
	}


	/**
	 * <pre>
	 * Use this operation to add a syslog server.
	 * </pre>
	 */
	public static syslog_server add(nitro_service client, syslog_server resource) throws Exception
	{
		resource.validate("add");
		return ((syslog_server[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add a syslog server in bulk.
	 * </pre>
	 */
	public static syslog_server[] add(nitro_service client, syslog_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((syslog_server[]) resources[0].perform_operation(client, "add"));
		
		return ((syslog_server[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete a syslog server.
	 * </pre>
	 */
	public static syslog_server delete(nitro_service client, syslog_server resource) throws Exception
	{
		resource.validate("delete");
		return ((syslog_server[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete a syslog server in bulk.
	 * </pre>
	 */
	public static syslog_server[] delete(nitro_service client, syslog_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((syslog_server[]) resources[0].delete_resource(client));
		
		return ((syslog_server[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get all the syslog servers.
	 * </pre>
	 */
	public static syslog_server[] get(nitro_service client) throws Exception
	{
		syslog_server resource = new syslog_server();
		resource.validate("get");
		return (syslog_server[]) resource.get_resources(client);
	}

	/**
	 * <pre>
	 * Use this operation to modify a syslog server.
	 * </pre>
	 */
	public static syslog_server modify(nitro_service client, syslog_server resource) throws Exception
	{
		resource.validate("modify");
		return ((syslog_server[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify a syslog server in bulk.
	 * </pre>
	 */
	public static syslog_server[] modify(nitro_service client, syslog_server[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((syslog_server[]) resources[0].update_resource(client));
		
		return ((syslog_server[]) update_bulk_request(client, resources));
	}

	/**
	* Use this API to fetch filtered set of syslog_server resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static syslog_server[] get_filtered(nitro_service service, String filter) throws Exception
	{
		syslog_server obj = new syslog_server();
		options option = new options();
		option.set_filter(filter);
		syslog_server[] response = (syslog_server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of syslog_server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static syslog_server[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		syslog_server obj = new syslog_server();
		options option = new options();
		option.set_filter(filter);
		syslog_server[] response = (syslog_server[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the syslog_server resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		syslog_server obj = new syslog_server();
		options option = new options();
		option.set_count(true);
		syslog_server[] response = (syslog_server[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of syslog_server resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		syslog_server obj = new syslog_server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		syslog_server[] response = (syslog_server[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of syslog_server resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		syslog_server obj = new syslog_server();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		syslog_server[] response = (syslog_server[])obj.get_resources(service, option);
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
		syslog_server_response result = (syslog_server_response) service.get_payload_formatter().string_to_resource(syslog_server_response.class, response);
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
		return result.syslog_server;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		syslog_server_responses result = (syslog_server_responses) service.get_payload_formatter().string_to_resource(syslog_server_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.syslog_server_response_array);
		}
		syslog_server[] result_syslog_server = new syslog_server[result.syslog_server_response_array.length];
		
		for(int i = 0; i < result.syslog_server_response_array.length; i++)
		{
			result_syslog_server[i] = result.syslog_server_response_array[i].syslog_server[0];
		}
		
		return result_syslog_server;
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
		name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[a-zA-Z0-9_#.:@=-]+");
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSInt port_validator = new MPSInt();
		port_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 65535);
		port_validator.validate(operationType, port, "\"port\"");
		
		MPSBoolean log_level_all_validator = new MPSBoolean();
		log_level_all_validator.validate(operationType, log_level_all, "\"log_level_all\"");
		
		MPSBoolean log_level_none_validator = new MPSBoolean();
		log_level_none_validator.validate(operationType, log_level_none, "\"log_level_none\"");
		
		MPSBoolean log_level_emergency_validator = new MPSBoolean();
		log_level_emergency_validator.validate(operationType, log_level_emergency, "\"log_level_emergency\"");
		
		MPSBoolean log_level_alert_validator = new MPSBoolean();
		log_level_alert_validator.validate(operationType, log_level_alert, "\"log_level_alert\"");
		
		MPSBoolean log_level_critical_validator = new MPSBoolean();
		log_level_critical_validator.validate(operationType, log_level_critical, "\"log_level_critical\"");
		
		MPSBoolean log_level_error_validator = new MPSBoolean();
		log_level_error_validator.validate(operationType, log_level_error, "\"log_level_error\"");
		
		MPSBoolean log_level_warning_validator = new MPSBoolean();
		log_level_warning_validator.validate(operationType, log_level_warning, "\"log_level_warning\"");
		
		MPSBoolean log_level_notice_validator = new MPSBoolean();
		log_level_notice_validator.validate(operationType, log_level_notice, "\"log_level_notice\"");
		
		MPSBoolean log_level_info_validator = new MPSBoolean();
		log_level_info_validator.validate(operationType, log_level_info, "\"log_level_info\"");
		
		MPSBoolean log_level_debug_validator = new MPSBoolean();
		log_level_debug_validator.validate(operationType, log_level_debug, "\"log_level_debug\"");
		
		MPSString log_levels_validator = new MPSString();
		log_levels_validator.validate(operationType, log_levels, "\"log_levels\"");
		
	}
}
