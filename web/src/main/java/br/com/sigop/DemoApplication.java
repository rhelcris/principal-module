package br.com.sigop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.sigop")
//@EnableJpaRepositories(basePackages = {"br.com.sigop"} )
//@EntityScan(basePackages = {"br.com.sigop"})
//@ComponentScan(basePackages = {"br.com.sigop.controllers"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

}
