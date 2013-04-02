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

package com.citrix.sdx.nitro.resource.base;

import java.io.*;
import java.net.*;
import javax.net.ssl.*;

import java.util.zip.*;
import javax.net.*;

import com.citrix.sdx.nitro.service.nitro_service;
import com.citrix.sdx.nitro.service.options;
import com.citrix.sdx.nitro.util.nitro_util;

/**
 * base_resource is a abstract base class for all the NetScaler SDX resources.
 */
public abstract class base_resource
{
	public static final int SESSION_NOT_EXISTS = 444;
	
	protected abstract base_resource[] get_nitro_response(nitro_service service, String str) throws Exception;
	protected abstract base_resource[] get_nitro_bulk_response(nitro_service service, String str) throws Exception;
	protected abstract String get_object_id();
	
	/**
	 * Gets the resource type.
	 * @return Resource Type.
	 */
	protected String get_object_type()
	{
		return "";
	}

	/**
	 * Converts MPS resource to Json string.
	 * @param service nitro_service object.
	 * @param option Options object.
	 * @return  string in Json format.
	 */
	protected String resource_to_string(nitro_service service, options option)
	{
		String onerror = service.get_onerror();
		return service.get_payload_formatter().resource_to_string(this, option, onerror);
	}

	/**
	 * Converts MPS resource to Json string.
	 * @param service nitro_service object
	 * @return  string in Json format.
	 */
	protected String resource_to_string(nitro_service service)
	{
		return service.get_payload_formatter().resource_to_string(this);
	}

	/**
	 * Use this method to perform a filtered get operation on MPS resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return Array of API resources of given resource type.
	 * @throws Exception API exception is thrown.
	 */
	protected base_resource[] getfiltered(nitro_service service, options option) throws Exception
	{
		if (!service.isLogin())
			service.login();
		String response = _get(service, option);
		return get_nitro_response(service, response);
	}

	/**
	 * Use this method to perform a get operation on MPS resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return Array of API resources of specified type.
	 * @throws Exception API exception is thrown.
	 */
	protected base_resource[] get_resources(nitro_service service) throws Exception
	{
		return get_resources(service, null);
	}

	/**
	 * Use this method to perform a get operation on MPS resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return Array of API resources of specified type.
	 * @throws Exception API exception is thrown.
	 */
	protected base_resource[] get_resources(nitro_service service, options option) throws Exception
	{
		if (!service.isLogin())
			service.login();
		String response = _get(service, option);
		return get_nitro_response(service, response);
	}

	/**
	 * Use this method to perform a get operation on MPS resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return Array of API resources of specified type.
	 * @throws Exception API exception is thrown.
	 */
	protected base_resource get_resource(nitro_service service, options option) throws Exception
	{
		if (!service.isLogin())
			service.login();
		String response = _get(service, option);
		return get_nitro_response(service, response)[0];
	}

	/**
	 * Use this method to perform a get operation on MPS resource.
	 * @param service nitro_service object.
	 * @return Array of API resources of specified type.
	 * @throws Exception API exception is thrown.
	 */
	protected base_resource get_resource(nitro_service service) throws Exception
	{
		return get_resource(service, null);
	}

