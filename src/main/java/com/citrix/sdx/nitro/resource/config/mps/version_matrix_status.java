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


class version_matrix_status_response extends base_response
{
	public version_matrix_status[] version_matrix_status;
}

class version_matrix_status_responses extends base_response
{
	public version_matrix_status_response[] version_matrix_status_response_array;
}

/**
 * Configuration for Current Verisons resource
 */

public class version_matrix_status extends base_resource
{
	private String br_version;
	private Integer status_code;
	private String xen_hotfix;
	private String status;
	private String svm_version;
	private String ns_version;
	private String xen_supplemental_pack_version;
	private String xen_version;
	private Long __count;

	protected String get_object_type()
	{
		return "version_matrix_status";
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
	 * Repeater Version
	 * </pre>
	 */
	public String get_br_version()
	{
		return this.br_version;
	}


	/**
	 * <pre>
	 * 0 - OK, 1 - Incompatible, 2 - Manifest file Missing 3- can not perform version compatibility
	 * </pre>
	 */
	public Integer get_status_code()
	{
		return this.status_code;
	}


	/**
	 * <pre>
	 * It will return xen hotfixes name-label
	 * </pre>
	 */
	public String get_xen_hotfix()
	{
		return this.xen_hotfix;
	}


	/**
	 * <pre>
	 * it will return OK if there is no compatability issues, else Error Message
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
	}


	/**
	 * <pre>
	 * Service Management Version
	 * </pre>
	 */
	public String get_svm_version()
	{
		return this.svm_version;
	}


	/**
	 * <pre>
	 * NetScaler Version
	 * </pre>
	 */
	public String get_ns_version()
	{
		return this.ns_version;
	}


	/**
	 * <pre>
	 * Xen Supplemental Pack Version
	 * </pre>
	 */
	public String get_xen_supplemental_pack_version()
	{
		return this.xen_supplemental_pack_version;
	}


	/**
	 * <pre>
	 * XenServer Version
	 * </pre>
	 */
	public String get_xen_version()
	{
		return this.xen_version;
	}


	/**
	 * <pre>
	 * Use this operation to get currently running versions.
	 * </pre>
	 */
	public static version_matrix_status[] get(nitro_service client) throws Exception
	{
		version_matrix_status resource = new version_matrix_status();
		resource.validate("get");
		return (version_matrix_status[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of version_matrix_status resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static version_matrix_status[] get_filtered(nitro_service service, String filter) throws Exception
	{
		version_matrix_status obj = new version_matrix_status();
		options option = new options();
		option.set_filter(filter);
		version_matrix_status[] response = (version_matrix_status[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of version_matrix_status resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static version_matrix_status[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		version_matrix_status obj = new version_matrix_status();
		options option = new options();
		option.set_filter(filter);
		version_matrix_status[] response = (version_matrix_status[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the version_matrix_status resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		version_matrix_status obj = new version_matrix_status();
		options option = new options();
		option.set_count(true);
		version_matrix_status[] response = (version_matrix_status[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of version_matrix_status resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		version_matrix_status obj = new version_matrix_status();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		version_matrix_status[] response = (version_matrix_status[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of version_matrix_status resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		version_matrix_status obj = new version_matrix_status();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		version_matrix_status[] response = (version_matrix_status[])obj.get_resources(service, option);
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
		version_matrix_status_response result = (version_matrix_status_response) service.get_payload_formatter().string_to_resource(version_matrix_status_response.class, response);
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
		return result.version_matrix_status;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		version_matrix_status_responses result = (version_matrix_status_responses) service.get_payload_formatter().string_to_resource(version_matrix_status_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.version_matrix_status_response_array);
		}
		version_matrix_status[] result_version_matrix_status = new version_matrix_status[result.version_matrix_status_response_array.length];
		
		for(int i = 0; i < result.version_matrix_status_response_array.length; i++)
		{
			result_version_matrix_status[i] = result.version_matrix_status_response_array[i].version_matrix_status[0];
		}
		
		return result_version_matrix_status;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString svm_version_validator = new MPSString();
		svm_version_validator.validate(operationType, svm_version, "\"svm_version\"");
		
		MPSString xen_version_validator = new MPSString();
		xen_version_validator.validate(operationType, xen_version, "\"xen_version\"");
		
		MPSString xen_supplemental_pack_version_validator = new MPSString();
		xen_supplemental_pack_version_validator.validate(operationType, xen_supplemental_pack_version, "\"xen_supplemental_pack_version\"");
		
		MPSString ns_version_validator = new MPSString();
		ns_version_validator.validate(operationType, ns_version, "\"ns_version\"");
		
		MPSString br_version_validator = new MPSString();
		br_version_validator.validate(operationType, br_version, "\"br_version\"");
		
		MPSString xen_hotfix_validator = new MPSString();
		xen_hotfix_validator.validate(operationType, xen_hotfix, "\"xen_hotfix\"");
		
		MPSString status_validator = new MPSString();
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSInt status_code_validator = new MPSInt();
		status_code_validator.validate(operationType, status_code, "\"status_code\"");
		
	}
}
