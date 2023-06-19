package PaymentManagementSystem.PaymentManagementSystem.Request;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentMethod;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class UserPaymentMethodRequest {
    Long amount;
    String currency;
    String methodType;
    String cardNumber;
    String expirationDate;
    String cvv;

    public UserPaymentMethod convertToUserPayment() {
        Date nowDate = new Date();
        UserPaymentMethod userpaymentMethod = new UserPaymentMethod();
        userpaymentMethod.setAmount(this.getAmount());
        userpaymentMethod.setCurrency(this.getCurrency());
        userpaymentMethod.setMethodType(this.getMethodType());
        userpaymentMethod.setCardNumber(this.getCardNumber());
        userpaymentMethod.setExpirationDate(this.getExpirationDate());
        userpaymentMethod.setCvv(this.getCvv());
        userpaymentMethod.setCreateDate(nowDate);
        userpaymentMethod.setIsActive(true);
        return userpaymentMethod;
    }
}
