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

class physical_disk_response extends base_response
{
	public physical_disk[] physical_disk;
}

class physical_disk_responses extends base_response
{
	public physical_disk_response[] physical_disk_response_array;
}

/**
 * Configuration for Raid Physical Drive resource
 */

public class physical_disk extends base_resource
{
	private Integer ld_number;
	private Integer deviceid;
	private String logical_disk_name;
	private String size;
	private String firmwarestate;
	private Integer adapter_id;
	private String mec;
	private Integer disk_index;
	private String host_ip_address;
	private String oec;
	private String id;
	private Integer slot;
	private Integer enclosure;
	private Boolean is_used;
	private String inquiry;
	private String wwn;
	private String foreignstate;
	private String mediatype;
	private Long __count;

	protected String get_object_type()
	{
		return "physical_disk";
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
	 * Logical Drive number
	 * </pre>
	 */
	public Integer get_ld_number()
	{
		return this.ld_number;
	}


	/**
	 * <pre>
	 * Device ID
	 * </pre>
	 */
	public Integer get_deviceid()
	{
		return this.deviceid;
	}

	/**
	 * <pre>
	 * Logical Disk Name
	 * </pre>
	 */
	public void set_logical_disk_name(String logical_disk_name)
	{
		this.logical_disk_name = logical_disk_name;
	}

	/**
	 * <pre>
	 * Logical Disk Name
	 * </pre>
	 */
	public String get_logical_disk_name()
	{
		return this.logical_disk_name;
	}


	/**
	 * <pre>
	 * oec
	 * </pre>
	 */
	public String get_size()
	{
		return this.size;
	}


	/**
	 * <pre>
	 * Firmware State
	 * </pre>
	 */
	public String get_firmwarestate()
	{
		return this.firmwarestate;
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
	 * mec
	 * </pre>
	 */
	public String get_mec()
	{
		return this.mec;
	}


	/**
	 * <pre>
	 * Disk Index
	 * </pre>
	 */
	public Integer get_disk_index()
	{
		return this.disk_index;
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
	 * Drives
	 * </pre>
	 */
	public String get_oec()
	{
		return this.oec;
	}

	/**
	 * <pre>
	 * Id is system generated key for all physical drives
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all physical drives
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * Slot Number
	 * </pre>
	 */
	public void set_slot(Integer slot)
	{
		this.slot = slot;
	}

	/**
	 * <pre>
	 * Slot Number
	 * </pre>
	 */
	public Integer get_slot()
	{
		return this.slot;
	}


	/**
	 * <pre>
	 * Enclosure
	 * </pre>
	 */
	public Integer get_enclosure()
	{
		return this.enclosure;
	}


	/**
	 * <pre>
	 * Is Used
	 * </pre>
	 */
	public Boolean get_is_used()
	{
		return this.is_used;
	}


	/**
	 * <pre>
	 * Inquiry
	 * </pre>
	 */
	public String get_inquiry()
	{
		return this.inquiry;
	}


	/**
	 * <pre>
	 * wwn
	 * </pre>
	 */
	public String get_wwn()
	{
		return this.wwn;
	}


	/**
	 * <pre>
	 * Foreign State
	 * </pre>
	 */
	public String get_foreignstate()
	{
		return this.foreignstate;
	}


	/**
	 * <pre>
	 * Media Type
	 * </pre>
	 */
	public String get_mediatype()
	{
		return this.mediatype;
	}


	/**
	 * <pre>
	 * Use this operation to get physical disks.
	 * </pre>
	 */
	public static physical_disk[] get(nitro_service client) throws Exception
	{
		physical_disk resource = new physical_disk();
		resource.validate("get");
		return (physical_disk[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get physical disks.
	 */
	public static physical_disk get(nitro_service client, physical_disk resource) throws Exception
	{
		resource.validate("get");
		return ((physical_disk[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get physical disks in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of physical_disk resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static physical_disk[] get_filtered(nitro_service service, String filter) throws Exception
	{
		physical_disk obj = new physical_disk();
		options option = new options();
		option.set_filter(filter);
		physical_disk[] response = (physical_disk[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of physical_disk resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static physical_disk[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		physical_disk obj = new physical_disk();
		options option = new options();
		option.set_filter(filter);
		physical_disk[] response = (physical_disk[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the physical_disk resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		physical_disk obj = new physical_disk();
		options option = new options();
		option.set_count(true);
		physical_disk[] response = (physical_disk[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of physical_disk resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		physical_disk obj = new physical_disk();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		physical_disk[] response = (physical_disk[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of physical_disk resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		physical_disk obj = new physical_disk();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		physical_disk[] response = (physical_disk[])obj.get_resources(service, option);
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
		physical_disk_response result = (physical_disk_response) service.get_payload_formatter().string_to_resource(physical_disk_response.class, response);
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
		return result.physical_disk;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		physical_disk_responses result = (physical_disk_responses) service.get_payload_formatter().string_to_resource(physical_disk_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.physical_disk_response_array);
		}
		physical_disk[] result_physical_disk = new physical_disk[result.physical_disk_response_array.length];
		
		for(int i = 0; i < result.physical_disk_response_array.length; i++)
		{
			result_physical_disk[i] = result.physical_disk_response_array[i].physical_disk[0];
		}
		
		return result_physical_disk;
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
		
		MPSInt enclosure_validator = new MPSInt();
		enclosure_validator.validate(operationType, enclosure, "\"enclosure\"");
		
		MPSInt slot_validator = new MPSInt();
		slot_validator.validate(operationType, slot, "\"slot\"");
		
		MPSInt deviceid_validator = new MPSInt();
		deviceid_validator.validate(operationType, deviceid, "\"deviceid\"");
		
		MPSString wwn_validator = new MPSString();
		wwn_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		wwn_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		wwn_validator.validate(operationType, wwn, "\"wwn\"");
		
		MPSString mec_validator = new MPSString();
		mec_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		mec_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		mec_validator.validate(operationType, mec, "\"mec\"");
		
		MPSString oec_validator = new MPSString();
		oec_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		oec_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		oec_validator.validate(operationType, oec, "\"oec\"");
		
		MPSString size_validator = new MPSString();
		size_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		size_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		size_validator.validate(operationType, size, "\"size\"");
		
		MPSString firmwarestate_validator = new MPSString();
		firmwarestate_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		firmwarestate_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		firmwarestate_validator.validate(operationType, firmwarestate, "\"firmwarestate\"");
		
		MPSString foreignstate_validator = new MPSString();
		foreignstate_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		foreignstate_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		foreignstate_validator.validate(operationType, foreignstate, "\"foreignstate\"");
		
		MPSString mediatype_validator = new MPSString();
		mediatype_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		mediatype_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		mediatype_validator.validate(operationType, mediatype, "\"mediatype\"");
		
		MPSString inquiry_validator = new MPSString();
		inquiry_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		inquiry_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		inquiry_validator.validate(operationType, inquiry, "\"inquiry\"");
		
		MPSIPAddress host_ip_address_validator = new MPSIPAddress();
		host_ip_address_validator.validate(operationType, host_ip_address, "\"host_ip_address\"");
		
		MPSBoolean is_used_validator = new MPSBoolean();
		is_used_validator.validate(operationType, is_used, "\"is_used\"");
		
		MPSString logical_disk_name_validator = new MPSString();
		logical_disk_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		logical_disk_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		logical_disk_name_validator.validate(operationType, logical_disk_name, "\"logical_disk_name\"");
		
		MPSInt ld_number_validator = new MPSInt();
		ld_number_validator.validate(operationType, ld_number, "\"ld_number\"");
		
		MPSInt disk_index_validator = new MPSInt();
		disk_index_validator.validate(operationType, disk_index, "\"disk_index\"");
		
	}
}
