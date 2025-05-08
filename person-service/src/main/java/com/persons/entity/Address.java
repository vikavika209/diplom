package com.persons.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Необходимо указать полный адрес.")
    private String fullAddress;
    @NotBlank(message = "Необходимо указать регион.")
    private String region;
    @ManyToMany(mappedBy = "addresses", fetch = FetchType.LAZY)
    private List<Person> persons = new ArrayList<>();
}
