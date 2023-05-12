package br.com.hackaton.distribuicaochamados.tarefas.services;

import java.util.List;

import br.com.hackaton.distribuicaochamados.tarefas.dto.ChamadoDTO;
import br.com.hackaton.distribuicaochamados.tarefas.dto.NovoChamadoDTO;

public interface ChamadosService {
	
	List<ChamadoDTO> listarTickets ();
	List<ChamadoDTO> listarTicketsPorPrioridade (int prioridade);
	ChamadoDTO buscarTicketPorId (long ID);
	ChamadoDTO distribuirTicket (NovoChamadoDTO novoChamadoDTO);
	ChamadoDTO atualizarDistribuicao (long ID, NovoChamadoDTO novoChamadoDTO);
	void removerTicket (Integer ID);
	
}
