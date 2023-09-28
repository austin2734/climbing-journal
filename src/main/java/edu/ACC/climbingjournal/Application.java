package edu.ACC.climbingjournal;

import edu.ACC.climbingjournal.config.JournalEntryProperties;
import edu.ACC.climbingjournal.model.Entry;
import edu.ACC.climbingjournal.model.Status;
import edu.ACC.climbingjournal.repository.EntryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
@EnableConfigurationProperties(JournalEntryProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
