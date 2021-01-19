package br.com.igormelo.cursojava.services;

import br.com.igormelo.cursojava.entities.User;
import br.com.igormelo.cursojava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }
    public void delete(Long id){
        userRepository.deleteById(id);
    }
    public User update(Long id, User obj){
        User entity = userRepository.getOne(id); //instancia um usuario, mas nao vai ao banco de dados
        //deixando um objeto monitorado, se tornando mais eficiente
        updateData(entity, obj);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }


}
