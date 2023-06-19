package PaymentManagementSystem.PaymentManagementSystem.Request;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentMethod;
import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentProcess;
import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data
@Getter
@Setter
public class PaymentProcessRequest {

    Integer paymentId;
    Long amount;
    String currency;
    String methodType;
    String cardNumber;
    String expirationDate;
    String cvv;


      public PaymentProcess convertToPaymentProcess() {
            Date nowDate = new Date();
            PaymentProcess paymentProcess = new PaymentProcess();
            paymentProcess.setPaymentId(this.getPaymentId());
            paymentProcess.setAmount(this.getAmount());
            paymentProcess.setCurrency(this.getCurrency());
            paymentProcess.setMethodType(this.getMethodType());
            paymentProcess.setCardNumber(this.getCardNumber());
            paymentProcess.setExpirationDate(this.getExpirationDate());
            paymentProcess.setCvv(this.getCvv());
            return paymentProcess;
        }
}
