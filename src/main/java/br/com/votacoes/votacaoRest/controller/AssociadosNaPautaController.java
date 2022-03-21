package br.com.votacoes.votacaoRest.controller;

import br.com.votacoes.votacaoRest.model.Pauta;
import br.com.votacoes.votacaoRest.repository.AssociadoRepository;
import br.com.votacoes.votacaoRest.repository.PautaRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/associadosPauta")
public class AssociadosNaPautaController {

    @Autowired
    private AssociadoRepository associadoRepository;

    @Autowired
    private PautaRepository pautaRepository;

    @PostMapping(params = {"id", "cpf"})
    public Pauta incluirAssociadoNaPauta(@RequestParam Long id, @RequestParam Long cpf){
        Integer qtdSim = 0;
        Integer qtdNao = 0;

        val associado = associadoRepository.findById(cpf).orElseThrow();
        val pauta = pautaRepository.findById(id).orElseThrow();

        if(associado.getVoto().equals("sim")){

            qtdSim++;
            pauta.setQtdSim(qtdSim);
        }else if(associado.getVoto().equals("nao")){

            qtdNao++;
            pauta.setQtdNao(qtdNao);
        }else{
            System.out.println("comando inválido");
        }

        pauta.getAssociados().add(associado);
        return pautaRepository.save(pauta);
    }
}