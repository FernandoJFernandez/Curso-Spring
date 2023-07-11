package com.app.anota.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fabrica")
public class UsuarioFactory {
	
	// Aquí se inyecta la dependencia y se hace la inversión de control
	@Autowired
	UsuarioImplOracle usr;
	// UsuarioImplMongo usr;

	// A través de este método se accede al método que se necesite
	public void getInserta() {
		usr.inserta();
	}
	
}
