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

package com.citrix.sdx.nitro.resource.config.ns;

import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;


class ns_ssl_certkey_response extends base_response
{
	public ns_ssl_certkey[] ns_ssl_certkey;
}

class ns_ssl_certkey_responses extends base_response
{
	public ns_ssl_certkey_response[] ns_ssl_certkey_response_array;
}

/**
 * Configuration for SSL certificate on NetScaler resource
 */

public class ns_ssl_certkey extends base_resource
{
	private String status;
	private Integer days_to_expiry;
	private String ns_ip_address;
	private String ssl_certificate;
	private String certkeypair_name;
	private String device_name;
	private String ssl_key;
	private String cert_format;
	private String id;
	private String valid_to;
	private Integer serial_number;
	private Boolean save_config;
	private String signature_algorithm;
	private String subject;
	private String valid_from;
	private String version;
	private String public_key_algorithm;
	private String issuer;
	private Boolean no_domain_check;
	private String[] ns_ip_address_arr;
	private String password;
	private Integer public_key_size;
	private String csr;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_ssl_certkey";
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
	 * Tells whether the certificate is still valid or not
	 * </pre>
	 */
	public String get_status()
	{
		return this.status;
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
	 * List of NetScaler IP Address
	 * </pre>
	 */
	public void set_ns_ip_address(String ns_ip_address)
	{
		this.ns_ip_address = ns_ip_address;
	}

	/**
	 * <pre>
	 * List of NetScaler IP Address
	 * </pre>
	 */
	public String get_ns_ip_address()
	{
		return this.ns_ip_address;
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
	 * Cert Key Pair Name
	 * </pre>
	 */
	public void set_certkeypair_name(String certkeypair_name)
	{
		this.certkeypair_name = certkeypair_name;
	}

	/**
	 * <pre>
	 * Cert Key Pair Name
	 * </pre>
	 */
	public String get_certkeypair_name()
	{
		return this.certkeypair_name;
	}


	/**
	 * <pre>
	 * Name of the device
	 * </pre>
	 */
	public String get_device_name()
	{
		return this.device_name;
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
	 * Id is system generated key for all ssl cert-keys entries
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all ssl cert-keys entries
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
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
	 * true, if save config is required
	 * </pre>
	 */
	public void set_save_config(Boolean save_config)
	{
		this.save_config = save_config;
	}

	/**
	 * <pre>
	 * true, if save config is required
	 * </pre>
	 */
	public Boolean get_save_config()
	{
		return this.save_config;
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
	 * Specify this option to override the check for matching domain names during certificate update operation
	 * </pre>
	 */
	public void set_no_domain_check(Boolean no_domain_check)
	{
		this.no_domain_check = no_domain_check;
	}

	/**
	 * <pre>
	 * Specify this option to override the check for matching domain names during certificate update operation
	 * </pre>
	 */
	public Boolean get_no_domain_check()
	{
		return this.no_domain_check;
	}

	/**
	 * <pre>
	 * List of NetScaler IP Address
	 * </pre>
	 */
	public void set_ns_ip_address_arr(String[] ns_ip_address_arr)
	{
		this.ns_ip_address_arr = ns_ip_address_arr;
	}

	/**
	 * <pre>
	 * List of NetScaler IP Address
	 * </pre>
	 */
	public String[] get_ns_ip_address_arr()
	{
		return this.ns_ip_address_arr;
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
	 * Public Key Size
	 * </pre>
	 */
	public Integer get_public_key_size()
	{
		return this.public_key_size;
	}


	/**
	 * <pre>
	 * Certificate Signing Request
	 * </pre>
	 */
	public String get_csr()
	{
		return this.csr;
	}


	/**
	 * <pre>
	 * Use this operation to install certificates on NetScaler Instance(s).
	 * </pre>
	 */
	public static ns_ssl_certkey add(nitro_service client, ns_ssl_certkey resource) throws Exception
	{
		resource.validate("add");
		return ((ns_ssl_certkey[]) resource.perform_operation(client, "add"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to install certificates on NetScaler Instance(s) in bulk.
	 * </pre>
	 */
	public static ns_ssl_certkey[] add(nitro_service client, ns_ssl_certkey[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("add");
		}
		
		if(resources.length == 1)
			return ((ns_ssl_certkey[]) resources[0].perform_operation(client, "add"));
		
		return ((ns_ssl_certkey[]) perform_operation_bulk_request(client, resources, "add"));
	}

	/**
	 * <pre>
	 * Use this operation to delete certificates on NetScaler Instance(s).
	 * </pre>
	 */
	public static ns_ssl_certkey delete(nitro_service client, ns_ssl_certkey resource) throws Exception
	{
		resource.validate("delete");
		return ((ns_ssl_certkey[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete certificates on NetScaler Instance(s) in bulk.
	 * </pre>
	 */
	public static ns_ssl_certkey[] delete(nitro_service client, ns_ssl_certkey[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((ns_ssl_certkey[]) resources[0].delete_resource(client));
		
		return ((ns_ssl_certkey[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to get certificates on NetScaler Instance(s).
	 * </pre>
	 */
	public static ns_ssl_certkey[] get(nitro_service client) throws Exception
	{
		ns_ssl_certkey resource = new ns_ssl_certkey();
		resource.validate("get");
		return (ns_ssl_certkey[]) resource.get_resources(client);
	}

	/**
	 * Use this operation to get certificates on NetScaler Instance(s).
	 */
	public static ns_ssl_certkey get(nitro_service client, ns_ssl_certkey resource) throws Exception
	{
		resource.validate("get");
		return ((ns_ssl_certkey[]) resource.get_resources(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to get certificates on NetScaler Instance(s) in bulk.
	 * </pre>
	 */

	/**
	 * <pre>
	 * Use this operation to modify certificates on NetScaler Instance(s).
	 * </pre>
	 */
	public static ns_ssl_certkey modify(nitro_service client, ns_ssl_certkey resource) throws Exception
	{
		resource.validate("modify");
		return ((ns_ssl_certkey[]) resource.update_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify certificates on NetScaler Instance(s) in bulk.
	 * </pre>
	 */
	public static ns_ssl_certkey[] modify(nitro_service client, ns_ssl_certkey[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("modify");
		}
		
		if(resources.length == 1)
			return ((ns_ssl_certkey[]) resources[0].update_resource(client));
		
		return ((ns_ssl_certkey[]) update_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Use this operation to generate CSR for the certificate.
	 * </pre>
	 */
	public static ns_ssl_certkey gen_csr(nitro_service client, ns_ssl_certkey resource) throws Exception
	{
		return ((ns_ssl_certkey[]) resource.perform_operation(client, "gen_csr"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to generate CSR for the certificate in bulk.
	 * </pre>
	 */
	public static ns_ssl_certkey[] gen_csr(nitro_service client, ns_ssl_certkey[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_ssl_certkey[]) resources[0].perform_operation(client, "gen_csr"));
		
		return ((ns_ssl_certkey[]) perform_operation_bulk_request(client, resources, "gen_csr"));
	}

	/**
	* Use this API to fetch filtered set of ns_ssl_certkey resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_ssl_certkey[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ssl_certkey obj = new ns_ssl_certkey();
		options option = new options();
		option.set_filter(filter);
		ns_ssl_certkey[] response = (ns_ssl_certkey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_ssl_certkey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_ssl_certkey[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ssl_certkey obj = new ns_ssl_certkey();
		options option = new options();
		option.set_filter(filter);
		ns_ssl_certkey[] response = (ns_ssl_certkey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_ssl_certkey resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_ssl_certkey obj = new ns_ssl_certkey();
		options option = new options();
		option.set_count(true);
		ns_ssl_certkey[] response = (ns_ssl_certkey[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ssl_certkey resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_ssl_certkey obj = new ns_ssl_certkey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ssl_certkey[] response = (ns_ssl_certkey[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_ssl_certkey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_ssl_certkey obj = new ns_ssl_certkey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_ssl_certkey[] response = (ns_ssl_certkey[])obj.get_resources(service, option);
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
		ns_ssl_certkey_response result = (ns_ssl_certkey_response) service.get_payload_formatter().string_to_resource(ns_ssl_certkey_response.class, response);
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
		return result.ns_ssl_certkey;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_ssl_certkey_responses result = (ns_ssl_certkey_responses) service.get_payload_formatter().string_to_resource(ns_ssl_certkey_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_ssl_certkey_response_array);
		}
		ns_ssl_certkey[] result_ns_ssl_certkey = new ns_ssl_certkey[result.ns_ssl_certkey_response_array.length];
		
		for(int i = 0; i < result.ns_ssl_certkey_response_array.length; i++)
		{
			result_ns_ssl_certkey[i] = result.ns_ssl_certkey_response_array[i].ns_ssl_certkey[0];
		}
		
		return result_ns_ssl_certkey;
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
		
		MPSString certkeypair_name_validator = new MPSString();
		certkeypair_name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		certkeypair_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		certkeypair_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		certkeypair_name_validator.setConstraintIsReq(MPSConstants.ADD_CONSTRAINT, true);
		certkeypair_name_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		certkeypair_name_validator.validate(operationType, certkeypair_name, "\"certkeypair_name\"");
		
		MPSString cert_format_validator = new MPSString();
		cert_format_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 64);
		cert_format_validator.validate(operationType, cert_format, "\"cert_format\"");
		
		MPSInt days_to_expiry_validator = new MPSInt();
		days_to_expiry_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		days_to_expiry_validator.validate(operationType, days_to_expiry, "\"days_to_expiry\"");
		
		MPSIPAddress ns_ip_address_validator = new MPSIPAddress();
		ns_ip_address_validator.validate(operationType, ns_ip_address, "\"ns_ip_address\"");
		
		MPSString status_validator = new MPSString();
		status_validator.validate(operationType, status, "\"status\"");
		
		MPSString device_name_validator = new MPSString();
		device_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		device_name_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		device_name_validator.validate(operationType, device_name, "\"device_name\"");
		
		MPSIPAddress ns_ip_address_arr_validator = new MPSIPAddress();
		ns_ip_address_arr_validator.setConstraintIsReq(MPSConstants.GENERIC_CONSTRAINT, true);
		if(ns_ip_address_arr != null)
		{
			for(int i=0; i<ns_ip_address_arr.length; i++)
			{
				ns_ip_address_arr_validator.validate(operationType, ns_ip_address_arr[i], "ns_ip_address_arr["+i+"]");
			}
		}
		
		MPSBoolean save_config_validator = new MPSBoolean();
		save_config_validator.validate(operationType, save_config, "\"save_config\"");
		
		MPSBoolean no_domain_check_validator = new MPSBoolean();
		no_domain_check_validator.validate(operationType, no_domain_check, "\"no_domain_check\"");
		
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
		
		MPSString csr_validator = new MPSString();
		csr_validator.validate(operationType, csr, "\"csr\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_validator.validate(operationType, password, "\"password\"");
		
	}
}
