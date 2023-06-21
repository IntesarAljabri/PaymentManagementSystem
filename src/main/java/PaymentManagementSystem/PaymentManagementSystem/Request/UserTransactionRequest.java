package PaymentManagementSystem.PaymentManagementSystem.Request;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserTransaction;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Data
@Getter
@Setter
public class UserTransactionRequest {
    Long transactionId;
    Long amount;
    String currency;
    String status;


    public UserTransaction convertToUSerTransaction() {
        Date nowDate = new Date();
        UserTransaction usertransaction = new UserTransaction();
        usertransaction.setTransactionId(this.getTransactionId());
        usertransaction.setAmount((long) this.getAmount());
        usertransaction.setCurrency(this.getCurrency());
        usertransaction.setStatus(this.getStatus());
        usertransaction.setCreateDate(nowDate);
        usertransaction.setIsActive(true);
        return usertransaction;
    }
}
