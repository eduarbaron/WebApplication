package com.projects.webaplication.commons.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.projects.webaplication.commons.IGenericService;

@Service
public abstract class GenericServiceImpl<T, ID extends Serializable> implements IGenericService<T, ID>{

	@Override
	public T save(T entity) {
		return getRepo().save(entity);
	}

	@Override
	public void delete(ID id) {
		getRepo().deleteById(id);		
	}

	@Override
	public T getPersona(ID id) {
		
		Optional<T> optional = getRepo().findById(id);
		
		if (optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}

	@Override
	public List<T> getAll() {
		List<T> list = new ArrayList<>();
		getRepo().findAll().forEach(obj -> list.add(obj));
		return list;
	}
	
	public abstract JpaRepository<T, ID> getRepo();

}
