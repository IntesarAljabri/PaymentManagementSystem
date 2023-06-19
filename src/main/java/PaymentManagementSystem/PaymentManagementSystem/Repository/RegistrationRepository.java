package PaymentManagementSystem.PaymentManagementSystem.Repository;

import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

    @Query(value = "SELECT r FROM Registration r where r.id=:id")
    public Registration getRegistrationById(@Param("id") Integer id);

}
