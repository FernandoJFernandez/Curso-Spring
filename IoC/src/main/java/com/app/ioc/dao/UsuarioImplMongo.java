package com.app.ioc.dao;

public class UsuarioImplMongo implements UsuarioService {
	
	public void insert() {
		System.out.println("Insertando Usando en Mongo");
	}

	public void elimina(int id) {
		System.out.println("Eliminando Usando en Mongo: " + id);
	}
}
