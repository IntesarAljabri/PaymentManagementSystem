package PaymentManagementSystem.PaymentManagementSystem.Repository;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Integer> {

    @Query("DELETE FROM UserPaymentMethod p WHERE p.id = :id")
    void deleteAllPaymentMethod(@Param("id") Long id);
}
