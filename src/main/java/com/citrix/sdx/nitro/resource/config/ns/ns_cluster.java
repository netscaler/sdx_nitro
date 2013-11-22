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


class ns_cluster_response extends base_response
{
	public ns_cluster[] ns_cluster;
}

class ns_cluster_responses extends base_response
{
	public ns_cluster_response[] ns_cluster_response_array;
}

/**
 * Configuration for ns_cluster resource.
 */

public class ns_cluster extends base_resource
{
	private Double mgmt_cpu_usage;
	private Double clbkplanerx;
	private String backplane;
	private Integer clusterid;
	private Integer nodeid;
	private String clnodes;
	private String state;
	private Double totpropagationtimeout;
	private Double totsteeredpkts;
	private Double clbkplanetx;
	private String password;
	private String act_id;
	private String clip;
	private Boolean iscco;
	private String operationalstate;
	private Double numdfddroppkts;
	private String clviewleader;
	private Double tx;
	private Integer clnumnodes;
	private String clcurstatus;
	private Double http_req;
	private Double rx;
	private Double memory_usage;
	private Double clbkplanetxrate;
	private String health;
	private Double clbkplanerxrate;
	private Double cpu_usage;
	private String ipaddress;
	private String profile_name;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_cluster";
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
	 * Management CPU Usage (%) of Cluster Instance
	 * </pre>
	 */
	public Double get_mgmt_cpu_usage()
	{
		return this.mgmt_cpu_usage;
	}


	/**
	 * <pre>
	 * Traffic received on backplane (in mbits)
	 * </pre>
	 */
	public Double get_clbkplanerx()
	{
		return this.clbkplanerx;
	}

	/**
	 * <pre>
	 * Backplane Interface
	 * </pre>
	 */
	public void set_backplane(String backplane)
	{
		this.backplane = backplane;
	}

	/**
	 * <pre>
	 * Backplane Interface
	 * </pre>
	 */
	public String get_backplane()
	{
		return this.backplane;
	}

	/**
	 * <pre>
	 * Cluster Id
	 * </pre>
	 */
	public void set_clusterid(Integer clusterid)
	{
		this.clusterid = clusterid;
	}

	/**
	 * <pre>
	 * Cluster Id
	 * </pre>
	 */
	public Integer get_clusterid()
	{
		return this.clusterid;
	}

	/**
	 * <pre>
	 * Node Id
	 * </pre>
	 */
	public void set_nodeid(Integer nodeid)
	{
		this.nodeid = nodeid;
	}

	/**
	 * <pre>
	 * Node Id
	 * </pre>
	 */
	public Integer get_nodeid()
	{
		return this.nodeid;
	}

	/**
	 * <pre>
	 * List of Nodes part of Cluster
	 * </pre>
	 */
	public void set_clnodes(String clnodes)
	{
		this.clnodes = clnodes;
	}

	/**
	 * <pre>
	 * List of Nodes part of Cluster
	 * </pre>
	 */
	public String get_clnodes()
	{
		return this.clnodes;
	}

	/**
	 * <pre>
	 * Node State
	 * </pre>
	 */
	public void set_state(String state)
	{
		this.state = state;
	}

	/**
	 * <pre>
	 * Node State
	 * </pre>
	 */
	public String get_state()
	{
		return this.state;
	}


	/**
	 * <pre>
	 * Number of times the update to the client timed-out
	 * </pre>
	 */
	public Double get_totpropagationtimeout()
	{
		return this.totpropagationtimeout;
	}


	/**
	 * <pre>
	 * Total number of packets steered on the cluster backplane
	 * </pre>
	 */
	public Double get_totsteeredpkts()
	{
		return this.totsteeredpkts;
	}


	/**
	 * <pre>
	 * Traffic transmitted from backplane (in mbits)
	 * </pre>
	 */
	public Double get_clbkplanetx()
	{
		return this.clbkplanetx;
	}

	/**
	 * <pre>
	 * Password of the Configuration Coordinator node(Cluster IP)
	 * </pre>
	 */
	public void set_password(String password)
	{
		this.password = password;
	}

