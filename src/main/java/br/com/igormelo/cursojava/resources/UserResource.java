package br.com.igormelo.cursojava.resources;

import br.com.igormelo.cursojava.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping // garante que recebe o /users na requisição HTTP
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Igor", "igorgmelo@hotmail.com", "999999","12345" );
        return ResponseEntity.ok().body(u);
    }
}
