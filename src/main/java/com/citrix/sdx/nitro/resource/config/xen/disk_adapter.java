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

class disk_adapter_response extends base_response
{
	public disk_adapter[] disk_adapter;
}

class disk_adapter_responses extends base_response
{
	public disk_adapter_response[] disk_adapter_response_array;
}

/**
 * Configuration for XenServer Disk Adapaters resource
 */

public class disk_adapter extends base_resource
{
	private Integer pdcount;
	private Integer adapter_id;
	private Integer ldcount;
	private String id;
	private Long __count;

	protected String get_object_type()
	{
		return "disk_adapter";
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
	 * Physical Disk Count for this Adapter
	 * </pre>
	 */
	public Integer get_pdcount()
	{
		return this.pdcount;
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
	 * Logical Disk Count for this Adapter
	 * </pre>
	 */
	public Integer get_ldcount()
	{
		return this.ldcount;
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
	 * Use this operation to get disk adapters.
	 * </pre>
	 */
	public static disk_adapter[] get(nitro_service client) throws Exception
	{
		disk_adapter resource = new disk_adapter();
		resource.validate("get");
		return (disk_adapter[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get disk adapters.
	 */
	public static disk_adapter get(nitro_service client, disk_adapter resource) throws Exception
	{
		resource.validate("get");
		return ((disk_adapter[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get disk adapters in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of disk_adapter resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static disk_adapter[] get_filtered(nitro_service service, String filter) throws Exception
	{
		disk_adapter obj = new disk_adapter();
		options option = new options();
		option.set_filter(filter);
		disk_adapter[] response = (disk_adapter[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of disk_adapter resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static disk_adapter[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		disk_adapter obj = new disk_adapter();
		options option = new options();
		option.set_filter(filter);
		disk_adapter[] response = (disk_adapter[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the disk_adapter resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		disk_adapter obj = new disk_adapter();
		options option = new options();
		option.set_count(true);
		disk_adapter[] response = (disk_adapter[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of disk_adapter resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		disk_adapter obj = new disk_adapter();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		disk_adapter[] response = (disk_adapter[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of disk_adapter resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		disk_adapter obj = new disk_adapter();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		disk_adapter[] response = (disk_adapter[])obj.get_resources(service, option);
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
		disk_adapter_response result = (disk_adapter_response) service.get_payload_formatter().string_to_resource(disk_adapter_response.class, response);
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
		return result.disk_adapter;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		disk_adapter_responses result = (disk_adapter_responses) service.get_payload_formatter().string_to_resource(disk_adapter_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.disk_adapter_response_array);
		}
		disk_adapter[] result_disk_adapter = new disk_adapter[result.disk_adapter_response_array.length];
		
		for(int i = 0; i < result.disk_adapter_response_array.length; i++)
		{
			result_disk_adapter[i] = result.disk_adapter_response_array[i].disk_adapter[0];
		}
		
		return result_disk_adapter;
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
		
		MPSInt adapter_id_validator = new MPSInt();
		adapter_id_validator.validate(operationType, adapter_id, "\"adapter_id\"");
		
		MPSInt pdcount_validator = new MPSInt();
		pdcount_validator.validate(operationType, pdcount, "\"pdcount\"");
		
		MPSInt ldcount_validator = new MPSInt();
		ldcount_validator.validate(operationType, ldcount, "\"ldcount\"");
		
	}
}
