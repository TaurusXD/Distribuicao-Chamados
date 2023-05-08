package br.com.hackaton.distribuicaochamados.tarefas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hackaton.distribuicaochamados.tarefas.dto.ChamadoDTO;
import br.com.hackaton.distribuicaochamados.tarefas.dto.NovoChamadoDTO;

@Service
public class ChamadosServiceImpl implements ChamadosService{

	@Override
	public List<ChamadoDTO> listarTickets() {
		
		return null;
	}

	@Override
	public List<ChamadoDTO> listarTicketsPorPrioridade(int prioridade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChamadoDTO buscarTicketPorId(long ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChamadoDTO distribuirTicket(NovoChamadoDTO novoChamadoDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChamadoDTO atualizarDistribuicao(long ID, NovoChamadoDTO novoChamadoDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removerTicket(long ID) {
		// TODO Auto-generated method stub
		
	}

}
