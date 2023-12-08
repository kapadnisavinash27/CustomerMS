package com.Ashoka.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CustomerDetails {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer id")
	private Integer cid;
	@Column(name = "customer name")
	private String cname;
	@Column(name = "customer Address")
	private String cadd;
	
	
	
	
}
