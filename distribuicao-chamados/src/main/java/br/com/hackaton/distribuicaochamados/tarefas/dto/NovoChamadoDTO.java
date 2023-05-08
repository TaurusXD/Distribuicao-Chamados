package br.com.hackaton.distribuicaochamados.tarefas.dto;

public class NovoChamadoDTO {

	private long ID;
	private String assunto;
	private int prioridade;
	
	public NovoChamadoDTO () {
		
	}
	
	public NovoChamadoDTO (long ID, String assunto) {
		this.ID = ID;
		this.assunto = assunto;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	
	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int CalculaPrioridade (String assunto) {
		prioridade = 0;
		switch(assunto) {
		case "Pagamento":
			prioridade = 1;
		case "Envio-Entrega":
			prioridade = 2;
		case "Compra Protegida":
			prioridade = 3;
		case "Outros":
			prioridade = 4;
		}
		return prioridade;
	}
}
