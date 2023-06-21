package PaymentManagementSystem.PaymentManagementSystem.Repository;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@EnableJpaRepositories
@Repository
public interface UserPaymentProcessRepository extends JpaRepository<UserPaymentProcess, Integer> {
    @Query("SELECT u FROM UserPaymentProcess u WHERE u.id= :id")
    List<UserPaymentProcess> findById(@Param("id") Long id);
}
