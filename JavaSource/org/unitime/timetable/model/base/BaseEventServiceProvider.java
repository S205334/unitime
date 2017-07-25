/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.model.base;

import java.io.Serializable;

import org.unitime.timetable.model.EventServiceProvider;
import org.unitime.timetable.model.RefTableEntry;

/**
 * Do not change this class. It has been automatically generated using ant create-model.
 * @see org.unitime.commons.ant.CreateBaseModelFromXml
 */
public abstract class BaseEventServiceProvider extends RefTableEntry implements Serializable {
	private static final long serialVersionUID = 1L;

	private String iNote;
	private String iEmail;
	private Integer iOptions;


	public static String PROP_NOTE = "note";
	public static String PROP_EMAIL = "email";
	public static String PROP_OPTIONS = "options";

	public BaseEventServiceProvider() {
		initialize();
	}

	public BaseEventServiceProvider(Long uniqueId) {
		setUniqueId(uniqueId);
		initialize();
	}

	protected void initialize() {}

	public String getNote() { return iNote; }
	public void setNote(String note) { iNote = note; }

	public String getEmail() { return iEmail; }
	public void setEmail(String email) { iEmail = email; }

	public Integer getOptions() { return iOptions; }
	public void setOptions(Integer options) { iOptions = options; }

	public boolean equals(Object o) {
		if (o == null || !(o instanceof EventServiceProvider)) return false;
		if (getUniqueId() == null || ((EventServiceProvider)o).getUniqueId() == null) return false;
		return getUniqueId().equals(((EventServiceProvider)o).getUniqueId());
	}

	public int hashCode() {
		if (getUniqueId() == null) return super.hashCode();
		return getUniqueId().hashCode();
	}

	public String toString() {
		return "EventServiceProvider["+getUniqueId()+" "+getLabel()+"]";
	}

	public String toDebugString() {
		return "EventServiceProvider[" +
			"\n	Email: " + getEmail() +
			"\n	Label: " + getLabel() +
			"\n	Note: " + getNote() +
			"\n	Options: " + getOptions() +
			"\n	Reference: " + getReference() +
			"\n	UniqueId: " + getUniqueId() +
			"]";
	}
}
