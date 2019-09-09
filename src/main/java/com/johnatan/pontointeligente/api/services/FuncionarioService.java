package com.johnatan.pontointeligente.api.services;

import java.util.Optional;

import com.johnatan.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	Funcionario persistir(Funcionario funcionario);
	
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	Optional<Funcionario> buscaPorEmail(String email);
	
	Optional<Funcionario> buscaPorId(Long id);
}
