package PaymentManagementSystem.PaymentManagementSystem.Repository;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Integer> {
    @Modifying
    @Query("UPDATE UserPaymentMethod p SET p.paymentStatus = :newStatus WHERE p.id = :id")
    void updatePaymentMethodStatus(@Param("id") Long id, @Param("newStatus") String newStatus);
}
