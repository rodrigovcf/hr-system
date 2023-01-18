package br.com.hrservices.userapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.hrservices.userapi.domain.User;
import br.com.hrservices.userapi.repository.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "Rodrigo Valença", "rodrigo@gmail.com", "123", 20.0),
				new User(null, "Pedro Valença", "pedro@gmail.com", "123", 30.0)
				
		));
	}

}
