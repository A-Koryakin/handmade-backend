package ru.bstu.ieitus.handmade_backend.repository;

import org.springframework.data.repository.CrudRepository;;
import org.springframework.stereotype.Repository;
import ru.bstu.ieitus.handmade_backend.entity.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    User findByLogin(String login);
}
