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


class sdx_license_response extends base_response
{
	public sdx_license[] sdx_license;
}

class sdx_license_responses extends base_response
{
	public sdx_license_response[] sdx_license_response_array;
}

/**
 * Configuration for SDX License Information resource
 */

public class sdx_license extends base_resource
{
	private Integer max_number_of_br_instances;
	private String act_id;
	private Boolean sync_operation;
	private Integer available_number_of_ns_instances;
	private String available_throughput;
	private String max_throughput;
	private Integer max_number_of_instances;
	private String platform;
	private Integer available_number_of_instances;
	private Integer max_number_of_ns_instances;
	private Long __count;

	protected String get_object_type()
	{
		return "sdx_license";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return null;
	}


	/**
	 * <pre>
	 * Maximum Repeater Instances
	 * </pre>
	 */
	public Integer get_max_number_of_br_instances()
	{
		return this.max_number_of_br_instances;
	}


	/**
	 * <pre>
	 * Activity Id
	 * </pre>
	 */
	public String get_act_id()
	{
		return this.act_id;
	}

	/**
	 * <pre>
	 * sync operation
	 * </pre>
	 */
	public void set_sync_operation(Boolean sync_operation)
	{
		this.sync_operation = sync_operation;
	}

	/**
	 * <pre>
	 * sync operation
	 * </pre>
	 */
	public Boolean get_sync_operation()
	{
		return this.sync_operation;
	}


	/**
	 * <pre>
	 * Available NetScaler Instances (Shared)
	 * </pre>
	 */
	public Integer get_available_number_of_ns_instances()
	{
		return this.available_number_of_ns_instances;
	}


	/**
	 * <pre>
	 * Available Throughput in Mbps
	 * </pre>
	 */
	public String get_available_throughput()
	{
		return this.available_throughput;
	}


	/**
	 * <pre>
	 * Maximum Throughput in Mbps
	 * </pre>
	 */
	public String get_max_throughput()
	{
		return this.max_throughput;
	}


	/**
	 * <pre>
	 * Maximum Instances
	 * </pre>
	 */
	public Integer get_max_number_of_instances()
	{
		return this.max_number_of_instances;
	}


	/**
	 * <pre>
	 * Platform
	 * </pre>
	 */
	public String get_platform()
	{
		return this.platform;
	}


	/**
	 * <pre>
	 * Available Instances
	 * </pre>
	 */
	public Integer get_available_number_of_instances()
	{
		return this.available_number_of_instances;
	}


	/**
	 * <pre>
	 * Maximum NetScaler Instances
	 * </pre>
	 */
	public Integer get_max_number_of_ns_instances()
	{
		return this.max_number_of_ns_instances;
	}


	/**
	 * <pre>
	 * Use this operation to apply new licenses files.
	 * </pre>
	 */
	public static sdx_license apply(nitro_service client) throws Exception
	{
		sdx_license resource = new sdx_license();
		return ((sdx_license[]) resource.perform_operation(client, "apply"))[0];
	}

	/**
	 * Use this operation to get SDX license information.
	 */
	public static sdx_license get(nitro_service client) throws Exception
	{
		sdx_license resource = new sdx_license();
		resource.validate("get");
		return ((sdx_license[]) resource.get_resources(client))[0];
	}

	/**
	* Use this API to fetch filtered set of sdx_license resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static sdx_license[] get_filtered(nitro_service service, String filter) throws Exception
	{
		sdx_license obj = new sdx_license();
		options option = new options();
		option.set_filter(filter);
		sdx_license[] response = (sdx_license[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sdx_license resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sdx_license[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sdx_license obj = new sdx_license();
		options option = new options();
		option.set_filter(filter);
		sdx_license[] response = (sdx_license[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sdx_license resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		sdx_license obj = new sdx_license();
		options option = new options();
		option.set_count(true);
		sdx_license[] response = (sdx_license[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sdx_license resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		sdx_license obj = new sdx_license();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sdx_license[] response = (sdx_license[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of sdx_license resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		sdx_license obj = new sdx_license();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sdx_license[] response = (sdx_license[])obj.get_resources(service, option);
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
		sdx_license_response result = (sdx_license_response) service.get_payload_formatter().string_to_resource(sdx_license_response.class, response);
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
		return result.sdx_license;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		sdx_license_responses result = (sdx_license_responses) service.get_payload_formatter().string_to_resource(sdx_license_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.sdx_license_response_array);
		}
		sdx_license[] result_sdx_license = new sdx_license[result.sdx_license_response_array.length];
		
		for(int i = 0; i < result.sdx_license_response_array.length; i++)
		{
			result_sdx_license[i] = result.sdx_license_response_array[i].sdx_license[0];
		}
		
		return result_sdx_license;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString platform_validator = new MPSString();
		platform_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		platform_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		platform_validator.validate(operationType, platform, "\"platform\"");
		
		MPSInt max_number_of_ns_instances_validator = new MPSInt();
		max_number_of_ns_instances_validator.validate(operationType, max_number_of_ns_instances, "\"max_number_of_ns_instances\"");
		
		MPSString max_throughput_validator = new MPSString();
		max_throughput_validator.validate(operationType, max_throughput, "\"max_throughput\"");
		
		MPSString available_throughput_validator = new MPSString();
		available_throughput_validator.validate(operationType, available_throughput, "\"available_throughput\"");
		
		MPSInt max_number_of_br_instances_validator = new MPSInt();
		max_number_of_br_instances_validator.validate(operationType, max_number_of_br_instances, "\"max_number_of_br_instances\"");
		
		MPSInt available_number_of_ns_instances_validator = new MPSInt();
		available_number_of_ns_instances_validator.validate(operationType, available_number_of_ns_instances, "\"available_number_of_ns_instances\"");
		
		MPSInt max_number_of_instances_validator = new MPSInt();
		max_number_of_instances_validator.validate(operationType, max_number_of_instances, "\"max_number_of_instances\"");
		
		MPSInt available_number_of_instances_validator = new MPSInt();
		available_number_of_instances_validator.validate(operationType, available_number_of_instances, "\"available_number_of_instances\"");
		
		MPSBoolean sync_operation_validator = new MPSBoolean();
		sync_operation_validator.validate(operationType, sync_operation, "\"sync_operation\"");
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
	}
}
