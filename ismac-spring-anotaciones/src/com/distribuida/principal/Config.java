package com.distribuida.principal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.distribuida.entities.Cliente;

@Configuration
@ComponentScan("com.distribuida")
@PropertySource("classpath:datosEmpresa.properties")
public class Config {

	@Bean
	public Cliente cliente() {
		return new Cliente();
		
	}
	
}
