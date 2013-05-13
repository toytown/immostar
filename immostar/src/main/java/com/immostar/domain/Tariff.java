package com.immostar.domain;

import java.io.Serializable;

import org.bson.types.ObjectId;

public class Tariff implements Serializable {

	private ObjectId tariffId;
	private double price;
	private String tariffName;

	public ObjectId getTariffId() {
		return tariffId;
	}
	public void setTariffId(ObjectId tariffId) {
		this.tariffId = tariffId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTariffName() {
		return tariffName;
	}
	public void setTariffName(String tariffName) {
		this.tariffName = tariffName;
	}
	
}
