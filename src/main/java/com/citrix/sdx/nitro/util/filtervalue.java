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

package com.citrix.sdx.nitro.util;

/**
 * filtervalue class provides a way to specify the filter parameter name and value for performing filtered get operation.
 */
public class filtervalue
{
	private String name;
	private String value;

	public filtervalue(String name, String value)
	{
		this.name = name;
		this.value = value;
	}

	/**
     * @return gets the name of the filter parameter.
     */
	public String get_name()
	{
		return this.name;
	}

	/**
     * @return gets the value of the filter parameter.
     */
	public String get_value() 
	{
		return this.value;
	}
}
