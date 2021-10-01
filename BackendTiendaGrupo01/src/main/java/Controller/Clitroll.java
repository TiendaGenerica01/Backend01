package Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import DAO.CliDAO;
import DTO.Cliente;

//control cliente
public class Clitroll {
	//consultar lista
	@RequestMapping("/tarcli")
	public ArrayList <Cliente> licli(){
		CliDAO objDAO=new CliDAO();
		return objDAO.licli();
	}
	//registrar
	@PostMapping("regcli")
	public Cliente regcli(@RequestBody Cliente cli) {
		CliDAO dao=new CliDAO(); 
		return dao.regcli(cli);
	}
	//buscar
	@PostMapping("buscli")
	public Cliente buscli(@RequestBody Cliente cli) {
		CliDAO dao=new CliDAO(); 
		return dao.buscli(cli);
	}
	//borrar
	@PostMapping("delcli")
	public Cliente delcli(@RequestBody Cliente cli) {
		CliDAO dao=new CliDAO(); 
		return dao.delcli(cli);
	}
	//actualizar
	@PostMapping("actcli")
	public Cliente actcli(@RequestBody Cliente cli) {
		CliDAO dao=new CliDAO(); 
		return dao.actcli(cli);
	}
}
