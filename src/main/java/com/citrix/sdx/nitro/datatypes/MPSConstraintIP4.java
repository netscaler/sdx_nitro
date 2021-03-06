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

public class MPSConstraintIP4 extends MPSConstraint
{
	private boolean isRequired;
	
	public MPSConstraintIP4()
	{
		isRequired = false;
	}
	
	public void setIsRequired(boolean isRequired){
		this.isRequired = isRequired;
	}
	
	public void validate(Object _value, String label) throws Exception
	{
		if(_value == null)
			_value = "";
		
		String value = (String)_value;
		
		if(isRequired == false && value.length() == 0)
			return;
		
		if(isValidIP4(value) == false)
		{
			throw new Exception(label+" Invalid IPv4 Address: "+value);
		}
		
		return;
	}
}