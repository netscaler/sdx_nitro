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


class managed_device_response extends base_response
{
	public managed_device[] managed_device;
}

class managed_device_responses extends base_response
{
	public managed_device_response[] managed_device_response_array;
}

/**
 * Configuration for Managed Device resource
 */

public class managed_device extends base_resource
{
	private Boolean user_driven;
	private String gateway;
	private String status;
	private String hostname;
	private String netmask;
	private String id;
	private String ip_address;
	private String instance_state;
	private Integer ping_state;
	private String device_family;
	private String version;
	private String reason;
	private String name;
	private String description;
	private String type;
	private String profile_name;
	private String act_id;
	private String profile_username;
	private String profile_password;
	private Long __count;

	protected String get_object_type()
	{
		return "managed_device";
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
	 * True if this managed device is specified by user or discovered internally
	 * </pre>
	 */
	public Boolean get_user_driven()
	{
		return this.user_driven;
	}

	/**
	 * <pre>
	 * Default Gateway of managed device
	 * </pre>
	 */
	public void set_gateway(String gateway)
	{
		this.gateway = gateway;
	}

	/**
	 * <pre>
	 * Default Gateway of managed device
	 * </pre>
	 */
	public String get_gateway()
	{
		return this.gateway;
	}


	/**
	 * <pre>
	 * Status of managed device
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
	}

	/**
	 * <pre>
	 * Assign hostname to managed device, if this is not provided, name will be set as host name 
	 * </pre>
	 */
	public void set_hostname(String hostname)
	{
		this.hostname = hostname;
	}

	/**
	 * <pre>
	 * Assign hostname to managed device, if this is not provided, name will be set as host name 
	 * </pre>
	 */
	public String get_hostname()
	{
		return this.hostname;
	}

	/**
	 * <pre>
	 * Netmask of managed device
	 * </pre>
	 */
	public void set_netmask(String netmask)
	{
		this.netmask = netmask;
	}

	/**
	 * <pre>
	 * Netmask of managed device
	 * </pre>
	 */
	public String get_netmask()
	{
		return this.netmask;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the managed devices
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the managed devices
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * IP Address for this managed device
	 * </pre>
	 */
	public void set_ip_address(String ip_address)
	{
		this.ip_address = ip_address;
	}

	/**
	 * <pre>
	 * IP Address for this managed device
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}


	/**
	 * <pre>
	 * State of device, UP only if device accessible
	 * </pre>
	 */
	public String get_instance_state()
	{
		return this.instance_state;
	}


	/**
	 * <pre>
	 * PING State of managed device, 0 is not pinging
	 * </pre>
	 */
	public Integer get_ping_state()
	{
		return this.ping_state;
	}

	/**
	 * <pre>
	 * Device family
	 * </pre>
	 */
	public void set_device_family(String device_family)
	{
		this.device_family = device_family;
	}

	/**
	 * <pre>
	 * Device family
	 * </pre>
	 */
	public String get_device_family()
	{
		return this.device_family;
	}


	/**
	 * <pre>
	 * Device Version
	 * </pre>
	 */
	public String get_version()
	{
		return this.version;
	}


	/**
	 * <pre>
	 * Reason of failure for this managed device
	 * </pre>
	 */
	public String get_reason()
	{
		return this.reason;
	}

	/**
	 * <pre>
	 * Name of managed device
	 * </pre>
	 */
	public void set_name(String name)
	{
		this.name = name;
	}

	/**
	 * <pre>
	 * Name of managed device
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}

	/**
	 * <pre>
	 * Description of managed device
	 * </pre>
	 */
	public void set_description(String description)
	{
		this.description = description;
	}

	/**
	 * <pre>
	 * Description of managed device
	 * </pre>
	 */
	public String get_description()
	{
		return this.description;
	}

	/**
	 * <pre>
	 * Type of device, (Xen | NS)
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * Type of device, (Xen | NS)
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * Device Profile Name that is attached with this managed device
	 * </pre>
	 */
	public void set_profile_name(String profile_name)
	{
		this.profile_name = profile_name;
	}

	/**
	 * <pre>
	 * Device Profile Name that is attached with this managed device
	 * </pre>
	 */
	public String get_profile_name()
	{
		return this.profile_name;
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
	 * User Name specified by the user for this Netscaler Instance.
	 * </pre>
	 */
	public void set_profile_username(String profile_username)
	{
		this.profile_username = profile_username;
	}

	/**
	 * <pre>
	 * User Name specified by the user for this Netscaler Instance.
	 * </pre>
	 */
	public String get_profile_username()
	{
		return this.profile_username;
	}

	/**
	 * <pre>
	 * Password specified by the user for this Netscaler.
	 * </pre>
	 */
	public void set_profile_password(String profile_password)
	{
		this.profile_password = profile_password;
	}

	/**
	 * <pre>
	 * Password specified by the user for this Netscaler.
	 * </pre>
	 */
	public String get_profile_password()
	{
		return this.profile_password;
	}


	/**
	 * <pre>
	 * Use this operation to add managed device.
	 * </pre>
	 */
	public static managed_device add(nitro_service client, managed_device resource) throws Exception
	{
		resource.validate("add");
		return ((managed_device[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to add managed device in bulk.
	 * </pre>
	 */
	public static managed_device[] add(nitro_service client, managed_device[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((managed_device[]) resources[0].perform_operation(client, "add"));
		
		return ((managed_device[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete managed device.
	 * </pre>
	 */
	public static managed_device delete(nitro_service client, managed_device resource) throws Exception
	{
		resource.validate("delete");
		return ((managed_device[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete managed device in bulk.
	 * </pre>
	 */
	public static managed_device[] delete(nitro_service client, managed_device[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((managed_device[]) resources[0].delete_resource(client));
		
		return ((managed_device[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get managed devices.
	 * </pre>
	 */
	public static managed_device[] get(nitro_service client) throws Exception
	{
		managed_device resource = new managed_device();
		resource.validate("get");
		return (managed_device[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of managed_device resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static managed_device[] get_filtered(nitro_service service, String filter) throws Exception
	{
		managed_device obj = new managed_device();
		options option = new options();
		option.set_filter(filter);
		managed_device[] response = (managed_device[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of managed_device resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static managed_device[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		managed_device obj = new managed_device();
		options option = new options();
		option.set_filter(filter);
		managed_device[] response = (managed_device[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the managed_device resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		managed_device obj = new managed_device();
		options option = new options();
		option.set_count(true);
		managed_device[] response = (managed_device[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of managed_device resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		managed_device obj = new managed_device();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		managed_device[] response = (managed_device[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of managed_device resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		managed_device obj = new managed_device();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		managed_device[] response = (managed_device[])obj.get_resources(service, option);
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
		managed_device_response result = (managed_device_response) service.get_payload_formatter().string_to_resource(managed_device_response.class, response);
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
		return result.managed_device;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		managed_device_responses result = (managed_device_responses) service.get_payload_formatter().string_to_resource(managed_device_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.managed_device_response_array);
		}
		managed_device[] result_managed_device = new managed_device[result.managed_device_response_array.length];
		
		for(int i = 0; i < result.managed_device_response_array.length; i++)
		{
			result_managed_device[i] = result.managed_device_response_array[i].managed_device[0];
		}
		
		return result_managed_device;
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
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSString profile_name_validator = new MPSString();
		profile_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		profile_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		profile_name_validator.validate(operationType, profile_name, "\"profile_name\"");
		
		MPSBoolean user_driven_validator = new MPSBoolean();
		user_driven_validator.validate(operationType, user_driven, "\"user_driven\"");
		
		MPSInt ping_state_validator = new MPSInt();
		ping_state_validator.validate(operationType, ping_state, "\"ping_state\"");
		
		MPSString status_validator = new MPSString();
		status_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		status_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSString reason_validator = new MPSString();
		reason_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 1024);
		reason_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		reason_validator.validate(operationType, reason, "\"reason\"");
		
		MPSString name_validator = new MPSString();
		name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[a-zA-Z0-9_#.:@=-]+");
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSIPAddress netmask_validator = new MPSIPAddress();
		netmask_validator.validate(operationType, netmask, "\"netmask\"");
		
		MPSIPAddress gateway_validator = new MPSIPAddress();
		gateway_validator.validate(operationType, gateway, "\"gateway\"");
		
		MPSString hostname_validator = new MPSString();
		hostname_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		hostname_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		hostname_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		hostname_validator.validate(operationType, hostname, "\"hostname\"");
		
		MPSString description_validator = new MPSString();
		description_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 512);
		description_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		description_validator.validate(operationType, description, "\"description\"");
		
		MPSString device_family_validator = new MPSString();
		device_family_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		device_family_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		device_family_validator.validate(operationType, device_family, "\"device_family\"");
		
		MPSString version_validator = new MPSString();
		version_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		version_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		version_validator.validate(operationType, version, "\"version\"");
		
		MPSString instance_state_validator = new MPSString();
		instance_state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		instance_state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		instance_state_validator.validate(operationType, instance_state, "\"instance_state\"");
		
		MPSString profile_username_validator = new MPSString();
		profile_username_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		profile_username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		profile_username_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		profile_username_validator.validate(operationType, profile_username, "\"profile_username\"");
		
		MPSString profile_password_validator = new MPSString();
		profile_password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		profile_password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		profile_password_validator.validate(operationType, profile_password, "\"profile_password\"");
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
	}
}
