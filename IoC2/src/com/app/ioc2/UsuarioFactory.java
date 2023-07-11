package com.app.ioc2;

public class UsuarioFactory {
	
	// Atributo apuntando directamente a la interface IUsuario
	IUsuario usr;
	
	// Método constructor con parámetro usuario
	public UsuarioFactory(IUsuario usr) {
		this.usr = usr ;
	}
	
	public void getInsertaUsuario() {
		usr.insertaUsuario();
	}
	
	public void getEliminaUsuarioByID(int id) {
		usr.eliminaUsuarioByID(id);
	}
	
}
