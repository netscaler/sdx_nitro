/*
* Copyright (c) 2008-2015 Citrix Systems, Inc.
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

import java.util.Arrays;
import java.util.List;

import com.citrix.sdx.nitro.resource.config.mps.*;
import com.citrix.sdx.nitro.resource.base.*;
import com.citrix.sdx.nitro.datatypes.*;
import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.exception.nitro_exception;
import com.citrix.sdx.nitro.util.filtervalue;

import java.io.*;
import java.util.*;


import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import junit.framework.Assert;
import org.junit.Test;

// This sample code demonstrates basic usage of the NITRO APIs
public class NitroTest {

	private String nsUserName;
	private String nsPassword;
	private String nsIP;

    public void loadXMLFromString() throws Exception
    {
    	URL url = this.getClass().getResource("/config.xml");
    	File xmlFile = new File(url.getFile());
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);
		doc.getDocumentElement().normalize();
	 
	 
		this.nsUserName = doc.getElementsByTagName("username").item(0).getTextContent();
		this.nsPassword = doc.getElementsByTagName("password").item(0).getTextContent();
		this.nsIP = doc.getElementsByTagName("ip").item(0).getTextContent();

		System.out.println(" Config for testing"
			+ "\n NetScaler SDX IP: " + this.nsIP
			+ "\n NetScaler SDX Username: " + this.nsUserName
			+ "\n NetScaler SDX Password: " + this.nsPassword
			);
    }

	@Test
	public void getMPSInfo() { // Retreive basic info from SDX box
		
		try {
			loadXMLFromString();
			//Create an instance of the nitro_service class to connect to the appliance
			com.citrix.sdx.nitro.service.nitro_service ns_session = new com.citrix.sdx.nitro.service.nitro_service(this.nsIP,"HTTP");
			
			//Log on to the appliance using your credentials
			ns_session.set_credential(this.nsUserName,this.nsPassword);
			ns_session.login();
			this.get_mps(ns_session);
			ns_session.logout();

		}catch(nitro_exception error){
			throw new RuntimeException("NITRO Error -> Code " +error.getErrorCode() +" : " +error.getMessage());
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("Error Testing NITRO -> " +e.getMessage());
		}
	}

	
	public static void main(String a[]) {
		new NitroTest().getMPSInfo();
	}
	

	public void get_mps(nitro_service client)
	{
		try
		{
			mps result = mps.get(client);
			System.out.println("Product: " + result.get_product() + ", Build: " + result.get_build_number());
		} catch (nitro_exception e)
		{
			System.out.println("Exception::get_mps::errorcode=" + e.getErrorCode() + ", message=" + e.getMessage());
		} catch (Exception e)
		{
			System.out.println("Exception::get_mps::message=" + e.getMessage());
		}
    }	
}
