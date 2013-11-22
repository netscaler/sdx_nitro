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


class version_recommendations_response extends base_response
{
	public version_recommendations[] version_recommendations;
}

class version_recommendations_responses extends base_response
{
	public version_recommendations_response[] version_recommendations_response_array;
}

/**
 * Configuration for Recommendation For Version Matrix resource
 */

public class version_recommendations extends base_resource
{
	private String xen_hotfix_recommendation;
	private String xen_hotfix;
	private String xen_recommendation;
	private String suggestion;
	private String xen_version;
	private String br_version;
	private String ns_recommendation;
	private String svm_version;
	private String ns_version;
	private String xen_supplemental_pack_recommendation;
	private String xen_supplemental_pack_version;
	private String br_recommendation;
	private String svm_recommendation;
	private Long __count;

	protected String get_object_type()
	{
		return "version_recommendations";
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
	 * Recommendations for Xen HotFix
	 * </pre>
	 */
	public String get_xen_hotfix_recommendation()
	{
		return this.xen_hotfix_recommendation;
	}


	/**
	 * <pre>
	 * xen hotfix is applied or not
	 * </pre>
	 */
	public String get_xen_hotfix()
	{
		return this.xen_hotfix;
	}


	/**
	 * <pre>
	 * Recommendations for XenServer
	 * </pre>
	 */
	public String get_xen_recommendation()
	{
		return this.xen_recommendation;
	}


	/**
	 * <pre>
	 * Suggestion for user regarding version matrix
	 * </pre>
	 */
	public String get_suggestion()
	{
		return this.suggestion;
	}


	/**
	 * <pre>
	 * Xen Version
	 * </pre>
	 */
	public String get_xen_version()
	{
		return this.xen_version;
	}


	/**
	 * <pre>
	 * Branch Repeater Version: All Branch Repeater Instances of this formation should be of same verison
	 * </pre>
	 */
	public String get_br_version()
	{
		return this.br_version;
	}


	/**
	 * <pre>
	 * Recommendations for NetScaler
	 * </pre>
	 */
	public String get_ns_recommendation()
	{
		return this.ns_recommendation;
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
	 * NetScaler Version: All NetScaler's Instances of this formation should be of same verison
	 * </pre>
	 */
	public String get_ns_version()
	{
		return this.ns_version;
	}


	/**
	 * <pre>
	 * Recommendations for Xen Supplemantal Pack
	 * </pre>
	 */
	public String get_xen_supplemental_pack_recommendation()
	{
		return this.xen_supplemental_pack_recommendation;
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
	 * Recommendations for Repeater
	 * </pre>
	 */
	public String get_br_recommendation()
	{
		return this.br_recommendation;
	}


	/**
	 * <pre>
	 * Recommendations for Management Service
	 * </pre>
	 */
	public String get_svm_recommendation()
	{
		return this.svm_recommendation;
	}


	/**
	 * <pre>
	 * Use this operation to get recommendations for version matrix.
	 * </pre>
	 */
	public static version_recommendations[] get(nitro_service client) throws Exception
	{
		version_recommendations resource = new version_recommendations();
		resource.validate("get");
		return (version_recommendations[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of version_recommendations resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static version_recommendations[] get_filtered(nitro_service service, String filter) throws Exception
	{
		version_recommendations obj = new version_recommendations();
		options option = new options();
		option.set_filter(filter);
		version_recommendations[] response = (version_recommendations[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of version_recommendations resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static version_recommendations[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		version_recommendations obj = new version_recommendations();
		options option = new options();
		option.set_filter(filter);
		version_recommendations[] response = (version_recommendations[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the version_recommendations resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		version_recommendations obj = new version_recommendations();
		options option = new options();
		option.set_count(true);
		version_recommendations[] response = (version_recommendations[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of version_recommendations resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		version_recommendations obj = new version_recommendations();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		version_recommendations[] response = (version_recommendations[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of version_recommendations resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		version_recommendations obj = new version_recommendations();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		version_recommendations[] response = (version_recommendations[])obj.get_resources(service, option);
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
		version_recommendations_response result = (version_recommendations_response) service.get_payload_formatter().string_to_resource(version_recommendations_response.class, response);
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
		return result.version_recommendations;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		version_recommendations_responses result = (version_recommendations_responses) service.get_payload_formatter().string_to_resource(version_recommendations_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.version_recommendations_response_array);
		}
		version_recommendations[] result_version_recommendations = new version_recommendations[result.version_recommendations_response_array.length];
		
		for(int i = 0; i < result.version_recommendations_response_array.length; i++)
		{
			result_version_recommendations[i] = result.version_recommendations_response_array[i].version_recommendations[0];
		}
		
		return result_version_recommendations;
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
		
		MPSString suggestion_validator = new MPSString();
		suggestion_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 512);
		suggestion_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		suggestion_validator.validate(operationType, suggestion, "\"suggestion\"");
		
		MPSString xen_hotfix_validator = new MPSString();
		xen_hotfix_validator.validate(operationType, xen_hotfix, "\"xen_hotfix\"");
		
		MPSString svm_recommendation_validator = new MPSString();
		svm_recommendation_validator.validate(operationType, svm_recommendation, "\"svm_recommendation\"");
		
		MPSString xen_recommendation_validator = new MPSString();
		xen_recommendation_validator.validate(operationType, xen_recommendation, "\"xen_recommendation\"");
		
		MPSString xen_supplemental_pack_recommendation_validator = new MPSString();
		xen_supplemental_pack_recommendation_validator.validate(operationType, xen_supplemental_pack_recommendation, "\"xen_supplemental_pack_recommendation\"");
		
		MPSString xen_hotfix_recommendation_validator = new MPSString();
		xen_hotfix_recommendation_validator.validate(operationType, xen_hotfix_recommendation, "\"xen_hotfix_recommendation\"");
		
		MPSString ns_recommendation_validator = new MPSString();
		ns_recommendation_validator.validate(operationType, ns_recommendation, "\"ns_recommendation\"");
		
		MPSString br_recommendation_validator = new MPSString();
		br_recommendation_validator.validate(operationType, br_recommendation, "\"br_recommendation\"");
		
	}
}
