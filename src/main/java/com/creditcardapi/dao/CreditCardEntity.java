package com.creditcardapi.dao;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card")
public class CreditCardEntity {

	private int cid;
	private String name;
	private String type;
	private String cno;
	private int cvv;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="c_id")
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(length=100)
	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}



	@Override
	public String toString() {
		return "CreditCardEntity [cid=" + cid + ", name=" + name + ", type=" + type + ", cno=" + cno + ", cvv=" + cvv
				+ "]";
	}

}
