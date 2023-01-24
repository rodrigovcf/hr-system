package br.com.hrservices.userapi.services.impl;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.hrservices.userapi.domain.User;
import br.com.hrservices.userapi.repository.UserRepository;
import br.com.hrservices.userapi.services.UserService;
import br.com.hrservices.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

	private final UserRepository repository;
	private final Environment env;

	@Override
	public User findById(Long id) {
		log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}
}
