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


class event_response extends base_response
{
	public event[] event;
}

class event_responses extends base_response
{
	public event_response[] event_response_array;
}

/**
 * Configuration for Event resource
 */

public class event extends base_resource
{
	private String source;
	private String history;
	private String message;
	private Integer trap_id;
	private String entity;
	private Integer timestamp;
	private String operation_type;
	private String id;
	private String category;
	private String severity;
	private String failureobj;
	private Integer source_event_id;
	private Long __count;

	protected String get_object_type()
	{
		return "event";
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
	 * Source
	 * </pre>
	 */
	public String get_source()
	{
		return this.source;
	}


	/**
	 * <pre>
	 * History of the Event with same entity
	 * </pre>
	 */
	public String get_history()
	{
		return this.history;
	}


	/**
	 * <pre>
	 * Event Message
	 * </pre>
	 */
	public String get_message()
	{
		return this.message;
	}


	/**
	 * <pre>
	 * Last Octet of SNMP Trap OID
	 * </pre>
	 */
	public Integer get_trap_id()
	{
		return this.trap_id;
	}


	/**
	 * <pre>
	 * Entity of Event
	 * </pre>
	 */
	public String get_entity()
	{
		return this.entity;
	}


	/**
	 * <pre>
	 * Event Time
	 * </pre>
	 */
	public Integer get_timestamp()
	{
		return this.timestamp;
	}


	/**
	 * <pre>
	 * Operation Type
	 * </pre>
	 */
	public String get_operation_type()
	{
		return this.operation_type;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the events
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the events
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Category of Event
	 * </pre>
	 */
	public String get_category()
	{
		return this.category;
	}


	/**
	 * <pre>
	 * Severity of Event
	 * </pre>
	 */
	public String get_severity()
	{
		return this.severity;
	}


	/**
	 * <pre>
	 * Failure Object
	 * </pre>
	 */
	public String get_failureobj()
	{
		return this.failureobj;
	}


	/**
	 * <pre>
	 * Internal Event ID used in the source device.
	 * </pre>
	 */
	public Integer get_source_event_id()
	{
		return this.source_event_id;
	}


	/**
	 * <pre>
	 * Use this operation to delete events.
	 * </pre>
	 */
	public static event delete(nitro_service client, event resource) throws Exception
	{
		resource.validate("delete");
		return ((event[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete events in bulk.
	 * </pre>
	 */
	public static event[] delete(nitro_service client, event[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((event[]) resources[0].delete_resource(client));
		
		return ((event[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get events.
	 * </pre>
	 */
	public static event[] get(nitro_service client) throws Exception
	{
		event resource = new event();
		resource.validate("get");
		return (event[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get events.
	 */
	public static event get(nitro_service client, event resource) throws Exception
	{
		resource.validate("get");
		return ((event[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get events in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of event resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static event[] get_filtered(nitro_service service, String filter) throws Exception
	{
		event obj = new event();
		options option = new options();
		option.set_filter(filter);
		event[] response = (event[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of event resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static event[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		event obj = new event();
		options option = new options();
		option.set_filter(filter);
		event[] response = (event[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the event resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		event obj = new event();
		options option = new options();
		option.set_count(true);
		event[] response = (event[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of event resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		event obj = new event();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		event[] response = (event[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of event resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		event obj = new event();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		event[] response = (event[])obj.get_resources(service, option);
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
		event_response result = (event_response) service.get_payload_formatter().string_to_resource(event_response.class, response);
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
		return result.event;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		event_responses result = (event_responses) service.get_payload_formatter().string_to_resource(event_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.event_response_array);
		}
		event[] result_event = new event[result.event_response_array.length];
		
		for(int i = 0; i < result.event_response_array.length; i++)
		{
			result_event[i] = result.event_response_array[i].event[0];
		}
		
		return result_event;
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
		
		MPSString category_validator = new MPSString();
		category_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 1024);
		category_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		category_validator.validate(operationType, category, "\"category\"");
		
		MPSString entity_validator = new MPSString();
		entity_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 1024);
		entity_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		entity_validator.validate(operationType, entity, "\"entity\"");
		
		MPSString severity_validator = new MPSString();
		severity_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		severity_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		severity_validator.validate(operationType, severity, "\"severity\"");
		
		MPSString source_validator = new MPSString();
		source_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		source_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		source_validator.validate(operationType, source, "\"source\"");
		
		MPSString failureobj_validator = new MPSString();
		failureobj_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		failureobj_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		failureobj_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		failureobj_validator.validate(operationType, failureobj, "\"failureobj\"");
		
		MPSInt source_event_id_validator = new MPSInt();
		source_event_id_validator.validate(operationType, source_event_id, "\"source_event_id\"");
		
		MPSInt timestamp_validator = new MPSInt();
		timestamp_validator.validate(operationType, timestamp, "\"timestamp\"");
		
		MPSString message_validator = new MPSString();
		message_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 4096);
		message_validator.validate(operationType, message, "\"message\"");
		
		MPSString operation_type_validator = new MPSString();
		operation_type_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		operation_type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		operation_type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		operation_type_validator.validate(operationType, operation_type, "\"operation_type\"");
		
		MPSInt trap_id_validator = new MPSInt();
		trap_id_validator.validate(operationType, trap_id, "\"trap_id\"");
		
		MPSString history_validator = new MPSString();
		history_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		history_validator.validate(operationType, history, "\"history\"");
		
	}
}
