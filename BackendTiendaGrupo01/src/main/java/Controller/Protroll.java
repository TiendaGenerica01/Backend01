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

import DAO.ProDAO;
import DAO.ProSer;
import DTO.Proveedor;

//control proveedor
@RestController
@RequestMapping(path ="/proveedores")
public class Protroll {
	@Autowired
    private ProSer proSer;

    public Protroll(ProSer proSer) {
        this.proSer = proSer;
    }
	//consultar lista
	@RequestMapping("/tarpro")
	public ArrayList <Proveedor> lipro(){
		ProDAO objDAO=new ProDAO();
		return objDAO.lipro();
	}
	@GetMapping
    public Collection<Proveedor> getProveedores() {
        return proSer.ObtPro();
    }
    
    @GetMapping("/{idpro}")
    public Proveedor getProveedor(@PathVariable Long idpro) {
        return proSer.ObtPro(idpro);
    }
	//registrar
	@PostMapping("regpro")
	public Proveedor regpro(@RequestBody Proveedor pro) {
		ProDAO dao=new ProDAO(); 
		return dao.regpro(pro);
	}
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void AgrePro(@RequestBody Proveedor newpro) {
        proSer.AgrePro(newpro);
    }
	//buscar
	@PostMapping("buspro")
	public Proveedor buspro(@RequestBody Proveedor pro) {
		ProDAO dao=new ProDAO(); 
		return dao.buspro(pro);
	}
	//borrar
	@DeleteMapping("delpro")
	public Proveedor delpro(@RequestBody Proveedor pro) {
		ProDAO dao=new ProDAO(); 
		return dao.delpro(pro);
	}
	@DeleteMapping("/{nit}")
    public void BorPro(@PathVariable Long idpro){
        proSer.BorPro(idpro);
    }
	//actualizar
	@PutMapping("actpro")
	public Proveedor actpro(@RequestBody Proveedor pro) {
		ProDAO dao=new ProDAO(); 
		return dao.actpro(pro);
	}
	@PutMapping("/{idpro}")
    public void ActPro(@PathVariable Long idpro, @RequestBody Proveedor proveedor) {
        proSer.ActPro(proveedor);
    }
}
