package net.zt.funcode.components;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class GoofClient {
	public static void main(String[] args) {
    	final   ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		final   Camera camera = context.getBean("cheapCamera",Camera.class);
          camera.doPhotograph();

	}
}
