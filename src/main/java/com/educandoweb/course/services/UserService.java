package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service /*Registra userservice como componente do spring ai se pode usar o Autowired para injetar a dependencia automaticametne8 poderia ser @component tbm*/
public class UserService {

	@Autowired /*injeção de dependências*/
	private UserRepository repository;
	
	public List<User> findAll () {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		
     Optional<User> obj = repository.findById(id);		
     return obj.get();
    
	}
	
	public User insert(User obj) {
	  return repository.save(obj);	
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
