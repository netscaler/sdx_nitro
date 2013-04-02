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


class mps_ssl_certkey_response extends base_response
{
	public mps_ssl_certkey[] mps_ssl_certkey;
}

class mps_ssl_certkey_responses extends base_response
{
	public mps_ssl_certkey_response[] mps_ssl_certkey_response_array;
}

/**
 * Configuration for Install SSL certificate on Management Service resource
 */

public class mps_ssl_certkey extends base_resource
{
	private String valid_to;
	private Integer serial_number;
	private Boolean reboot;
	private String signature_algorithm;
	private String subject;
	private String valid_from;
	private String version;
	private String status;
	private String public_key_algorithm;
	private String issuer;
	private Integer days_to_expiry;
	private String ssl_certificate;
	private Integer public_key_size;
	private String password;
	private String ssl_key;
	private String cert_format;
	private Long __count;

	protected String get_object_type()
	{
		return "mps_ssl_certkey";
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
	 * Valid To
	 * </pre>
	 */
	public String get_valid_to()
	{
		return this.valid_to;
	}


	/**
	 * <pre>
	 * Serial Number
	 * </pre>
	 */
	public Integer get_serial_number()
	{
		return this.serial_number;
	}

	/**
	 * <pre>
	 * Reboot the Management Service immediately after installing certificate.
	 * </pre>
	 */
	public void set_reboot(Boolean reboot)
	{
		this.reboot = reboot;
	}

	/**
	 * <pre>
	 * Reboot the Management Service immediately after installing certificate.
	 * </pre>
	 */
	public Boolean get_reboot()
	{
		return this.reboot;
	}


	/**
	 * <pre>
	 * Signature Algorithm
	 * </pre>
	 */
	public String get_signature_algorithm()
	{
		return this.signature_algorithm;
	}


	/**
	 * <pre>
	 * Subject
	 * </pre>
	 */
	public String get_subject()
	{
		return this.subject;
	}


	/**
	 * <pre>
	 * Valid From
	 * </pre>
	 */
	public String get_valid_from()
	{
		return this.valid_from;
	}


	/**
	 * <pre>
	 * Version
	 * </pre>
	 */
	public String get_version()
	{
		return this.version;
	}


	/**
	 * <pre>
	 * Tells whether the certificate is still valid or not
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
	}


	/**
	 * <pre>
	 * Public Key Algorithm
	 * </pre>
	 */
	public String get_public_key_algorithm()
	{
		return this.public_key_algorithm;
	}


	/**
	 * <pre>
	 * Issuer
	 * </pre>
	 */
	public String get_issuer()
	{
		return this.issuer;
	}


	/**
	 * <pre>
	 * Days before SSL certificate expires
	 * </pre>
	 */
	public Integer get_days_to_expiry()
	{
		return this.days_to_expiry;
	}

	/**
	 * <pre>
	 * Certificate
	 * </pre>
	 */
	public void set_ssl_certificate(String ssl_certificate)
	{
		this.ssl_certificate = ssl_certificate;
	}

	/**
	 * <pre>
	 * Certificate
	 * </pre>
	 */
	public String get_ssl_certificate()
	{
		return this.ssl_certificate;
	}


	/**
	 * <pre>
	 * Public Key Size
	 * </pre>
	 */
	public Integer get_public_key_size()
	{
		return this.public_key_size;
	}

	/**
	 * <pre>
	 * The pass-phrase that was used to encrypt the private-key.
	 * </pre>
	 */
	public void set_password(String password)
	{
		this.password = password;
	}

	/**
	 * <pre>
	 * The pass-phrase that was used to encrypt the private-key.
	 * </pre>
	 */
	public String get_password()
	{
		return this.password;
	}

	/**
	 * <pre>
	 * Key
	 * </pre>
	 */
	public void set_ssl_key(String ssl_key)
	{
		this.ssl_key = ssl_key;
	}

	/**
	 * <pre>
	 * Key
	 * </pre>
	 */
	public String get_ssl_key()
	{
		return this.ssl_key;
	}

	/**
	 * <pre>
	 * Certificate Format
	 * </pre>
	 */
	public void set_cert_format(String cert_format)
	{
		this.cert_format = cert_format;
	}

	/**
	 * <pre>
	 * Certificate Format
	 * </pre>
	 */
	public String get_cert_format()
	{
		return this.cert_format;
	}


	/**
	 * <pre>
	 * Use this operation to install certificate on Management Service.
	 * </pre>
	 */
	public static mps_ssl_certkey add(nitro_service client, mps_ssl_certkey resource) throws Exception
	{
		resource.validate("add");
		return ((mps_ssl_certkey[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to install certificate on Management Service in bulk.
	 * </pre>
	 */
	public static mps_ssl_certkey[] add(nitro_service client, mps_ssl_certkey[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((mps_ssl_certkey[]) resources[0].perform_operation(client, "add"));
		
		return ((mps_ssl_certkey[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to get certificate on Management Service.
	 * </pre>
	 */
	public static mps_ssl_certkey[] get(nitro_service client) throws Exception
	{
		mps_ssl_certkey resource = new mps_ssl_certkey();
		resource.validate("get");
		return (mps_ssl_certkey[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of mps_ssl_certkey resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static mps_ssl_certkey[] get_filtered(nitro_service service, String filter) throws Exception
	{
		mps_ssl_certkey obj = new mps_ssl_certkey();
		options option = new options();
		option.set_filter(filter);
		mps_ssl_certkey[] response = (mps_ssl_certkey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of mps_ssl_certkey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static mps_ssl_certkey[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mps_ssl_certkey obj = new mps_ssl_certkey();
		options option = new options();
		option.set_filter(filter);
		mps_ssl_certkey[] response = (mps_ssl_certkey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the mps_ssl_certkey resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		mps_ssl_certkey obj = new mps_ssl_certkey();
		options option = new options();
		option.set_count(true);
		mps_ssl_certkey[] response = (mps_ssl_certkey[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mps_ssl_certkey resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		mps_ssl_certkey obj = new mps_ssl_certkey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mps_ssl_certkey[] response = (mps_ssl_certkey[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of mps_ssl_certkey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		mps_ssl_certkey obj = new mps_ssl_certkey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		mps_ssl_certkey[] response = (mps_ssl_certkey[])obj.get_resources(service, option);
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
		mps_ssl_certkey_response result = (mps_ssl_certkey_response) service.get_payload_formatter().string_to_resource(mps_ssl_certkey_response.class, response);
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
		return result.mps_ssl_certkey;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		mps_ssl_certkey_responses result = (mps_ssl_certkey_responses) service.get_payload_formatter().string_to_resource(mps_ssl_certkey_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.mps_ssl_certkey_response_array);
		}
		mps_ssl_certkey[] result_mps_ssl_certkey = new mps_ssl_certkey[result.mps_ssl_certkey_response_array.length];
		
		for(int i = 0; i < result.mps_ssl_certkey_response_array.length; i++)
		{
			result_mps_ssl_certkey[i] = result.mps_ssl_certkey_response_array[i].mps_ssl_certkey[0];
		}
		
		return result_mps_ssl_certkey;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSString ssl_certificate_validator = new MPSString();
		ssl_certificate_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		ssl_certificate_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ssl_certificate_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		ssl_certificate_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		ssl_certificate_validator.validate(operationType, ssl_certificate, "\"ssl_certificate\"");
		
		MPSString ssl_key_validator = new MPSString();
		ssl_key_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		ssl_key_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		ssl_key_validator.validate(operationType, ssl_key, "\"ssl_key\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSBoolean reboot_validator = new MPSBoolean();
		reboot_validator.validate(operationType, reboot, "\"reboot\"");
		
		MPSString cert_format_validator = new MPSString();
		cert_format_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		cert_format_validator.validate(operationType, cert_format, "\"cert_format\"");
		
		MPSInt days_to_expiry_validator = new MPSInt();
		days_to_expiry_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		days_to_expiry_validator.validate(operationType, days_to_expiry, "\"days_to_expiry\"");
		
		MPSString status_validator = new MPSString();
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSString version_validator = new MPSString();
		version_validator.validate(operationType, version, "\"version\"");
		
		MPSInt serial_number_validator = new MPSInt();
		serial_number_validator.validate(operationType, serial_number, "\"serial_number\"");
		
		MPSString signature_algorithm_validator = new MPSString();
		signature_algorithm_validator.validate(operationType, signature_algorithm, "\"signature_algorithm\"");
		
		MPSString issuer_validator = new MPSString();
		issuer_validator.validate(operationType, issuer, "\"issuer\"");
		
		MPSString valid_from_validator = new MPSString();
		valid_from_validator.validate(operationType, valid_from, "\"valid_from\"");
		
		MPSString valid_to_validator = new MPSString();
		valid_to_validator.validate(operationType, valid_to, "\"valid_to\"");
		
		MPSString subject_validator = new MPSString();
		subject_validator.validate(operationType, subject, "\"subject\"");
		
		MPSString public_key_algorithm_validator = new MPSString();
		public_key_algorithm_validator.validate(operationType, public_key_algorithm, "\"public_key_algorithm\"");
		
		MPSInt public_key_size_validator = new MPSInt();
		public_key_size_validator.validate(operationType, public_key_size, "\"public_key_size\"");
		
	}
}
