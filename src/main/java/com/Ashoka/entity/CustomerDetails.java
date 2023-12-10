package com.Ashoka.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Getter
public class CustomerDetails {

	

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer id")
	private Integer cid;
	

	@Column(name = "customer name")
	private String cname;
	@Column(name = "customer Address")
	private String cadd;
	
	public Integer getCid() {
		return cid;
	}
	
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	
	
}
