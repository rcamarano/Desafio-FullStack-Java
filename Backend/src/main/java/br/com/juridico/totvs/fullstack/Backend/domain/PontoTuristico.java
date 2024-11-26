package br.com.juridico.totvs.fullstack.Backend.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class PontoTuristico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cidade;
    private String melhorEstacao;
    private String resumo;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

    @OneToMany(mappedBy = "pontoTuristico", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    // Getters e Setters
}
