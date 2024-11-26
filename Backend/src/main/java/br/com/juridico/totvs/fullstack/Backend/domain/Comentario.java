package br.com.juridico.totvs.fullstack.Backend.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String autor;
    private String texto;
    private LocalDate dataCriacao;

    @ManyToOne
    @JoinColumn(name = "ponto_turistico_id")
    private PontoTuristico pontoTuristico;

    // Getters e Setters
}
