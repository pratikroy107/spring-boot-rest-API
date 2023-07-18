package com.springboot.load.loadapi.entities;

import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Load {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")

	private String loadId;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private Integer noOfTrucks;
	private Double weight;
	private String comment;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "shipper_id", referencedColumnName = "shipperId")
	private Shipper shipperId;
	private Date date;

	public String getLoadId() {
		return loadId;
	}

	public void setLoadId(String loadId) {
		this.loadId = loadId;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public Integer getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(Integer noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Shipper getShipperId() {
		return shipperId;
	}

	public void setShipperId(Shipper shipperId) {
		this.shipperId = shipperId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
