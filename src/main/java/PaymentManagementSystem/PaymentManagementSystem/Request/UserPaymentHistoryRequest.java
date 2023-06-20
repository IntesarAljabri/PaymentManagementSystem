package PaymentManagementSystem.PaymentManagementSystem.Request;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class UserPaymentHistoryRequest {

    Long id;
    String paymentId;
    Long amount;
    String currency;
    Date date;
    String status;

    public UserPaymentHistory convertUserPaymentHistoryToResponse(UserPaymentHistory userPaymentHistory) {
        // Modify the fields of the userPaymentHistory object
        userPaymentHistory.setUserId(this.getId());
        userPaymentHistory.setPaymentId(this.getPaymentId());
        userPaymentHistory.setAmount(this.getAmount());
        userPaymentHistory.setCurrency(this.getCurrency());
        userPaymentHistory.setDate(this.getDate());
        userPaymentHistory.setStatus(this.getStatus());

        return userPaymentHistory;
      }
    }
