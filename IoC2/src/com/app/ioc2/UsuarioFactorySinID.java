package com.app.ioc2;

public class UsuarioFactorySinID {
	
	public void getInsertaUsuario() {
		System.out.println("Insertando usuario con Oracle");
	}
	
	public void getEliminaUsuarioByID(int id) {
		System.out.println("Eliminando usuario con Oracle: " + id);
	}
	
}
