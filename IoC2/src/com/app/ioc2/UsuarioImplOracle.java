package com.app.ioc2;

//Se implementa la interface IUsuario con sus métodos abstractos
public class UsuarioImplOracle  implements IUsuario {

	public void insertaUsuario() {
		System.out.println("Insertando Usando en Oracle");
	}

	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando Usando en Oracle: " + id);
	}

}
