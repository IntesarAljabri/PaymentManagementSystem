package PaymentManagementSystem.PaymentManagementSystem.Repository;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserPaymentHistoryRepository extends JpaRepository<UserPaymentHistory, Long> {
    @Query("SELECT u FROM UserPaymentProcess u WHERE u.id= :id")
    List<UserPaymentHistory> findByUserId(@Param("id") Long userId);
}
