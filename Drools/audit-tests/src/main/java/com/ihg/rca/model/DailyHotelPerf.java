package com.ihg.rca.model;

public class DailyHotelPerf {
	
	private long id;
	private long monthId;
	private float adrVarPct;
	private double adrUsdAmt;
	private float adjRevPct;
	
	public DailyHotelPerf() {
		super();
	}
	
	public DailyHotelPerf(long id, long monthId, float adrVarPct, double adrUsdAmt, float adjRevPct) {
		super();
		this.id = id;
		this.monthId = monthId;
		this.adrVarPct = adrVarPct;
		this.adrUsdAmt = adrUsdAmt;
		this.adjRevPct = adjRevPct;
	}
	
	
	
	public float getAdjRevPct() {
		return adjRevPct;
	}

	public void setAdjRevPct(float adjRevPct) {
		this.adjRevPct = adjRevPct;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getMonthId() {
		return monthId;
	}

	public void setMonthId(long monthId) {
		this.monthId = monthId;
	}
	public float getAdrVarPct() {
		return adrVarPct;
	}
	public void setAdrVarPct(float adrVarPct) {
		this.adrVarPct = adrVarPct;
	}
	public double getAdrUsdAmt() {
		return adrUsdAmt;
	}
	public void setAdrUsdAmt(double adrUsdAmt) {
		this.adrUsdAmt = adrUsdAmt;
	}
	
	
	
}
