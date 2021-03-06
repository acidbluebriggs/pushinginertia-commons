/* Copyright (c) 2011-2013 Pushing Inertia
 * All rights reserved.  http://pushinginertia.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pushinginertia.commons.domain.base;

import java.io.Serializable;

/**
 * Base container object.
 */
public abstract class BaseDCO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Performs any necessary business logic to prepare the object before it is created in the database.
	 */
	public void onBeforeCreate() {
	}

	/**
	 * Performs any necessary business logic to prepare the object before it is updated in the database.
	 */
	public void onBeforeUpdate() {
	}
}
