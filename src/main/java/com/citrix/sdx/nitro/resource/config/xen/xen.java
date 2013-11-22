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
import com.citrix.sdx.nitro.resource.config.mps.*;

class xen_response extends base_response
{
	public xen[] xen;
}

class xen_responses extends base_response
{
	public xen_response[] xen_response_array;
}

/**
 * Configuration for Xen resource
 */

public class xen extends host_device
{
	private String kernel_version;
	private String version_short;
	private String expiry;
	private String supplemental_pack;
	private String productcode;
	private String bios_version;
	private String build_date;
	private String iscsi_iqn;
	private String version_long;
	private String build_number;
	private String edition;
	private String serialnumber;
	private Double wan_out;
	private Double lan_out;
	private Double wan_in;
	private Double lan_in;
	private Long __count;

	protected String get_object_type()
	{
		return "xen";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return super.get_object_id();
	}


	/**
	 * <pre>
	 * Kernel Version
	 * </pre>
	 */
	public String get_kernel_version()
	{
		return this.kernel_version;
	}


	/**
	 * <pre>
	 * XenServer Version
	 * </pre>
	 */
	public String get_version_short()
	{
		return this.version_short;
	}


	/**
	 * <pre>
	 * XenServer Expiry
	 * </pre>
	 */
	public String get_expiry()
	{
		return this.expiry;
	}


	/**
	 * <pre>
	 * Supplemental Pack installed on XenServer
	 * </pre>
	 */
	public String get_supplemental_pack()
	{
		return this.supplemental_pack;
	}


