package org.patientcare.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "org.patientcare.*")
public class AppConfig extends WebMvcConfigurerAdapter {

 @Override
 public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
  configurer.enable();
 }

 @Bean
 public InternalResourceViewResolver viewResolver() {
	 System.out.println("yaha aaya resolve");
  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
  resolver.setViewClass(JstlView.class);
  resolver.setPrefix("WEB-INF/jsp/");
  resolver.setSuffix(".jsp");
  return resolver;
 }

}
