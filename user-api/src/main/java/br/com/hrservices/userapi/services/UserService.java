package br.com.hrservices.userapi.services;

import java.util.List;

import br.com.hrservices.userapi.domain.User;

public interface UserService {
	
	User findById(Long id);
	List<User> findAll();

}
