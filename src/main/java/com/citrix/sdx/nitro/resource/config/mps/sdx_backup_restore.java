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


class sdx_backup_restore_response extends base_response
{
	public sdx_backup_restore[] sdx_backup_restore;
}

class sdx_backup_restore_responses extends base_response
{
	public sdx_backup_restore_response[] sdx_backup_restore_response_array;
}

/**
 * Configuration for Backup resource
 */

public class sdx_backup_restore extends base_resource
{
	private String act_id;
	private String file_name;
	private String[] ip_address_list;
	private String name;
	private String type;
	private String ip_address;
	private Integer reset_type;
	private Long __count;

	protected String get_object_type()
	{
		return "sdx_backup_restore";
	}

	/**
	 * Returns the value of object identifier argument.
	 */
	protected String get_object_id()
	{
		return file_name;
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
	 * File Name
	 * </pre>
	 */
	public void set_file_name(String file_name)
	{
		this.file_name = file_name;
	}

	/**
	 * <pre>
	 * File Name
	 * </pre>
	 */
	public String get_file_name()
	{
		return this.file_name;
	}

	/**
	 * <pre>
	 * List of VM IP Address
	 * </pre>
	 */
	public void set_ip_address_list(String[] ip_address_list)
	{
		this.ip_address_list = ip_address_list;
	}

	/**
	 * <pre>
	 * List of VM IP Address
	 * </pre>
	 */
	public String[] get_ip_address_list()
	{
		return this.ip_address_list;
	}


	/**
	 * <pre>
	 * Name of VM device
	 * </pre>
	 */
	public String get_name()
	{
		return this.name;
	}


	/**
	 * <pre>
	 * Type of device, (br | ns)
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}


	/**
	 * <pre>
	 * IP Address for this VM device
	 * </pre>
	 */
	public String get_ip_address()
	{
		return this.ip_address;
	}

	/**
	 * <pre>
	 * Reset Type [0: Reset (Without Network Configuration), 1: Reset (With Network Configuration), 2: Appliance Reset, 3: Appliance Restore, 4: Instance Restore, 5: Backup ]
	 * </pre>
	 */
	public void set_reset_type(Integer reset_type)
	{
		this.reset_type = reset_type;
	}

	/**
	 * <pre>
	 * Reset Type [0: Reset (Without Network Configuration), 1: Reset (With Network Configuration), 2: Appliance Reset, 3: Appliance Restore, 4: Instance Restore, 5: Backup ]
	 * </pre>
	 */
	public Integer get_reset_type()
	{
		return this.reset_type;
	}


	/**
	 * <pre>
	 * Use this operation to Restore factory default.
	 * </pre>
	 */
	public static sdx_backup_restore factory_default(nitro_service client, sdx_backup_restore resource) throws Exception
	{
		return ((sdx_backup_restore[]) resource.perform_operation(client, "factory_default"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to Restore factory default in bulk.
	 * </pre>
	 */
	public static sdx_backup_restore[] factory_default(nitro_service client, sdx_backup_restore[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((sdx_backup_restore[]) resources[0].perform_operation(client, "factory_default"));
		
		return ((sdx_backup_restore[]) perform_operation_bulk_request(client, resources, "factory_default"));
	}

	/**
	 * <pre>
	 * Use this operation to Restore.
	 * </pre>
	 */
	public static sdx_backup_restore restore(nitro_service client, sdx_backup_restore resource) throws Exception
	{
		return ((sdx_backup_restore[]) resource.perform_operation(client, "restore"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to Restore in bulk.
	 * </pre>
	 */
	public static sdx_backup_restore[] restore(nitro_service client, sdx_backup_restore[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((sdx_backup_restore[]) resources[0].perform_operation(client, "restore"));
		
		return ((sdx_backup_restore[]) perform_operation_bulk_request(client, resources, "restore"));
	}

	/**
	 * <pre>
	 * Use this operation to Backup.
	 * </pre>
	 */
	public static sdx_backup_restore backup(nitro_service client) throws Exception
	{
		sdx_backup_restore resource = new sdx_backup_restore();
		return ((sdx_backup_restore[]) resource.perform_operation(client, "backup"))[0];
	}

	/**
	 * <pre>
	 * Converts API response into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception
	{
		sdx_backup_restore_response result = (sdx_backup_restore_response) service.get_payload_formatter().string_to_resource(sdx_backup_restore_response.class, response);
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
		return result.sdx_backup_restore;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		sdx_backup_restore_responses result = (sdx_backup_restore_responses) service.get_payload_formatter().string_to_resource(sdx_backup_restore_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.sdx_backup_restore_response_array);
		}
		sdx_backup_restore[] result_sdx_backup_restore = new sdx_backup_restore[result.sdx_backup_restore_response_array.length];
		
		for(int i = 0; i < result.sdx_backup_restore_response_array.length; i++)
		{
			result_sdx_backup_restore[i] = result.sdx_backup_restore_response_array[i].sdx_backup_restore[0];
		}
		
		return result_sdx_backup_restore;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString file_name_validator = new MPSString();
		file_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 256);
		file_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		file_name_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		file_name_validator.validate(operationType, file_name, "\"file_name\"");
		
		MPSInt reset_type_validator = new MPSInt();
		reset_type_validator.validate(operationType, reset_type, "\"reset_type\"");
		
		MPSString name_validator = new MPSString();
		name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		name_validator.validate(operationType, name, "\"name\"");
		
		MPSIPAddress ip_address_validator = new MPSIPAddress();
		ip_address_validator.validate(operationType, ip_address, "\"ip_address\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		type_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSIPAddress ip_address_list_validator = new MPSIPAddress();
		if(ip_address_list != null)
		{
			for(int i=0; i<ip_address_list.length; i++)
			{
				ip_address_list_validator.validate(operationType, ip_address_list[i], "ip_address_list["+i+"]");
			}
		}
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
	}
}
