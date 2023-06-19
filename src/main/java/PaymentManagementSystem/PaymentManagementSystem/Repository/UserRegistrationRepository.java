package PaymentManagementSystem.PaymentManagementSystem.Repository;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {
    @Query(value = "SELECT r FROM UserRegistration r where r.id=:id")
    public Registration getUserRegistrationById(@Param("id") Integer id);
}
