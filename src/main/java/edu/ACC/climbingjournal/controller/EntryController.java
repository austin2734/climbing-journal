package edu.ACC.climbingjournal.controller;

import edu.ACC.climbingjournal.model.Entry;
import edu.ACC.climbingjournal.repository.EntryCollectionRepository;
import edu.ACC.climbingjournal.repository.EntryRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/journal")
public class EntryController {

    private final EntryRepository repository;

    public EntryController(EntryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Entry> findAll() {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Entry> findById(@PathVariable Integer id) {
        return Optional.ofNullable(repository.findById(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found."));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody Entry entry) {
        repository.save(entry);
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@Valid @RequestBody Entry entry, @PathVariable Integer id) {

        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entry not found!");
        }

        repository.save(entry);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }


}
