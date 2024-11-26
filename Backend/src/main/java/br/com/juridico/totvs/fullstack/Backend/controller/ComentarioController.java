package br.com.juridico.totvs.fullstack.Backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.juridico.totvs.fullstack.Backend.service.ComentarioService;
import br.com.juridico.totvs.fullstack.Backend.service.dto.ComentarioDTO;

@RestController
@RequestMapping("/comentarios")

public class ComentarioController {
    private final ComentarioService comentarioService;

    public ComentarioController(ComentarioService service) {
        this.comentarioService = service;
    }

    @GetMapping("/ponto-turistico/{pontoTuristicoId}")
    public List<ComentarioDTO> getByPontoTuristico(@PathVariable Long pontoTuristicoId) {
        return comentarioService.getAllByPontoTuristico(pontoTuristicoId);
    }
}
