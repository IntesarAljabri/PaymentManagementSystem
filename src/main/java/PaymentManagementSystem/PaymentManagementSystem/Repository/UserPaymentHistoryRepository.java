package PaymentManagementSystem.PaymentManagementSystem.Repository;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPaymentHistoryRepository extends JpaRepository<UserPaymentHistory, Long> {
    List<UserPaymentHistory> findByUserId(Long userId);
}
