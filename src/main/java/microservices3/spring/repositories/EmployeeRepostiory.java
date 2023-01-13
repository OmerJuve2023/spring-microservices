package microservices3.spring.repositories;

import microservices3.spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepostiory extends JpaRepository<Employee, Long> {

}
