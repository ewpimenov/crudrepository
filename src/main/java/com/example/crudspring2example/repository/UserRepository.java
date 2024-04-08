package com.example.crudspring2example.repository;


import com.example.crudspring2example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT o FROM User o JOIN FETCH o.roles i WHERE o.username = :username")
    User getUserByUsername(@Param("username")String username);
}
