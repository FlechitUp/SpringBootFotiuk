package com.xime.bupho.repository;


import com.xime.bupho.model.UserModel;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends PagingAndSortingRepository<UserModel, Long> {

  List<UserModel> findAll();

  UserModel findByUsername(String username);
  
  UserModel findByMail(String mail);
  
  UserModel findByPassword(String password);

}
