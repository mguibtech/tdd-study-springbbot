package br.com.mguibtech.introtesteautomatizados;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.el.ELException;

@Service
public class UserService {
  List<User> users = new ArrayList<User>();

  public List<User> create(User user){
    if(users.contains(user)){
      throw new RuntimeException();
    }
    users.add(user);
    return users;
  }
  
}
