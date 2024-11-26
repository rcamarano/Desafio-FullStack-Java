package br.com.juridico.totvs.fullstack.Backend.service;

import java.util.List;

import br.com.juridico.totvs.fullstack.Backend.service.dto.ComentarioDTO;

public class ComentarioService {
    ComentarioDTO create(ComentarioDTO dto);
    List<ComentarioDTO> getAllByPontoTuristico(Long pontoTuristicoId);
    void delete(Long id);
}
