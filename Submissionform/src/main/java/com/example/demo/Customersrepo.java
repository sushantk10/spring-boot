package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Customersrepo extends JpaRepository<Customers, Integer>{

}
