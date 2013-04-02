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

class hostcpu_response extends base_response
{
	public hostcpu[] hostcpu;
}

class hostcpu_responses extends base_response
{
	public hostcpu_response[] hostcpu_response_array;
}

/**
 * Configuration for Host CPU resource
 */

public class hostcpu extends base_resource
{
	private String features;
	private String flags;
	private Integer number;
	private Integer model;
	private String uuid;
	private Integer speed;
	private Double cpu_usage;
	private String id;
	private String stepping;
	private Integer family;
	private String modelname;
	private String vendor;
	private Long __count;

	protected String get_object_type()
	{
		return "hostcpu";
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
	 * CPU features
	 * </pre>
	 */
	public String get_features()
	{
		return this.features;
	}


	/**
	 * <pre>
	 * CPU Flags
	 * </pre>
	 */
	public String get_flags()
	{
		return this.flags;
	}


	/**
	 * <pre>
	 * CPU number
	 * </pre>
	 */
	public Integer get_number()
	{
		return this.number;
	}


	/**
	 * <pre>
	 * CPU Model
	 * </pre>
	 */
	public Integer get_model()
	{
		return this.model;
	}


	/**
	 * <pre>
	 * UUID of this CPU
	 * </pre>
	 */
	public String get_uuid()
	{
		return this.uuid;
	}


	/**
	 * <pre>
	 * CPU speed
	 * </pre>
	 */
	public Integer get_speed()
	{
		return this.speed;
	}


	/**
	 * <pre>
	 * CPU Usage (%)
	 * </pre>
	 */
	public Double get_cpu_usage()
	{
		return this.cpu_usage;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the CPUs
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the CPUs
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}


	/**
	 * <pre>
	 * CPU Stepping
	 * </pre>
	 */
	public String get_stepping()
	{
		return this.stepping;
	}


	/**
	 * <pre>
	 * CPU family
	 * </pre>
	 */
	public Integer get_family()
	{
		return this.family;
	}


	/**
	 * <pre>
	 * CPU Model Name
	 * </pre>
	 */
	public String get_modelname()
	{
		return this.modelname;
	}


	/**
	 * <pre>
	 * CPU Vendor
	 * </pre>
	 */
	public String get_vendor()
	{
		return this.vendor;
	}


	/**
	 * <pre>
	 * Use this operation to get CPU Cores.
	 * </pre>
	 */
	public static hostcpu[] get(nitro_service client) throws Exception
	{
		hostcpu resource = new hostcpu();
		resource.validate("get");
		return (hostcpu[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get CPU Cores.
	 */
	public static hostcpu get(nitro_service client, hostcpu resource) throws Exception
	{
		resource.validate("get");
		return ((hostcpu[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get CPU Cores in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of hostcpu resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static hostcpu[] get_filtered(nitro_service service, String filter) throws Exception
	{
		hostcpu obj = new hostcpu();
		options option = new options();
		option.set_filter(filter);
		hostcpu[] response = (hostcpu[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of hostcpu resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static hostcpu[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		hostcpu obj = new hostcpu();
		options option = new options();
		option.set_filter(filter);
		hostcpu[] response = (hostcpu[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the hostcpu resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		hostcpu obj = new hostcpu();
		options option = new options();
		option.set_count(true);
		hostcpu[] response = (hostcpu[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of hostcpu resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		hostcpu obj = new hostcpu();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hostcpu[] response = (hostcpu[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of hostcpu resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		hostcpu obj = new hostcpu();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		hostcpu[] response = (hostcpu[])obj.get_resources(service, option);
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
		hostcpu_response result = (hostcpu_response) service.get_payload_formatter().string_to_resource(hostcpu_response.class, response);
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
		return result.hostcpu;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		hostcpu_responses result = (hostcpu_responses) service.get_payload_formatter().string_to_resource(hostcpu_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.hostcpu_response_array);
		}
		hostcpu[] result_hostcpu = new hostcpu[result.hostcpu_response_array.length];
		
		for(int i = 0; i < result.hostcpu_response_array.length; i++)
		{
			result_hostcpu[i] = result.hostcpu_response_array[i].hostcpu[0];
		}
		
		return result_hostcpu;
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
		
		MPSString uuid_validator = new MPSString();
		uuid_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		uuid_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		uuid_validator.validate(operationType, uuid, "\"uuid\"");
		
		MPSInt number_validator = new MPSInt();
		number_validator.validate(operationType, number, "\"number\"");
		
		MPSDouble cpu_usage_validator = new MPSDouble();
		cpu_usage_validator.validate(operationType, cpu_usage, "\"cpu_usage\"");
		
		MPSString vendor_validator = new MPSString();
		vendor_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		vendor_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		vendor_validator.validate(operationType, vendor, "\"vendor\"");
		
		MPSInt speed_validator = new MPSInt();
		speed_validator.validate(operationType, speed, "\"speed\"");
		
		MPSString modelname_validator = new MPSString();
		modelname_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		modelname_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		modelname_validator.validate(operationType, modelname, "\"modelname\"");
		
		MPSInt family_validator = new MPSInt();
		family_validator.validate(operationType, family, "\"family\"");
		
		MPSInt model_validator = new MPSInt();
		model_validator.validate(operationType, model, "\"model\"");
		
		MPSString stepping_validator = new MPSString();
		stepping_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		stepping_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		stepping_validator.validate(operationType, stepping, "\"stepping\"");
		
		MPSString flags_validator = new MPSString();
		flags_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 512);
		flags_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		flags_validator.validate(operationType, flags, "\"flags\"");
		
		MPSString features_validator = new MPSString();
		features_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		features_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		features_validator.validate(operationType, features, "\"features\"");
		
	}
}
