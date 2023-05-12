package br.com.hackaton.distribuicaochamados.tarefas.entity;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "TB_Chamados")
@EntityListeners(AuditingEntityListener.class)
public class ChamadoEntity {
	
	@Id
	private long ID;
	@Column
	private String assunto;
	@Column
	private int prioridade;
	
	public ChamadoEntity() {
		
	}
	/**
	 * @return the iD
	 */
	public long getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(long iD) {
		ID = iD;
	}
	/**
	 * @return the assunto
	 */
	public String getAssunto() {
		return assunto;
	}
	/**
	 * @param assunto the assunto to set
	 */
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	/**
	 * @return the prioridade
	 */
	public int getPrioridade() {
		return prioridade;
	}
	/**
	 * @param prioridade the prioridade to set
	 */
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	
}
