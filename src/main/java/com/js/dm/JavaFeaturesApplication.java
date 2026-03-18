package com.js.dm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JavaFeaturesApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(JavaFeaturesApplication.class);

	public static void main(String[] args) {
        logger.info("Starting JavaFeaturesApplication...");

        SpringApplication.run(JavaFeaturesApplication.class, args);
	}

    @Bean
    public ServletContextInitializer initializer() {
        return servletContext -> {
            logger.info("JavaFeaturesApplication started in WAR mode!");
        };
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JavaFeaturesApplication.class);
    }
}
