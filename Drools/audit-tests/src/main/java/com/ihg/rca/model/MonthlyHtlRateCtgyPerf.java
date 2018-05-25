package com.ihg.rca.model;

public class MonthlyHtlRateCtgyPerf {
	
	private long id;
	private double netRevUsdAmt;
	private double psReimbRoomRevUsdAmt;
	private String rateCtgyCode;
	
	public MonthlyHtlRateCtgyPerf() {
		super();
	}
	
	public MonthlyHtlRateCtgyPerf(long id, double netRevUsdAmt, double psReimbRoomRevUsdAmt, String rateCtgyCode) {
		super();
		this.id = id;
		this.netRevUsdAmt = netRevUsdAmt;
		this.psReimbRoomRevUsdAmt = psReimbRoomRevUsdAmt;
		this.rateCtgyCode = rateCtgyCode;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getNetRevUsdAmt() {
		return netRevUsdAmt;
	}
	public void setNetRevUsdAmt(double netRevUsdAmt) {
		this.netRevUsdAmt = netRevUsdAmt;
	}
	public double getPsReimbRoomRevUsdAmt() {
		return psReimbRoomRevUsdAmt;
	}
	public void setPsReimbRoomRevUsdAmt(double psReimbRoomRevUsdAmt) {
		this.psReimbRoomRevUsdAmt = psReimbRoomRevUsdAmt;
	}
	public String getRateCtgyCode() {
		return rateCtgyCode;
	}
	public void setRateCtgyCode(String rateCtgyCode) {
		this.rateCtgyCode = rateCtgyCode;
	}
	
	
}
