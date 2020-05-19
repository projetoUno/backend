package br.com.lavaJato.rest;

import br.com.lavaJato.model.Cliente;
import br.com.lavaJato.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public Cliente detalharCliente(@Valid @PathVariable("idCliente")Long idCliente){
        return clienteService.findById(idCliente);
    }

    @PostMapping
    @ApiOperation(value = "salva um cliente")
    public void incluirClientes(@Valid @RequestBody Cliente cliente){
         clienteService.save(cliente);
    }

    @DeleteMapping(value = "/{idCliente}")
    @ApiOperation(value = "Exclui um cliente especifico pelo ID")
    public void excluirCliente(@Valid @PathVariable Long idCliente){
        clienteService.delete(idCliente);
    }
    
    @GetMapping(value = "/cpf/{cpfCnpj}")
    public boolean buscarcpf(@PathVariable String cpfCnpj ) {
    	//cpfCnpj = 765659452L;
    	Cliente cliente = clienteService.findByCpfCnpj(cpfCnpj);
    	if(cliente != null) {
    		return true;
    	}else {
    		return false;
    	}
    	
    }
    

  /*  @PutMapping("/{id}")
    @ApiOperation(value="Altera os dados de um cliente especifico")
    public Cliente alterarCliente(@Valid @PathVariable(value = "id") Long id, @RequestBody Cliente cliente){
    	Cliente cli = this.detalharCliente(id);
        return clienteService.save(cliente);
    }
*/

}
