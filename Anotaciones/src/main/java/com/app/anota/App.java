package com.app.anota;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		ServicioA obj = (ServicioA) context.getBean("servicioA");
		System.out.println(obj.getMensaje());
	}
}
