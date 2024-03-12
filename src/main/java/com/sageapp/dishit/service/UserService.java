package com.sageapp.dishit.service;

import com.sageapp.dishit.dao.UserDAO;
import com.sageapp.dishit.repository.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService {
  UserRepository userRepository;

  public void createUser(){
    UserDAO userDAO = new UserDAO();
    userDAO.setFirstName("John");
    userDAO.setLastName("Doe");
    userDAO.setEmail("johndoe@gmail.com");
    userDAO.setUsername("johnnyboyy");
    userDAO.setPassword("test");

    userRepository.save(userDAO);
  }
}
