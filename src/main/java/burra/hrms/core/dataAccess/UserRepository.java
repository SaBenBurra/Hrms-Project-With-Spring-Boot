package burra.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import burra.hrms.core.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
