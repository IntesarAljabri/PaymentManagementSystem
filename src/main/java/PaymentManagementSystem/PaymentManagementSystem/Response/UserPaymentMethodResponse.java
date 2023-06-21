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
public class UserPaymentMethodResponse {

    String methodType;
    String cardNumber;
    Date expirationDate;
    String cvv;

    public static UserPaymentProcessResponse convertToUserPaymentProcessResponse(UserPaymentProcess userPaymentProcess) {
        return UserPaymentProcessResponse.builder()
                .methodType(userPaymentProcess.getMethodType())
                .cardNumber(userPaymentProcess.getCardNumber())
                .expirationDate(userPaymentProcess.getExpirationDate())
                .cvv(userPaymentProcess.getCvv())
                .build();
    }
}
