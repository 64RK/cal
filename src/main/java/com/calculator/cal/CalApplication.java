package com.calculator.cal;

import com.calculator.cal.calculator.CalRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.server", "com.server.config"})
//@EnableMongoRepositories ("com.server.repository") // this fix the problem
public class CalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(CalApplication.class, args);

		CalRunner runner = context.getBean(CalRunner.class);

		runner.dataEntry();
		runner.decision();


	}

}

