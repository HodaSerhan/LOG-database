package com.example.LOGdatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogDatabaseApplication {

  private static final Logger logger = LoggerFactory.getLogger(LogDatabaseApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(LogDatabaseApplication.class, args);

    logger.info("Hello Spring Boot");
  }
}
