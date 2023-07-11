package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creación de objetos de tipo Empleado
		// Cargando el objeto
		// JefeEmpleado Empleado1 = new JefeEmpleado();
		
		// Cargando la interface
		// Empleados Empleado1 = new JefeEmpleado();
		
		// Crear la clase SecretarioEmpleado, DirectorEmpleado
		//   Empleados Empleado1 = new SecretarioEmpleado();
		//Empleados Empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		//   System.out.println(Empleado1.getTareas());

		// Inversion of Control - Bean por xml (video 8)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
/*
		Empleados Fernando = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Fernando.getTareas());
		contexto.close();
		
		// Inyección de dependencias (video 9 y 10)
		// Mediante constructor
		System.out.println(Fernando.getInforme());
*/
		// Mediante un setter
/*		Empleados Fernando = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		System.out.println(Fernando.getTareas());
		System.out.println(Fernando.getInforme());
		contexto.close();
*/	
/*
		// Inyección de campos desde archivo xml
		SecretarioEmpleado Fernando = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println("\n"+Fernando.getTareas());
		System.out.println(Fernando.getInforme());
		System.out.println("Email: " + Fernando.getEmail());
		System.out.println(Fernando.getNombreEmpresa());
		
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println("\n"+"Email Pablo: " + Pablo.getEmail());
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println("\n"+Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println("Email Juan: " + Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		contexto.close();
*/
		// Inyección de campos desde archivo externo
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println("Email Juan: " + Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		contexto.close();
	}

}
