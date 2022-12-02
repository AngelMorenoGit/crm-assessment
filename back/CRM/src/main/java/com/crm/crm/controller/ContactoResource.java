package com.crm.crm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.Dao.ContactoDao;
import com.crm.crm.entities.Contacto;

@RestController
@CrossOrigin(origins= "*")
public class ContactoResource {
	@Autowired
	private ContactoDao service;

	@GetMapping("/contacto")
	public List<Contacto> serviceAllContacts(){
		return service.getAll();
	}
	
	@GetMapping("/contacto/{id}")
	public Contacto retrieveContact(@PathVariable int id){
		return service.findContact(id);
	}
	
	@PostMapping("/contacto")
	public List<Contacto> createContact(@RequestBody Contacto contacto) {
		return service.save(contacto);
	}
}
