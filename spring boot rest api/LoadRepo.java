package com.springboot.load.loadapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.load.loadapi.entities.Load;
import com.springboot.load.loadapi.entities.Shipper;

@Repository
public interface LoadRepo extends JpaRepository<Load,String>{
    List<Load> findByshipperId(Shipper shipperId);

}
