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

class sr_response extends base_response
{
	public sr[] sr;
}

class sr_responses extends base_response
{
	public sr_response[] sr_response_array;
}

/**
 * Configuration for Storage Repositories resource
 */

public class sr extends base_resource
{
	private String status;
	private String uuid;
	private Double size;
	private String host_type;
	private Double allocated;
	private String reference;
	private String bay_number;
	private String host_ip_address;
	private String type;
	private Integer id;
	private String name_label;
	private Double utilized;
	private String allocation_type;
	private Long __count;

	protected String get_object_type()
	{
		return "sr";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		if(id != null)
			return "" + id.intValue();
		return null;
	}


	/**
	 * <pre>
	 * Status of the SR.
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
	}


	/**
	 * <pre>
	 * sr uuid
	 * </pre>
	 */
	public String get_uuid()
	{
		return this.uuid;
	}


	/**
	 * <pre>
	 * Physical size of the SR
	 * </pre>
	 */
	public Double get_size()
	{
		return this.size;
	}

	/**
	 * <pre>
	 * Host Type of sr
	 * </pre>
	 */
	public void set_host_type(String host_type)
	{
		this.host_type = host_type;
	}

	/**
	 * <pre>
	 * Host Type of sr
	 * </pre>
	 */
	public String get_host_type()
	{
		return this.host_type;
	}


	/**
	 * <pre>
	 * virtual disk allocation.
	 * </pre>
	 */
	public Double get_allocated()
	{
		return this.allocated;
	}


	/**
	 * <pre>
	 * sr ref
	 * </pre>
	 */
	public String get_reference()
	{
		return this.reference;
	}


	/**
	 * <pre>
	 * Type of allocation, thick or thin.
	 * </pre>
	 */
	public String get_bay_number()
	{
		return this.bay_number;
	}

	/**
	 * <pre>
	 * Host IPAddress.
	 * </pre>
	 */
	public void set_host_ip_address(String host_ip_address)
	{
		this.host_ip_address = host_ip_address;
	}

	/**
	 * <pre>
	 * Host IPAddress.
	 * </pre>
	 */
	public String get_host_ip_address()
	{
		return this.host_ip_address;
	}


	/**
	 * <pre>
	 * Type of SR.
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the storage repositories
	 * </pre>
	 */
	public void set_id(Integer id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the storage repositories
	 * </pre>
	 */
	public Integer get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * name label of the Storage Repository
	 * </pre>
	 */
	public String get_name_label()
	{
		return this.name_label;
	}


	/**
	 * <pre>
	 * Physical utilization of SR.
	 * </pre>
	 */
	public Double get_utilized()
	{
		return this.utilized;
	}


	/**
	 * <pre>
	 * Type of allocation, thick or thin.
	 * </pre>
	 */
	public String get_allocation_type()
	{
		return this.allocation_type;
	}


	/**
	* Use this API to fetch filtered set of sr resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static sr[] get_filtered(nitro_service service, String filter) throws Exception
	{
		sr obj = new sr();
		options option = new options();
		option.set_filter(filter);
		sr[] response = (sr[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sr resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sr[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sr obj = new sr();
		options option = new options();
		option.set_filter(filter);
		sr[] response = (sr[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sr resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		sr obj = new sr();
		options option = new options();
		option.set_count(true);
		sr[] response = (sr[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sr resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		sr obj = new sr();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sr[] response = (sr[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sr resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sr obj = new sr();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sr[] response = (sr[])obj.get_resources(service, option);
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
		sr_response result = (sr_response) service.get_payload_formatter().string_to_resource(sr_response.class, response);
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
		return result.sr;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		sr_responses result = (sr_responses) service.get_payload_formatter().string_to_resource(sr_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.sr_response_array);
		}
		sr[] result_sr = new sr[result.sr_response_array.length];
		
		for(int i = 0; i < result.sr_response_array.length; i++)
		{
			result_sr[i] = result.sr_response_array[i].sr[0];
		}
		
		return result_sr;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt id_validator = new MPSInt();
		id_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 1);
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSString host_type_validator = new MPSString();
		host_type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		host_type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		host_type_validator.validate(operationType, host_type, "\"host_type\"");
		
		MPSIPAddress host_ip_address_validator = new MPSIPAddress();
		host_ip_address_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		host_ip_address_validator.validate(operationType, host_ip_address, "\"host_ip_address\"");
		
		MPSString uuid_validator = new MPSString();
		uuid_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		uuid_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		uuid_validator.validate(operationType, uuid, "\"uuid\"");
		
		MPSString reference_validator = new MPSString();
		reference_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		reference_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		reference_validator.validate(operationType, reference, "\"reference\"");
		
		MPSString name_label_validator = new MPSString();
		name_label_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_label_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_label_validator.validate(operationType, name_label, "\"name_label\"");
		
		MPSDoubleLong allocated_validator = new MPSDoubleLong();
		allocated_validator.validate(operationType, allocated, "\"allocated\"");
		
		MPSDoubleLong utilized_validator = new MPSDoubleLong();
		utilized_validator.validate(operationType, utilized, "\"utilized\"");
		
		MPSDoubleLong size_validator = new MPSDoubleLong();
		size_validator.validate(operationType, size, "\"size\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSString status_validator = new MPSString();
		status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		status_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSString allocation_type_validator = new MPSString();
		allocation_type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		allocation_type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		allocation_type_validator.validate(operationType, allocation_type, "\"allocation_type\"");
		
		MPSString bay_number_validator = new MPSString();
		bay_number_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 10);
		bay_number_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		bay_number_validator.validate(operationType, bay_number, "\"bay_number\"");
		
	}
}
