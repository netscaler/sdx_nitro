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


class jazz_license_response extends base_response
{
	public jazz_license[] jazz_license;
}

class jazz_license_responses extends base_response
{
	public jazz_license_response[] jazz_license_response_array;
}

/**
 * Configuration for Jazz License Information resource
 */

public class jazz_license extends base_resource
{
	private String date_purchased;
	private String session_id;
	private String features;
	private Integer relevance;
	private String name;
	private String serial_no;
	private Integer count_total;
	private Integer count_available;
	private String id;
	private String date_exp;
	private String bind_type;
	private Long __count;

	protected String get_object_type()
	{
		return "jazz_license";
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
	 * Purchase Date for license
	 * </pre>
	 */
	public void set_date_purchased(String date_purchased)
	{
		this.date_purchased = date_purchased;
	}

	/**
	 * <pre>
	 * Purchase Date for license
	 * </pre>
	 */
	public String get_date_purchased()
	{
		return this.date_purchased;
	}

	/**
	 * <pre>
	 * Session id for license
	 * </pre>
	 */
	public void set_session_id(String session_id)
	{
		this.session_id = session_id;
	}

	/**
	 * <pre>
	 * Session id for license
	 * </pre>
	 */
	public String get_session_id()
	{
		return this.session_id;
	}

	/**
	 * <pre>
	 * Features for license
	 * </pre>
	 */
	public void set_features(String features)
	{
		this.features = features;
	}

	/**
	 * <pre>
	 * Features for license
	 * </pre>
	 */
	public String get_features()
	{
		return this.features;
	}

	/**
	 * <pre>
	 * Relevance of license
	 * </pre>
	 */
	public void set_relevance(Integer relevance)
	{
		this.relevance = relevance;
	}

	/**
	 * <pre>
	 * Relevance of license
	 * </pre>
	 */
	public Integer get_relevance()
	{
		return this.relevance;
	}

	/**
	 * <pre>
	 * Name of license
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Name of license
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Serial Number for license
	 * </pre>
	 */
	public void set_serial_no(String serial_no)
	{
		this.serial_no = serial_no;
	}

	/**
	 * <pre>
	 * Serial Number for license
	 * </pre>
	 */
	public String get_serial_no()
	{
		return this.serial_no;
	}

	/**
	 * <pre>
	 * Count Total of license
	 * </pre>
	 */
	public void set_count_total(Integer count_total)
	{
		this.count_total = count_total;
	}

	/**
	 * <pre>
	 * Count Total of license
	 * </pre>
	 */
	public Integer get_count_total()
	{
		return this.count_total;
	}

	/**
	 * <pre>
	 * Count Available of license
	 * </pre>
	 */
	public void set_count_available(Integer count_available)
	{
		this.count_available = count_available;
	}

	/**
	 * <pre>
	 * Count Available of license
	 * </pre>
	 */
	public Integer get_count_available()
	{
		return this.count_available;
	}

	/**
	 * <pre>
	 * ID for license
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * ID for license
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * Expiry Date for license
	 * </pre>
	 */
	public void set_date_exp(String date_exp)
	{
		this.date_exp = date_exp;
	}

	/**
	 * <pre>
	 * Expiry Date for license
	 * </pre>
	 */
	public String get_date_exp()
	{
		return this.date_exp;
	}

	/**
	 * <pre>
	 * Bind Type for license
	 * </pre>
	 */
	public void set_bind_type(String bind_type)
	{
		this.bind_type = bind_type;
	}

	/**
	 * <pre>
	 * Bind Type for license
	 * </pre>
	 */
	public String get_bind_type()
	{
		return this.bind_type;
	}


	/**
	 * <pre>
	 * Use this operation to Fetch new licenses files.
	 * </pre>
	 */
	public static jazz_license fetch(nitro_service client, jazz_license resource) throws Exception
	{
		return ((jazz_license[]) resource.perform_operation(client, "fetch"))[0];
	}

	/**
	 * Use this operation to get license information.
	 */
	public static jazz_license get(nitro_service client) throws Exception
	{
		jazz_license resource = new jazz_license();
		resource.validate("get");
		return ((jazz_license[]) resource.get_resources(client))[0];
	}

	/**
	* Use this API to fetch filtered set of jazz_license resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static jazz_license[] get_filtered(nitro_service service, String filter) throws Exception
	{
		jazz_license obj = new jazz_license();
		options option = new options();
		option.set_filter(filter);
		jazz_license[] response = (jazz_license[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of jazz_license resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static jazz_license[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		jazz_license obj = new jazz_license();
		options option = new options();
		option.set_filter(filter);
		jazz_license[] response = (jazz_license[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the jazz_license resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		jazz_license obj = new jazz_license();
		options option = new options();
		option.set_count(true);
		jazz_license[] response = (jazz_license[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of jazz_license resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		jazz_license obj = new jazz_license();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		jazz_license[] response = (jazz_license[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of jazz_license resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		jazz_license obj = new jazz_license();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		jazz_license[] response = (jazz_license[])obj.get_resources(service, option);
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
		jazz_license_response result = (jazz_license_response) service.get_payload_formatter().string_to_resource(jazz_license_response.class, response);
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
		return result.jazz_license;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		jazz_license_responses result = (jazz_license_responses) service.get_payload_formatter().string_to_resource(jazz_license_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.jazz_license_response_array);
		}
		jazz_license[] result_jazz_license = new jazz_license[result.jazz_license_response_array.length];
		
		for(int i = 0; i < result.jazz_license_response_array.length; i++)
		{
			result_jazz_license[i] = result.jazz_license_response_array[i].jazz_license[0];
		}
		
		return result_jazz_license;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString serial_no_validator = new MPSString();
		serial_no_validator.validate(operationType, serial_no, "\"serial_no\"");
		
		MPSString id_validator = new MPSString();
		id_validator.validate(operationType, id, "\"id\"");
		
		MPSString session_id_validator = new MPSString();
		session_id_validator.validate(operationType, session_id, "\"session_id\"");
		
		MPSString name_validator = new MPSString();
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSInt relevance_validator = new MPSInt();
		relevance_validator.validate(operationType, relevance, "\"relevance\"");
		
		MPSString bind_type_validator = new MPSString();
		bind_type_validator.validate(operationType, bind_type, "\"bind_type\"");
		
		MPSInt count_total_validator = new MPSInt();
		count_total_validator.validate(operationType, count_total, "\"count_total\"");
		
		MPSInt count_available_validator = new MPSInt();
		count_available_validator.validate(operationType, count_available, "\"count_available\"");
		
		MPSString date_purchased_validator = new MPSString();
		date_purchased_validator.validate(operationType, date_purchased, "\"date_purchased\"");
		
		MPSString date_exp_validator = new MPSString();
		date_exp_validator.validate(operationType, date_exp, "\"date_exp\"");
		
		MPSString features_validator = new MPSString();
		features_validator.validate(operationType, features, "\"features\"");
		
	}
}
