package com.springboot.load.loadapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.load.loadapi.entities.Load;
import com.springboot.load.loadapi.entities.Shipper;
import com.springboot.load.loadapi.services.LoadImpl;

@RestController
public class LoadController {

	@Autowired
	private LoadImpl loadImpl;

	@PostMapping("/load")
	public String addLoadDetails(@RequestBody Load load) {
		loadImpl.createLoad(load);
		return "loads details added successfully";
	}

	@PostMapping("/shipper")
	public String addShipperDetails(@RequestBody Shipper shipper) {
		loadImpl.createShipper(shipper);
		return "shipper details added successfully";
	}

	@GetMapping("/load/{loadId}")
	public Load getLoadByLoadId(@PathVariable String loadId) {
		Optional<Load> l = loadImpl.getLoadByLoadId(loadId);
		return l.get();
	}

	@GetMapping("/load")
	public List<Load> getLoadByShipperId(@RequestParam String shipperId) {
		Optional<Shipper> shipper = loadImpl.getShipperId(shipperId);
		return loadImpl.getLoadByShipperId(shipper.get());
	}

	@PutMapping("/load/{loadId}")
	public String updateLoadDetails(@PathVariable String loadId, @RequestBody Load load) {
		load.setLoadId(loadId);
		load.setShipperId(loadImpl.getLoadByLoadId(loadId).get().getShipperId());
		loadImpl.update(load);
		return "loads details updated successfully";
	}

	@DeleteMapping("/load/{loadId}")
	public String deleteLoadDetails(@PathVariable String loadId) {
		loadImpl.delete(loadId);
		return "loads deleted successfully";
	}

}
