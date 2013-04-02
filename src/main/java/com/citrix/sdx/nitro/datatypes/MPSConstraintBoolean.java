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

public class MPSConstraintBoolean extends MPSConstraint
{
	private boolean isRequired;
	@SuppressWarnings("unused")
	private boolean defaultValue;
	
	public MPSConstraintBoolean()
	{
		isRequired = false;
		defaultValue = new Boolean(false);
	}
	
	public void setIsRequired(boolean isRequired){
		this.isRequired = isRequired;
	}
	
	public void setDefaultValue(boolean defaultValue){
		this.defaultValue = defaultValue;
	}
	
	public void validate(Object _vlaue, String label) throws Exception 
	{
		if(_vlaue == null && isRequired == true)
			throw new Exception(label+" No boolean value passed");
					
		return;
	}
}