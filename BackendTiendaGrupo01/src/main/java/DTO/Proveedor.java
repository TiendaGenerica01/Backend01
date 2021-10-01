package DTO;

public class Proveedor {
	private int idpro;
	private String ciupro,dirpro,nompro,telpro;
	
	public Proveedor(int idpro, String ciupro, String dirpro, String nompro, String telpro) {
		super();
		this.idpro = idpro;
		this.ciupro = ciupro;
		this.dirpro = dirpro;
		this.nompro = nompro;
		this.telpro = telpro;
	}
	public int getIdpro() {
		return idpro;
	}
	public void setIdpro(int idpro) {
		this.idpro = idpro;
	}
	public String getCiupro() {
		return ciupro;
	}
	public void setCiupro(String ciupro) {
		this.ciupro = ciupro;
	}
	public String getDirpro() {
		return dirpro;
	}
	public void setDirpro(String dirpro) {
		this.dirpro = dirpro;
	}
	public String getNompro() {
		return nompro;
	}
	public void setNompro(String nompro) {
		this.nompro = nompro;
	}
	public String getTelpro() {
		return telpro;
	}
	public void setTelpro(String telpro) {
		this.telpro = telpro;
	}
	
	
}
