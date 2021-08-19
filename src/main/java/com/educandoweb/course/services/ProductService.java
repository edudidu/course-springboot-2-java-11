package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service /*Registra userservice como componente do spring ai se pode usar o Autowired para injetar a dependencia automaticametne8 poderia ser @component tbm*/
public class ProductService {

	@Autowired /*injeção de dependências*/
	private ProductRepository repository;
	
	public List<Product> findAll () {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		
     Optional<Product> obj = repository.findById(id);		
     return obj.get();
    
	}
	
}
