package Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import DAO.ProDAO;
import DTO.Proveedor;

//control proveedor
public class Protroll {
	//consultar lista
		@RequestMapping("/tarpro")
		public ArrayList <Proveedor> lipro(){
			ProDAO objDAO=new ProDAO();
			return objDAO.lipro();
		}
		//registrar
		@PostMapping("regpro")
		public Proveedor regpro(@RequestBody Proveedor pro) {
			ProDAO dao=new ProDAO(); 
			return dao.regpro(pro);
		}
		//buscar
		@PostMapping("buspro")
		public Proveedor buspro(@RequestBody Proveedor pro) {
			ProDAO dao=new ProDAO(); 
			return dao.buspro(pro);
		}
		//borrar
		@PostMapping("delpro")
		public Proveedor delpro(@RequestBody Proveedor pro) {
			ProDAO dao=new ProDAO(); 
			return dao.delpro(pro);
		}
		//actualizar
		@PostMapping("actpro")
		public Proveedor actpro(@RequestBody Proveedor pro) {
			ProDAO dao=new ProDAO(); 
			return dao.actpro(pro);
		}
}
