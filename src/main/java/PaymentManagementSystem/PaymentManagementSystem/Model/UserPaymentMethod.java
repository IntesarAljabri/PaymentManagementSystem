package PaymentManagementSystem.PaymentManagementSystem.Model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Data
@Table(name = "User_Payment_Method")
public class UserPaymentMethod extends BaseEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
      Integer id;

      String methodType;
      String cardNumber;
      Date expirationDate;
      String cvv;

     @ManyToOne
     @JoinColumn(name = "userPaymentId")
     UserPaymentProcess userPaymentProcess;

     @ManyToOne
     @JoinColumn(name = "user_registration_id") // Adjust the column name as per your database schema
     UserRegistration userRegistration;
}
