package com.app.ioc.dao;

public class UsuarioFactory {
	
	// Atributo apuntando directamente a la interface UsuarioService
	UsuarioService usr;
	
	// Método Setter
	public void setUsr(UsuarioService usr) {
		this.usr = usr;
	}

	public void insertaUsuario() {
		usr.insert();
	}
	
	public void eliminaUsuario(int id) {
		usr.elimina(id);
	}
}
