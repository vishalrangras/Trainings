package com.ihg.rca.model;

public class MonthlyHotelPerf {
	private long id;
	private double adrUsdAmt;
	
	private float roomRevVarPct;
	private double roomRevDiffUsdAmt;
	private double psRoomRevUsdAmt;
	private double netRevUsdAmt;
	private float strCompRevparVarPct;
	private float strHtlRevparVarPct;
	
	public MonthlyHotelPerf() {
		super();
	}
	
	public MonthlyHotelPerf(long id, double adrUsdAmt) {
		super();
		this.id = id;
		this.adrUsdAmt = adrUsdAmt;
	}
	
	
	
	public MonthlyHotelPerf(long id, double adrUsdAmt, float roomRevVarPct, double roomRevDiffUsdAmt,
			double psRoomRevUsdAmt, double netRevUsdAmt, float strCompRevparVarPct, float strHtlRevparVarPct) {
		super();
		this.id = id;
		this.adrUsdAmt = adrUsdAmt;
		this.roomRevVarPct = roomRevVarPct;
		this.roomRevDiffUsdAmt = roomRevDiffUsdAmt;
		this.psRoomRevUsdAmt = psRoomRevUsdAmt;
		this.netRevUsdAmt = netRevUsdAmt;
		this.strCompRevparVarPct = strCompRevparVarPct;
		this.strHtlRevparVarPct = strHtlRevparVarPct;
	}

	public float getRoomRevVarPct() {
		return roomRevVarPct;
	}

	public void setRoomRevVarPct(float roomRevVarPct) {
		this.roomRevVarPct = roomRevVarPct;
	}

	public double getRoomRevDiffUsdAmt() {
		return roomRevDiffUsdAmt;
	}

	public void setRoomRevDiffUsdAmt(double roomRevDiffUsdAmt) {
		this.roomRevDiffUsdAmt = roomRevDiffUsdAmt;
	}

	public double getPsRoomRevUsdAmt() {
		return psRoomRevUsdAmt;
	}

	public void setPsRoomRevUsdAmt(double psRoomRevUsdAmt) {
		this.psRoomRevUsdAmt = psRoomRevUsdAmt;
	}

	public double getNetRevUsdAmt() {
		return netRevUsdAmt;
	}

	public void setNetRevUsdAmt(double netRevUsdAmt) {
		this.netRevUsdAmt = netRevUsdAmt;
	}

	public float getStrCompRevparVarPct() {
		return strCompRevparVarPct;
	}

	public void setStrCompRevparVarPct(float strCompRevparVarPct) {
		this.strCompRevparVarPct = strCompRevparVarPct;
	}

	public float getStrHtlRevparVarPct() {
		return strHtlRevparVarPct;
	}

	public void setStrHtlRevparVarPct(float strHtlRevparVarPct) {
		this.strHtlRevparVarPct = strHtlRevparVarPct;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAdrUsdAmt() {
		return adrUsdAmt;
	}

	public void setAdrUsdAmt(double adrUsdAmt) {
		this.adrUsdAmt = adrUsdAmt;
	}
	
	
}
