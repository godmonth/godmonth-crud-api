package com.godmonth.crud.service;

import java.util.List;

import com.godmonth.crud.model.LongIdModel;

public interface CrudService<T extends LongIdModel> {
	T save(T t);

	void save2(T t);

	void delete(Long id);

	T get(Long id);

	List<T> list();
}
