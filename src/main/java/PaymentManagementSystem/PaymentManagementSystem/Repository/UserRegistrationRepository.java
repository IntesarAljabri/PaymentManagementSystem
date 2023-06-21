package PaymentManagementSystem.PaymentManagementSystem.Repository;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {
    @Query(value = "SELECT r FROM UserRegistration r where r.id = :id")
    UserRegistration getUserRegistrationById(@Param("id") Integer id);

//    @Modifying
//    @Query("INSERT INTO UserRegistration (id, userName, password, email) VALUES (:id, :username, :password, :email)")
//    static void createUserRegistration(@Param("id") Integer id, @Param("username") String username,
//    @Param("password") String password, @Param("email") String email);
}
