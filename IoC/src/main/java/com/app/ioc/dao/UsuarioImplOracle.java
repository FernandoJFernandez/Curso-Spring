package com.app.ioc.dao;

public class UsuarioImplOracle implements UsuarioService {
	
	public void insert() {
		System.out.println("Insertando Usando en Oracle");
	}

	public void elimina(int id) {
		System.out.println("Eliminando Usando en Oracle: " + id);
	}

}
