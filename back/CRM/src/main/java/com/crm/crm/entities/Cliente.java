package com.crm.crm.entities;

public class Cliente {

	private int idCliente;
	private String nameCliente;
	private int telCliente;
	private String contactMode;
	
	public Cliente(int idCliente, String nameCliente, int telCliente, String contactMode) {
		this.idCliente = idCliente;
		this.nameCliente = nameCliente;
		this.telCliente = telCliente;
		this.contactMode = contactMode;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNameCliente() {
		return nameCliente;
	}
	public void setNameCliente(String nameCliente) {
		this.nameCliente = nameCliente;
	}
	public int getTelCliente() {
		return telCliente;
	}
	public void setTelCliente(int telCliente) {
		this.telCliente = telCliente;
	}
	public String getContactMode() {
		return contactMode;
	}
	public void setContactMode(String contactMode) {
		this.contactMode = contactMode;
	}
	public void add(Cliente cliente) {
		new Cliente(cliente.idCliente, cliente.nameCliente, cliente.telCliente, cliente.contactMode);
	}

}
