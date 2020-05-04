package br.com.lavaJato.rest;

import br.com.lavaJato.model.Cliente;
import br.com.lavaJato.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@Api(value = "API REST LAVA JATO")
@CrossOrigin(origins = "*")
public class ClienteRest{

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de clientes")
    public List<Cliente> listarClientes(){
        return clienteService.findAll();
    }

    @GetMapping("/{idCliente}")
    @ApiOperation(value = "Retorna um cliente especifico pelo ID")
    public Cliente detalharCliente(@RequestParam long idCliente){
        return clienteService.findById(idCliente);
    }

    @PostMapping
    @ApiOperation(value = "salva um cliente")
    public void incluirClientes(@RequestBody Cliente cliente){
         clienteService.save(cliente);
    }

    @DeleteMapping
    @ApiOperation(value = "Exclui um cliente especifico pelo ID")
    public void excluirCliente(@RequestParam long idCLiente){
        clienteService.delete(idCLiente);
    }

    @PatchMapping
    @ApiOperation(value="Altera os dados de um cliente especifico")
    public void alterarCliente(@RequestBody Cliente cliente){
        clienteService.save(cliente);
    }


}
