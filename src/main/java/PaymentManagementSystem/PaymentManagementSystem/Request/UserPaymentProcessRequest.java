package PaymentManagementSystem.PaymentManagementSystem.Request;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentProcess;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data
@Getter
@Setter
public class UserPaymentProcessRequest {

    Integer paymentId;
    Long amount;
    String currency;
    String methodType;
    String cardNumber;
    String expirationDate;
    String cvv;


      public UserPaymentProcess convertToUserPaymentProcess() {
            Date nowDate = new Date();
            UserPaymentProcess userpaymentProcess = new UserPaymentProcess();
          userpaymentProcess.setPaymentId(this.getPaymentId());
          userpaymentProcess.setAmount(this.getAmount());
          userpaymentProcess.setCurrency(this.getCurrency());
          userpaymentProcess.setMethodType(this.getMethodType());
          userpaymentProcess.setCardNumber(this.getCardNumber());
          userpaymentProcess.setExpirationDate(this.getExpirationDate());
          userpaymentProcess.setCvv(this.getCvv());
            return userpaymentProcess;
        }
}
