package com.godmonth.crud.service;

import java.util.List;

import com.godmonth.crud.model.LongIdModel;

public interface CrudService<T extends LongIdModel> {
	T saveAndReturn(T t);

	void save(T t);

	void delete(Long id);

	T get(Long id);

	List<T> list();
}
