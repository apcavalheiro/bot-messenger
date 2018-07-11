package xyz.cavalheiro.bot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BotApplication {
	private static Logger logger = LogManager.getLogger(BotApplication.class);
	public static void main(String[] args) {
		logger.info("Starting Spring Boot application..");
		SpringApplication app = new SpringApplication(BotApplication.class);
		app.run(args);
	}
}
