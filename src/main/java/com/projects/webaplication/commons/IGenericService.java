package com.projects.webaplication.commons;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<T, ID extends Serializable > {
	
	public T save(T entity);
	public void delete(ID id);
	public T getPersona(ID id);
	public List<T> getAll();	

}
