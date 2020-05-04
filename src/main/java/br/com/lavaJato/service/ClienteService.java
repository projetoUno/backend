package br.com.lavaJato.service;

import br.com.lavaJato.model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();
    Cliente findById(long idCliente);
    Cliente save(Cliente cliente);
    void delete(long idCliente);
    void update(Cliente cliente);

}
