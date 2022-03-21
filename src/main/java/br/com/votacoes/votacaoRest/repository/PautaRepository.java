package br.com.votacoes.votacaoRest.repository;

import br.com.votacoes.votacaoRest.model.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PautaRepository extends JpaRepository<Pauta, Long> {

}
