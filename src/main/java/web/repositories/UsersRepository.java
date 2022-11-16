package web.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import web.model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
