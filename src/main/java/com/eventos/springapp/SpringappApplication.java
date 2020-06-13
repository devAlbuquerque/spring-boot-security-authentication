package com.eventos.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
		// Encriptação
		System.out.println(new BCryptPasswordEncoder().encode("admin"));
		System.out.println("SQL'S INICIAIS "
				+ "\n insert into usuario values('admin', 'Antonio', '$2a$10$L6ybvkOp4Li6IKGdekWt6Obx5VPzoyWYNoliYD80L.ANM4Ya7fqom');\n" + 
				" insert into role values('ROLE_ADMIN');\n" + 
				" insert into role values('ROLE_USER');\n" + 
				" insert into usuarios_roles values('admin', 'ROLE_ADMIN');");
		
	}

}
