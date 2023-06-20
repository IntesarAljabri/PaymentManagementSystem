package PaymentManagementSystem.PaymentManagementSystem.Repository;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTransactionRepository extends JpaRepository<UserTransaction, Long> {
    @Query(value = "SELECT t FROM User_Transaction ")
    List<UserTransaction> getAllUserTransaction();
    @Query(value = "SELECT t FROM User_Transaction where t.id=:id")
    UserTransaction getUserTransactionById(@Param("id") Long id);
}
