package com.jshop.entity;

// Generated 2014-4-8 22:52:16 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ShippingAddressT generated by hbm2java
 */
@Entity
@Table(name = "shipping_address_t", catalog = "jshoper3")
public class ShippingAddressT implements java.io.Serializable {

	private String shippingaddressid;
	private String memberid;
	private String shippingusername;
	private String province;
	private String city;
	private String district;
	private String street;
	private String postcode;
	private String telno;
	private String mobile;
	private String email;
	private Date createtime;
	private String state;
	private String issend;
	private String deliveraddressid;
	private String orderid;
	private String country;
	private String shopid;

	public ShippingAddressT() {
	}

	public ShippingAddressT(String shippingaddressid, String memberid,
			String shippingusername, String province, String city,
			String district, String street, String mobile, Date createtime,
			String state, String issend, String country) {
		this.shippingaddressid = shippingaddressid;
		this.memberid = memberid;
		this.shippingusername = shippingusername;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.mobile = mobile;
		this.createtime = createtime;
		this.state = state;
		this.issend = issend;
		this.country = country;
	}

	public ShippingAddressT(String shippingaddressid, String memberid,
			String shippingusername, String province, String city,
			String district, String street, String postcode, String telno,
			String mobile, String email, Date createtime, String state,
			String issend, String deliveraddressid, String orderid,
			String country, String shopid) {
		this.shippingaddressid = shippingaddressid;
		this.memberid = memberid;
		this.shippingusername = shippingusername;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.postcode = postcode;
		this.telno = telno;
		this.mobile = mobile;
		this.email = email;
		this.createtime = createtime;
		this.state = state;
		this.issend = issend;
		this.deliveraddressid = deliveraddressid;
		this.orderid = orderid;
		this.country = country;
		this.shopid = shopid;
	}

	@Id
	@Column(name = "SHIPPINGADDRESSID", unique = true, nullable = false, length = 20)
	public String getShippingaddressid() {
		return this.shippingaddressid;
	}

	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}

	@Column(name = "MEMBERID", nullable = false, length = 20)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "SHIPPINGUSERNAME", nullable = false, length = 45)
	public String getShippingusername() {
		return this.shippingusername;
	}

	public void setShippingusername(String shippingusername) {
		this.shippingusername = shippingusername;
	}

	@Column(name = "PROVINCE", nullable = false, length = 45)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "CITY", nullable = false, length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "DISTRICT", nullable = false, length = 45)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "STREET", nullable = false, length = 100)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "POSTCODE", length = 45)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "TELNO", length = 20)
	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	@Column(name = "MOBILE", nullable = false, length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "ISSEND", nullable = false, length = 1)
	public String getIssend() {
		return this.issend;
	}

	public void setIssend(String issend) {
		this.issend = issend;
	}

	@Column(name = "DELIVERADDRESSID", length = 20)
	public String getDeliveraddressid() {
		return this.deliveraddressid;
	}

	public void setDeliveraddressid(String deliveraddressid) {
		this.deliveraddressid = deliveraddressid;
	}

	@Column(name = "ORDERID", length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "COUNTRY", nullable = false, length = 45)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "SHOPID", length = 20)
	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}
