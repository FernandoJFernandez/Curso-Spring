package com.app.ioc2;

public class App {
	public static void main(String[] args) {
		
// Sin Inyección de Dependencia
		System.out.println("\nEjemplo sin Inyección de Dependencia");
		UsuarioFactorySinID obj = new UsuarioFactorySinID();
		obj.getInsertaUsuario();
		obj.getEliminaUsuarioByID(1);
		
// Con Inyección de Dependencia
// Se necesita crear una Interface donde crearemos todos los métodos abstractos
// Crear clases para los diferentes objetos
// Se instancia la clase pasándole el objeto a inyectar por parámetro
		
		System.out.println("\nEjemplo con Inyección de Dependencia");
		UsuarioFactory obj1 = new UsuarioFactory(new UsuarioImplOracle()); // <-- Aquí se inyecta la dependencia...
		// ... y se produce la Inversión de Control
		obj1.getInsertaUsuario();
		obj1.getEliminaUsuarioByID(1);
		
		UsuarioFactory obj2 = new UsuarioFactory(new UsuarioImplMongo()); // <-- Aquí se inyecta la dependencia...
		// ... y se produce la Inversión de Control
		obj2.getInsertaUsuario();
		obj2.getEliminaUsuarioByID(1);
		
	}
}
