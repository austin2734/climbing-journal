package edu.ACC.climbingjournal.repository;


import edu.ACC.climbingjournal.model.Entry;
import edu.ACC.climbingjournal.model.Status;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EntryCollectionRepository {

    private final List<Entry> entryList = new ArrayList<>();

    public List<Entry> findAll(){
        return entryList;
    }

    public Optional<Entry> findById(Integer id){
        return entryList.stream().filter(e -> e.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init(){
        Entry entry = new Entry(2,
                "Rock Solid",
                "5.15b",
                1,
                1,
                Status.WORKING,
                "This route is really hard.",
                LocalDateTime.now(),
                null);

        entryList.add(entry);
    }

    public void save(Entry entry) {

        entryList.removeIf(c -> c.id().equals(entry.id()));
        entryList.add(entry);
    }

    public boolean exitsById(Integer id) {
        return entryList.stream().filter(e -> e.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        entryList.removeIf(e -> e.id().equals(id));
    }

}
