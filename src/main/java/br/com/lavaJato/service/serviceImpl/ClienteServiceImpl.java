package br.com.lavaJato.service.serviceImpl;

import br.com.lavaJato.model.Cliente;
import br.com.lavaJato.repository.ClienteRepository;
import br.com.lavaJato.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long idCliente) {
        return clienteRepository.findById(idCliente).get();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void delete(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }

    @Override
    public void update(Cliente cliente) {
        clienteRepository.save(cliente);
    }

	@Override
	public Cliente findByCpfCnpj(Long cpfCnpj) {
		Cliente cliente =  clienteRepository.findPessoaByCpfCnpj(cpfCnpj);
		return cliente;
	}
}
