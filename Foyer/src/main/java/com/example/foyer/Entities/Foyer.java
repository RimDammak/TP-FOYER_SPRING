package com.example.foyer.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idFoyer;

    private String nomFoyer;

    private Long capaciteFoyer;

    @OneToOne
    private Universite universite;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "foyer")
    private Set<Bloc> Blocs;
}