package com.mds.healper;

import com.maidis.mdskernel.MdsDateTime;

public class PamiValue {

	private int miAttr_Id;
	private int mi_Id;
	private String miAttrName;
	private String valueType;
	private double numValue;
	private String stringValue;
	private String measureUnit;
	private double lowerValue;
	private double upperValue;
	private boolean isExportable;
	private MdsDateTime vStartDate;
	public PamiValue(int miAttr_Id, int mi_Id, String miAttrName,
			String valueType, double numValue, String stringValue,
			String measureUnit, double lowerValue, double upperValue,
			boolean isExportable, MdsDateTime vStartDate) {
		super();
		this.miAttr_Id = miAttr_Id;
		this.mi_Id = mi_Id;
		this.miAttrName = miAttrName;
		this.valueType = valueType;
		this.numValue = numValue;
		this.stringValue = stringValue;
		this.measureUnit = measureUnit;
		this.lowerValue = lowerValue;
		this.upperValue = upperValue;
		this.isExportable = isExportable;
		this.vStartDate = vStartDate;
	}
	public PamiValue() {
		super();
	}
	public int getMiAttr_Id() {
		return miAttr_Id;
	}
	public void setMiAttr_Id(int miAttr_Id) {
		this.miAttr_Id = miAttr_Id;
	}
	public int getMi_Id() {
		return mi_Id;
	}
	public void setMi_Id(int mi_Id) {
		this.mi_Id = mi_Id;
	}
	public String getMiAttrName() {
		return miAttrName;
	}
	public void setMiAttrName(String miAttrName) {
		this.miAttrName = miAttrName;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public double getNumValue() {
		return numValue;
	}
	public void setNumValue(double numValue) {
		this.numValue = numValue;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	public String getMeasureUnit() {
		return measureUnit;
	}
	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}
	public double getLowerValue() {
		return lowerValue;
	}
	public void setLowerValue(double lowerValue) {
		this.lowerValue = lowerValue;
	}
	public double getUpperValue() {
		return upperValue;
	}
	public void setUpperValue(double upperValue) {
		this.upperValue = upperValue;
	}
	public boolean isExportable() {
		return isExportable;
	}
	public void setExportable(boolean isExportable) {
		this.isExportable = isExportable;
	}
	public MdsDateTime getvStartDate() {
		return vStartDate;
	}
	public void setvStartDate(MdsDateTime vStartDate) {
		this.vStartDate = vStartDate;
	}
	
	
	
}
