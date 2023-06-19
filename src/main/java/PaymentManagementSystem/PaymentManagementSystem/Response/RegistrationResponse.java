package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class RegistrationResponse {

    Integer registerId;
    String userName;
    String password;
    String email;

    public static RegistrationResponse convertRegistrationToResponse(Registration RegistrationRequest) {
        return RegistrationResponse.builder()
                .registerId(RegistrationRequest.getRegisterId())
                .userName(RegistrationRequest.getUserName())
                .password(RegistrationRequest.getPassword())
                .email(RegistrationRequest.getEmail())
                .build();
    }


}