	/**
	 * Use this method to perform a start/stop/reboot/ ...etc
	 * operation on MPS resource.
	 * @param service nitro_service object.
	 * @param action action needs to be taken on resource.
	 * @return status of the operation performed.
	 * @throws Exception API exception is thrown.
	 */
	public base_resource[] perform_operation(nitro_service service, String action)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();
		options option = new options();
		option.set_action(action);
		return post_request(service, option);
	}

	/**
	 * Use this method to perform a any post operation ...etc 
	 * operation on MPS resource.
	 * @param service nitro_service object. 
	 * @return status of the operation performed.
	 * @throws Exception API exception is thrown.
	 */
	public base_resource[] perform_operation(nitro_service service)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();
		return post_request(service, null);
	}
	
	/**
	 * Use this method to perform a post operation...etc
	 * operation on MPS resource.
	 * @param service nitro_service object.
	 * @param option options object with action that is to be performed set.
	 * @return status of the operation performed.
	 * @throws Exception API exception is thrown.
	 */
	public base_resource[] perform_operation(nitro_service service, options option)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();
		return post_request(service, option);
	}

	/**
	 * Use this method to perform a Add operation on netscaler resource.
	 * @param service nitro_service object.
	 * @param option Options class object.
	 * @return status of the operation performed.
	 * @throws Exception if invalid input is given.
	 */
	private base_resource[] post_request(nitro_service service, options option)  throws Exception
	{
		return add_resource(service, option);
	}

	/**
	 * Use this method to perform a add operation on MPS resource.
	 * @param service nitro_service object.
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected base_resource[] add_resource(nitro_service service)  throws Exception
	{
		return add_resource(service, null);
	}

	/**
	 * Use this method to perform a add operation on MPS resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected base_resource[] add_resource(nitro_service service, options option)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();
		
		String request = resource_to_string(service, option);
		return post_data(service, request);
	}

	private base_resource[] post_data(nitro_service service, String request) throws Exception
	{
		String response = _post(service, request, get_object_type());
		return get_nitro_response(service, response);
	}

	/**
	 * Use this method to perform a modify operation on MPS resource.
	 * @param service nitro_service object.
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected base_resource[] update_resource(nitro_service service)  throws Exception
	{
		return update_resource(service, null);
	}

	/**
	 * Use this method to perform a modify operation on MPS resource.
	 * @param service nitro_service object.
	 * @param option options class object.
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected base_resource[] update_resource(nitro_service service, options option)  throws Exception
	{
		if (!service.isLogin() && !get_object_type().equals("login"))
			service.login();
		String request = resource_to_string(service, option);
		return put_data(service,request);
	}

	private base_resource[] put_data(nitro_service service, String request) throws Exception
	{
		String response = _put(service, request, get_object_type());
		return get_nitro_response(service, response);
	}

	/**
	 * Use this method to perform a delete operation on MPS resource.
	 * @param service nitro_service object
	 * @return status of the operation performed.
	 * @throws Exception API exception is thrown.
	 */
	protected base_resource[] delete_resource(nitro_service service) throws Exception
	{
		if (!service.isLogin())
			service.login();

		String str = nitro_util.object_to_string_withoutquotes(this);
		String response = _delete(service, str);
		
		return get_nitro_response(service, response);
	}
		
	/**
	 * This method, forms the http GET request, applies on the MPS.
	 * Reads the response from the MPS and converts it to corresponding
	 * resource type.
	 * @param service
	 * @param option
	 * @return Array of requested resources.
	 */
	private String _get(nitro_service service, options option) throws Exception
	{
		StringBuilder responseStr = new StringBuilder();
		HttpURLConnection httpURLConnection = null;
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String version = service.get_version();
			String sessionid = service.get_sessionid();
			String objtype = get_object_type();
			String protocol = service.get_protocol();
			// build URL
			urlstr = protocol + "://" + ipaddress + "/nitro/" + version + "/config/" + objtype;

			String name = this.get_object_id();
			if (name != null && name.length() > 0)
			{
				urlstr = urlstr + "/" + nitro_util.encode(nitro_util.encode(name));
			}
			
			if (option != null)
			{
				String optionstr = option.to_string();
				if (optionstr.length() > 0)
				{
					urlstr = urlstr + "?" + optionstr;
				}
			}
			
			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();

			httpURLConnection.setRequestMethod("GET");

			if(sessionid != null)
			{
				httpURLConnection.setRequestProperty("Cookie", "SESSID=" + nitro_util.encode(sessionid));
				if (option != null && option.get_compression())
					httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
			}

			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because MPS currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}

			InputStream input = httpURLConnection.getInputStream();
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}

			httpURLConnection.disconnect();
			input.close();
		}
		catch (MalformedURLException mue)
		{
			System.err.println("Invalid URL");
		}
		catch (IOException ioe)
		{
			System.err.println("I/O Error - " + ioe);
		}
		catch(Exception e)
		{
			System.err.println("Error - " + e);
		}
		
		return responseStr.toString();
	}

	/**
	 * This method, forms the http POST request, applies on the MPS.
	 * Reads the response from the MPS and converts it to base response.
	 * @param service
	 * @param request
	 * @return
	 * @throws Exception
	 */
	private static String _post(nitro_service service, String request, String objtype) throws Exception 
	{
		HttpURLConnection httpURLConnection;
		StringBuilder responseStr = new StringBuilder();
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String sessionid = service.get_sessionid();
			String version = service.get_version();
			String protocol = service.get_protocol();
			urlstr = protocol + "://" + ipaddress + "/nitro/" + version + "/config/" + objtype;

			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod("POST");
			
			if(sessionid != null)
			{
				httpURLConnection.setRequestProperty("Cookie", "SESSID=" + nitro_util.encode(sessionid));
				httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
			}

			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because MPS currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}
			httpURLConnection.setDoInput(true);
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			request = "object=" + request;
			OutputStreamWriter ouput = new OutputStreamWriter(httpURLConnection.getOutputStream());
			ouput.write(request);
			ouput.flush();
			ouput.close();

			InputStream input = httpURLConnection.getInputStream();
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}			
			
			input.close();
			httpURLConnection.disconnect();
		}
		catch (MalformedURLException mue)
		{
			System.err.println("Invalid URL");
		}
		catch (IOException ioe)
		{
			System.err.println("I/O Error - " + ioe);
		}
		catch(Exception e)
		{
			System.err.println("Error - " + e);
		}
		
		return responseStr.toString();
	}

	/**
	 * This method, forms the http PUT request, applies on the MPS.
	 * Reads the response from the MPS and converts it to base response.
	 * @param service nitro_service object.
	 * @param request Json request.
	 * @return status of the operation performed.
	 * @throws Exception API exception is thrown.
	 */
	private static String _put(nitro_service service, String request, String objtype) throws Exception 
	{
		HttpURLConnection httpURLConnection;
		StringBuilder responseStr = new StringBuilder();
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String sessionid = service.get_sessionid();
			String version = service.get_version();
			String protocol = service.get_protocol();
			urlstr = protocol + "://" + ipaddress + "/nitro/" + version + "/config/" + objtype;
			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod("PUT");
			
			if(sessionid != null)
			{
				httpURLConnection.setRequestProperty("Cookie", "SESSID=" + nitro_util.encode(sessionid));
				httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
			}
			
			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because MPS currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}
			httpURLConnection.setDoInput(true);
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			httpURLConnection.setDoOutput(true);
			OutputStreamWriter ouput = new OutputStreamWriter(httpURLConnection.getOutputStream());
			ouput.write(request);
			ouput.flush();
			ouput.close();

			InputStream input = httpURLConnection.getInputStream();
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}

			httpURLConnection.disconnect();
			input.close();
		}
		catch (MalformedURLException mue)
		{
			System.err.println("Invalid URL");
		}
		catch (IOException ioe)
		{
			System.err.println("I/O Error - " + ioe);
		}
		catch(Exception e)
		{
			System.err.println("Error - " + e);
		}

		return responseStr.toString();
	}

	/**
	 * This method, forms the http DELETE request, applies on the MPS.
	 * Reads the response from the MPS and converts it to base response.
	 * @param service
	 * @param req_args
	 * @return
	 * @throws Exception
	 */
	private String _delete(nitro_service service, String req_args) throws Exception
	{
		StringBuilder responseStr = new StringBuilder();
		HttpURLConnection httpURLConnection = null;
		try
		{
			String urlstr;
			String ipaddress = service.get_ipaddress();
			String version = service.get_version();
			String sessionid = service.get_sessionid();
			String objtype = get_object_type();
			String protocol = service.get_protocol();
			// build URL
			urlstr = protocol + "://" + ipaddress + "/nitro/" + version + "/config/" + objtype;

			String name = this.get_object_id();
			if (name != null && name.length() > 0)
			{
				urlstr = urlstr + "/" + nitro_util.encode(nitro_util.encode(name));
			}

			/*if(req_args != null && req_args.length() > 0)
			{
				urlstr = urlstr + "?args=" + req_args;
			}*/

			URL url = new URL(urlstr);
			httpURLConnection = (HttpURLConnection) url.openConnection();

			httpURLConnection.setRequestMethod("DELETE");

			if(sessionid != null)
			{
				httpURLConnection.setRequestProperty("Cookie", "SESSID=" + nitro_util.encode(sessionid));
				httpURLConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
			}
			
			if (httpURLConnection instanceof HttpsURLConnection)
			{
				SSLContext sslContext = SSLContext.getInstance("SSL");
				//we are using an empty trust manager, because MPS currently presents
				//a test certificate not issued by any signing authority, so we need to bypass
				//the credentials check
				sslContext.init(null, new TrustManager[]{new EmptyTrustManager()}, null);
				SocketFactory sslSocketFactory = sslContext.getSocketFactory();

				HttpsURLConnection secured = (HttpsURLConnection) httpURLConnection;
				secured.setSSLSocketFactory((SSLSocketFactory)sslSocketFactory);
				secured.setHostnameVerifier(new EmptyHostnameVerifier());
			}

			InputStream input = httpURLConnection.getInputStream();
			String contentEncoding = httpURLConnection.getContentEncoding();
			//	get correct input stream for compressed data:
			if (contentEncoding != null)
			{
				if(contentEncoding.equalsIgnoreCase("gzip"))
					input = new GZIPInputStream(input); //reads 2 bytes to determine GZIP stream!
				else if(contentEncoding.equalsIgnoreCase("deflate"))
					input = new InflaterInputStream(input);
			}

			int numOfTotalBytesRead;
			byte [] buffer = new byte[1024];
			while ((numOfTotalBytesRead = input.read(buffer, 0, buffer.length)) != -1)
			{
				responseStr.append(new String(buffer, 0, numOfTotalBytesRead));
			}

			httpURLConnection.disconnect();
			input.close();
		}
		catch (MalformedURLException mue)
		{
			System.err.println("Invalid URL");
		}
		catch (IOException ioe)
		{
			System.err.println("I/O Error - " + ioe);
		}
		catch(Exception e)
		{
			System.err.println("Error - " + e);
		}		
		
		return responseStr.toString();	
	}
	
	/**
	 * This method, performs validation for all data of the resource.
	 * @param operationType : add,delete,modify,get etc.
	 * @throws Exception
	 */
	protected void validate(String operationType) throws Exception
	{
	}
	
	/**
	 * Use this method to perform add/reboot/stop/reboot  ...etc 
	 * operation on multiple MPS resources.
	 * @param service nitro_service object. 
	 * @param resources Array of Nitro resources on which the specified action to be performed.
	 * @param option options object with action that is to be performed set.
	 * @return array of resources on which operation performed.
	 * @throws Exception Nitro exception is thrown.
	 */
	protected static base_resource[] perform_operation_bulk_request(nitro_service service,base_resource resources[], String action ) throws Exception
	{
		if (!service.isLogin())
			service.login();
		
		String objtype = resources[0].get_object_type();

		options option = new options();
		option.set_action(action);		
		String onerror = service.get_onerror();
		//String id = service.get_sessionid();
		String request = service.get_payload_formatter().resource_to_string(resources, option, onerror);
		String result = post_bulk_data(service,request,objtype);
		if(resources.length == 1)
			return resources[0].get_nitro_response(service, result);
	
		return resources[0].get_nitro_bulk_response(service, result);
	}
	
	/**
	 * Use this method to perform a modify operation on multiple MPS resources.
	 * @param service nitro_service object.
	 * @return status of the operation performed.
	 * @throws Exception
	 */
	protected static base_resource[] update_bulk_request(nitro_service service,base_resource resources[]) throws Exception
	{
		if (!service.isLogin())
			service.login();
		
		String objtype = resources[0].get_object_type();

		String onerror = service.get_onerror();
		//String id = service.get_sessionid();
		String request = service.get_payload_formatter().resource_to_string(resources, null, onerror);
		String result = put_bulk_data(service,request,objtype);
		if(resources.length == 1)
			return resources[0].get_nitro_response(service, result);
		
		return resources[0].get_nitro_bulk_response(service, result);
	}
	
	/**
	 * Use this method to perform a delete operation on multiple MPS resources.
	 * @param service nitro_service object
	 * @return status of the operation performed.
	 * @throws Exception API exception is thrown.
	 */
	protected static base_resource[] delete_bulk_request(nitro_service service,base_resource resources[]) throws Exception
	{
		if (!service.isLogin())
			service.login();
		
		String objtype = resources[0].get_object_type();

		options option = new options();
		option.set_action("delete");		
		String onerror = service.get_onerror();
		//String id = service.get_sessionid();
		String request = service.get_payload_formatter().resource_to_string(resources, option, onerror);
		String result = post_bulk_data(service,request,objtype);
		if(resources.length == 1)
			return resources[0].get_nitro_response(service, result);
		
		return resources[0].get_nitro_bulk_response(service, result);
	}
	
	private static String post_bulk_data(nitro_service service, String request, String objtype) throws Exception
	{
	
		String response = _post(service, request, objtype);
		/*base_responses result =(base_responses) service.get_payload_formatter().string_to_resource(base_responses.class, response);
		if (result.errorcode != 0)
		{
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if(result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode,result.response);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode,result.response);
			}
		}*/

		return response;
	}
	
	private static String put_bulk_data(nitro_service service, String request, String objtype) throws Exception
	{
	
		String response = _put(service, request, objtype);
		/*base_responses result =(base_responses) service.get_payload_formatter().string_to_resource(base_responses.class, response);
		if (result.errorcode != 0)
		{
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if(result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode,result.response);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode,result.response);
			}
		}*/

		return response;
	}
}