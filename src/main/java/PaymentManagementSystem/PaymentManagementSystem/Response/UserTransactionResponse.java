package PaymentManagementSystem.PaymentManagementSystem.Response;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserTransaction;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class UserTransactionResponse {
    Long transactionId;
    Long amount;
    String currency;
    String status;

    public static UserTransactionResponse covertUserTransactionToResponse(UserTransaction usertransaction) {
        return UserTransactionResponse.builder()
                .transactionId(usertransaction.getTransactionId())
                .amount(usertransaction.getAmount())
                .currency(usertransaction.getCurrency())
                .status(usertransaction.getStatus())
                .build();
    }

}
