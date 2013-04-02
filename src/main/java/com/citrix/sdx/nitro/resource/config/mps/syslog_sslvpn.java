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


class syslog_sslvpn_response extends base_response
{
	public syslog_sslvpn[] syslog_sslvpn;
}

class syslog_sslvpn_responses extends base_response
{
	public syslog_sslvpn_response[] syslog_sslvpn_response_array;
}

/**
 * Configuration for Syslog SSL VPN table resource
 */

public class syslog_sslvpn extends base_resource
{
	private Double priority;
	private String vpnaccess;
	private String remote_host;
	private String totalPoliciesDenied;
	private String totalTCPconnections;
	private String hostname;
	private String nonhttpServicesAccessed;
	private String last_contact;
	private String sessionId;
	private String clisecexp;
	private String starttime;
	private String id;
	private String totalUDPflows;
	private String duration;
	private Boolean decoded;
	private String totalPoliciesAllowed;
	private String username;
	private String browserType;
	private String applicationName;
	private String logoutMethod;
	private String xdata;
	private String process_name;
	private String syslog_msg;
	private String type;
	private String httpResourcesAccessed;
	private String httpResourceName;
	private String destinationport;
	private String eval_value;
	private String vserverport;
	private String totalCompressedBytesRecv;
	private String licenselmt;
	private String domainname;
	private Double timestamp;
	private String totalCompressedBytesSend;
	private String endtime;
	private String totalBytesRecv;
	private String module;
	private String clientip;
	private String sourceport;
	private String compressionRatioRecv;
	private String xdatalen;
	private Double sequence_no;
	private String connectionId;
	private String group_name;
	private String sourceip;
	private String compressionRatioSend;
	private String vserverip;
	private Double datarecord_rx_time;
	private String clientType;
	private String nat_ip;
	private String deniedByPolicy;
	private String deniedURL;
	private Double exporter_id;
	private String destinationip;
	private String totalBytesSend;
	private Long __count;

