package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
@Table(name = "User_Payment_Process")
public class UserPaymentProcess extends UserPaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Long amount;
    String currency;

    @ManyToOne
    @JoinColumn(name = "user_registration_id") // Adjust the column name as per your database schema
    private UserRegistration userRegistration;
}
