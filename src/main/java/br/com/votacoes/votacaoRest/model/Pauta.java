package br.com.votacoes.votacaoRest.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.swing.text.StyleContext;
import java.util.List;

@Getter
@Setter
@Entity
public class Pauta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer qtdSim;
    private Integer qtdNao;
    @OneToMany
    private List<Associado>associados;
    private String resultado;

    public Pauta(){
    }

    public Pauta(String nome, Integer qtdSim, Integer qtdNao){
        this.nome = nome;
        this.qtdSim = qtdSim;
        this.qtdNao = qtdNao;
    }
}
