package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
