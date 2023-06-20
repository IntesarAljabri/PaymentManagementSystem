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
public class UserPaymentProcess extends UserPaymentMethod{

    Integer userPaymentId;
    Long amount;
    String currency;

    @JoinColumn(name = "registerId", referencedColumnName = "id") // FK
    UserRegistration userregistration;
}
