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


class ns_clusternode_response extends base_response
{
	public ns_clusternode[] ns_clusternode;
}

class ns_clusternode_responses extends base_response
{
	public ns_clusternode_response[] ns_clusternode_response_array;
}

/**
 * Configuration for ns_clusternode resource.
 */

public class ns_clusternode extends base_resource
{
	private String clnodehealth;
	private Integer clusterid;
	private Integer nodeid;
	private Double nnmcurconn;
	private String clnodeip;
	private Double nnmerrmsend;
	private Double nnmtotconntx;
	private String password;
	private String act_id;
	private Boolean iscco;
	private String clnodeeffectivehealth;
	private String clip;
	private Double clptptx;
	private String clmasterstate;
	private String clsyncstate;
	private Double cltothbtx;
	private Double nnmtotconnrx;
	private Double clptprx;
	private String clptpstate;
	private Double cltothbrx;
	private String islocalsdx;
	private Long __count;

	protected String get_object_type()
	{
		return "ns_clusternode";
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
	 * Health of the node in the cluster
	 * </pre>
	 */
	public String get_clnodehealth()
	{
		return this.clnodehealth;
	}

	/**
	 * <pre>
	 * Cluster Instance ID
	 * </pre>
	 */
	public void set_clusterid(Integer clusterid)
	{
		this.clusterid = clusterid;
	}

	/**
	 * <pre>
	 * Cluster Instance ID
	 * </pre>
	 */
	public Integer get_clusterid()
	{
		return this.clusterid;
	}

	/**
	 * <pre>
	 * Cluster Node ID
	 * </pre>
	 */
	public void set_nodeid(Integer nodeid)
	{
		this.nodeid = nodeid;
	}

	/**
	 * <pre>
	 * Cluster Node ID
	 * </pre>
	 */
	public Integer get_nodeid()
	{
		return this.nodeid;
	}


	/**
	 * <pre>
	 * Number of Connections open for node to node connection.
	 * </pre>
	 */
	public Double get_nnmcurconn()
	{
		return this.nnmcurconn;
	}

	/**
	 * <pre>
	 * Cluster Node IP
	 * </pre>
	 */
	public void set_clnodeip(String clnodeip)
	{
		this.clnodeip = clnodeip;
	}

	/**
	 * <pre>
	 * Cluster Node IP
	 * </pre>
	 */
	public String get_clnodeip()
	{
		return this.clnodeip;
	}


	/**
	 * <pre>
	 * Number of errors in sending node-to-node multicast/broadcast messages
	 * </pre>
	 */
	public Double get_nnmerrmsend()
	{
		return this.nnmerrmsend;
	}


	/**
	 * <pre>
	 * Number of node-to-node messages sent
	 * </pre>
	 */
	public Double get_nnmtotconntx()
	{
		return this.nnmtotconntx;
	}

	/**
	 * <pre>
	 * Password of the CCO node(CLIP)
	 * </pre>
	 */
	public void set_password(String password)
	{
		this.password = password;
	}

	/**
	 * <pre>
	 * Password of the CCO node(CLIP)
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
	 * Effective Health of the node in the cluster
	 * </pre>
	 */
	public String get_clnodeeffectivehealth()
	{
		return this.clnodeeffectivehealth;
	}

	/**
	 * <pre>
	 * Cluster IP
	 * </pre>
	 */
	public void set_clip(String clip)
	{
		this.clip = clip;
	}

	/**
	 * <pre>
	 * Cluster IP
	 * </pre>
	 */
	public String get_clip()
	{
		return this.clip;
	}


	/**
	 * <pre>
	 * Number of PTP packets transmitted by the node
	 * </pre>
	 */
	public Double get_clptptx()
	{
		return this.clptptx;
	}


	/**
	 * <pre>
	 * Cluster Master State
	 * </pre>
	 */
	public String get_clmasterstate()
	{
		return this.clmasterstate;
	}


	/**
	 * <pre>
	 * Sync state of the cluster node
	 * </pre>
	 */
	public String get_clsyncstate()
	{
		return this.clsyncstate;
	}


	/**
	 * <pre>
	 * Cluster Number of Heartbeats Sent
	 * </pre>
	 */
	public Double get_cltothbtx()
	{
		return this.cltothbtx;
	}


	/**
	 * <pre>
	 * Number of node-to-node messages received
	 * </pre>
	 */
	public Double get_nnmtotconnrx()
	{
		return this.nnmtotconnrx;
	}


	/**
	 * <pre>
	 * Number of PTP packets received on the node
	 * </pre>
	 */
	public Double get_clptprx()
	{
		return this.clptprx;
	}


	/**
	 * <pre>
	 * PTP state of the node. This state is Master for one node and Slave for the rest
	 * </pre>
	 */
	public String get_clptpstate()
	{
		return this.clptpstate;
	}


	/**
	 * <pre>
	 * Cluster Number of Heartbeats Received
	 * </pre>
	 */
	public Double get_cltothbrx()
	{
		return this.cltothbrx;
	}

	/**
	 * <pre>
	 * Is Node Belonging to Local SDX
	 * </pre>
	 */
	public void set_islocalsdx(String islocalsdx)
	{
		this.islocalsdx = islocalsdx;
	}

	/**
	 * <pre>
	 * Is Node Belonging to Local SDX
	 * </pre>
	 */
	public String get_islocalsdx()
	{
		return this.islocalsdx;
	}


	/**
	 * <pre>
	 * Use this operation to remove node from cluster.
	 * </pre>
	 */
	public static ns_clusternode remove_node(nitro_service client, ns_clusternode resource) throws Exception
	{
		return ((ns_clusternode[]) resource.perform_operation(client, "remove_node"))[0];
	}

	/**
	 * <pre>
	 * Use this operation to remove node from cluster in bulk.
	 * </pre>
	 */
	public static ns_clusternode[] remove_node(nitro_service client, ns_clusternode[] resources) throws Exception
	{
		if(resources == null)
			throw new Exception("Null resource array");
		
		
		if(resources.length == 1)
			return ((ns_clusternode[]) resources[0].perform_operation(client, "remove_node"));
		
		return ((ns_clusternode[]) perform_operation_bulk_request(client, resources, "remove_node"));
	}

	/**
	* Use this API to fetch filtered set of ns_clusternode resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static ns_clusternode[] get_filtered(nitro_service service, String filter) throws Exception
	{
		ns_clusternode obj = new ns_clusternode();
		options option = new options();
		option.set_filter(filter);
		ns_clusternode[] response = (ns_clusternode[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ns_clusternode resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ns_clusternode[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_clusternode obj = new ns_clusternode();
		options option = new options();
		option.set_filter(filter);
		ns_clusternode[] response = (ns_clusternode[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ns_clusternode resources configured on NetScaler SDX.
	*/
	public static long count(nitro_service service) throws Exception
	{
		ns_clusternode obj = new ns_clusternode();
		options option = new options();
		option.set_count(true);
		ns_clusternode[] response = (ns_clusternode[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_clusternode resources.
	* filter string should be in JSON format.eg: "vm_state:DOWN,name:[a-z]+"
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception
	{
		ns_clusternode obj = new ns_clusternode();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_clusternode[] response = (ns_clusternode[])obj.get_resources(service, option);
		if (response != null && response.length > 0)
			return response[0].__count;
		return 0;
	}

	/**
	* Use this API to count the filtered set of ns_clusternode resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception
	{
		ns_clusternode obj = new ns_clusternode();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ns_clusternode[] response = (ns_clusternode[])obj.get_resources(service, option);
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
		ns_clusternode_response result = (ns_clusternode_response) service.get_payload_formatter().string_to_resource(ns_clusternode_response.class, response);
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
		return result.ns_clusternode;
	}

	/**
	 * <pre>
	 * Converts API response of bulk operation into object and returns the object array in case of get request.
	 * </pre>
	 */
	protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
	{
		ns_clusternode_responses result = (ns_clusternode_responses) service.get_payload_formatter().string_to_resource(ns_clusternode_responses.class, response);
		if(result.errorcode != 0)
		{
			if (result.errorcode == SESSION_NOT_EXISTS)
				service.clear_session();
			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.ns_clusternode_response_array);
		}
		ns_clusternode[] result_ns_clusternode = new ns_clusternode[result.ns_clusternode_response_array.length];
		
		for(int i = 0; i < result.ns_clusternode_response_array.length; i++)
		{
			result_ns_clusternode[i] = result.ns_clusternode_response_array[i].ns_clusternode[0];
		}
		
		return result_ns_clusternode;
	}

	/**
	 * <pre>
	 * Performs generic data validation for the operation to be performed
	 * </pre>
	 */
	protected void validate(String operationType) throws Exception
	{
		super.validate(operationType);

		MPSInt nodeid_validator = new MPSInt();
		nodeid_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 0);
		nodeid_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 31);
		nodeid_validator.validate(operationType, nodeid, "\"nodeid\"");
		
		MPSInt clusterid_validator = new MPSInt();
		clusterid_validator.setConstraintMinValue(MPSConstants.GENERIC_CONSTRAINT, 1);
		clusterid_validator.setConstraintMaxValue(MPSConstants.GENERIC_CONSTRAINT, 16);
		clusterid_validator.validate(operationType, clusterid, "\"clusterid\"");
		
		MPSIPAddress clnodeip_validator = new MPSIPAddress();
		clnodeip_validator.validate(operationType, clnodeip, "\"clnodeip\"");
		
		MPSIPAddress clip_validator = new MPSIPAddress();
		clip_validator.validate(operationType, clip, "\"clip\"");
		
		MPSString password_validator = new MPSString();
		password_validator.setConstraintMaxStrLen(MPSConstants.GENERIC_CONSTRAINT, 128);
		password_validator.setConstraintMinStrLen(MPSConstants.GENERIC_CONSTRAINT, 1);
		password_validator.validate(operationType, password, "\"password\"");
		
		MPSString clmasterstate_validator = new MPSString();
		clmasterstate_validator.validate(operationType, clmasterstate, "\"clmasterstate\"");
		
		MPSDouble cltothbtx_validator = new MPSDouble();
		cltothbtx_validator.validate(operationType, cltothbtx, "\"cltothbtx\"");
		
		MPSDouble cltothbrx_validator = new MPSDouble();
		cltothbrx_validator.validate(operationType, cltothbrx, "\"cltothbrx\"");
		
		MPSDouble nnmcurconn_validator = new MPSDouble();
		nnmcurconn_validator.validate(operationType, nnmcurconn, "\"nnmcurconn\"");
		
		MPSDouble nnmtotconntx_validator = new MPSDouble();
		nnmtotconntx_validator.validate(operationType, nnmtotconntx, "\"nnmtotconntx\"");
		
		MPSDouble nnmtotconnrx_validator = new MPSDouble();
		nnmtotconnrx_validator.validate(operationType, nnmtotconnrx, "\"nnmtotconnrx\"");
		
		MPSDouble nnmerrmsend_validator = new MPSDouble();
		nnmerrmsend_validator.validate(operationType, nnmerrmsend, "\"nnmerrmsend\"");
		
		MPSDouble clptptx_validator = new MPSDouble();
		clptptx_validator.validate(operationType, clptptx, "\"clptptx\"");
		
		MPSDouble clptprx_validator = new MPSDouble();
		clptprx_validator.validate(operationType, clptprx, "\"clptprx\"");
		
		MPSString clptpstate_validator = new MPSString();
		clptpstate_validator.validate(operationType, clptpstate, "\"clptpstate\"");
		
		MPSString clnodehealth_validator = new MPSString();
		clnodehealth_validator.validate(operationType, clnodehealth, "\"clnodehealth\"");
		
		MPSString clnodeeffectivehealth_validator = new MPSString();
		clnodeeffectivehealth_validator.validate(operationType, clnodeeffectivehealth, "\"clnodeeffectivehealth\"");
		
		MPSString clsyncstate_validator = new MPSString();
		clsyncstate_validator.validate(operationType, clsyncstate, "\"clsyncstate\"");
		
		MPSBoolean iscco_validator = new MPSBoolean();
		iscco_validator.validate(operationType, iscco, "\"iscco\"");
		
		MPSString islocalsdx_validator = new MPSString();
		islocalsdx_validator.validate(operationType, islocalsdx, "\"islocalsdx\"");
		
		MPSString act_id_validator = new MPSString();
		act_id_validator.validate(operationType, act_id, "\"act_id\"");
		
	}
}
