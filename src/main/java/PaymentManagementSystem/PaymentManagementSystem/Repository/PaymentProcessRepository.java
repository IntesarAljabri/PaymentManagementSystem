package PaymentManagementSystem.PaymentManagementSystem.Repository;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentProcessRepository extends JpaRepository<PaymentProcess, Integer> {
    
}
