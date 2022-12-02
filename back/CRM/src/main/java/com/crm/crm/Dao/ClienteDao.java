package com.crm.crm.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.crm.crm.entities.Cliente;

@Component
public class ClienteDao {
	private static List<Cliente> cliente = new ArrayList<>();
	
	static {
		cliente.add(new Cliente(1, "Juan", 456123789, "Email"));
		cliente.add(new Cliente(2,"Marcos", 456879147, "In person"));
		cliente.add(new Cliente (3,"Marta", 159789456, "Phone"));
	}
	
	public List<Cliente> getAll(){
		return cliente;
	}
	public Cliente getCliente(int id) {
		return cliente.get(id);
	}
	
	public void saveCliente(Cliente cliente) {
		cliente.add(cliente);
	}
	public void deleteCliente(int id) {
		cliente.remove(id);
	}
	
	public Cliente findCliente(int id) {
		for(Cliente clientes: cliente) {
			if(clientes.getIdCliente() == id) {
				return clientes;
			}
		}
		return null;
	}

}
