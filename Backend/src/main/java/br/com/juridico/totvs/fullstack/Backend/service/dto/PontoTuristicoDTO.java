package br.com.juridico.totvs.fullstack.Backend.service.dto;

import java.util.List;

public class PontoTuristicoDTO {
    private Long id;
    private String nome;
    private String cidade;
    private String melhorEstacao;
    private String resumo;
    private Long paisId;
    private List<ComentarioDTO> comentarios;

    // Getters e Setters
}
