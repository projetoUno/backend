package br.com.lavaJato.repository;

import br.com.lavaJato.model.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
	@Query("select c from Cliente c where c.cpfCnpj = ?1")
	Cliente findPessoaByCpfCnpj(String cpfCnpj);
}
