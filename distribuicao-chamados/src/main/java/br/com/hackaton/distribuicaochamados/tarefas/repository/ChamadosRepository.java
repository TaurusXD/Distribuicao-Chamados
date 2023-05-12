package br.com.hackaton.distribuicaochamados.tarefas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hackaton.distribuicaochamados.tarefas.entity.ChamadoEntity;


public interface ChamadosRepository extends JpaRepository<ChamadoEntity, Integer> {
	List<ChamadoEntity> findAllByPrioridadeContainingIgnoreCase(int prioridade);
	ChamadoEntity findById(long ID);
    List<ChamadoEntity> findAllByCategoriaContainingIgnoreCase(String categoria);
    List<ChamadoEntity> findAllByNameContainingIgnoreCase(String name);
}
