package PaymentManagementSystem.PaymentManagementSystem.Response;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentMethod;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@Builder
public class UserPaymentProcessResponse {
    String methodType;
    String cardNumber;
    Date expirationDate;
    String cvv;

    public static UserPaymentProcessResponse convertUserPaymentMethodToResponse(UserPaymentMethod userpaymentMethod) {
        return UserPaymentProcessResponse.builder()
                .methodType(userpaymentMethod.getMethodType())
                .cardNumber(userpaymentMethod.getCardNumber())
                .expirationDate(userpaymentMethod.getExpirationDate())
                .cvv(userpaymentMethod.getCvv())
                .build();
    }
}
