package edu.ACC.climbingjournal.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ACC.climbingjournal.model.Entry;
import edu.ACC.climbingjournal.repository.EntryRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner{

    private final EntryRepository repository;
    private final ObjectMapper objectMapper;

    public DataLoader(EntryRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }
    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
                repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Entry>>() {}));
            }
        }
    }
}
