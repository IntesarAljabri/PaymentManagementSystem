package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentMethod;
import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentProcess;
import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
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

    public static PaymentProcessResponse convertPaymentProcessToResponse(PaymentProcess paymentProcess) {
        return PaymentProcessResponse.builder()
                .paymentId(paymentProcess.getPaymentId())
                .amount(paymentProcess.getAmount())
                .currency(paymentProcess.getCurrency())
                .methodType(paymentProcess.getMethodType())
                .cardNumber(paymentProcess.getCardNumber())
                .expirationDate(paymentProcess.getExpirationDate())
                .cvv(paymentProcess.getCvv())
                .build();
    }


}
