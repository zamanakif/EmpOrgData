package edu.springboot.a2z;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "edu.springboot.a2z.emporg")
@EnableSwagger2
public class EmpOrgDataApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmpOrgDataApplication.class, args);
	}
}
