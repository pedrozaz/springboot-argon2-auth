package io.github.pedrozaz.argon2auth.repository;

import io.github.pedrozaz.argon2auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
