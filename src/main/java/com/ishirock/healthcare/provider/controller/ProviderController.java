package com.ishirock.healthcare.provider.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ishirock.healthcare.provider.model.Provider;
import com.ishirock.healthcare.provider.repository.ProviderRepository;

@RestController
@RequestMapping("/api/v1/providers")
public class ProviderController {

	@Autowired
	ProviderRepository providerRepository;
	
	@GetMapping
	public List<Provider> listProviders(){		
		return providerRepository.findAll();
 	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Provider provider){
		providerRepository.save(provider);
		
	}
	
	@GetMapping("/{id}")
	public Provider get(@PathVariable("id") long id){
		return providerRepository.getOne(id);
	}
	
}
