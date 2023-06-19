package PaymentManagementSystem.PaymentManagementSystem.Request;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentMethod;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class PaymentMethodRequest {
    Long amount;
    String currency;
    String methodType;
    String cardNumber;
    String expirationDate;
    String cvv;

    public PaymentMethod convertToPayment() {
        Date nowDate = new Date();
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setAmount(this.getAmount());
        paymentMethod.setCurrency(this.getCurrency());
        paymentMethod.setMethodType(this.getMethodType());
        paymentMethod.setCardNumber(this.getCardNumber());
        paymentMethod.setExpirationDate(this.getExpirationDate());
        paymentMethod.setCvv(this.getCvv());
        paymentMethod.setCreateDate(nowDate);
        paymentMethod.setIsActive(true);
        return paymentMethod;
    }
}
