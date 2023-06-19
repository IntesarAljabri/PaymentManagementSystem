package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentMethod;
import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentProcess;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@Builder
public class PaymentMethodResponse {
    Long amount;
    String currency;
    String methodType;
    String cardNumber;
    String expirationDate;
    String cvv;

    public static PaymentProcessResponse convertPaymentMethodToResponse(PaymentMethod paymentMethod) {
        return PaymentProcessResponse.builder()
                .amount(paymentMethod.getAmount())
                .currency(paymentMethod.getCurrency())
                .methodType(paymentMethod.getMethodType())
                .cardNumber(paymentMethod.getCardNumber())
                .expirationDate(paymentMethod.getExpirationDate())
                .cvv(paymentMethod.getCvv())
                .build();
    }
}
