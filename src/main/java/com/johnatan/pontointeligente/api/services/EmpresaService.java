package com.johnatan.pontointeligente.api.services;

import java.util.Optional;

import com.johnatan.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	Optional<Empresa> buscaPorCnpj(String cnpj);
	
	Empresa persistir(Empresa empresa);
}
