package learnjava.restfullapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import learnjava.restfullapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
