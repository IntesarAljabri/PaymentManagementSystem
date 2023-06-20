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
@Table(name = "User_Payment_History")
public class UserPaymentHistory extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

     String paymentId;
     Long amount;
     String currency;
     Date date;
     String status;
}
