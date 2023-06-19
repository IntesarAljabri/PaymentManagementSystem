package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentProcess;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@Builder
public class PaymentProcessResponse {
    Integer paymentId;
    Long amount;
    String currency;
    String methodType;
    String cardNumber;
    String expirationDate;
    String cvv;

    public static PaymentProcessResponse convertPaymentProcessToResponse(UserPaymentProcess userpaymentProcess) {
        return PaymentProcessResponse.builder()
                .paymentId(userpaymentProcess.getPaymentId())
                .amount(userpaymentProcess.getAmount())
                .currency(userpaymentProcess.getCurrency())
                .methodType(userpaymentProcess.getMethodType())
                .cardNumber(userpaymentProcess.getCardNumber())
                .expirationDate(userpaymentProcess.getExpirationDate())
                .cvv(userpaymentProcess.getCvv())
                .build();
    }


}
