package com.springboot.load.loadapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.load.loadapi.entities.Shipper;

@Repository
public interface ShipperRepo extends JpaRepository<Shipper, String> {

}
