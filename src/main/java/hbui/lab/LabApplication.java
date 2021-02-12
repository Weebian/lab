package hbui.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabApplication {

	private static final Logger log = LoggerFactory.getLogger(LabApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LabApplication.class, args);
	}
}