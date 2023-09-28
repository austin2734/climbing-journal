package edu.ACC.climbingjournal.repository;

import edu.ACC.climbingjournal.model.Entry;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface EntryRepository extends ListCrudRepository<Entry, Integer> {

}
