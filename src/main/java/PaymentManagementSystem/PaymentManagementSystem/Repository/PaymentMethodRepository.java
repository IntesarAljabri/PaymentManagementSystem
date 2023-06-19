package PaymentManagementSystem.PaymentManagementSystem.Repository;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
    @Query(value = "UPDATE PaymentMethod p Set p.isActive = false")
     void deleteAllPaymentMethod();

}
