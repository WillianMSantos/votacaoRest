package br.com.votacoes.votacaoRest.repository;

import br.com.votacoes.votacaoRest.model.Associado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociadoRepository extends JpaRepository<Associado, Long> {
}
