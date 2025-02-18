package kz.projectx.almatour.repository;

import jakarta.transaction.Transactional;
import kz.projectx.almatour.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
