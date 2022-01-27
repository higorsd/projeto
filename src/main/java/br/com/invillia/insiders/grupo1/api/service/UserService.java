package br.com.invillia.insiders.grupo1.api.service;

import br.com.invillia.insiders.grupo1.domain.model.User;
import br.com.invillia.insiders.grupo1.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService {
//    public ResponseEntity<?> getById(Long id) {
//        return ResponseEntity.ok(create(id));
//    }
//    List<User> getAllUsers();
//    User findById(long id);

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUsers(){
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public ResponseEntity<User> getUserById(long id){
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }

        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<User> createUser(User user){
        return new ResponseEntity(userRepository.save(user), HttpStatus.CREATED);
//        URI location = URI.create()
//        ResponseEntity.created(userRepository.save(user)).build();
    }

    public ResponseEntity<User> updateUser(Long id, User newUser) {
        Optional<User> user = userRepository.findById(id);

        if(!userRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }

        verifyAndUpdateUser(user.get(), newUser);
        return ResponseEntity.ok(userRepository.save(user.get()));
    }
    
    public void verifyAndUpdateUser(User user, User newUser){
        if(newUser.getFirst_name() != null) user.setFirst_name(newUser.getFirst_name());
        if(newUser.getLast_name() != null) user.setLast_name(newUser.getLast_name());
        if(newUser.getEmail() != null) user.setEmail(newUser.getEmail());
        if(newUser.getRole() != null) user.setRole(newUser.getRole());

        user.setUpdated_at(LocalDateTime.now());
    }

    public ResponseEntity<User> deleteUser(long id){
        if(!userRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }

        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
