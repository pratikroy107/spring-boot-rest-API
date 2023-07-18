package com.springboot.load.loadapi.services;

import java.util.List;
import java.util.Optional;

import com.springboot.load.loadapi.entities.Load;
import com.springboot.load.loadapi.entities.Shipper;

public interface LoadServices {

	void createLoad(Load entity);

	void createShipper(Shipper entity);

	Optional<Load> getLoadByLoadId(String id);

	Optional<Shipper> getShipperId(String id);

	List<Load> getLoadByShipperId(Shipper id);

	void update(Load entity);

	void delete(String id);

}
