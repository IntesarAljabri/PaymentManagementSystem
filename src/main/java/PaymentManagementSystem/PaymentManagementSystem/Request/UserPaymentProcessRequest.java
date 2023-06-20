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
    Long amount;
    String currency;



      public UserPaymentProcess convertToUserPaymentProcess() {
            Date nowDate = new Date();
            UserPaymentProcess userpaymentProcess = new UserPaymentProcess();
          userpaymentProcess.setAmount(this.getAmount());
          userpaymentProcess.setCurrency(this.getCurrency());
            return userpaymentProcess;
        }
}
