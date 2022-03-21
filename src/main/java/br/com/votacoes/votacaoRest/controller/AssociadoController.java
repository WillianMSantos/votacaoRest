package br.com.votacoes.votacaoRest.controller;

import br.com.votacoes.votacaoRest.model.Associado;
import br.com.votacoes.votacaoRest.repository.AssociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/associados")
public class AssociadoController {

    @Autowired
    private AssociadoRepository associadoRepository;

    @GetMapping
    public List<Associado> listarAssociados(){

        return associadoRepository.findAll();
    }

    @PostMapping
    public Associado cadastrarAssociado(@RequestBody Associado associado) {

        return associadoRepository.save(associado);
    }
}