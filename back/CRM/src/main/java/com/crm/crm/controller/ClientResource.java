package com.crm.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.Dao.ClienteDao;
import com.crm.crm.entities.Cliente;


@RestController
@CrossOrigin(origins = "*")
public class ClientResource {
	@Autowired
	private ClienteDao service;
	
	@GetMapping("/cliente")
	public List<Cliente> serviceAllClientes(){
		return service.getAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente serviceClientes(@PathVariable int id) {
		return service.findCliente(id);
	}
}
