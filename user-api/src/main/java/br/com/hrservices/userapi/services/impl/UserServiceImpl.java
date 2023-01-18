package br.com.hrservices.userapi.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hrservices.userapi.domain.User;
import br.com.hrservices.userapi.repository.UserRepository;
import br.com.hrservices.userapi.services.UserService;
import br.com.hrservices.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

	private final UserRepository repository;

	@Override
	public User findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}
}
