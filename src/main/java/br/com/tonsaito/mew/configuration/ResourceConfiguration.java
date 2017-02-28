package br.com.tonsaito.mew.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import br.com.tonsaito.mew.api.TestApi;

@Configuration
public class ResourceConfiguration extends ResourceConfig{
	
	
	public ResourceConfiguration(){
		register(TestApi.class);
		packages("br.com.tonsaito.mew.api");
	}
	
}
