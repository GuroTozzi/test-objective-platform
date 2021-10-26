package com.assignment.assignment.data.repository.Interface;

import com.assignment.assignment.data.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

    @Query("select u from User u where u.idUser= ?1")
    Iterable<User> findUserByIdUser(Long idUser);

    @Query("select u from User u where u.age = ?1")
    Iterable<User> findUserByAge(Integer age);

    @Modifying
    @Transactional
    @Query(value = "update User u set u.name = ?1 where u.idUser = ?2")
    int updateUserName(String name, Long id);
}
