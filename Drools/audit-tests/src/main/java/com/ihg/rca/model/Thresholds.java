package com.ihg.rca.model;

public class Thresholds {
	private float adrMatMin;
	private float adrMatMax;
	
	private float fisPsMatMin;
	private float fisPsMatMax;
	
	private double fisPsUsdMin;
	private double fisPsUsdMax;
	
	private float compMatMin;
	private float compMatMax;
	
	private float strFisMatMin;
	private float strFisMatMax;
	
	private float fisRevAdjMatMin;
	
	
	
	 
	
	public Thresholds() {
		super();
	}
	
	public Thresholds(float adrMatMin, float adrMatMax, float fisPsMatMin, float fisPsMatMax, double fisPsUsdMin,
			double fisPsUsdMax, float compMatMin, float compMatMax, float strFisMatMin, float strFisMatMax,
			float fisRevAdjMatMin) {
		super();
		this.adrMatMin = adrMatMin;
		this.adrMatMax = adrMatMax;
		this.fisPsMatMin = fisPsMatMin;
		this.fisPsMatMax = fisPsMatMax;
		this.fisPsUsdMin = fisPsUsdMin;
		this.fisPsUsdMax = fisPsUsdMax;
		this.compMatMin = compMatMin;
		this.compMatMax = compMatMax;
		this.strFisMatMin = strFisMatMin;
		this.strFisMatMax = strFisMatMax;
		this.fisRevAdjMatMin = fisRevAdjMatMin;
	}

	public double getFisPsUsdMin() {
		return fisPsUsdMin;
	}

	public void setFisPsUsdMin(double fisPsUsdMin) {
		this.fisPsUsdMin = fisPsUsdMin;
	}

	public double getFisPsUsdMax() {
		return fisPsUsdMax;
	}

	public void setFisPsUsdMax(double fisPsUsdMax) {
		this.fisPsUsdMax = fisPsUsdMax;
	}

	public float getFisPsMatMin() {
		return fisPsMatMin;
	}

	public void setFisPsMatMin(float fisPsMatMin) {
		this.fisPsMatMin = fisPsMatMin;
	}

	public float getFisPsMatMax() {
		return fisPsMatMax;
	}

	public void setFisPsMatMax(float fisPsMatMax) {
		this.fisPsMatMax = fisPsMatMax;
	}

	public float getCompMatMin() {
		return compMatMin;
	}

	public void setCompMatMin(float compMatMin) {
		this.compMatMin = compMatMin;
	}

	public float getCompMatMax() {
		return compMatMax;
	}

	public void setCompMatMax(float compMatMax) {
		this.compMatMax = compMatMax;
	}

	public float getStrFisMatMin() {
		return strFisMatMin;
	}

	public void setStrFisMatMin(float strFisMatMin) {
		this.strFisMatMin = strFisMatMin;
	}

	public float getStrFisMatMax() {
		return strFisMatMax;
	}

	public void setStrFisMatMax(float strFisMatMax) {
		this.strFisMatMax = strFisMatMax;
	}

	public float getFisRevAdjMatMin() {
		return fisRevAdjMatMin;
	}

	public void setFisRevAdjMatMin(float fisRevAdjMatMin) {
		this.fisRevAdjMatMin = fisRevAdjMatMin;
	}

	public float getAdrMatMin() {
		return adrMatMin;
	}
	public void setAdrMatMin(float adrMatMin) {
		this.adrMatMin = adrMatMin;
	}
	public float getAdrMatMax() {
		return adrMatMax;
	}
	public void setAdrMatMax(float adrMatMax) {
		this.adrMatMax = adrMatMax;
	}
	
	

}
