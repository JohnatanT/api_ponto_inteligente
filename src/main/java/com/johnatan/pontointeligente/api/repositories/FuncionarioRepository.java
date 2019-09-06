package com.johnatan.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.johnatan.pontointeligente.api.entities.Funcionario;

@Repository
@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	Funcionario findByCpf(String cpf);
	Funcionario findByEmai(String email);
	Funcionario findByCpfOrEmail(String cpf, String email);
		
}
