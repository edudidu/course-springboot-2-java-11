package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;


@Service /*Registra userservice como componente do spring ai se pode usar o Autowired para injetar a dependencia automaticametne8 poderia ser @component tbm*/
public class OrderService {

	@Autowired /*injeção de dependências*/
	private OrderRepository repository;
	
	public List<Order> findAll () {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		
     Optional<Order> obj = repository.findById(id);		
     return obj.get();
    
	}
	
}
