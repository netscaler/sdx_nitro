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


class mps_response extends base_response
{
	public mps[] mps;
}

class mps_responses extends base_response
{
	public mps_response[] mps_response_array;
}

/**
 * Configuration for Management Service resource
 */

public class mps extends base_resource
{
	private Integer current_time;
	private String serial;
	private String sysid;
	private String bios_version;
	private String hostid;
	private String product_version;
	private String username;
	private String host;
	private String build_number;
	private String current_time_formatted;
	private String uptime;
	private String product;
	private String platform;
	private Long __count;

	protected String get_object_type()
	{
		return "mps";
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
	 * Current Time
	 * </pre>
	 */
	public Integer get_current_time()
	{
		return this.current_time;
	}


	/**
	 * <pre>
	 * Serial Number
	 * </pre>
	 */
	public String get_serial()
	{
		return this.serial;
	}


	/**
	 * <pre>
	 * Serial Number
	 * </pre>
	 */
	public String get_sysid()
	{
		return this.sysid;
	}


	/**
	 * <pre>
	 * BIOS Version
	 * </pre>
	 */
	public String get_bios_version()
	{
		return this.bios_version;
	}


	/**
	 * <pre>
	 * Host Id
	 * </pre>
	 */
	public String get_hostid()
	{
		return this.hostid;
	}


	/**
	 * <pre>
	 * Product Version
	 * </pre>
	 */
	public String get_product_version()
	{
		return this.product_version;
	}


	/**
	 * <pre>
	 * User Name who is currently connected to the system
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}


	/**
	 * <pre>
	 * Host IP Address on which system is running, this will set for each client session only
	 * </pre>
	 */
	public String get_host()
	{
		return this.host;
	}


	/**
	 * <pre>
	 * Build Number
	 * </pre>
	 */
	public String get_build_number()
	{
		return this.build_number;
	}


	/**
	 * <pre>
	 * Current Time (Formatted)
	 * </pre>
	 */
	public String get_current_time_formatted()
	{
		return this.current_time_formatted;
	}


	/**
	 * <pre>
	 * Uptime
	 * </pre>
	 */
	public String get_uptime()
	{
		return this.uptime;
	}


	/**
	 * <pre>
	 * Product Name
	 * </pre>
	 */
	public String get_product()
	{
		return this.product;
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
	 * Use this operation to reboot Management Service.
	 * </pre>
	 */
	public static mps reboot(nitro_service client, mps resource) throws Exception
	{
		return ((mps[]) resource.perform_operation(client, "reboot"))[0];
	}

	/**
	 * Use this operation to get Management Service Information.
	 */
	public static mps get(nitro_service client) throws Exception
	{
		mps resource = new mps();
		resource.validate("get");
		return ((mps[]) resource.get_resources(client))[0];
	}

	/**
	* Use this API to fetch filtered set of mps resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static mps[] get_filtered(nitro_service service, String filter) throws Exception
	{
		mps obj = new mps();
		options option = new options();
		option.set_filter(filter);
		mps[] response = (mps[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of mps resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static mps[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mps obj = new mps();
		options option = new options();
		option.set_filter(filter);
		mps[] response = (mps[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the mps resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		mps obj = new mps();
		options option = new options();
		option.set_count(true);
		mps[] response = (mps[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mps resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		mps obj = new mps();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mps[] response = (mps[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mps resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mps obj = new mps();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mps[] response = (mps[])obj.get_resources(service, option);
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
		mps_response result = (mps_response) service.get_payload_formatter().string_to_resource(mps_response.class, response);
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
		return result.mps;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		mps_responses result = (mps_responses) service.get_payload_formatter().string_to_resource(mps_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.mps_response_array);
		}
		mps[] result_mps = new mps[result.mps_response_array.length];
		
		for(int i = 0; i < result.mps_response_array.length; i++)
		{
			result_mps[i] = result.mps_response_array[i].mps[0];
		}
		
		return result_mps;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString product_validator = new MPSString();
		product_validator.validate(operationType, product, "\"product\"");
		
		MPSString build_number_validator = new MPSString();
		build_number_validator.validate(operationType, build_number, "\"build_number\"");
		
		MPSString host_validator = new MPSString();
		host_validator.validate(operationType, host, "\"host\"");
		
		MPSString username_validator = new MPSString();
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSString platform_validator = new MPSString();
		platform_validator.validate(operationType, platform, "\"platform\"");
		
		MPSString hostid_validator = new MPSString();
		hostid_validator.validate(operationType, hostid, "\"hostid\"");
		
		MPSString sysid_validator = new MPSString();
		sysid_validator.validate(operationType, sysid, "\"sysid\"");
		
		MPSString serial_validator = new MPSString();
		serial_validator.validate(operationType, serial, "\"serial\"");
		
		MPSInt current_time_validator = new MPSInt();
		current_time_validator.validate(operationType, current_time, "\"current_time\"");
		
		MPSString current_time_formatted_validator = new MPSString();
		current_time_formatted_validator.validate(operationType, current_time_formatted, "\"current_time_formatted\"");
		
		MPSString uptime_validator = new MPSString();
		uptime_validator.validate(operationType, uptime, "\"uptime\"");
		
		MPSString bios_version_validator = new MPSString();
		bios_version_validator.validate(operationType, bios_version, "\"bios_version\"");
		
		MPSString product_version_validator = new MPSString();
		product_version_validator.validate(operationType, product_version, "\"product_version\"");
		
	}
}
