package io.github.leosantiago13.clientes.model.repository;

import io.github.leosantiago13.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
