package com.app.anota.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		UsuarioFactory obj = (UsuarioFactory) context.getBean("fabrica");
		obj.getInserta();
	}
}
