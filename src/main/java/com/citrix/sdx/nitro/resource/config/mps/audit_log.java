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


class audit_log_response extends base_response
{
	public audit_log[] audit_log;
}

class audit_log_responses extends base_response
{
	public audit_log_response[] audit_log_response_array;
}

/**
 * Configuration for Audit Log resource
 */

public class audit_log extends base_resource
{
	private String status;
	private Integer port;
	private String message;
	private String username;
	private Integer audittime;
	private String id;
	private String ip_address;
	private String resource_name;
	private String operation;
	private String resource_type;
	private Long __count;

	protected String get_object_type()
	{
		return "audit_log";
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
	 * Status of this action whether accepted/rejected by system
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
	}


	/**
	 * <pre>
	 * Client port from where operation specified for this entry was performed
	 * </pre>
	 */
	public Integer get_port()
	{
		return this.port;
	}


	/**
	 * <pre>
	 * Message for this action
	 * </pre>
	 */
	public String get_message()
	{
		return this.message;
	}


	/**
	 * <pre>
	 * User Name, who performed operation specified for this entry
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}


	/**
	 * <pre>
	 * Action Time on which operation specified for this entry was started
	 * </pre>
	 */
	public Integer get_audittime()
	{
		return this.audittime;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the audit log entries
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the audit log entries
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Client IP Address from where operation specified for this entry was performed
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}


	/**
	 * <pre>
	 * Resource Name on which operation specified for this entry was performed
	 * </pre>
	 */
	public String get_resource_name()
	{
		return this.resource_name;
	}


	/**
	 * <pre>
	 * Operation Type that is performed
	 * </pre>
	 */
	public String get_operation()
	{
		return this.operation;
	}


	/**
	 * <pre>
	 * Resource Type on which operation specified for this entry was performed 
	 * </pre>
	 */
	public String get_resource_type()
	{
		return this.resource_type;
	}


	/**
	 * <pre>
	 * Use this operation to get audit log message.
	 * </pre>
	 */
	public static audit_log[] get(nitro_service client) throws Exception
	{
		audit_log resource = new audit_log();
		resource.validate("get");
		return (audit_log[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get audit log message.
	 */
	public static audit_log get(nitro_service client, audit_log resource) throws Exception
	{
		resource.validate("get");
		return ((audit_log[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get audit log message in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of audit_log resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static audit_log[] get_filtered(nitro_service service, String filter) throws Exception
	{
		audit_log obj = new audit_log();
		options option = new options();
		option.set_filter(filter);
		audit_log[] response = (audit_log[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of audit_log resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static audit_log[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		audit_log obj = new audit_log();
		options option = new options();
		option.set_filter(filter);
		audit_log[] response = (audit_log[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the audit_log resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		audit_log obj = new audit_log();
		options option = new options();
		option.set_count(true);
		audit_log[] response = (audit_log[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of audit_log resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		audit_log obj = new audit_log();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		audit_log[] response = (audit_log[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of audit_log resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		audit_log obj = new audit_log();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		audit_log[] response = (audit_log[])obj.get_resources(service, option);
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
		audit_log_response result = (audit_log_response) service.get_payload_formatter().string_to_resource(audit_log_response.class, response);
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
		return result.audit_log;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		audit_log_responses result = (audit_log_responses) service.get_payload_formatter().string_to_resource(audit_log_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.audit_log_response_array);
		}
		audit_log[] result_audit_log = new audit_log[result.audit_log_response_array.length];
		
		for(int i = 0; i < result.audit_log_response_array.length; i++)
		{
			result_audit_log[i] = result.audit_log_response_array[i].audit_log[0];
		}
		
		return result_audit_log;
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
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		username_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSInt port_validator = new MPSInt();
		port_validator.validate(operationType, port, "\"port\"");
		
		MPSString resource_type_validator = new MPSString();
		resource_type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		resource_type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		resource_type_validator.validate(operationType, resource_type, "\"resource_type\"");
		
		MPSString resource_name_validator = new MPSString();
		resource_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		resource_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		resource_name_validator.validate(operationType, resource_name, "\"resource_name\"");
		
		MPSInt audittime_validator = new MPSInt();
		audittime_validator.validate(operationType, audittime, "\"audittime\"");
		
		MPSString operation_validator = new MPSString();
		operation_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		operation_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		operation_validator.validate(operationType, operation, "\"operation\"");
		
		MPSString status_validator = new MPSString();
		status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSString message_validator = new MPSString();
		message_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		message_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		message_validator.validate(operationType, message, "\"message\"");
		
	}
}
