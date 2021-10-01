package Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DAO.UsuDAO;
import DTO.Usuario;

//control usuario
@RestController
public class Usutroll {
	//consultar lista
	@RequestMapping("/tarusu")
	public ArrayList <Usuario> liusu(){
		UsuDAO objDAO=new UsuDAO();
		return objDAO.liusu();
	}
	//registrar
	@PostMapping("regusu")
	public Usuario regusu(@RequestBody Usuario usu) {
		UsuDAO dao=new UsuDAO(); 
		return dao.regusu(usu);
	}
	//buscar
	@PostMapping("bususu")
	public Usuario bususu(@RequestBody Usuario usu) {
		UsuDAO dao=new UsuDAO(); 
		return dao.bususu(usu);
	}
	//borrar
	@PostMapping("delusu")
	public Usuario delusu(@RequestBody Usuario usu) {
		UsuDAO dao=new UsuDAO(); 
		return dao.delusu(usu);
	}
	//actualizar
	@PostMapping("actusu")
	public Usuario actusu(@RequestBody Usuario usu) {
		UsuDAO dao=new UsuDAO(); 
		return dao.actusu(usu);
	}
}
