package com.Ashoka.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ashoka.entity.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails,Integer> {

}
