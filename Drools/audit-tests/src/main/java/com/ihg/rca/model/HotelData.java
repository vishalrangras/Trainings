package com.ihg.rca.model;

public class HotelData {
	
	private DailyHotelPerf dailyHotelPerf;
	private MonthlyHotelPerf monthlyHotelPerf;
	private MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf;
	private String holidexCode;
	private int totalExceptions;
	
	public HotelData() {
		super();
	}
	
	public HotelData(DailyHotelPerf dailyHotelPerf, MonthlyHotelPerf monthlyHotelPerf,
			MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf, String holidexCode) {
		super();
		this.dailyHotelPerf = dailyHotelPerf;
		this.monthlyHotelPerf = monthlyHotelPerf;
		this.monthlyHtlRateCtgyPerf = monthlyHtlRateCtgyPerf;
		this.holidexCode = holidexCode;
	}
	
	
	public int getTotalExceptions() {
		return totalExceptions;
	}

	public void setTotalExceptions(int totalExceptions) {
		this.totalExceptions = totalExceptions;
	}

	public DailyHotelPerf getDailyHotelPerf() {
		return dailyHotelPerf;
	}
	public void setDailyHotelPerf(DailyHotelPerf dailyHotelPerf) {
		this.dailyHotelPerf = dailyHotelPerf;
	}
	public MonthlyHotelPerf getMonthlyHotelPerf() {
		return monthlyHotelPerf;
	}
	public MonthlyHtlRateCtgyPerf getMonthlyHtlRateCtgyPerf() {
		return monthlyHtlRateCtgyPerf;
	}
	public void setMonthlyHtlRateCtgyPerf(MonthlyHtlRateCtgyPerf monthlyHtlRateCtgyPerf) {
		this.monthlyHtlRateCtgyPerf = monthlyHtlRateCtgyPerf;
	}

	public String getHolidexCode() {
		return holidexCode;
	}
	public void setHolidexCode(String holidexCode) {
		this.holidexCode = holidexCode;
	}
	public void setMonthlyHotelPerf(MonthlyHotelPerf monthlyHotelPerf) {
		this.monthlyHotelPerf = monthlyHotelPerf;
	}
	
	

}
