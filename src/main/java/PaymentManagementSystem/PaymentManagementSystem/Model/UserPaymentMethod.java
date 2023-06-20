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
public class UserPaymentMethod extends BaseEntity{

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private String methodType;
     private String cardNumber;
     private String expirationDate;
     private String cvv;

     @ManyToOne
     @JoinColumn(name = "registerId")
     private UserRegistration userRegistration;

     @ManyToOne
     @JoinColumn(name = "userPaymentId")
     private UserPaymentProcess userPaymentProcess;

}
