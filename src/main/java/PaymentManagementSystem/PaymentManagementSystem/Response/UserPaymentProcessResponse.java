package PaymentManagementSystem.PaymentManagementSystem.Response;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentMethod;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class UserPaymentProcessResponse {
    Long amount;
    String currency;
    String methodType;
    String cardNumber;
    String expirationDate;
    String cvv;

    public static PaymentProcessResponse convertUserPaymentMethodToResponse(UserPaymentMethod userpaymentMethod) {
        return PaymentProcessResponse.builder()
                .amount(userpaymentMethod.getAmount())
                .currency(userpaymentMethod.getCurrency())
                .methodType(userpaymentMethod.getMethodType())
                .cardNumber(userpaymentMethod.getCardNumber())
                .expirationDate(userpaymentMethod.getExpirationDate())
                .cvv(userpaymentMethod.getCvv())
                .build();
    }
}
