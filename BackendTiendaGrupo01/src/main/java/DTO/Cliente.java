package DTO;

public class Cliente {
	private int idcli;
	private String dircli,mailcli,nomcli,telcli;
	
	public Cliente(int idcli, String dircli, String mailcli, String nomcli, String telcli) {
		super();
		this.idcli = idcli;
		this.dircli = dircli;
		this.mailcli = mailcli;
		this.nomcli = nomcli;
		this.telcli = telcli;
	}

	public int getIdcli() {
		return idcli;
	}

	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}

	public String getDircli() {
		return dircli;
	}

	public void setDircli(String dircli) {
		this.dircli = dircli;
	}

	public String getMailcli() {
		return mailcli;
	}

	public void setMailcli(String mailcli) {
		this.mailcli = mailcli;
	}

	public String getNomcli() {
		return nomcli;
	}

	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}

	public String getTelcli() {
		return telcli;
	}

	public void setTelcli(String telcli) {
		this.telcli = telcli;
	}
	
	
}
