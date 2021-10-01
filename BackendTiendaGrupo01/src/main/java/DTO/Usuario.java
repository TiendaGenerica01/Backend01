package DTO;

//origen datos proyecto
public class Usuario {
	private int idusu;
	private String mailusu,nomusu,pass,ario;
	
	public Usuario(int idusu, String mailusu, String nomusu, String pass, String ario) {
		super();
		this.idusu = idusu;
		this.mailusu = mailusu;
		this.nomusu = nomusu;
		this.pass = pass;
		this.ario = ario;
		
	}
	public int getIdusu() {
		return idusu;
	}
	public void setIdusu(int idusu) {
		this.idusu = idusu;
	}
	public String getMailusu() {
		return mailusu;
	}
	public void setMailusu(String mailusu) {
		this.mailusu = mailusu;
	}
	public String getNomusu() {
		return nomusu;
	}
	public void setNomusu(String nomusu) {
		this.nomusu = nomusu;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getArio() {
		return ario;
	}
	public void setArio(String ario) {
		this.ario = ario;
	}
	
	
}
