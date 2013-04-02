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

package com.citrix.sdx.nitro.datatypes;

public class MPSIPAddress4 extends MPSDatatype
{
	private String value;
	
	private MPSConstraintIP4[] constraints;
	
	public MPSIPAddress4()
	{
		this(null);
	}
	
	public MPSIPAddress4(String _value)
	{
		constraints = new MPSConstraintIP4[MPSConstants.GENERIC_CONSTRAINT];
					
		for(int i = 0; i < constraints.length; i++)
		{
			constraints[i] = new MPSConstraintIP4();
		}
		value = _value;
	}
		
	public void setConstraintIsReq(int constraintType, boolean isRequired)
	{
		if(constraintType == MPSConstants.GENERIC_CONSTRAINT)
		{
			for(int _type = 0; _type < MPSConstants.GENERIC_CONSTRAINT; _type++)
			{
				constraints[_type].setIsRequired(isRequired);
			}
		}
		else
		{
			constraints[constraintType].setIsRequired(isRequired);
		}
	}
		
	public void validate(String operationType, Object _value, String label) throws Exception 
	{
		value = (String)_value;
		int constraintType = getConstraintType(operationType);
		
		if(constraintType == MPSConstants.INVALID_CONSTRAINT)
		{
			throw new Exception(label+" Invalid operation type");
		}
		
		this.constraints[constraintType].validate(value,label);		
	}
}