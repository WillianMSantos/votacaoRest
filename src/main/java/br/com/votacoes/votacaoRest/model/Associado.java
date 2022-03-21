package br.com.votacoes.votacaoRest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Associado {

    @Id
    private Long cpf;
    private String voto;
}
