package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
@Table(name = "User_Transaction")
public class UserTransaction extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long transactionId;
     double amount;
     String currency;
     String status;

    @ManyToOne
    @JoinColumn(name = "registerId")
    private UserRegistration userRegistration;

    @ManyToOne
    @JoinColumn(name = "transactionId")
    private UserTransaction transaction;
}
