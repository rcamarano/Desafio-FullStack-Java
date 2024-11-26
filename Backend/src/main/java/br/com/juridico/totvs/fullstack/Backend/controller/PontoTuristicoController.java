package br.com.juridico.totvs.fullstack.Backend.controller;

@RestController
@RequestMapping("/ponto-turistico")

public class PontoTuristicoController {

    private final PontoTuristicoService pontoTuristicoService;

    public PontoTuristicoController(PontoTuristicoService service) {
        this.pontoTuristicoService = service;
    }

    @PostMapping
    public PontoTuristicoDTO create(@Valid @RequestBody PontoTuristicoDTO dto) {
        return pontoTuristicoService.create(dto);
    }

    @GetMapping
    public List<PontoTuristicoDTO> getAll() {
        return pontoTuristicoService.getAll();
    }

    // Outros métodos de GET, PUT e DELETE
}