package io.github.leosantiago13.clientes.model.repository;

import io.github.leosantiago13.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
