package com.crm.crm.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.crm.crm.entities.Contacto;
@Component
public class ContactoDao {
	private static List<Contacto> contactos = new ArrayList<>();
	private static int idContacto = 0;
	static {
		contactos.add(new Contacto(++idContacto,"Juan", 633514110 , "Primer contacto", "Angel Moreno", 5, "Se ha realizado una propuesta", "Telefono", "","working on it"));
		contactos.add(new Contacto(++idContacto,"Marcos", 633517895 , "Primer contacto con la empresa", "Angel Moreno", 5, "Se ha realizado un borrador", "Carta", "","done"));
		contactos.add(new Contacto(++idContacto,"Marta", 633517845 , "Primer mail enviado", "Angel Moreno", 5, "Primer mail enviado", "Mail", "","working on it"));
		contactos.add(new Contacto(++idContacto, "Dani", 677, "Primer contacto", "Angel Comercial", 4, "descripcion", "Mail", "","done"));
	}
	
	public List<Contacto> getAll(){
		return contactos;
	}
	
	public Contacto getContacto(int id) {
		return contactos.get(id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Contacto> save(Contacto contactos) {
		contactos.setIdContacto(++idContacto);
		((List<Contacto>) contactos).add(contactos);
		return (List<Contacto>) contactos;
	}

	public void deleteContacto(int id) {
		contactos.remove(id);
	}
	
	public Contacto findContact(int id) {
		for(Contacto contactos : contactos) {
			if(contactos.getIdContacto()== id) {
				return contactos;
			}
		}
		return null;
	}
}
