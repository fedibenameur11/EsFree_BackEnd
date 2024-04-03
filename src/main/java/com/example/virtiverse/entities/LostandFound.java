package com.example.virtiverse.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString



public class LostandFound {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long id_pub;
     String name;
     String location;
     String descripttion;
     String status;
     String image;
     LocalDate datePub;
     long num_tel;
     @ManyToOne(cascade = CascadeType.ALL)
     @JsonIgnore
     User iduser;
}
