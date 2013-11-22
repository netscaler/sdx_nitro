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


class system_settings_response extends base_response
{
	public system_settings[] system_settings;
}

class system_settings_responses extends base_response
{
	public system_settings_response[] system_settings_response_array;
}

/**
 * Configuration for System Settings resource
 */

public class system_settings extends base_resource
{
	private String svm_ns_comm;
	private Boolean secure_access_only;
	private Integer init_status;
	private Boolean vm_auto_poweron;
	private String ns_br_interface;
	private String id;
	private String ns_br_interface_2;
	private Long __count;

	protected String get_object_type()
	{
		return "system_settings";
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
	 * Management Service to NetScaler Communication
	 * </pre>
	 */
	public void set_svm_ns_comm(String svm_ns_comm)
	{
		this.svm_ns_comm = svm_ns_comm;
	}

	/**
	 * <pre>
	 * Management Service to NetScaler Communication
	 * </pre>
	 */
	public String get_svm_ns_comm()
	{
		return this.svm_ns_comm;
	}

	/**
	 * <pre>
	 * Secure Access only
	 * </pre>
	 */
	public void set_secure_access_only(Boolean secure_access_only)
	{
		this.secure_access_only = secure_access_only;
	}

	/**
	 * <pre>
	 * Secure Access only
	 * </pre>
	 */
	public Boolean get_secure_access_only()
	{
		return this.secure_access_only;
	}

	/**
	 * <pre>
	 * System initialize status
	 * </pre>
	 */
	public void set_init_status(Integer init_status)
	{
		this.init_status = init_status;
	}

	/**
	 * <pre>
	 * System initialize status
	 * </pre>
	 */
	public Integer get_init_status()
	{
		return this.init_status;
	}

	/**
	 * <pre>
	 * Auto Power On
	 * </pre>
	 */
	public void set_vm_auto_poweron(Boolean vm_auto_poweron)
	{
		this.vm_auto_poweron = vm_auto_poweron;
	}

	/**
	 * <pre>
	 * Auto Power On
	 * </pre>
	 */
	public Boolean get_vm_auto_poweron()
	{
		return this.vm_auto_poweron;
	}

	/**
	 * <pre>
	 * Load Balancing Interface
	 * </pre>
	 */
	public void set_ns_br_interface(String ns_br_interface)
	{
		this.ns_br_interface = ns_br_interface;
	}

	/**
	 * <pre>
	 * Load Balancing Interface
	 * </pre>
	 */
	public String get_ns_br_interface()
	{
		return this.ns_br_interface;
	}

	/**
	 * <pre>
	 * Id is system generated key
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * Reserved Interface
	 * </pre>
	 */
	public void set_ns_br_interface_2(String ns_br_interface_2)
	{
		this.ns_br_interface_2 = ns_br_interface_2;
	}

	/**
	 * <pre>
	 * Reserved Interface
	 * </pre>
	 */
	public String get_ns_br_interface_2()
	{
		return this.ns_br_interface_2;
	}


	/**
	 * Use this operation to get SDX system settings.
	 */
	public static system_settings get(nitro_service client) throws Exception
	{
		system_settings resource = new system_settings();
		resource.validate("get");
		return ((system_settings[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify SDX system settings.
	 * </pre>
	 */
	public static system_settings update(nitro_service client, system_settings resource) throws Exception
	{
		resource.validate("modify");
		return ((system_settings[]) resource.update_resource(client))[0];
	}

	/**
	* Use this API to fetch filtered set of system_settings resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static system_settings[] get_filtered(nitro_service service, String filter) throws Exception
	{
		system_settings obj = new system_settings();
		options option = new options();
		option.set_filter(filter);
		system_settings[] response = (system_settings[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of system_settings resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static system_settings[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		system_settings obj = new system_settings();
		options option = new options();
		option.set_filter(filter);
		system_settings[] response = (system_settings[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the system_settings resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		system_settings obj = new system_settings();
		options option = new options();
		option.set_count(true);
		system_settings[] response = (system_settings[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of system_settings resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		system_settings obj = new system_settings();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		system_settings[] response = (system_settings[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of system_settings resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		system_settings obj = new system_settings();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		system_settings[] response = (system_settings[])obj.get_resources(service, option);
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
		system_settings_response result = (system_settings_response) service.get_payload_formatter().string_to_resource(system_settings_response.class, response);
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
		return result.system_settings;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		system_settings_responses result = (system_settings_responses) service.get_payload_formatter().string_to_resource(system_settings_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.system_settings_response_array);
		}
		system_settings[] result_system_settings = new system_settings[result.system_settings_response_array.length];
		
		for(int i = 0; i < result.system_settings_response_array.length; i++)
		{
			result_system_settings[i] = result.system_settings_response_array[i].system_settings[0];
		}
		
		return result_system_settings;
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
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSBoolean secure_access_only_validator = new MPSBoolean();
		secure_access_only_validator.validate(operationType, secure_access_only, "\"secure_access_only\"");
		
		MPSString svm_ns_comm_validator = new MPSString();
		svm_ns_comm_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		svm_ns_comm_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		svm_ns_comm_validator.validate(operationType, svm_ns_comm, "\"svm_ns_comm\"");
		
		MPSString ns_br_interface_validator = new MPSString();
		ns_br_interface_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		ns_br_interface_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ns_br_interface_validator.validate(operationType, ns_br_interface, "\"ns_br_interface\"");
		
		MPSBoolean vm_auto_poweron_validator = new MPSBoolean();
		vm_auto_poweron_validator.validate(operationType, vm_auto_poweron, "\"vm_auto_poweron\"");
		
		MPSString ns_br_interface_2_validator = new MPSString();
		ns_br_interface_2_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		ns_br_interface_2_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ns_br_interface_2_validator.validate(operationType, ns_br_interface_2, "\"ns_br_interface_2\"");
		
		MPSInt init_status_validator = new MPSInt();
		init_status_validator.validate(operationType, init_status, "\"init_status\"");
		
	}
}
