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

public class MPSString extends MPSDatatype
{
	private String value;
	
	private MPSConstraintString[] constraints;
	
	public MPSString()
	{
		this(null);
	}
	
	public MPSString(String _value)
	{
		constraints = new MPSConstraintString[MPSConstants.GENERIC_CONSTRAINT];
		for(int i = 0; i < constraints.length; i++)
		{
			constraints[i] = new MPSConstraintString();
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
	
	public void setConstraintMaxStrLen(int constraintType, int maxStrLen)
	{
		if(constraintType == MPSConstants.GENERIC_CONSTRAINT)
		{
			for(int _type = 0; _type < MPSConstants.GENERIC_CONSTRAINT; _type++)
			{
				constraints[_type].setMaxStrLen(maxStrLen);
			}
		}
		else
		{
			constraints[constraintType].setMaxStrLen(maxStrLen);
		}
	}
	
	public void setConstraintMinStrLen(int constraintType, int minStrLen)
	{
		if(constraintType == MPSConstants.GENERIC_CONSTRAINT)
		{
			for(int _type = 0; _type < MPSConstants.GENERIC_CONSTRAINT; _type++)
			{
				constraints[_type].setMinStrLen(minStrLen);
			}
		}
		else
		{
			constraints[constraintType].setMinStrLen(minStrLen);
		}
	}
	
	public void setConstraintCharSetRegEx(int constraintType, String charSetRegEx)
	{
		if(constraintType == MPSConstants.GENERIC_CONSTRAINT)
		{
			for(int _type = 0; _type < MPSConstants.GENERIC_CONSTRAINT; _type++)
			{
				constraints[_type].setCharSetRegEx(charSetRegEx);
			}
		}
		else
		{
			constraints[constraintType].setCharSetRegEx(charSetRegEx);
		}
	}
	
	public void validate(String operationType, Object _value, String label) throws Exception 
	{
		this.value = (String)_value;
		int constraintType = getConstraintType(operationType);
		
		if(constraintType == MPSConstants.INVALID_CONSTRAINT)
		{
			throw new Exception(label+" Invalid operation type");
		}
		
		this.constraints[constraintType].validate(value,label);
	}
}