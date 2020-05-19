package br.com.lavaJato.service;

import br.com.lavaJato.model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();
    Cliente findById(Long idCliente);
    Cliente save(Cliente cliente);
    void delete(Long idCliente);
    void update(Cliente cliente);
    Cliente findByCpfCnpj(String cpfCnpj);

}
