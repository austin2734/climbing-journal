package edu.ACC.climbingjournal.controller;

import edu.ACC.climbingjournal.config.JournalEntryProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private JournalEntryProperties properties;

    public HomeController(JournalEntryProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public JournalEntryProperties home() {
        return properties;
    }
}
