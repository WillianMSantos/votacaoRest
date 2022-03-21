package br.com.votacoes.votacaoRest.controller;

import br.com.votacoes.votacaoRest.model.Pauta;
import br.com.votacoes.votacaoRest.repository.AssociadoRepository;
import br.com.votacoes.votacaoRest.repository.PautaRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pautas")
public class PautaController {

    @Autowired
    private PautaRepository pautaRepository;

    @Autowired
    private AssociadoRepository associadoRepository;

    @GetMapping
    public List<Pauta> carregarPautas(){

        return pautaRepository.findAll();
    }

    @PostMapping
    public Pauta cadastrarPauta(@RequestBody Pauta pauta) {

        return pautaRepository.save(pauta);
    }
}
