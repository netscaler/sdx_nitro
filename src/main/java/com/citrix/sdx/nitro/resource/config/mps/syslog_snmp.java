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


class syslog_snmp_response extends base_response
{
	public syslog_snmp[] syslog_snmp;
}

class syslog_snmp_responses extends base_response
{
	public syslog_snmp_response[] syslog_snmp_response_array;
}

/**
 * Configuration for Syslog generic table resource
 */

public class syslog_snmp extends base_resource
{
	private Double priority;
	private String hostname;
	private String authorizationStatus;
	private String configurationCmd;
	private Double timestamp;
	private String id;
	private String commandExecutionStatus;
	private String module;
	private Double sequence_no;
	private String group_name;
	private Boolean decoded;
	private Double datarecord_rx_time;
	private String username;
	private Double exporter_id;
	private String process_name;
	private String syslog_msg;
	private String type;
	private String sysIpAddress;
	private Long __count;

	protected String get_object_type()
	{
		return "syslog_snmp";
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
	 * priority
	 * </pre>
	 */
	public void set_priority(Double priority)
	{
		this.priority = priority;
	}

	/**
	 * <pre>
	 * priority
	 * </pre>
	 */
	public Double get_priority()
	{
		return this.priority;
	}

	/**
	 * <pre>
	 * Host Name.
	 * </pre>
	 */
	public void set_hostname(String hostname)
	{
		this.hostname = hostname;
	}

	/**
	 * <pre>
	 * Host Name.
	 * </pre>
	 */
	public String get_hostname()
	{
		return this.hostname;
	}

	/**
	 * <pre>
	 * Authorization status.
	 * </pre>
	 */
	public void set_authorizationStatus(String authorizationStatus)
	{
		this.authorizationStatus = authorizationStatus;
	}

	/**
	 * <pre>
	 * Authorization status.
	 * </pre>
	 */
	public String get_authorizationStatus()
	{
		return this.authorizationStatus;
	}

	/**
	 * <pre>
	 * Configuration command.
	 * </pre>
	 */
	public void set_configurationCmd(String configurationCmd)
	{
		this.configurationCmd = configurationCmd;
	}

	/**
	 * <pre>
	 * Configuration command.
	 * </pre>
	 */
	public String get_configurationCmd()
	{
		return this.configurationCmd;
	}

	/**
	 * <pre>
	 * timestamp
	 * </pre>
	 */
	public void set_timestamp(Double timestamp)
	{
		this.timestamp = timestamp;
	}

	/**
	 * <pre>
	 * timestamp
	 * </pre>
	 */
	public Double get_timestamp()
	{
		return this.timestamp;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the syslog snmp record.
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the syslog snmp record.
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * Command Execution status.
	 * </pre>
	 */
	public void set_commandExecutionStatus(String commandExecutionStatus)
	{
		this.commandExecutionStatus = commandExecutionStatus;
	}

	/**
	 * <pre>
	 * Command Execution status.
	 * </pre>
	 */
	public String get_commandExecutionStatus()
	{
		return this.commandExecutionStatus;
	}

	/**
	 * <pre>
	 * Module Name.
	 * </pre>
	 */
	public void set_module(String module)
	{
		this.module = module;
	}

	/**
	 * <pre>
	 * Module Name.
	 * </pre>
	 */
	public String get_module()
	{
		return this.module;
	}

	/**
	 * <pre>
	 * Sequence no.
	 * </pre>
	 */
	public void set_sequence_no(Double sequence_no)
	{
		this.sequence_no = sequence_no;
	}

	/**
	 * <pre>
	 * Sequence no.
	 * </pre>
	 */
	public Double get_sequence_no()
	{
		return this.sequence_no;
	}

	/**
	 * <pre>
	 * Group name.
	 * </pre>
	 */
	public void set_group_name(String group_name)
	{
		this.group_name = group_name;
	}

	/**
	 * <pre>
	 * Group name.
	 * </pre>
	 */
	public String get_group_name()
	{
		return this.group_name;
	}

	/**
	 * <pre>
	 * Whether this was decoded.
	 * </pre>
	 */
	public void set_decoded(Boolean decoded)
	{
		this.decoded = decoded;
	}

	/**
	 * <pre>
	 * Whether this was decoded.
	 * </pre>
	 */
	public Boolean get_decoded()
	{
		return this.decoded;
	}

	/**
	 * <pre>
	 * Transaction Time when this was received.
	 * </pre>
	 */
	public void set_datarecord_rx_time(Double datarecord_rx_time)
	{
		this.datarecord_rx_time = datarecord_rx_time;
	}

	/**
	 * <pre>
	 * Transaction Time when this was received.
	 * </pre>
	 */
	public Double get_datarecord_rx_time()
	{
		return this.datarecord_rx_time;
	}

	/**
	 * <pre>
	 * User name.
	 * </pre>
	 */
	public void set_username(String username)
	{
		this.username = username;
	}

	/**
	 * <pre>
	 * User name.
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}

	/**
	 * <pre>
	 * Exporter ID
	 * </pre>
	 */
	public void set_exporter_id(Double exporter_id)
	{
		this.exporter_id = exporter_id;
	}

	/**
	 * <pre>
	 * Exporter ID
	 * </pre>
	 */
	public Double get_exporter_id()
	{
		return this.exporter_id;
	}

	/**
	 * <pre>
	 * Process Name.
	 * </pre>
	 */
	public void set_process_name(String process_name)
	{
		this.process_name = process_name;
	}

	/**
	 * <pre>
	 * Process Name.
	 * </pre>
	 */
	public String get_process_name()
	{
		return this.process_name;
	}

	/**
	 * <pre>
	 * Syslog original Message.
	 * </pre>
	 */
	public void set_syslog_msg(String syslog_msg)
	{
		this.syslog_msg = syslog_msg;
	}

	/**
	 * <pre>
	 * Syslog original Message.
	 * </pre>
	 */
	public String get_syslog_msg()
	{
		return this.syslog_msg;
	}

	/**
	 * <pre>
	 * Type Name.
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * Type Name.
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * Sys IP Address.
	 * </pre>
	 */
	public void set_sysIpAddress(String sysIpAddress)
	{
		this.sysIpAddress = sysIpAddress;
	}

	/**
	 * <pre>
	 * Sys IP Address.
	 * </pre>
	 */
	public String get_sysIpAddress()
	{
		return this.sysIpAddress;
	}


	/**
	 * <pre>
	 * Use this operation to delete snmp syslog message details..
	 * </pre>
	 */
	public static syslog_snmp delete(nitro_service client, syslog_snmp resource) throws Exception
	{
		resource.validate("delete");
		return ((syslog_snmp[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete snmp syslog message details. in bulk.
	 * </pre>
	 */
	public static syslog_snmp[] delete(nitro_service client, syslog_snmp[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((syslog_snmp[]) resources[0].delete_resource(client));
		
		return ((syslog_snmp[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Report for snmp syslog message received by this collector..
	 * </pre>
	 */
	public static syslog_snmp[] get(nitro_service client) throws Exception
	{
		syslog_snmp resource = new syslog_snmp();
		resource.validate("get");
		return (syslog_snmp[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of syslog_snmp resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static syslog_snmp[] get_filtered(nitro_service service, String filter) throws Exception
	{
		syslog_snmp obj = new syslog_snmp();
		options option = new options();
		option.set_filter(filter);
		syslog_snmp[] response = (syslog_snmp[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of syslog_snmp resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static syslog_snmp[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		syslog_snmp obj = new syslog_snmp();
		options option = new options();
		option.set_filter(filter);
		syslog_snmp[] response = (syslog_snmp[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the syslog_snmp resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		syslog_snmp obj = new syslog_snmp();
		options option = new options();
		option.set_count(true);
		syslog_snmp[] response = (syslog_snmp[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of syslog_snmp resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		syslog_snmp obj = new syslog_snmp();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		syslog_snmp[] response = (syslog_snmp[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of syslog_snmp resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		syslog_snmp obj = new syslog_snmp();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		syslog_snmp[] response = (syslog_snmp[])obj.get_resources(service, option);
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
		syslog_snmp_response result = (syslog_snmp_response) service.get_payload_formatter().string_to_resource(syslog_snmp_response.class, response);
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
		return result.syslog_snmp;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		syslog_snmp_responses result = (syslog_snmp_responses) service.get_payload_formatter().string_to_resource(syslog_snmp_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.syslog_snmp_response_array);
		}
		syslog_snmp[] result_syslog_snmp = new syslog_snmp[result.syslog_snmp_response_array.length];
		
		for(int i = 0; i < result.syslog_snmp_response_array.length; i++)
		{
			result_syslog_snmp[i] = result.syslog_snmp_response_array[i].syslog_snmp[0];
		}
		
		return result_syslog_snmp;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSLong exporter_id_validator = new MPSLong();
		exporter_id_validator.validate(operationType, exporter_id, "\"exporter_id\"");
		
		MPSLong priority_validator = new MPSLong();
		priority_validator.validate(operationType, priority, "\"priority\"");
		
		MPSLong timestamp_validator = new MPSLong();
		timestamp_validator.validate(operationType, timestamp, "\"timestamp\"");
		
		MPSString hostname_validator = new MPSString();
		hostname_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		hostname_validator.validate(operationType, hostname, "\"hostname\"");
		
		MPSString process_name_validator = new MPSString();
		process_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		process_name_validator.validate(operationType, process_name, "\"process_name\"");
		
		MPSString module_validator = new MPSString();
		module_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		module_validator.validate(operationType, module, "\"module\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSString syslog_msg_validator = new MPSString();
		syslog_msg_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 2000);
		syslog_msg_validator.validate(operationType, syslog_msg, "\"syslog_msg\"");
		
		MPSLong sequence_no_validator = new MPSLong();
		sequence_no_validator.validate(operationType, sequence_no, "\"sequence_no\"");
		
		MPSLong datarecord_rx_time_validator = new MPSLong();
		datarecord_rx_time_validator.validate(operationType, datarecord_rx_time, "\"datarecord_rx_time\"");
		
		MPSBoolean decoded_validator = new MPSBoolean();
		decoded_validator.validate(operationType, decoded, "\"decoded\"");
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSString group_name_validator = new MPSString();
		group_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		group_name_validator.validate(operationType, group_name, "\"group_name\"");
		
		MPSString authorizationStatus_validator = new MPSString();
		authorizationStatus_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		authorizationStatus_validator.validate(operationType, authorizationStatus, "\"authorizationStatus\"");
		
		MPSString commandExecutionStatus_validator = new MPSString();
		commandExecutionStatus_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		commandExecutionStatus_validator.validate(operationType, commandExecutionStatus, "\"commandExecutionStatus\"");
		
		MPSString sysIpAddress_validator = new MPSString();
		sysIpAddress_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		sysIpAddress_validator.validate(operationType, sysIpAddress, "\"sysIpAddress\"");
		
		MPSString configurationCmd_validator = new MPSString();
		configurationCmd_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 2000);
		configurationCmd_validator.validate(operationType, configurationCmd, "\"configurationCmd\"");
		
		MPSString id_validator = new MPSString();
		id_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		id_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		id_validator.validate(operationType, id, "\"id\"");
		
	}
}
