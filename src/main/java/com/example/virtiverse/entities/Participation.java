package com.example.virtiverse.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Participation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id_participation;
      long numtel;
      String email;
      int nb_place;

    @JsonIgnore
    @ManyToOne
    Event event;

    @JsonIgnore
    @ManyToOne
    User user;
}
