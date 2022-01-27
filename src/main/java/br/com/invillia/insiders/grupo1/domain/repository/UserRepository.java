package br.com.invillia.insiders.grupo1.domain.repository;

import br.com.invillia.insiders.grupo1.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // List<User> findByFirstNameContaining(String first_name);
}