	protected String get_object_type()
	{
		return "syslog_sslvpn";
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
	 * priority
	 * </pre>
	 */
	public void set_priority(Double priority)
	{
		this.priority = priority;
	}

	/**
	 * <pre>
	 * priority
	 * </pre>
	 */
	public Double get_priority()
	{
		return this.priority;
	}

	/**
	 * <pre>
	 * VPN Access.
	 * </pre>
	 */
	public void set_vpnaccess(String vpnaccess)
	{
		this.vpnaccess = vpnaccess;
	}

	/**
	 * <pre>
	 * VPN Access.
	 * </pre>
	 */
	public String get_vpnaccess()
	{
		return this.vpnaccess;
	}

	/**
	 * <pre>
	 * Remote host.
	 * </pre>
	 */
	public void set_remote_host(String remote_host)
	{
		this.remote_host = remote_host;
	}

	/**
	 * <pre>
	 * Remote host.
	 * </pre>
	 */
	public String get_remote_host()
	{
		return this.remote_host;
	}

	/**
	 * <pre>
	 * Total Policies Denied.
	 * </pre>
	 */
	public void set_totalPoliciesDenied(String totalPoliciesDenied)
	{
		this.totalPoliciesDenied = totalPoliciesDenied;
	}

	/**
	 * <pre>
	 * Total Policies Denied.
	 * </pre>
	 */
	public String get_totalPoliciesDenied()
	{
		return this.totalPoliciesDenied;
	}

	/**
	 * <pre>
	 * Total TCP Connections.
	 * </pre>
	 */
	public void set_totalTCPconnections(String totalTCPconnections)
	{
		this.totalTCPconnections = totalTCPconnections;
	}

	/**
	 * <pre>
	 * Total TCP Connections.
	 * </pre>
	 */
	public String get_totalTCPconnections()
	{
		return this.totalTCPconnections;
	}

	/**
	 * <pre>
	 * Host Name.
	 * </pre>
	 */
	public void set_hostname(String hostname)
	{
		this.hostname = hostname;
	}

	/**
	 * <pre>
	 * Host Name.
	 * </pre>
	 */
	public String get_hostname()
	{
		return this.hostname;
	}

	/**
	 * <pre>
	 * Non HTTP Services Accessed.
	 * </pre>
	 */
	public void set_nonhttpServicesAccessed(String nonhttpServicesAccessed)
	{
		this.nonhttpServicesAccessed = nonhttpServicesAccessed;
	}

	/**
	 * <pre>
	 * Non HTTP Services Accessed.
	 * </pre>
	 */
	public String get_nonhttpServicesAccessed()
	{
		return this.nonhttpServicesAccessed;
	}

	/**
	 * <pre>
	 * Last contact time.
	 * </pre>
	 */
	public void set_last_contact(String last_contact)
	{
		this.last_contact = last_contact;
	}

	/**
	 * <pre>
	 * Last contact time.
	 * </pre>
	 */
	public String get_last_contact()
	{
		return this.last_contact;
	}

	/**
	 * <pre>
	 * Session Id.
	 * </pre>
	 */
	public void set_sessionId(String sessionId)
	{
		this.sessionId = sessionId;
	}

	/**
	 * <pre>
	 * Session Id.
	 * </pre>
	 */
	public String get_sessionId()
	{
		return this.sessionId;
	}

	/**
	 * <pre>
	 * Client security expression.
	 * </pre>
	 */
	public void set_clisecexp(String clisecexp)
	{
		this.clisecexp = clisecexp;
	}

	/**
	 * <pre>
	 * Client security expression.
	 * </pre>
	 */
	public String get_clisecexp()
	{
		return this.clisecexp;
	}

	/**
	 * <pre>
	 * Start time.
	 * </pre>
	 */
	public void set_starttime(String starttime)
	{
		this.starttime = starttime;
	}

	/**
	 * <pre>
	 * Start time.
	 * </pre>
	 */
	public String get_starttime()
	{
		return this.starttime;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the syslog sslvpn record.
	 * </pre>
	 */
	public void set_id(String id)
	{
		this.id = id;
	}

	/**
	 * <pre>
	 * Id is system generated key for all the syslog sslvpn record.
	 * </pre>
	 */
	public String get_id()
	{
		return this.id;
	}

	/**
	 * <pre>
	 * Total UDP flows.
	 * </pre>
	 */
	public void set_totalUDPflows(String totalUDPflows)
	{
		this.totalUDPflows = totalUDPflows;
	}

	/**
	 * <pre>
	 * Total UDP flows.
	 * </pre>
	 */
	public String get_totalUDPflows()
	{
		return this.totalUDPflows;
	}

	/**
	 * <pre>
	 * Duration.
	 * </pre>
	 */
	public void set_duration(String duration)
	{
		this.duration = duration;
	}

	/**
	 * <pre>
	 * Duration.
	 * </pre>
	 */
	public String get_duration()
	{
		return this.duration;
	}

	/**
	 * <pre>
	 * Whether this was decoded.
	 * </pre>
	 */
	public void set_decoded(Boolean decoded)
	{
		this.decoded = decoded;
	}

	/**
	 * <pre>
	 * Whether this was decoded.
	 * </pre>
	 */
	public Boolean get_decoded()
	{
		return this.decoded;
	}

	/**
	 * <pre>
	 * Total Policies Allowed.
	 * </pre>
	 */
	public void set_totalPoliciesAllowed(String totalPoliciesAllowed)
	{
		this.totalPoliciesAllowed = totalPoliciesAllowed;
	}

	/**
	 * <pre>
	 * Total Policies Allowed.
	 * </pre>
	 */
	public String get_totalPoliciesAllowed()
	{
		return this.totalPoliciesAllowed;
	}

	/**
	 * <pre>
	 * User Name.
	 * </pre>
	 */
	public void set_username(String username)
	{
		this.username = username;
	}

	/**
	 * <pre>
	 * User Name.
	 * </pre>
	 */
	public String get_username()
	{
		return this.username;
	}

	/**
	 * <pre>
	 * Browser Type.
	 * </pre>
	 */
	public void set_browserType(String browserType)
	{
		this.browserType = browserType;
	}

	/**
	 * <pre>
	 * Browser Type.
	 * </pre>
	 */
	public String get_browserType()
	{
		return this.browserType;
	}

	/**
	 * <pre>
	 * Application Name.
	 * </pre>
	 */
	public void set_applicationName(String applicationName)
	{
		this.applicationName = applicationName;
	}

	/**
	 * <pre>
	 * Application Name.
	 * </pre>
	 */
	public String get_applicationName()
	{
		return this.applicationName;
	}

	/**
	 * <pre>
	 * Logout Method.
	 * </pre>
	 */
	public void set_logoutMethod(String logoutMethod)
	{
		this.logoutMethod = logoutMethod;
	}

	/**
	 * <pre>
	 * Logout Method.
	 * </pre>
	 */
	public String get_logoutMethod()
	{
		return this.logoutMethod;
	}

	/**
	 * <pre>
	 * Xdata value.
	 * </pre>
	 */
	public void set_xdata(String xdata)
	{
		this.xdata = xdata;
	}

	/**
	 * <pre>
	 * Xdata value.
	 * </pre>
	 */
	public String get_xdata()
	{
		return this.xdata;
	}

	/**
	 * <pre>
	 * Process Name.
	 * </pre>
	 */
	public void set_process_name(String process_name)
	{
		this.process_name = process_name;
	}

	/**
	 * <pre>
	 * Process Name.
	 * </pre>
	 */
	public String get_process_name()
	{
		return this.process_name;
	}

	/**
	 * <pre>
	 * Syslog original Message.
	 * </pre>
	 */
	public void set_syslog_msg(String syslog_msg)
	{
		this.syslog_msg = syslog_msg;
	}

	/**
	 * <pre>
	 * Syslog original Message.
	 * </pre>
	 */
	public String get_syslog_msg()
	{
		return this.syslog_msg;
	}

	/**
	 * <pre>
	 * Type Name.
	 * </pre>
	 */
	public void set_type(String type)
	{
		this.type = type;
	}

	/**
	 * <pre>
	 * Type Name.
	 * </pre>
	 */
	public String get_type()
	{
		return this.type;
	}

	/**
	 * <pre>
	 * HTTP Resources Accessed.
	 * </pre>
	 */
	public void set_httpResourcesAccessed(String httpResourcesAccessed)
	{
		this.httpResourcesAccessed = httpResourcesAccessed;
	}

	/**
	 * <pre>
	 * HTTP Resources Accessed.
	 * </pre>
	 */
	public String get_httpResourcesAccessed()
	{
		return this.httpResourcesAccessed;
	}

	/**
	 * <pre>
	 * HTTP Resource Name.
	 * </pre>
	 */
	public void set_httpResourceName(String httpResourceName)
	{
		this.httpResourceName = httpResourceName;
	}

	/**
	 * <pre>
	 * HTTP Resource Name.
	 * </pre>
	 */
	public String get_httpResourceName()
	{
		return this.httpResourceName;
	}

	/**
	 * <pre>
	 * Destination port.
	 * </pre>
	 */
	public void set_destinationport(String destinationport)
	{
		this.destinationport = destinationport;
	}

	/**
	 * <pre>
	 * Destination port.
	 * </pre>
	 */
	public String get_destinationport()
	{
		return this.destinationport;
	}

	/**
	 * <pre>
	 * Client security expression evaluation value.
	 * </pre>
	 */
	public void set_eval_value(String eval_value)
	{
		this.eval_value = eval_value;
	}

	/**
	 * <pre>
	 * Client security expression evaluation value.
	 * </pre>
	 */
	public String get_eval_value()
	{
		return this.eval_value;
	}

	/**
	 * <pre>
	 * Vserver port.
	 * </pre>
	 */
	public void set_vserverport(String vserverport)
	{
		this.vserverport = vserverport;
	}

	/**
	 * <pre>
	 * Vserver port.
	 * </pre>
	 */
	public String get_vserverport()
	{
		return this.vserverport;
	}

	/**
	 * <pre>
	 * Total Compressed Bytes Received.
	 * </pre>
	 */
	public void set_totalCompressedBytesRecv(String totalCompressedBytesRecv)
	{
		this.totalCompressedBytesRecv = totalCompressedBytesRecv;
	}

	/**
	 * <pre>
	 * Total Compressed Bytes Received.
	 * </pre>
	 */
	public String get_totalCompressedBytesRecv()
	{
		return this.totalCompressedBytesRecv;
	}

	/**
	 * <pre>
	 * License limit.
	 * </pre>
	 */
	public void set_licenselmt(String licenselmt)
	{
		this.licenselmt = licenselmt;
	}

	/**
	 * <pre>
	 * License limit.
	 * </pre>
	 */
	public String get_licenselmt()
	{
		return this.licenselmt;
	}

	/**
	 * <pre>
	 * Domain name.
	 * </pre>
	 */
	public void set_domainname(String domainname)
	{
		this.domainname = domainname;
	}

	/**
	 * <pre>
	 * Domain name.
	 * </pre>
	 */
	public String get_domainname()
	{
		return this.domainname;
	}

	/**
	 * <pre>
	 * timestamp
	 * </pre>
	 */
	public void set_timestamp(Double timestamp)
	{
		this.timestamp = timestamp;
	}

	/**
	 * <pre>
	 * timestamp
	 * </pre>
	 */
	public Double get_timestamp()
	{
		return this.timestamp;
	}

	/**
	 * <pre>
	 * Total Compressed Bytes Send.
	 * </pre>
	 */
	public void set_totalCompressedBytesSend(String totalCompressedBytesSend)
	{
		this.totalCompressedBytesSend = totalCompressedBytesSend;
	}

	/**
	 * <pre>
	 * Total Compressed Bytes Send.
	 * </pre>
	 */
	public String get_totalCompressedBytesSend()
	{
		return this.totalCompressedBytesSend;
	}

	/**
	 * <pre>
	 * End time.
	 * </pre>
	 */
	public void set_endtime(String endtime)
	{
		this.endtime = endtime;
	}

	/**
	 * <pre>
	 * End time.
	 * </pre>
	 */
	public String get_endtime()
	{
		return this.endtime;
	}

	/**
	 * <pre>
	 * Total Bytes Recv.
	 * </pre>
	 */
	public void set_totalBytesRecv(String totalBytesRecv)
	{
		this.totalBytesRecv = totalBytesRecv;
	}

	/**
	 * <pre>
	 * Total Bytes Recv.
	 * </pre>
	 */
	public String get_totalBytesRecv()
	{
		return this.totalBytesRecv;
	}

	/**
	 * <pre>
	 * Module Name.
	 * </pre>
	 */
	public void set_module(String module)
	{
		this.module = module;
	}

	/**
	 * <pre>
	 * Module Name.
	 * </pre>
	 */
	public String get_module()
	{
		return this.module;
	}

	/**
	 * <pre>
	 * Client IP.
	 * </pre>
	 */
	public void set_clientip(String clientip)
	{
		this.clientip = clientip;
	}

	/**
	 * <pre>
	 * Client IP.
	 * </pre>
	 */
	public String get_clientip()
	{
		return this.clientip;
	}

	/**
	 * <pre>
	 * Source port.
	 * </pre>
	 */
	public void set_sourceport(String sourceport)
	{
		this.sourceport = sourceport;
	}

	/**
	 * <pre>
	 * Source port.
	 * </pre>
	 */
	public String get_sourceport()
	{
		return this.sourceport;
	}

	/**
	 * <pre>
	 * Compression Ratio Received.
	 * </pre>
	 */
	public void set_compressionRatioRecv(String compressionRatioRecv)
	{
		this.compressionRatioRecv = compressionRatioRecv;
	}

	/**
	 * <pre>
	 * Compression Ratio Received.
	 * </pre>
	 */
	public String get_compressionRatioRecv()
	{
		return this.compressionRatioRecv;
	}

	/**
	 * <pre>
	 * X data length.
	 * </pre>
	 */
	public void set_xdatalen(String xdatalen)
	{
		this.xdatalen = xdatalen;
	}

	/**
	 * <pre>
	 * X data length.
	 * </pre>
	 */
	public String get_xdatalen()
	{
		return this.xdatalen;
	}

	/**
	 * <pre>
	 * Sequence no.
	 * </pre>
	 */
	public void set_sequence_no(Double sequence_no)
	{
		this.sequence_no = sequence_no;
	}

	/**
	 * <pre>
	 * Sequence no.
	 * </pre>
	 */
	public Double get_sequence_no()
	{
		return this.sequence_no;
	}

	/**
	 * <pre>
	 * Connection ID.
	 * </pre>
	 */
	public void set_connectionId(String connectionId)
	{
		this.connectionId = connectionId;
	}

	/**
	 * <pre>
	 * Connection ID.
	 * </pre>
	 */
	public String get_connectionId()
	{
		return this.connectionId;
	}

	/**
	 * <pre>
	 * Group Name.
	 * </pre>
	 */
	public void set_group_name(String group_name)
	{
		this.group_name = group_name;
	}

	/**
	 * <pre>
	 * Group Name.
	 * </pre>
	 */
	public String get_group_name()
	{
		return this.group_name;
	}

	/**
	 * <pre>
	 * Source ip.
	 * </pre>
	 */
	public void set_sourceip(String sourceip)
	{
		this.sourceip = sourceip;
	}

	/**
	 * <pre>
	 * Source ip.
	 * </pre>
	 */
	public String get_sourceip()
	{
		return this.sourceip;
	}

	/**
	 * <pre>
	 * Compression Ratio Send.
	 * </pre>
	 */
	public void set_compressionRatioSend(String compressionRatioSend)
	{
		this.compressionRatioSend = compressionRatioSend;
	}

	/**
	 * <pre>
	 * Compression Ratio Send.
	 * </pre>
	 */
	public String get_compressionRatioSend()
	{
		return this.compressionRatioSend;
	}

	/**
	 * <pre>
	 * Vserver ip.
	 * </pre>
	 */
	public void set_vserverip(String vserverip)
	{
		this.vserverip = vserverip;
	}

	/**
	 * <pre>
	 * Vserver ip.
	 * </pre>
	 */
	public String get_vserverip()
	{
		return this.vserverip;
	}

	/**
	 * <pre>
	 * Transaction Time when this was received.
	 * </pre>
	 */
	public void set_datarecord_rx_time(Double datarecord_rx_time)
	{
		this.datarecord_rx_time = datarecord_rx_time;
	}

	/**
	 * <pre>
	 * Transaction Time when this was received.
	 * </pre>
	 */
	public Double get_datarecord_rx_time()
	{
		return this.datarecord_rx_time;
	}

	/**
	 * <pre>
	 * Client Type.
	 * </pre>
	 */
	public void set_clientType(String clientType)
	{
		this.clientType = clientType;
	}

	/**
	 * <pre>
	 * Client Type.
	 * </pre>
	 */
	public String get_clientType()
	{
		return this.clientType;
	}

	/**
	 * <pre>
	 * Nat IP.
	 * </pre>
	 */
	public void set_nat_ip(String nat_ip)
	{
		this.nat_ip = nat_ip;
	}

	/**
	 * <pre>
	 * Nat IP.
	 * </pre>
	 */
	public String get_nat_ip()
	{
		return this.nat_ip;
	}

	/**
	 * <pre>
	 * Denied by which policy.
	 * </pre>
	 */
	public void set_deniedByPolicy(String deniedByPolicy)
	{
		this.deniedByPolicy = deniedByPolicy;
	}

	/**
	 * <pre>
	 * Denied by which policy.
	 * </pre>
	 */
	public String get_deniedByPolicy()
	{
		return this.deniedByPolicy;
	}

	/**
	 * <pre>
	 * Denied URL name.
	 * </pre>
	 */
	public void set_deniedURL(String deniedURL)
	{
		this.deniedURL = deniedURL;
	}

	/**
	 * <pre>
	 * Denied URL name.
	 * </pre>
	 */
	public String get_deniedURL()
	{
		return this.deniedURL;
	}

	/**
	 * <pre>
	 * Exporter ID
	 * </pre>
	 */
	public void set_exporter_id(Double exporter_id)
	{
		this.exporter_id = exporter_id;
	}

	/**
	 * <pre>
	 * Exporter ID
	 * </pre>
	 */
	public Double get_exporter_id()
	{
		return this.exporter_id;
	}

	/**
	 * <pre>
	 * Destination IP.
	 * </pre>
	 */
	public void set_destinationip(String destinationip)
	{
		this.destinationip = destinationip;
	}

	/**
	 * <pre>
	 * Destination IP.
	 * </pre>
	 */
	public String get_destinationip()
	{
		return this.destinationip;
	}

	/**
	 * <pre>
	 * Total Bytes Send.
	 * </pre>
	 */
	public void set_totalBytesSend(String totalBytesSend)
	{
		this.totalBytesSend = totalBytesSend;
	}

	/**
	 * <pre>
	 * Total Bytes Send.
	 * </pre>
	 */
	public String get_totalBytesSend()
	{
		return this.totalBytesSend;
	}


	/**
	 * <pre>
	 * Use this operation to delete sslvpn syslog message details..
	 * </pre>
	 */
	public static syslog_sslvpn delete(nitro_service client, syslog_sslvpn resource) throws Exception
	{
		resource.validate("delete");
		return ((syslog_sslvpn[]) resource.delete_resource(client))[0];
	}

	/**
	 * <pre>
	 * Use this operation to delete sslvpn syslog message details. in bulk.
	 * </pre>
	 */
	public static syslog_sslvpn[] delete(nitro_service client, syslog_sslvpn[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		for(int i = 0; i < resources.length; i++)
		{
			resources[i].validate("delete");
		}
		
		if(resources.length == 1)
			return ((syslog_sslvpn[]) resources[0].delete_resource(client));
		
		return ((syslog_sslvpn[]) delete_bulk_request(client, resources));
	}

	/**
	 * <pre>
	 * Report for sslvpn syslog message received by this collector..
	 * </pre>
	 */
	public static syslog_sslvpn[] get(nitro_service client) throws Exception
	{
		syslog_sslvpn resource = new syslog_sslvpn();
		resource.validate("get");
		return (syslog_sslvpn[]) resource.get_resources(client);
	}

	/**
	* Use this API to fetch filtered set of syslog_sslvpn resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static syslog_sslvpn[] get_filtered(nitro_service service, String filter) throws Exception
	{
		syslog_sslvpn obj = new syslog_sslvpn();
		options option = new options();
		option.set_filter(filter);
		syslog_sslvpn[] response = (syslog_sslvpn[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of syslog_sslvpn resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static syslog_sslvpn[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		syslog_sslvpn obj = new syslog_sslvpn();
		options option = new options();
		option.set_filter(filter);
		syslog_sslvpn[] response = (syslog_sslvpn[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the syslog_sslvpn resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		syslog_sslvpn obj = new syslog_sslvpn();
		options option = new options();
		option.set_count(true);
		syslog_sslvpn[] response = (syslog_sslvpn[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of syslog_sslvpn resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		syslog_sslvpn obj = new syslog_sslvpn();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		syslog_sslvpn[] response = (syslog_sslvpn[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of syslog_sslvpn resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		syslog_sslvpn obj = new syslog_sslvpn();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		syslog_sslvpn[] response = (syslog_sslvpn[])obj.get_resources(service, option);
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
		syslog_sslvpn_response result = (syslog_sslvpn_response) service.get_payload_formatter().string_to_resource(syslog_sslvpn_response.class, response);
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
		return result.syslog_sslvpn;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		syslog_sslvpn_responses result = (syslog_sslvpn_responses) service.get_payload_formatter().string_to_resource(syslog_sslvpn_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.syslog_sslvpn_response_array);
		}
		syslog_sslvpn[] result_syslog_sslvpn = new syslog_sslvpn[result.syslog_sslvpn_response_array.length];
		
		for(int i = 0; i < result.syslog_sslvpn_response_array.length; i++)
		{
			result_syslog_sslvpn[i] = result.syslog_sslvpn_response_array[i].syslog_sslvpn[0];
		}
		
		return result_syslog_sslvpn;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSLong exporter_id_validator = new MPSLong();
		exporter_id_validator.validate(operationType, exporter_id, "\"exporter_id\"");
		
		MPSLong priority_validator = new MPSLong();
		priority_validator.validate(operationType, priority, "\"priority\"");
		
		MPSLong timestamp_validator = new MPSLong();
		timestamp_validator.validate(operationType, timestamp, "\"timestamp\"");
		
		MPSString hostname_validator = new MPSString();
		hostname_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		hostname_validator.validate(operationType, hostname, "\"hostname\"");
		
		MPSString process_name_validator = new MPSString();
		process_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		process_name_validator.validate(operationType, process_name, "\"process_name\"");
		
		MPSString module_validator = new MPSString();
		module_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		module_validator.validate(operationType, module, "\"module\"");
		
		MPSString type_validator = new MPSString();
		type_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		type_validator.validate(operationType, type, "\"type\"");
		
		MPSString syslog_msg_validator = new MPSString();
		syslog_msg_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 2000);
		syslog_msg_validator.validate(operationType, syslog_msg, "\"syslog_msg\"");
		
		MPSLong sequence_no_validator = new MPSLong();
		sequence_no_validator.validate(operationType, sequence_no, "\"sequence_no\"");
		
		MPSLong datarecord_rx_time_validator = new MPSLong();
		datarecord_rx_time_validator.validate(operationType, datarecord_rx_time, "\"datarecord_rx_time\"");
		
		MPSBoolean decoded_validator = new MPSBoolean();
		decoded_validator.validate(operationType, decoded, "\"decoded\"");
		
		MPSString group_name_validator = new MPSString();
		group_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		group_name_validator.validate(operationType, group_name, "\"group_name\"");
		
		MPSString sessionId_validator = new MPSString();
		sessionId_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		sessionId_validator.validate(operationType, sessionId, "\"sessionId\"");
		
		MPSString username_validator = new MPSString();
		username_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		username_validator.validate(operationType, username, "\"username\"");
		
		MPSString clientip_validator = new MPSString();
		clientip_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		clientip_validator.validate(operationType, clientip, "\"clientip\"");
		
		MPSString vserverip_validator = new MPSString();
		vserverip_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		vserverip_validator.validate(operationType, vserverip, "\"vserverip\"");
		
		MPSString vserverport_validator = new MPSString();
		vserverport_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		vserverport_validator.validate(operationType, vserverport, "\"vserverport\"");
		
		MPSString nat_ip_validator = new MPSString();
		nat_ip_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		nat_ip_validator.validate(operationType, nat_ip, "\"nat_ip\"");
		
		MPSString sourceip_validator = new MPSString();
		sourceip_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		sourceip_validator.validate(operationType, sourceip, "\"sourceip\"");
		
		MPSString sourceport_validator = new MPSString();
		sourceport_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		sourceport_validator.validate(operationType, sourceport, "\"sourceport\"");
		
		MPSString destinationip_validator = new MPSString();
		destinationip_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		destinationip_validator.validate(operationType, destinationip, "\"destinationip\"");
		
		MPSString destinationport_validator = new MPSString();
		destinationport_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		destinationport_validator.validate(operationType, destinationport, "\"destinationport\"");
		
		MPSString starttime_validator = new MPSString();
		starttime_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		starttime_validator.validate(operationType, starttime, "\"starttime\"");
		
		MPSString endtime_validator = new MPSString();
		endtime_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		endtime_validator.validate(operationType, endtime, "\"endtime\"");
		
		MPSString duration_validator = new MPSString();
		duration_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		duration_validator.validate(operationType, duration, "\"duration\"");
		
		MPSString totalBytesSend_validator = new MPSString();
		totalBytesSend_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		totalBytesSend_validator.validate(operationType, totalBytesSend, "\"totalBytesSend\"");
		
		MPSString totalBytesRecv_validator = new MPSString();
		totalBytesRecv_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		totalBytesRecv_validator.validate(operationType, totalBytesRecv, "\"totalBytesRecv\"");
		
		MPSString totalCompressedBytesSend_validator = new MPSString();
		totalCompressedBytesSend_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		totalCompressedBytesSend_validator.validate(operationType, totalCompressedBytesSend, "\"totalCompressedBytesSend\"");
		
		MPSString totalCompressedBytesRecv_validator = new MPSString();
		totalCompressedBytesRecv_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		totalCompressedBytesRecv_validator.validate(operationType, totalCompressedBytesRecv, "\"totalCompressedBytesRecv\"");
		
		MPSString compressionRatioSend_validator = new MPSString();
		compressionRatioSend_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		compressionRatioSend_validator.validate(operationType, compressionRatioSend, "\"compressionRatioSend\"");
		
		MPSString compressionRatioRecv_validator = new MPSString();
		compressionRatioRecv_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		compressionRatioRecv_validator.validate(operationType, compressionRatioRecv, "\"compressionRatioRecv\"");
		
		MPSString domainname_validator = new MPSString();
		domainname_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		domainname_validator.validate(operationType, domainname, "\"domainname\"");
		
		MPSString applicationName_validator = new MPSString();
		applicationName_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		applicationName_validator.validate(operationType, applicationName, "\"applicationName\"");
		
		MPSString browserType_validator = new MPSString();
		browserType_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		browserType_validator.validate(operationType, browserType, "\"browserType\"");
		
		MPSString clientType_validator = new MPSString();
		clientType_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		clientType_validator.validate(operationType, clientType, "\"clientType\"");
		
		MPSString logoutMethod_validator = new MPSString();
		logoutMethod_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		logoutMethod_validator.validate(operationType, logoutMethod, "\"logoutMethod\"");
		
		MPSString vpnaccess_validator = new MPSString();
		vpnaccess_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		vpnaccess_validator.validate(operationType, vpnaccess, "\"vpnaccess\"");
		
		MPSString deniedURL_validator = new MPSString();
		deniedURL_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		deniedURL_validator.validate(operationType, deniedURL, "\"deniedURL\"");
		
		MPSString deniedByPolicy_validator = new MPSString();
		deniedByPolicy_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		deniedByPolicy_validator.validate(operationType, deniedByPolicy, "\"deniedByPolicy\"");
		
		MPSString remote_host_validator = new MPSString();
		remote_host_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		remote_host_validator.validate(operationType, remote_host, "\"remote_host\"");
		
		MPSString xdatalen_validator = new MPSString();
		xdatalen_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		xdatalen_validator.validate(operationType, xdatalen, "\"xdatalen\"");
		
		MPSString xdata_validator = new MPSString();
		xdata_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		xdata_validator.validate(operationType, xdata, "\"xdata\"");
		
		MPSString last_contact_validator = new MPSString();
		last_contact_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		last_contact_validator.validate(operationType, last_contact, "\"last_contact\"");
		
		MPSString httpResourceName_validator = new MPSString();
		httpResourceName_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		httpResourceName_validator.validate(operationType, httpResourceName, "\"httpResourceName\"");
		
		MPSString licenselmt_validator = new MPSString();
		licenselmt_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		licenselmt_validator.validate(operationType, licenselmt, "\"licenselmt\"");
		
		MPSString connectionId_validator = new MPSString();
		connectionId_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		connectionId_validator.validate(operationType, connectionId, "\"connectionId\"");
		
		MPSString clisecexp_validator = new MPSString();
		clisecexp_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		clisecexp_validator.validate(operationType, clisecexp, "\"clisecexp\"");
		
		MPSString eval_value_validator = new MPSString();
		eval_value_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		eval_value_validator.validate(operationType, eval_value, "\"eval_value\"");
		
		MPSString httpResourcesAccessed_validator = new MPSString();
		httpResourcesAccessed_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		httpResourcesAccessed_validator.validate(operationType, httpResourcesAccessed, "\"httpResourcesAccessed\"");
		
		MPSString nonhttpServicesAccessed_validator = new MPSString();
		nonhttpServicesAccessed_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		nonhttpServicesAccessed_validator.validate(operationType, nonhttpServicesAccessed, "\"nonhttpServicesAccessed\"");
		
		MPSString totalTCPconnections_validator = new MPSString();
		totalTCPconnections_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		totalTCPconnections_validator.validate(operationType, totalTCPconnections, "\"totalTCPconnections\"");
		
		MPSString totalUDPflows_validator = new MPSString();
		totalUDPflows_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		totalUDPflows_validator.validate(operationType, totalUDPflows, "\"totalUDPflows\"");
		
		MPSString totalPoliciesAllowed_validator = new MPSString();
		totalPoliciesAllowed_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		totalPoliciesAllowed_validator.validate(operationType, totalPoliciesAllowed, "\"totalPoliciesAllowed\"");
		
		MPSString totalPoliciesDenied_validator = new MPSString();
		totalPoliciesDenied_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 255);
		totalPoliciesDenied_validator.validate(operationType, totalPoliciesDenied, "\"totalPoliciesDenied\"");
		
		MPSString id_validator = new MPSString();
		id_validator.setConstraintIsReq(MPSConstants.DELETE_CONSTRAINT, true);
		id_validator.setConstraintIsReq(MPSConstants.MODIFY_CONSTRAINT, true);
		id_validator.validate(operationType, id, "\"id\"");
		
	}
}
