package ma.ws.javaxrs.config;

import ma.ws.javaxrs.controllers.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig config = new ResourceConfig();

        config.register(CompteRestJaxRSAPI.class);

        config.register(CorsFilter.class);

        return config;
    }
}
