package DAO;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DTO.CliTory;
import DTO.Cliente;
import Exception.CliEx;

@Service
public class CliSer {
	private CliTory repository;

    @Autowired
    public CliSer(CliTory repository) {
        this.repository = repository;
    }
    
    public Collection<Cliente> ObtCli() {
        return repository.findAll();
    }  

    public Cliente ObtCli(Long idcli) {
        return repository.findById(idcli)
            .orElseThrow(() -> new CliEx(idcli));
    }
    
    public void AgreCli(Cliente newcli){
        repository.save(newcli);
    }

    public void ActCli(Cliente cliente) {
        repository.findById(cliente.getIdcli())
            .ifPresent(client -> {
                repository.save(cliente);
            });        
    }

    public void BorCli(Long idcli) {
        Cliente cliente = ObtCli(idcli);
        repository.delete(cliente);
    }
}
