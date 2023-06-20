package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserRegistration;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class UserRegistrationResponse {

    Integer registerId;
    String userName;
    String password;
    String email;

    public static UserRegistrationResponse convertUserRegistrationToResponse(UserRegistration userRegistrationRequest) {
        return UserRegistrationResponse.builder()
                .registerId(userRegistrationRequest.getRegisterId())
                .userName(userRegistrationRequest.getUserName())
                .password(userRegistrationRequest.getPassword())
                .email(userRegistrationRequest.getEmail())
                .build();
    }


}
