package PaymentManagementSystem.PaymentManagementSystem.Request;

import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
import PaymentManagementSystem.PaymentManagementSystem.Model.Transaction;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class TransactionRequest {
    Long transactionId;
    double amount;
    String currency;
    String status;

    public Transaction convertToTransaction() {
        Date nowDate = new Date();
        Transaction transaction = new Transaction();
        transaction.setTransactionId(this.getTransactionId());
        transaction.setAmount(this.getAmount());
        transaction.setCurrency(this.getCurrency());
        transaction.setStatus(this.getStatus());
        transaction.setCreateDate(nowDate);
        transaction.setIsActive(true);
        return transaction;
    }
}
