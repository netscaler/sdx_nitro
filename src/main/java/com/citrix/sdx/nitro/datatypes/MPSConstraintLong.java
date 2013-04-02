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

public class MPSConstraintLong extends MPSConstraint
{
	private boolean isRequired;
	private long maxValue;
	private long minValue;
	private long defaultValue;
	
	public MPSConstraintLong()
	{
		isRequired = false;
		minValue = Long.MIN_VALUE;
		maxValue = Long.MAX_VALUE;
		defaultValue = new Long(-1);
	}

	public void setIsRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	public void setMaxValue(long maxValue) {
		this.maxValue = maxValue;
	}

	public void setMinValue(long minValue) {
		this.minValue = minValue;
	}

	public void setDefaultValue(long defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	public void validate(Object _value, String label) throws Exception 
	{
		if(_value == null)
			_value = (Long)defaultValue;
		
		long value = (Long)_value;
		
		if(isRequired == false && value == defaultValue)
			return;
		
		if(value < minValue)
		{
			throw new Exception(label+" value: "+value+" is less than minimum value: "+minValue);
		}
		
		if(value > maxValue)
		{
			throw new Exception(label+" value: "+value+" is greater than maximun value: "+maxValue);
		}
		
		return;
	}
}