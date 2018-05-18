package lk.chefsick.gateway.auth.server.repository;

import lk.chefsick.gateway.auth.server.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
//    List<User> findAllUsers();
}