	/**
	 * <pre>
	 * Password of the Configuration Coordinator node(Cluster IP)
	 * </pre>
	 */
	public String get_password()
	{
		return this.password;
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
	 * Cluster IPAddress
	 * </pre>
	 */
	public void set_clip(String clip)
	{
		this.clip = clip;
	}

	/**
	 * <pre>
	 * Cluster IPAddress
	 * </pre>
	 */
	public String get_clip()
	{
		return this.clip;
	}

	/**
	 * <pre>
	 * Is CCO
	 * </pre>
	 */
	public void set_iscco(Boolean iscco)
	{
		this.iscco = iscco;
	}

	/**
	 * <pre>
	 * Is CCO
	 * </pre>
	 */
	public Boolean get_iscco()
	{
		return this.iscco;
	}


	/**
	 * <pre>
	 * Cluster Operational State
	 * </pre>
	 */
	public String get_operationalstate()
	{
		return this.operationalstate;
	}


	/**
	 * <pre>
	 * Total number of packets steered on the cluster backplane
	 * </pre>
	 */
	public Double get_numdfddroppkts()
	{
		return this.numdfddroppkts;
	}

	/**
	 * <pre>
	 * Cluster CCO NSIP
	 * </pre>
	 */
	public void set_clviewleader(String clviewleader)
	{
		this.clviewleader = clviewleader;
	}

	/**
	 * <pre>
	 * Cluster CCO NSIP
	 * </pre>
	 */
	public String get_clviewleader()
	{
		return this.clviewleader;
	}


	/**
	 * <pre>
	 * Out Throughput of Cluster Instance in Mbps
	 * </pre>
	 */
	public Double get_tx()
	{
		return this.tx;
	}

	/**
	 * <pre>
	 * Cluster ID
	 * </pre>
	 */
	public void set_clnumnodes(Integer clnumnodes)
	{
		this.clnumnodes = clnumnodes;
	}

	/**
	 * <pre>
	 * Cluster ID
	 * </pre>
	 */
	public Integer get_clnumnodes()
	{
		return this.clnumnodes;
	}


	/**
	 * <pre>
	 * State of the cluster
	 * </pre>
	 */
	public String get_clcurstatus()
	{
		return this.clcurstatus;
	}


	/**
	 * <pre>
	 * HTTP Requests/second on Cluster Instance
	 * </pre>
	 */
	public Double get_http_req()
	{
		return this.http_req;
	}


	/**
	 * <pre>
	 * In Throughput of Cluster Instance in Mbps
	 * </pre>
	 */
	public Double get_rx()
	{
		return this.rx;
	}


	/**
	 * <pre>
	 * Memory Usage (%) of Cluster Instance
	 * </pre>
	 */
	public Double get_memory_usage()
	{
		return this.memory_usage;
	}


	/**
	 * <pre>
	 * Traffic rate transmitted from backplane (in mbits)
	 * </pre>
	 */
	public Double get_clbkplanetxrate()
	{
		return this.clbkplanetxrate;
	}


	/**
	 * <pre>
	 * Node Health State
	 * </pre>
	 */
	public String get_health()
	{
		return this.health;
	}


	/**
	 * <pre>
	 * Traffic rate received on backplane (in mbits)
	 * </pre>
	 */
	public Double get_clbkplanerxrate()
	{
		return this.clbkplanerxrate;
	}


	/**
	 * <pre>
	 * CPU Usage (%) of Cluster Instance
	 * </pre>
	 */
	public Double get_cpu_usage()
	{
		return this.cpu_usage;
	}

	/**
	 * <pre>
	 * NS ipaddress
	 * </pre>
	 */
	public void set_ipaddress(String ipaddress)
	{
		this.ipaddress = ipaddress;
	}

	/**
	 * <pre>
	 * NS ipaddress
	 * </pre>
	 */
	public String get_ipaddress()
	{
		return this.ipaddress;
	}

	/**
	 * <pre>
	 * Profile Name
	 * </pre>
	 */
	public void set_profile_name(String profile_name)
	{
		this.profile_name = profile_name;
	}

	/**
	 * <pre>
	 * Profile Name
	 * </pre>
	 */
	public String get_profile_name()
	{
		return this.profile_name;
	}


	/**
	 * <pre>
	 * Use this operation to remove entire Cluster Instance.
	 * </pre>
	 */
	public static ns_cluster remove(nitro_service client, ns_cluster resource) throws Exception
	{
		return ((ns_cluster[]) resource.perform_operation(client, "remove"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to remove entire Cluster Instance in bulk.
	 * </pre>
	 */
	public static ns_cluster[] remove(nitro_service client, ns_cluster[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_cluster[]) resources[0].perform_operation(client, "remove"));
		
		return ((ns_cluster[]) perform_operation_bulk_request(client, resources, "remove"));
	}

	/**
	 * <pre>
	 * Use this operation to get ns cluster instance.
	 * </pre>
	 */
	public static ns_cluster[] get(nitro_service client) throws Exception
	{
		ns_cluster resource = new ns_cluster();
		resource.validate("get");
		return (ns_cluster[]) resource.get_resources(client);
	}

	/**
	 * <pre>
	 * Use this operation to modify Cluster IP admin ns password.
	 * </pre>
	 */
	public static ns_cluster modify_password(nitro_service client, ns_cluster resource) throws Exception
	{
		return ((ns_cluster[]) resource.perform_operation(client, "modify_password"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to modify Cluster IP admin ns password in bulk.
	 * </pre>
	 */
	public static ns_cluster[] modify_password(nitro_service client, ns_cluster[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_cluster[]) resources[0].perform_operation(client, "modify_password"));
		
		return ((ns_cluster[]) perform_operation_bulk_request(client, resources, "modify_password"));
	}

	/**
	 * <pre>
	 * Use this operation to form one node cluster from NetScaler Instance.
	 * </pre>
	 */
	public static ns_cluster form_cluster(nitro_service client, ns_cluster resource) throws Exception
	{
		return ((ns_cluster[]) resource.perform_operation(client, "form_cluster"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to form one node cluster from NetScaler Instance in bulk.
	 * </pre>
	 */
	public static ns_cluster[] form_cluster(nitro_service client, ns_cluster[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_cluster[]) resources[0].perform_operation(client, "form_cluster"));
		
		return ((ns_cluster[]) perform_operation_bulk_request(client, resources, "form_cluster"));
	}

	/**
	 * <pre>
	 * Use this operation to join NetScaler Instance to existing cluster.
	 * </pre>
	 */
	public static ns_cluster join(nitro_service client, ns_cluster resource) throws Exception
	{
		return ((ns_cluster[]) resource.perform_operation(client, "join"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to join NetScaler Instance to existing cluster in bulk.
	 * </pre>
	 */
	public static ns_cluster[] join(nitro_service client, ns_cluster[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_cluster[]) resources[0].perform_operation(client, "join"));
		
		return ((ns_cluster[]) perform_operation_bulk_request(client, resources, "join"));
	}

	/**
	* Use this API to fetch filtered set of ns_cluster resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_cluster[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_cluster obj = new ns_cluster();
		options option = new options();
		option.set_filter(filter);
		ns_cluster[] response = (ns_cluster[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_cluster resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_cluster[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_cluster obj = new ns_cluster();
		options option = new options();
		option.set_filter(filter);
		ns_cluster[] response = (ns_cluster[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_cluster resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_cluster obj = new ns_cluster();
		options option = new options();
		option.set_count(true);
		ns_cluster[] response = (ns_cluster[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_cluster resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_cluster obj = new ns_cluster();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_cluster[] response = (ns_cluster[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_cluster resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_cluster obj = new ns_cluster();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_cluster[] response = (ns_cluster[])obj.get_resources(service, option);
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
		ns_cluster_response result = (ns_cluster_response) service.get_payload_formatter().string_to_resource(ns_cluster_response.class, response);
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
		return result.ns_cluster;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_cluster_responses result = (ns_cluster_responses) service.get_payload_formatter().string_to_resource(ns_cluster_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_cluster_response_array);
		}
		ns_cluster[] result_ns_cluster = new ns_cluster[result.ns_cluster_response_array.length];
		
		for(int i = 0; i < result.ns_cluster_response_array.length; i++)
		{
			result_ns_cluster[i] = result.ns_cluster_response_array[i].ns_cluster[0];
		}
		
		return result_ns_cluster;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSIPAddress ipaddress_validator = new MPSIPAddress();
		ipaddress_validator.validate(operationType, ipaddress, "\"ipaddress\"");
		
		MPSIPAddress clip_validator = new MPSIPAddress();
		clip_validator.validate(operationType, clip, "\"clip\"");
		
		MPSInt nodeid_validator = new MPSInt();
		nodeid_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		nodeid_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 31);
		nodeid_validator.validate(operationType, nodeid, "\"nodeid\"");
		
		MPSInt clusterid_validator = new MPSInt();
		clusterid_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 1);
		clusterid_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 16);
		clusterid_validator.validate(operationType, clusterid, "\"clusterid\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSBoolean iscco_validator = new MPSBoolean();
		iscco_validator.validate(operationType, iscco, "\"iscco\"");
		
		MPSString backplane_validator = new MPSString();
		backplane_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		backplane_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		backplane_validator.validate(operationType, backplane, "\"backplane\"");
		
		MPSString health_validator = new MPSString();
		health_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		health_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		health_validator.validate(operationType, health, "\"health\"");
		
		MPSString state_validator = new MPSString();
		state_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 32);
		state_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		state_validator.validate(operationType, state, "\"state\"");
		
		MPSIPAddress clviewleader_validator = new MPSIPAddress();
		clviewleader_validator.validate(operationType, clviewleader, "\"clviewleader\"");
		
		MPSDouble clbkplanerx_validator = new MPSDouble();
		clbkplanerx_validator.validate(operationType, clbkplanerx, "\"clbkplanerx\"");
		
		MPSDouble clbkplanetx_validator = new MPSDouble();
		clbkplanetx_validator.validate(operationType, clbkplanetx, "\"clbkplanetx\"");
		
		MPSDouble clbkplanerxrate_validator = new MPSDouble();
		clbkplanerxrate_validator.validate(operationType, clbkplanerxrate, "\"clbkplanerxrate\"");
		
		MPSDouble clbkplanetxrate_validator = new MPSDouble();
		clbkplanetxrate_validator.validate(operationType, clbkplanetxrate, "\"clbkplanetxrate\"");
		
		MPSDouble totsteeredpkts_validator = new MPSDouble();
		totsteeredpkts_validator.validate(operationType, totsteeredpkts, "\"totsteeredpkts\"");
		
		MPSDouble numdfddroppkts_validator = new MPSDouble();
		numdfddroppkts_validator.validate(operationType, numdfddroppkts, "\"numdfddroppkts\"");
		
		MPSDouble totpropagationtimeout_validator = new MPSDouble();
		totpropagationtimeout_validator.validate(operationType, totpropagationtimeout, "\"totpropagationtimeout\"");
		
		MPSString clcurstatus_validator = new MPSString();
		clcurstatus_validator.validate(operationType, clcurstatus, "\"clcurstatus\"");
		
		MPSInt clnumnodes_validator = new MPSInt();
		clnumnodes_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		clnumnodes_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 32);
		clnumnodes_validator.validate(operationType, clnumnodes, "\"clnumnodes\"");
		
		MPSDouble cpu_usage_validator = new MPSDouble();
		cpu_usage_validator.validate(operationType, cpu_usage, "\"cpu_usage\"");
		
		MPSDouble mgmt_cpu_usage_validator = new MPSDouble();
		mgmt_cpu_usage_validator.validate(operationType, mgmt_cpu_usage, "\"mgmt_cpu_usage\"");
		
		MPSDouble memory_usage_validator = new MPSDouble();
		memory_usage_validator.validate(operationType, memory_usage, "\"memory_usage\"");
		
		MPSDouble tx_validator = new MPSDouble();
		tx_validator.validate(operationType, tx, "\"tx\"");
		
		MPSDouble rx_validator = new MPSDouble();
		rx_validator.validate(operationType, rx, "\"rx\"");
		
		MPSDouble http_req_validator = new MPSDouble();
		http_req_validator.validate(operationType, http_req, "\"http_req\"");
		
		MPSString profile_name_validator = new MPSString();
		profile_name_validator.setConstraintCharSetRegEx(MPSConstants.GENERIC_CONSTRAINT,"[ a-zA-Z0-9_#.:@=-]+");
		profile_name_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		profile_name_validator.validate(operationType, profile_name, "\"profile_name\"");
		
		MPSString clnodes_validator = new MPSString();
		clnodes_validator.validate(operationType, clnodes, "\"clnodes\"");
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
		MPSString operationalstate_validator = new MPSString();
		operationalstate_validator.validate(operationType, operationalstate, "\"operationalstate\"");
		
	}
}
