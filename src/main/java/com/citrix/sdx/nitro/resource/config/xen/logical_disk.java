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

package com.citrix.sdx.nitro.resource.config.xen;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

class logical_disk_response extends base_response
{
	public logical_disk[] logical_disk;
}

class logical_disk_responses extends base_response
{
	public logical_disk_response[] logical_disk_response_array;
}

/**
 * Configuration for Raid Logical Drive resource
 */

public class logical_disk extends base_resource
{
	private Integer virtualdrive;
	private String name;
	private String state;
	private String size;
	private Integer adapter_id;
	private String drives;
	private String host_ip_address;
	private String id;
	private Integer targetid;
	private String physical_disk_slot_2;
	private String physical_disk_slot_1;
	private Long __count;

	protected String get_object_type()
	{
		return "logical_disk";
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
	 * Virtual Drive
	 * </pre>
	 */
	public Integer get_virtualdrive()
	{
		return this.virtualdrive;
	}


	/**
	 * <pre>
	 * Logical Drive Name
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}


	/**
	 * <pre>
	 * State
	 * </pre>
	 */
	public String get_state()
	{
		return this.state;
	}


	/**
	 * <pre>
	 * Logical Drive Size
	 * </pre>
	 */
	public String get_size()
	{
		return this.size;
	}


	/**
	 * <pre>
	 * Adapter ID
	 * </pre>
	 */
	public Integer get_adapter_id()
	{
		return this.adapter_id;
	}


	/**
	 * <pre>
	 * Drives
	 * </pre>
	 */
	public String get_drives()
	{
		return this.drives;
	}

	/**
	 * <pre>
	 * host_ip_address
	 * </pre>
	 */
	public void set_host_ip_address(String host_ip_address)
	{
		this.host_ip_address = host_ip_address;
	}

	/**
	 * <pre>
	 * host_ip_address
	 * </pre>
	 */
	public String get_host_ip_address()
	{
		return this.host_ip_address;
	}

	/**
	 * <pre>
	 * Id is system generated key for all logical drives
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all logical drives
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * Target ID
	 * </pre>
	 */
	public Integer get_targetid()
	{
		return this.targetid;
	}

	/**
	 * <pre>
	 * Second Slot for Raid Logical Drive
	 * </pre>
	 */
	public void set_physical_disk_slot_2(String physical_disk_slot_2)
	{
		this.physical_disk_slot_2 = physical_disk_slot_2;
	}

	/**
	 * <pre>
	 * Second Slot for Raid Logical Drive
	 * </pre>
	 */
	public String get_physical_disk_slot_2()
	{
		return this.physical_disk_slot_2;
	}

	/**
	 * <pre>
	 * First Slot for Raid Logical Drive
	 * </pre>
	 */
	public void set_physical_disk_slot_1(String physical_disk_slot_1)
	{
		this.physical_disk_slot_1 = physical_disk_slot_1;
	}

	/**
	 * <pre>
	 * First Slot for Raid Logical Drive
	 * </pre>
	 */
	public String get_physical_disk_slot_1()
	{
		return this.physical_disk_slot_1;
	}


	/**
	 * <pre>
	 * Use this operation to create logical disk.
	 * </pre>
	 */
	public static logical_disk add(nitro_service client, logical_disk resource) throws Exception
	{
		resource.validate("add");
		return ((logical_disk[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to create logical disk in bulk.
	 * </pre>
	 */
	public static logical_disk[] add(nitro_service client, logical_disk[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((logical_disk[]) resources[0].perform_operation(client, "add"));
		
		return ((logical_disk[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to get logical disks.
	 * </pre>
	 */
	public static logical_disk[] get(nitro_service client) throws Exception
	{
		logical_disk resource = new logical_disk();
		resource.validate("get");
		return (logical_disk[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get logical disks.
	 */
	public static logical_disk get(nitro_service client, logical_disk resource) throws Exception
	{
		resource.validate("get");
		return ((logical_disk[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get logical disks in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of logical_disk resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static logical_disk[] get_filtered(nitro_service service, String filter) throws Exception
	{
		logical_disk obj = new logical_disk();
		options option = new options();
		option.set_filter(filter);
		logical_disk[] response = (logical_disk[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of logical_disk resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static logical_disk[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		logical_disk obj = new logical_disk();
		options option = new options();
		option.set_filter(filter);
		logical_disk[] response = (logical_disk[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the logical_disk resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		logical_disk obj = new logical_disk();
		options option = new options();
		option.set_count(true);
		logical_disk[] response = (logical_disk[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of logical_disk resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		logical_disk obj = new logical_disk();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		logical_disk[] response = (logical_disk[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of logical_disk resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		logical_disk obj = new logical_disk();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		logical_disk[] response = (logical_disk[])obj.get_resources(service, option);
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
		logical_disk_response result = (logical_disk_response) service.get_payload_formatter().string_to_resource(logical_disk_response.class, response);
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
		return result.logical_disk;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		logical_disk_responses result = (logical_disk_responses) service.get_payload_formatter().string_to_resource(logical_disk_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.logical_disk_response_array);
		}
		logical_disk[] result_logical_disk = new logical_disk[result.logical_disk_response_array.length];
		
		for(int i = 0; i < result.logical_disk_response_array.length; i++)
		{
			result_logical_disk[i] = result.logical_disk_response_array[i].logical_disk[0];
		}
		
		return result_logical_disk;
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
		
		MPSInt adapter_id_validator = new MPSInt();
		adapter_id_validator.validate(operationType, adapter_id, "\"adapter_id\"");
		
		MPSInt virtualdrive_validator = new MPSInt();
		virtualdrive_validator.validate(operationType, virtualdrive, "\"virtualdrive\"");
		
		MPSInt targetid_validator = new MPSInt();
		targetid_validator.validate(operationType, targetid, "\"targetid\"");
		
		MPSString name_validator = new MPSString();
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSString size_validator = new MPSString();
		size_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		size_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		size_validator.validate(operationType, size, "\"size\"");
		
		MPSString state_validator = new MPSString();
		state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		state_validator.validate(operationType, state, "\"state\"");
		
		MPSString drives_validator = new MPSString();
		drives_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		drives_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		drives_validator.validate(operationType, drives, "\"drives\"");
		
		MPSIPAddress host_ip_address_validator = new MPSIPAddress();
		host_ip_address_validator.validate(operationType, host_ip_address, "\"host_ip_address\"");
		
		MPSString physical_disk_slot_1_validator = new MPSString();
		physical_disk_slot_1_validator.validate(operationType, physical_disk_slot_1, "\"physical_disk_slot_1\"");
		
		MPSString physical_disk_slot_2_validator = new MPSString();
		physical_disk_slot_2_validator.validate(operationType, physical_disk_slot_2, "\"physical_disk_slot_2\"");
		
	}
}
