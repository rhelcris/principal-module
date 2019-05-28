package br.com.sigop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.sigop.config.property.SigopApiProperties;

@SpringBootApplication(scanBasePackages = "br.com.sigop")
@EnableConfigurationProperties(SigopApiProperties.class)
//@EnableJpaRepositories(basePackages = {"br.com.sigop"} )
//@EntityScan(basePackages = {"br.com.sigop"})
//@ComponentScan(basePackages = {"br.com.sigop.controllers"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

}
