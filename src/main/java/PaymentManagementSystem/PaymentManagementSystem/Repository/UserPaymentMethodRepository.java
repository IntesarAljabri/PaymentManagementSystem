package PaymentManagementSystem.PaymentManagementSystem.Repository;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Integer> {
    @Query(value = "UPDATE p User_Payment_Method p WHERE p.id =:id")
     void deleteAllPaymentMethod();
}
