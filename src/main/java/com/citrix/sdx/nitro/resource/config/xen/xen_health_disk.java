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

class xen_health_disk_response extends base_response
{
	public xen_health_disk[] xen_health_disk;
}

class xen_health_disk_responses extends base_response
{
	public xen_health_disk_response[] xen_health_disk_response_array;
}

/**
 * Configuration for Disk IO Statistics resource
 */

public class xen_health_disk extends base_resource
{
	private Double total_blocks_read;
	private String name;
	private Double size;
	private Double total_blocks_written;
	private Double block_read_rate;
	private Double block_write_rate;
	private Integer bay_number;
	private String host_ip_address;
	private Double utilized;
	private Double transaction_rate;
	private Long __count;

	protected String get_object_type()
	{
		return "xen_health_disk";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return name;
	}

	/**
	 * <pre>
	 * Total blocks read
	 * </pre>
	 */
	public void set_total_blocks_read(Double total_blocks_read)
	{
		this.total_blocks_read = total_blocks_read;
	}

	/**
	 * <pre>
	 * Total blocks read
	 * </pre>
	 */
	public Double get_total_blocks_read()
	{
		return this.total_blocks_read;
	}

	/**
	 * <pre>
	 * Name of the Disk
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Name of the Disk
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Size of the disk (bytes)
	 * </pre>
	 */
	public void set_size(Double size)
	{
		this.size = size;
	}

	/**
	 * <pre>
	 * Size of the disk (bytes)
	 * </pre>
	 */
	public Double get_size()
	{
		return this.size;
	}

	/**
	 * <pre>
	 * Total blocks written
	 * </pre>
	 */
	public void set_total_blocks_written(Double total_blocks_written)
	{
		this.total_blocks_written = total_blocks_written;
	}

	/**
	 * <pre>
	 * Total blocks written
	 * </pre>
	 */
	public Double get_total_blocks_written()
	{
		return this.total_blocks_written;
	}

	/**
	 * <pre>
	 * Blocks read per second
	 * </pre>
	 */
	public void set_block_read_rate(Double block_read_rate)
	{
		this.block_read_rate = block_read_rate;
	}

	/**
	 * <pre>
	 * Blocks read per second
	 * </pre>
	 */
	public Double get_block_read_rate()
	{
		return this.block_read_rate;
	}

	/**
	 * <pre>
	 * Blocks written per second
	 * </pre>
	 */
	public void set_block_write_rate(Double block_write_rate)
	{
		this.block_write_rate = block_write_rate;
	}

	/**
	 * <pre>
	 * Blocks written per second
	 * </pre>
	 */
	public Double get_block_write_rate()
	{
		return this.block_write_rate;
	}

	/**
	 * <pre>
	 * Bay number
	 * </pre>
	 */
	public void set_bay_number(Integer bay_number)
	{
		this.bay_number = bay_number;
	}

	/**
	 * <pre>
	 * Bay number
	 * </pre>
	 */
	public Integer get_bay_number()
	{
		return this.bay_number;
	}

	/**
	 * <pre>
	 * Host IP Address
	 * </pre>
	 */
	public void set_host_ip_address(String host_ip_address)
	{
		this.host_ip_address = host_ip_address;
	}

	/**
	 * <pre>
	 * Host IP Address
	 * </pre>
	 */
	public String get_host_ip_address()
	{
		return this.host_ip_address;
	}

	/**
	 * <pre>
	 * Utilization of the disk (bytes)
	 * </pre>
	 */
	public void set_utilized(Double utilized)
	{
		this.utilized = utilized;
	}

	/**
	 * <pre>
	 * Utilization of the disk (bytes)
	 * </pre>
	 */
	public Double get_utilized()
	{
		return this.utilized;
	}

	/**
	 * <pre>
	 * Transactions per second
	 * </pre>
	 */
	public void set_transaction_rate(Double transaction_rate)
	{
		this.transaction_rate = transaction_rate;
	}

	/**
	 * <pre>
	 * Transactions per second
	 * </pre>
	 */
	public Double get_transaction_rate()
	{
		return this.transaction_rate;
	}


	/**
	 * <pre>
	 * Use this operation to get disk IO statistics.
	 * </pre>
	 */
	public static xen_health_disk[] get(nitro_service client) throws Exception
	{
		xen_health_disk resource = new xen_health_disk();
		resource.validate("get");
		return (xen_health_disk[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get disk IO statistics.
	 */
	public static xen_health_disk get(nitro_service client, xen_health_disk resource) throws Exception
	{
		resource.validate("get");
		return ((xen_health_disk[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get disk IO statistics in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of xen_health_disk resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen_health_disk[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_disk obj = new xen_health_disk();
		options option = new options();
		option.set_filter(filter);
		xen_health_disk[] response = (xen_health_disk[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen_health_disk resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen_health_disk[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_disk obj = new xen_health_disk();
		options option = new options();
		option.set_filter(filter);
		xen_health_disk[] response = (xen_health_disk[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen_health_disk resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen_health_disk obj = new xen_health_disk();
		options option = new options();
		option.set_count(true);
		xen_health_disk[] response = (xen_health_disk[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_disk resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen_health_disk obj = new xen_health_disk();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_disk[] response = (xen_health_disk[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen_health_disk resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen_health_disk obj = new xen_health_disk();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen_health_disk[] response = (xen_health_disk[])obj.get_resources(service, option);
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
		xen_health_disk_response result = (xen_health_disk_response) service.get_payload_formatter().string_to_resource(xen_health_disk_response.class, response);
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
		return result.xen_health_disk;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_health_disk_responses result = (xen_health_disk_responses) service.get_payload_formatter().string_to_resource(xen_health_disk_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_health_disk_response_array);
		}
		xen_health_disk[] result_xen_health_disk = new xen_health_disk[result.xen_health_disk_response_array.length];
		
		for(int i = 0; i < result.xen_health_disk_response_array.length; i++)
		{
			result_xen_health_disk[i] = result.xen_health_disk_response_array[i].xen_health_disk[0];
		}
		
		return result_xen_health_disk;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString name_validator = new MPSString();
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSIPAddress host_ip_address_validator = new MPSIPAddress();
		host_ip_address_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		host_ip_address_validator.validate(operationType, host_ip_address, "\"host_ip_address\"");
		
		MPSDouble transaction_rate_validator = new MPSDouble();
		transaction_rate_validator.validate(operationType, transaction_rate, "\"transaction_rate\"");
		
		MPSDouble block_read_rate_validator = new MPSDouble();
		block_read_rate_validator.validate(operationType, block_read_rate, "\"block_read_rate\"");
		
		MPSDouble block_write_rate_validator = new MPSDouble();
		block_write_rate_validator.validate(operationType, block_write_rate, "\"block_write_rate\"");
		
		MPSDouble total_blocks_read_validator = new MPSDouble();
		total_blocks_read_validator.validate(operationType, total_blocks_read, "\"total_blocks_read\"");
		
		MPSDouble total_blocks_written_validator = new MPSDouble();
		total_blocks_written_validator.validate(operationType, total_blocks_written, "\"total_blocks_written\"");
		
		MPSDoubleLong utilized_validator = new MPSDoubleLong();
		utilized_validator.validate(operationType, utilized, "\"utilized\"");
		
		MPSDoubleLong size_validator = new MPSDoubleLong();
		size_validator.validate(operationType, size, "\"size\"");
		
		MPSInt bay_number_validator = new MPSInt();
		bay_number_validator.validate(operationType, bay_number, "\"bay_number\"");
		
	}
}
