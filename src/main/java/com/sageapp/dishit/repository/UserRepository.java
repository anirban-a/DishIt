package com.sageapp.dishit.repository;

import com.sageapp.dishit.dao.UserDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDAO, Long> {

}
