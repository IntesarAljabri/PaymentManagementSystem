package PaymentManagementSystem.PaymentManagementSystem.Repository;

import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
