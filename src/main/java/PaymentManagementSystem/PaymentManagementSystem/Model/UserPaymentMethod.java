package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
@Table(name = "User_Payment_Method")
public class UserPaymentMethod extends BaseEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

     private String methodType;
     private String cardNumber;
     private String expirationDate;
     private String cvv;

     @ManyToOne
     @JoinColumn(name = "userPaymentId")
     private UserPaymentProcess userPaymentProcess;
     @ManyToOne
     @JoinColumn(name = "user_registration_id") // Adjust the column name as per your database schema
     private UserRegistration userRegistration;
}
