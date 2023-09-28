package edu.ACC.climbingjournal.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;


import java.time.LocalDateTime;


public record Entry(
        @Id
        Integer id,
        @NotBlank
        String routeName,
        String routeGrade,
        Integer pitches,
        Integer attempts,
        Status status,
        String notes,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated
) {


}
