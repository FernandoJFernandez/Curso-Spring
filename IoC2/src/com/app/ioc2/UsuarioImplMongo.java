package com.app.ioc2;

public class UsuarioImplMongo implements IUsuario {

	public void insertaUsuario() {
		System.out.println("Insertando Usando en Mongo");
	}

	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando Usando en Mongo: " + id);
	}

}