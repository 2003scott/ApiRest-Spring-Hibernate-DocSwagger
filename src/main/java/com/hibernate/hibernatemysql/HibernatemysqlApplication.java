package com.hibernate.hibernatemysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernatemysqlApplication {

	//ingreso al swagger

	/**
	 * http://localhost:8090/api/swagger-ui/index.html
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HibernatemysqlApplication.class, args);
	}

}
