package br.com.hackaton.distribuicaochamados.tarefas.dto;

public class AnalistaDTO {
	private long ID;
	private String nome;
	private String email;
	private boolean dispoinibilidade;
	private boolean ativo;
	
	public AnalistaDTO() {
	}
	
	public AnalistaDTO (long ID, String nome, String email) {
		this.ID = ID;
		this.nome = nome;
		this.email = email;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isDispoinibilidade() {
		return dispoinibilidade;
	}

	public void setDispoinibilidade(boolean dispoinibilidade) {
		this.dispoinibilidade = dispoinibilidade;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	

}
