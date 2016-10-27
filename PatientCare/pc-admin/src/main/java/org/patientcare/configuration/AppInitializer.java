package org.patientcare.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;//we need servlet-api above 2.5
//all org.springframework.web is available in spring-web maven dependancy except those which is highlighted
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;//this is in spring-webmvc package

import org.patientcare.configuration.AppConfig;

public class AppInitializer implements WebApplicationInitializer
{
	private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
							
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		//spring-web
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfig.class);
		servletContext.addListener(new ContextLoaderListener(ctx));

		ctx.setServletContext(servletContext);

		Dynamic servlet = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
