package edu.ACC.climbingjournal.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "cc")
public record JournalEntryProperties(String welcomeMessage, String about) {
}
