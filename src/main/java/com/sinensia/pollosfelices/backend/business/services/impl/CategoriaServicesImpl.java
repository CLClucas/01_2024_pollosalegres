package com.sinensia.pollosfelices.backend.business.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sinensia.pollosfelices.backend.business.model.Categoria;
import com.sinensia.pollosfelices.backend.business.services.CategoriaServices;

@Service
@Primary
public class CategoriaServicesImpl implements CategoriaServices{

	@Override
	public Long create(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Categoria> read(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Categoria> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
