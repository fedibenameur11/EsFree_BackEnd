package com.example.virtiverse.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Covoiturage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id_cov;
     int nombre_placecov;
     LocalDate date_depart;
     String lieu_depart;
     String destination;
     String description;
     @JsonIgnore
    @ManyToOne (cascade = CascadeType.ALL)
        User iduser;

}
