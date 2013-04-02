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

package com.citrix.sdx.nitro.service;

import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.resource.base.ipayload_formatter;
import com.citrix.sdx.nitro.resource.base.Json;
import com.citrix.sdx.nitro.resource.base.login;

/**
 * nitro_service is client interface through which Nitro operations are performed on resources.
 */
public class nitro_service
{
	private String user_name;
	private String password;
	private Integer timeout;
	private String ipaddress;
	private String version;
	private String sessionid;
	private String protocol;
	private ipayload_formatter format;
	private OnerrorEnum onerror;
	
	public enum OnerrorEnum{
		EXIT, CONTINUE
	}

	/**
	 * nitro_service class constructor specifying ip.
	 * @param ip IPAddress of the NetScaler SDX on which configuration is to be run.
	 */
	public nitro_service(String ip) throws nitro_exception
	{
		this(ip, new Json(), "http");
	}

	/**
	 * nitro_service class constructor specifying ip and protocol.
	 * @param ip IPaddress of the NetScaler SDX on which configuration is to be run.
	 * @param protocol Protocol.
	 */
	public nitro_service(String ip, String protocol) throws nitro_exception
	{
		this(ip, new Json(), protocol);
	}

	/**
	 * nitro_service class constructor specifying ip and format.
	 * @param ip IPAdress of the NetScaler SDX on which configuration is to be run.
	 * @param format payload format, eg: Json, XML
	 */
	public nitro_service(String ip, ipayload_formatter format)throws nitro_exception
	{
		this(ip, format, "http");
	}

	/**
	 * nitro_service class constructor specifying ip, format and protocol.
	 * @param ip IPaddress of the NetScaler SDX on which configuration is to be run.
	 * @param format format wire language to be used. eg: Json, XML
	 * @param protocol Protocol.
	 */
	public nitro_service(String ip, ipayload_formatter format,String protocol)throws nitro_exception
	{
		set_protocol(protocol);

		this.ipaddress = ip;
		this.version = "v1";
		this.format = format;
		if(this.format == null)
			this.format = (ipayload_formatter) new Json();
	}
	
    /**
	 * sets the session id. 
	 * @param id session id
     */
    public void set_sessionid(String id)
    {
		this.sessionid = id;
	}

	/**
	 * sets the credentials for the NetScaler SDX.
	 * @param username Username of the NetScaler SDX
	 * @param password Password for the NetScaler SDX.
	 */
	public void set_credential(String username, String password)
	{
		this.user_name = username;
		this.password = password;
	}

	/**
	 * sets the credentials for the NetScaler SDX. 
	 * @param timeout session timeout of the NetScaler SDX. Default is 30 mins.
	 */
	public void set_timeout(int timeout)
	{
		this.timeout = new Integer(timeout);
	}
	
	/**
	 * sets the credentials for the NetScaler SDX. 
	 * @param timeout session timeout of the NetScaler SDX. Default is 30 mins.
	 */
	public void set_timeout(Integer timeout)
	{
		this.timeout = timeout;
	}

	/**
	 * Checks login status.
	 * @return true if logged-in else false.
	 */
	public  boolean isLogin()
	{
		if (this.sessionid == null)
			return false;

		return true;
	}

	/**
	 * Gets the IPaddress of the NetScaler SDX.
	 * @return IPaddress.
	 */
	public String get_ipaddress()
	{
		return this.ipaddress;
	}

	/**
	 * Gets the nitro version.
	 * @return nitro version.
	 */
	public String get_version()
	{
		return this.version;
	}

	/**
	 * Gets the sessionId.
	 * @return sessionId.
	 */
	public String get_sessionid()
	{
		return this.sessionid;
	}

	/**
	 * Gets the protocol.
	 * @return Returns the protocol.
	 */
	public String get_protocol()
	{
		return protocol;
	}

	/**
	 * Sets the protocol.
	 * @param protocol The protocol to be set.
	 */
	public void set_protocol(String protocol) throws nitro_exception
	{
		if (protocol == null || !(protocol.equalsIgnoreCase("http") || protocol.equalsIgnoreCase("https"))) 
		{
			throw new nitro_exception("error: protocol value " + protocol + " is not supported");
		}
		this.protocol = protocol;
	}
	
	/**
	 * Gets the onerror status of the MPS Resource.
	 * @return onerror status.
	 */
	public String get_onerror()
	{
		if(this.onerror != null)
		{
		return this.onerror.toString();
		}
		return "";
	}
	
	/**
	 * Sets the onerror status of the MPS Resources.
	 * @param val This option is applicable for bulk requests.
	 * possible values: EXIT, CONTINUE.
	 * if set with EXIT: exists on the first encountered error.
	 * if set with CONTINUE: executes all the requests irrespective of individual response status. 
	 */
	public void set_onerror(OnerrorEnum val)
	{
		this.onerror = val;
	}
	
	/**
	 * Returns payload format.
	 * @return Returns the ijson.
	 */
	public ipayload_formatter get_payload_formatter()
	{
		return this.format;
	}
	
	/**
	* <pre>
	* Use this API to login into NetScaler SDX.
	* @return status of the operation performed.
	* @throws nitro_exception nitro exception is thrown.
	* </pre>
	*/
	public login login() throws Exception
	{
		login login_obj = new login();
		login_obj.set_username(this.user_name);
		login_obj.set_password(this.password);
		login_obj.set_session_timeout(this.timeout);
		
		login result = login.add(this, login_obj);
		sessionid = result.get_sessionid();
		
		return result;
	}

	/**
    * Use this API to clear the current session.
    */
    public void clear_session()
    {
        this.sessionid = null;
    }

	/**
	 * Use this to API to re login into NetScaler SDX.
	 * @return status of the operation performed.
	 * @throws Exception nitro exception is thrown.
	 */
	public login relogin() throws Exception
	{
		this.sessionid = null;
		return this.login();
	}

	/**
	 * Use this API to login into NetScaler SDX.
	 * @param username Username
	 * @param password Password for the NetScaler SDX.
	 * @return status of the operation performed.
	 * @throws Exception nitro exception is thrown.
	 */
	public login login(String username, String password) throws Exception
	{
		this.set_credential(username, password);
		return this.login();
	}

	/**
	 * Use this API to login into NetScaler SDX.
	 * @param username Username
	 * @param password Password for the NetScaler SDX.
	 * @param timeout timeout for NetScaler SDX session. Default is 30mins
	 * @return status of the operation performed.
	 * @throws Exception nitro exception is thrown.
	 */
	public login login(String username, String password, Integer timeout) throws Exception
	{
		this.set_credential(username, password);
		this.set_timeout(timeout);
		return this.login();
	}

	/**
	* <pre>
	* Use this API to logout from current session.
	* @return status of the operation performed.
	* </pre>
	*/
	public login logout() throws Exception
	{
		if(sessionid == null || sessionid.length() <= 0)
			throw new Exception("User not logged-in");
		
		login logout_obj = new login();
		logout_obj.set_sessionid(sessionid);
		
		login result = login.delete(this, logout_obj);
		sessionid = null;
		user_name = null;
		password = null;
		return result;
	}
}