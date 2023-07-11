package com.app.ioc.dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		BeanFactory fabrica = context;
		UsuarioFactory obj = (UsuarioFactory) fabrica.getBean("ejecutaUsr");
		obj.insertaUsuario();
		obj.eliminaUsuario(12);
	}

}
