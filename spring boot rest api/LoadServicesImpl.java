package com.springboot.load.loadapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.load.loadapi.dao.LoadRepo;
import com.springboot.load.loadapi.dao.ShipperRepo;
import com.springboot.load.loadapi.entities.Load;
import com.springboot.load.loadapi.entities.Shipper;

@Service
public class LoadServicesImpl implements LoadServices{

	@Autowired
	private LoadRepo loadRepo;
	@Autowired
	private ShipperRepo shipperRepo;

	
	public LoadServicesImpl() {
	}

	
	public void createLoad(Load entity) {
		loadRepo.save(entity);
	}

	
	public void createShipper(Shipper entity) {
		shipperRepo.save(entity);
	}

	
	public Optional<Load> getLoadByLoadId(String id) {
		Optional<Load> l = loadRepo.findById(id);
		return l;
	}

	
	public Optional<Shipper> getShipperId(String id) {
		Optional<Shipper> l = shipperRepo.findById(id);
		return l;
	}

	
	public List<Load> getLoadByShipperId(Shipper id) {
		return loadRepo.findByshipperId(id);
	}

	
	public void update(Load entity) {
		loadRepo.save(entity);
	}

	
	public void delete(String id) {
		loadRepo.deleteById(id);
	}

}
