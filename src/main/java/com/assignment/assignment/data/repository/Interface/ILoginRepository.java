package com.assignment.assignment.data.repository.Interface;

import com.assignment.assignment.data.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ILoginRepository extends JpaRepository<Login, Long> {

    @Modifying
    @Transactional
    @Query(value = "update User u set u.name = ?1 where u.idUser = ?2")
    int ins(String name, Long id);
}
