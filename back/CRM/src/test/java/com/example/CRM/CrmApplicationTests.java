package com.example.CRM;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crm.crm.Dao.ClienteDao;
import com.crm.crm.Dao.ContactoDao;
import com.crm.crm.entities.Cliente;
import com.crm.crm.entities.Contacto;

@SpringBootTest
class CrmApplicationTests {

	
	ClienteDao clienteDao;
	ContactoDao contactoDao;
	
	@Test
	public void test() {
	}

}
