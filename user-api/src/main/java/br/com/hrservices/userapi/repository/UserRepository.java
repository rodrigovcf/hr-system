package br.com.hrservices.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hrservices.userapi.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
