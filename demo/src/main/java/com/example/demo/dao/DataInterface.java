package com.example.demo.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.ObjectClass;
public interface DataInterface extends CrudRepository<ObjectClass, String>{
	

}
