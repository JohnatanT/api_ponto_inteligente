package com.johnatan.pontointeligente.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.johnatan.pontointeligente.api.entities.Lancamento;
import com.johnatan.pontointeligente.api.repositories.LancamentoRepository;
import com.johnatan.pontointeligente.api.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {

	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Override
	public Page<Lancamento> buscaPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		log.info("Buscando lancamento por Id do Funcionario: {}", funcionarioId);
		return this.lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
	}

	@Override
	public Optional<Lancamento> buscaPorId(Long id) {
		log.info("Buscando lancamento por ID: {}", id);
		return this.lancamentoRepository.findById(id);
	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo lancamento");
		return this.lancamentoRepository.save(lancamento);
	}

	@Override
	public void remover(Long id) {
		this.lancamentoRepository.deleteById(id);
	}
	
}
