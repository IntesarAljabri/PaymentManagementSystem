package PaymentManagementSystem.PaymentManagementSystem.Repository;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSubscriptionRepository extends JpaRepository<UserSubscription, Integer> {
    @Query("SELECT s FROM UserSubscription s WHERE s.id = :id")
    UserSubscription getUserSubscriptionById(@Param("id") Integer id);
}
