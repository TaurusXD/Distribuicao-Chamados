package br.com.hackaton.distribuicaochamados.tarefas.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.hackaton.distribuicaochamados.tarefas.services.ChamadosService;
import br.com.hackaton.distribuicaochamados.tarefas.dto.ChamadoDTO;
import br.com.hackaton.distribuicaochamados.tarefas.dto.NovoChamadoDTO;

@RestController
@RequestMapping("chamados")
public class ChamadoController {
	
	private ChamadosService chamadoService;
	
	public ChamadoController(ChamadosService chamadoService) {
		this.chamadoService = chamadoService;
	}

	@CrossOrigin(origins = "*")
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ChamadoDTO> getChamados(){
		return chamadoService.listarTickets();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("id/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ChamadoDTO buscarTicketPorId (@RequestParam long ID) {
		return chamadoService.buscarTicketPorId(ID);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("prioridade/{prioridade}")
	@ResponseStatus(HttpStatus.OK)
	public List<ChamadoDTO> listarTicketsPorPrioridade (@RequestParam int prioridade) {
		return chamadoService.listarTicketsPorPrioridade(prioridade);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ChamadoDTO distribuirTicket (
		@RequestBody NovoChamadoDTO novoChamadoDTO
	) {
		return chamadoService.distribuirTicket(novoChamadoDTO);
	}
	
	@CrossOrigin(origins = "*")
	@PatchMapping("id/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ChamadoDTO atualizarDistribuicao(
			@RequestBody NovoChamadoDTO novoChamadoDTO,
			@PathVariable int ID
	) {
		return chamadoService.atualizarDistribuicao(ID, novoChamadoDTO);
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("id/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removerTicket(
			@PathVariable int ID
	) {
		chamadoService.removerTicket(ID);
	}
	

}
