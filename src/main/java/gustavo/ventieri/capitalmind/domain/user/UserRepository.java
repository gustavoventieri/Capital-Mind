package gustavo.ventieri.capitalmind.domain.user;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    Optional<User> findById(UUID id);

    Optional<User> findByEmail(String email);

    User save(User user);

    void deleteById(UUID id);
}
