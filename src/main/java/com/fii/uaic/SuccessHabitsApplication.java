package com.fii.uaic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@SpringBootApplication(scanBasePackages="com.fii.uaic")
@EnableAutoConfiguration
@EnableWebMvc
//@ComponentScan(basePackages = {"com.fii.uaic.controller", "com.fii.uaic.service"})
//@EntityScan("com.fii.uaic.entities")
//@EnableJpaRepositories("com.fii.uaic.repositories")
public class SuccessHabitsApplication extends SpringBootServletInitializer {

	private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
	private static final String DISPATCHER_SERVLET_MAPPING = "/";

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SuccessHabitsApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(SuccessHabitsApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//Loading application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SuccessHabitsApplication.class);

		//Dispatcher servlet
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(rootContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping(DISPATCHER_SERVLET_MAPPING);

		//Context loader listener
		servletContext.addListener(new ContextLoaderListener(rootContext));
	}




}
