package Controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import DAO.CliDAO;
import DAO.CliSer;
import DTO.Cliente;

//control cliente
@RestController
@RequestMapping(path = "/clientes")
public class Clitroll {
	private CliSer cliSer;

    @Autowired
    public Clitroll(CliSer cliSer) {
        this.cliSer = cliSer;
    }
	//consultar lista
	@RequestMapping("/tarcli")
	public ArrayList <Cliente> licli(){
		CliDAO objDAO=new CliDAO();
		return objDAO.licli();
	}
	 @GetMapping
    Collection<Cliente> getClientes() {
        return cliSer.ObtCli();
    }

    @GetMapping("/{idcli}")
    Cliente getCliente(@PathVariable Long idcli)  {
        return cliSer.ObtCli(idcli);
    }
	//registrar
	@PostMapping("regcli")
	public Cliente regcli(@RequestBody Cliente cli) {
		CliDAO dao=new CliDAO(); 
		return dao.regcli(cli);
	}
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void AgreCli(@RequestBody Cliente newcli) {
        cliSer.AgreCli(newcli);
    }        
	//buscar
	@PostMapping("buscli")
	public Cliente buscli(@RequestBody Cliente cli) {
		CliDAO dao=new CliDAO(); 
		return dao.buscli(cli);
	}
	//borrar
	@DeleteMapping("delcli")
	public Cliente delcli(@RequestBody Cliente cli) {
		CliDAO dao=new CliDAO(); 
		return dao.delcli(cli);
	}
	 @DeleteMapping("/{idcli}")
    public void borrarCliente(@PathVariable Long idcli) {
        cliSer.BorCli(idcli);
    }
	//actualizar
	@PutMapping("actcli")
	public Cliente actcli(@RequestBody Cliente cli) {
		CliDAO dao=new CliDAO(); 
		return dao.actcli(cli);
	}
	@PutMapping("/{idcli}")
    public void ActCli(@RequestBody Cliente cliente) {
        cliSer.ActCli(cliente);
    }
}
