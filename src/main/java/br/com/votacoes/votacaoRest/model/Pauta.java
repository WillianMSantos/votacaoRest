package br.com.votacoes.votacaoRest.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Pauta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer qtdSim;
    private Integer qtdNao;
    private String resultado;

    public Pauta(){
    }

    public Pauta(String nome, Integer qtdSim, Integer qtdNao){
        this.nome = nome;
        this.qtdSim = qtdSim;
        this.qtdNao = qtdNao;
    }
}
