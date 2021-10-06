package Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import DAO.UsuDAO;
import DAO.UsuSer;
import DTO.Usuario;

//control usuario
@RestController
@RequestMapping(path ="/usuarios")
public class Usutroll {
	//consultar lista
	private final UsuSer usuSer;

    @Autowired
    public Usutroll(UsuSer usuSer) {
        this.usuSer = usuSer;
    }
	@RequestMapping("/tarusu")
	public ArrayList <Usuario> liusu(){
		UsuDAO objDAO=new UsuDAO();
		return objDAO.liusu();
	}
	 @GetMapping
    Collection<Usuario> getUsuarios(@RequestParam Optional<String> filtroId) {        
        return usuSer.getUsuarios(filtroId.orElse(""));
    }

    @GetMapping("/{idusu}")
    Usuario getUsuario(@PathVariable Long idusu) {
        return usuSer.getUsuario(idusu);
    }
	//registrar
	@PostMapping("regusu")
	public Usuario regusu(@RequestBody Usuario usu) {
		UsuDAO dao=new UsuDAO(); 
		return dao.regusu(usu);
	}
	 @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void AgreUsu(@RequestBody Usuario newusu){
        usuSer.AgreUsu(newusu);
    }
	//buscar
	@PostMapping("bususu")
	public Usuario bususu(@RequestBody Usuario usu) {
		UsuDAO dao=new UsuDAO(); 
		return dao.bususu(usu);
	}
	//borrar
	@DeleteMapping("delusu")
	public Usuario delusu(@RequestBody Usuario usu) {
		UsuDAO dao=new UsuDAO(); 
		return dao.delusu(usu);
	}
	@DeleteMapping("/{idusu}")
    void borrarUsuario(@PathVariable Long idusu){
        usuSer.BorUsu(idusu);
    }
	//actualizar
	@PutMapping("actusu")
	public Usuario actusu(@RequestBody Usuario usu) {
		UsuDAO dao=new UsuDAO(); 
		return dao.actusu(usu);
	}
	@PutMapping("/{idusu}")
    void ActrUsu(@RequestBody Usuario datausu) {
        usuSer.ActUsu(datausu);
    }
}
