package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Data
@Table(name = "PaymentMethod")
public class UserPaymentMethod extends BaseEntity{
     Long amount;
     String currency;
     String methodType;
     String cardNumber;
     String expirationDate;
     String cvv;

}
