package com.mh.green2nd.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmailAndPassword(String email, String password);

    User findByEmail(String email);

    User findByNickname(String nickname);
}
