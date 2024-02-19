package com.example.foyer.Entities;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idUniversite;

    private String nomUniversite;

    private String adresse;

 @OneToOne (mappedBy ="universite")
  private Foyer foyer;
}