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


class vm_template_response extends base_response
{
	public vm_template[] vm_template;
}

class vm_template_responses extends base_response
{
	public vm_template_response[] vm_template_response_array;
}

/**
 * Configuration for VM Template resource
 */

public class vm_template extends base_resource
{
	private String device_family;
	private String name;
	private String description;
	private String uuid;
	private String id;
	private String type;
	private Long __count;

	protected String get_object_type()
	{
		return "vm_template";
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
	 * Device family
	 * </pre>
	 */
	public void set_device_family(String device_family)
	{
		this.device_family = device_family;
	}

	/**
	 * <pre>
	 * Device family
	 * </pre>
	 */
	public String get_device_family()
	{
		return this.device_family;
	}

	/**
	 * <pre>
	 * Template Name
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Template Name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}


	/**
	 * <pre>
	 * Description of vm_template
	 * </pre>
	 */
	public String get_description()
	{
		return this.description;
	}


	/**
	 * <pre>
	 * UUID of Template
	 * </pre>
	 */
	public String get_uuid()
	{
		return this.uuid;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the VM Templates
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the VM Templates
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * Type of device, (Xen | NS)
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * Type of device, (Xen | NS)
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}


	/**
	 * <pre>
	 * Use this operation to get VM Template.
	 * </pre>
	 */
	public static vm_template[] get(nitro_service client) throws Exception
	{
		vm_template resource = new vm_template();
		resource.validate("get");
		return (vm_template[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get VM Template.
	 */
	public static vm_template get(nitro_service client, vm_template resource) throws Exception
	{
		resource.validate("get");
		return ((vm_template[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get VM Template in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of vm_template resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static vm_template[] get_filtered(nitro_service service, String filter) throws Exception
	{
		vm_template obj = new vm_template();
		options option = new options();
		option.set_filter(filter);
		vm_template[] response = (vm_template[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vm_template resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vm_template[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		vm_template obj = new vm_template();
		options option = new options();
		option.set_filter(filter);
		vm_template[] response = (vm_template[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vm_template resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		vm_template obj = new vm_template();
		options option = new options();
		option.set_count(true);
		vm_template[] response = (vm_template[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of vm_template resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		vm_template obj = new vm_template();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vm_template[] response = (vm_template[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of vm_template resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		vm_template obj = new vm_template();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vm_template[] response = (vm_template[])obj.get_resources(service, option);
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
		vm_template_response result = (vm_template_response) service.get_payload_formatter().string_to_resource(vm_template_response.class, response);
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
		return result.vm_template;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		vm_template_responses result = (vm_template_responses) service.get_payload_formatter().string_to_resource(vm_template_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.vm_template_response_array);
		}
		vm_template[] result_vm_template = new vm_template[result.vm_template_response_array.length];
		
		for(int i = 0; i < result.vm_template_response_array.length; i++)
		{
			result_vm_template[i] = result.vm_template_response_array[i].vm_template[0];
		}
		
		return result_vm_template;
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
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSString uuid_validator = new MPSString();
		uuid_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		uuid_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		uuid_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		uuid_validator.validate(operationType, uuid, "\"uuid\"");
		
		MPSString name_validator = new MPSString();
		name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSString description_validator = new MPSString();
		description_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		description_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		description_validator.validate(operationType, description, "\"description\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSString device_family_validator = new MPSString();
		device_family_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		device_family_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		device_family_validator.validate(operationType, device_family, "\"device_family\"");
		
	}
}