	/**
	 * <pre>
	 * XenServer Product Code
	 * </pre>
	 */
	public String get_productcode()
	{
		return this.productcode;
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
	 * XenServer Build Date
	 * </pre>
	 */
	public String get_build_date()
	{
		return this.build_date;
	}


	/**
	 * <pre>
	 * iSCSI IQN
	 * </pre>
	 */
	public String get_iscsi_iqn()
	{
		return this.iscsi_iqn;
	}


	/**
	 * <pre>
	 * XenServer Version (full text)
	 * </pre>
	 */
	public String get_version_long()
	{
		return this.version_long;
	}


	/**
	 * <pre>
	 * XenServer Build Number
	 * </pre>
	 */
	public String get_build_number()
	{
		return this.build_number;
	}


	/**
	 * <pre>
	 * XenServer Edition
	 * </pre>
	 */
	public String get_edition()
	{
		return this.edition;
	}


	/**
	 * <pre>
	 * XenServer Serial Number
	 * </pre>
	 */
	public String get_serialnumber()
	{
		return this.serialnumber;
	}


	/**
	 * <pre>
	 * WAN Out (Mbps)
	 * </pre>
	 */
	public Double get_wan_out()
	{
		return this.wan_out;
	}


	/**
	 * <pre>
	 * LAN Out (Mbps)
	 * </pre>
	 */
	public Double get_lan_out()
	{
		return this.lan_out;
	}


	/**
	 * <pre>
	 * WAN In (Mbps)
	 * </pre>
	 */
	public Double get_wan_in()
	{
		return this.wan_in;
	}


	/**
	 * <pre>
	 * LAN In (Mbps)
	 * </pre>
	 */
	public Double get_lan_in()
	{
		return this.lan_in;
	}


	/**
	 * <pre>
	 * Use this operation to reboot XenServer.
	 * </pre>
	 */

	/**
	 * Use this operation to reboot XenServer.
	 */
	public static xen reboot(nitro_service client, xen resource) throws Exception
	{
		return ((xen[]) resource.perform_operation(client, "reboot"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to reboot XenServer in bulk.
	 * </pre>
	 */

	public static xen[] reboot(nitro_service client, xen[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((xen[]) resources[0].perform_operation(client, "reboot"));
		
		return ((xen[]) perform_operation_bulk_request(client, resources, "reboot"));
	}

	/**
	 * <pre>
	 * Use this operation to shutdown XenServer.
	 * </pre>
	 */

	/**
	 * Use this operation to shutdown XenServer.
	 */
	public static xen stop(nitro_service client, xen resource) throws Exception
	{
		return ((xen[]) resource.perform_operation(client, "stop"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to shutdown XenServer in bulk.
	 * </pre>
	 */

	public static xen[] stop(nitro_service client, xen[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		if(resources.length == 1)
			return ((xen[]) resources[0].perform_operation(client, "stop"));
		
		return ((xen[]) perform_operation_bulk_request(client, resources, "stop"));
	}

	/**
	 * <pre>
	 * Use this operation to get XenServers.
	 * </pre>
	 */
	public static xen[] get(nitro_service client) throws Exception
	{
		xen resource = new xen();
		resource.validate("get");
		return (xen[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get XenServers.
	 */
	public static xen get(nitro_service client, xen resource) throws Exception
	{
		resource.validate("get");
		return ((xen[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get XenServers in bulk.
	 * </pre>
	 */

	/**
	* Use this API to fetch filtered set of xen resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static xen[] get_filtered(nitro_service service, String filter) throws Exception
	{
		xen obj = new xen();
		options option = new options();
		option.set_filter(filter);
		xen[] response = (xen[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of xen resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static xen[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen obj = new xen();
		options option = new options();
		option.set_filter(filter);
		xen[] response = (xen[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the xen resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		xen obj = new xen();
		options option = new options();
		option.set_count(true);
		xen[] response = (xen[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		xen obj = new xen();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen[] response = (xen[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of xen resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		xen obj = new xen();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		xen[] response = (xen[])obj.get_resources(service, option);
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
		xen_response result = (xen_response) service.get_payload_formatter().string_to_resource(xen_response.class, response);
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
		return result.xen;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		xen_responses result = (xen_responses) service.get_payload_formatter().string_to_resource(xen_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.xen_response_array);
		}
		xen[] result_xen = new xen[result.xen_response_array.length];
		
		for(int i = 0; i < result.xen_response_array.length; i++)
		{
			result_xen[i] = result.xen_response_array[i].xen[0];
		}
		
		return result_xen;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString iscsi_iqn_validator = new MPSString();
		iscsi_iqn_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		iscsi_iqn_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		iscsi_iqn_validator.validate(operationType, iscsi_iqn, "\"iscsi_iqn\"");
		
		MPSString edition_validator = new MPSString();
		edition_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		edition_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		edition_validator.validate(operationType, edition, "\"edition\"");
		
		MPSString expiry_validator = new MPSString();
		expiry_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		expiry_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		expiry_validator.validate(operationType, expiry, "\"expiry\"");
		
		MPSString productcode_validator = new MPSString();
		productcode_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		productcode_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		productcode_validator.validate(operationType, productcode, "\"productcode\"");
		
		MPSString serialnumber_validator = new MPSString();
		serialnumber_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		serialnumber_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		serialnumber_validator.validate(operationType, serialnumber, "\"serialnumber\"");
		
		MPSString version_long_validator = new MPSString();
		version_long_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		version_long_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		version_long_validator.validate(operationType, version_long, "\"version_long\"");
		
		MPSString version_short_validator = new MPSString();
		version_short_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		version_short_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		version_short_validator.validate(operationType, version_short, "\"version_short\"");
		
		MPSString build_number_validator = new MPSString();
		build_number_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		build_number_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		build_number_validator.validate(operationType, build_number, "\"build_number\"");
		
		MPSString build_date_validator = new MPSString();
		build_date_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		build_date_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		build_date_validator.validate(operationType, build_date, "\"build_date\"");
		
		MPSString supplemental_pack_validator = new MPSString();
		supplemental_pack_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		supplemental_pack_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		supplemental_pack_validator.validate(operationType, supplemental_pack, "\"supplemental_pack\"");
		
		MPSString kernel_version_validator = new MPSString();
		kernel_version_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		kernel_version_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		kernel_version_validator.validate(operationType, kernel_version, "\"kernel_version\"");
		
		MPSString bios_version_validator = new MPSString();
		bios_version_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		bios_version_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		bios_version_validator.validate(operationType, bios_version, "\"bios_version\"");
		
		MPSDouble wan_out_validator = new MPSDouble();
		wan_out_validator.validate(operationType, wan_out, "\"wan_out\"");
		
		MPSDouble lan_out_validator = new MPSDouble();
		lan_out_validator.validate(operationType, lan_out, "\"lan_out\"");
		
		MPSDouble wan_in_validator = new MPSDouble();
		wan_in_validator.validate(operationType, wan_in, "\"wan_in\"");
		
	}
}
