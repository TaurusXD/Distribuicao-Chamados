package br.com.hackaton.distribuicaochamados.tarefas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.hackaton.distribuicaochamados.tarefas.dto.ChamadoDTO;
import br.com.hackaton.distribuicaochamados.tarefas.dto.NovoChamadoDTO;
import br.com.hackaton.distribuicaochamados.tarefas.entity.ChamadoEntity;
import br.com.hackaton.distribuicaochamados.tarefas.repository.ChamadosRepository;

@Service
public class ChamadosServiceImpl implements ChamadosService{
	private ChamadosRepository chamadosRepository;
	public ChamadosServiceImpl(ChamadosRepository chamadosRepository) {
		this.chamadosRepository = chamadosRepository;
	}
	@Override
	public List<ChamadoDTO> listarTickets() {
		List<ChamadoEntity> ChamadosList;
		ChamadosList = chamadosRepository.findAll();
		return ChamadosList
				.stream()
				.map(entity ->{
					ChamadoDTO dto = new ChamadoDTO();
					dto.setID(entity.getID());
					dto.setAssunto(entity.getAssunto());
					dto.setPrioridade(entity.getPrioridade());
					return dto;
				}).collect(Collectors.toList());
	}

	@Override
	public List<ChamadoDTO> listarTicketsPorPrioridade(int prioridade) {
		List<ChamadoEntity> ChamadosList;
		ChamadosList = chamadosRepository.findAllByPrioridadeContainingIgnoreCase(prioridade);
		return ChamadosList
				.stream()
				.map(entity ->{
					ChamadoDTO dto = new ChamadoDTO();
					dto.setID(entity.getID());
					dto.setAssunto(entity.getAssunto());
					dto.setPrioridade(entity.getPrioridade());
					return dto;
				}).collect(Collectors.toList());
	}

	@Override
	public ChamadoDTO buscarTicketPorId(long ID) {
		ChamadoEntity entity = chamadosRepository.findById(ID);
		ChamadoDTO dto = new ChamadoDTO();
		dto.setID(entity.getID());
		dto.setAssunto(entity.getAssunto());
		dto.setPrioridade(entity.getPrioridade());
		return dto;
	}

	@Override
	public ChamadoDTO distribuirTicket(NovoChamadoDTO novoChamadoDTO) {
		ChamadoEntity entity = new ChamadoEntity();
		entity.setID(novoChamadoDTO.getID());
		entity.setAssunto(novoChamadoDTO.getAssunto());
		entity.setPrioridade(novoChamadoDTO.getPrioridade());
		
		ChamadoEntity savedEntity = chamadosRepository.save(entity);
		
		ChamadoDTO dto = new ChamadoDTO();
		dto.setID(entity.getID());
		dto.setAssunto(entity.getAssunto());
		dto.setPrioridade(entity.getPrioridade());
		return dto;
	}

	@Override
	public ChamadoDTO atualizarDistribuicao(long ID, NovoChamadoDTO novoChamadoDTO) {
		ChamadoEntity entity = chamadosRepository.findById(ID);
		entity.setID(novoChamadoDTO.getID());
		entity.setAssunto(novoChamadoDTO.getAssunto());
		entity.setPrioridade(novoChamadoDTO.getPrioridade());
		
		ChamadoEntity savedEntity = chamadosRepository.save(entity);
		
		ChamadoDTO dto = new ChamadoDTO();
		dto.setID(savedEntity.getID());
		dto.setAssunto(savedEntity.getAssunto());
		dto.setPrioridade(savedEntity.getPrioridade());
		return dto;
	}

	@Override
	public void removerTicket(Integer ID) {
		chamadosRepository.deleteById(ID);
		
	}

}
