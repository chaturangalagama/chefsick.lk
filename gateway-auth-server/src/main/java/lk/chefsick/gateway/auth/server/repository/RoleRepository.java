package lk.chefsick.gateway.auth.server.repository;

import lk.chefsick.gateway.auth.server.domain.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}
