package org.insight_centre.aceis.observations;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.hp.hpl.jena.rdf.model.Model;

public class SensorObservation {
	protected String srvId, foi, pName, pType;
	protected Object value;
	protected Date sysTimestamp;
	protected Date obTimeStamp;
	protected String obId;

	public String getObId() {
		return obId;
	}

	public void setObId(String obId) {
		this.obId = obId;
	}

	protected Map<String, String> propertyTypeMap;
	protected Map<String, Object> propertyValueMap;

	public SensorObservation() {
		obId = "Observation-" + UUID.randomUUID();
		this.sysTimestamp = new Date();
	}

	public static List<SensorObservation> readObservationFromSnapshot(Model m) {
		return null;

	}

	public SensorObservation(String sensor, Object value) {
		// super();
		this.srvId = sensor;
		this.value = value;
		this.sysTimestamp = new Date();
	}

	public String getFoi() {
		return foi;
	}

	public boolean valueEquals(SensorObservation so) {
		if (this.getpType().equals(so.getpType()) && this.getValue().equals(so.getValue()))
			return true;
		return false;
	}

	public String getpName() {
		return pName;
	}

	public String getpType() {
		return pType;
	}

	public String getServiceId() {
		return srvId;
	}

	public Object getValue() {
		return value;
	}

	public void setFoi(String foi) {
		this.foi = foi;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public void setServiceId(String sensor) {
		this.srvId = sensor;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Date getSysTimestamp() {
		return sysTimestamp;
	}

	public void setSysTimestamp(Date sysTimestamp) {
		this.sysTimestamp = sysTimestamp;
	}

	public Date getObTimeStamp() {
		return obTimeStamp;
	}

	public void setObTimeStamp(Date obTimeStamp) {
		this.obTimeStamp = obTimeStamp;
	}

	public String toString() {
		return "Observation: " + this.obId + ", v: " + this.value + ", p: " + this.pType + ", t1: " + this.obTimeStamp
				+ ",t2: " + this.sysTimestamp;
	}
}
