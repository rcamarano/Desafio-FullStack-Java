package br.com.juridico.totvs.fullstack.Backend.service;

import java.util.List;

import br.com.juridico.totvs.fullstack.Backend.service.dto.PontoTuristicoDTO;

public class PontoTuristicoService {
    PontoTuristicoDTO create(PontoTuristicoDTO dto);
    List<PontoTuristicoDTO> getAll();
    PontoTuristicoDTO getById(Long id);
    PontoTuristicoDTO update(Long id, PontoTuristicoDTO dto);
    void delete(Long id);

}
