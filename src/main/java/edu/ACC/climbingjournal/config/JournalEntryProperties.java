package edu.ACC.climbingjournal.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(value = "cc")
public record JournalEntryProperties(String welcomeMessage, String about) {
}
