package PaymentManagementSystem.PaymentManagementSystem.Request;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserRegistration;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class UserRegistrationRequest {

    Integer registerId;
    String userName;
    String password;
    String email;

    public UserRegistration convertToUSerRegistration() {
        Date nowDate = new Date();
        UserRegistration userregistration = new UserRegistration();
        userregistration.setRegisterId(this.getRegisterId());
        userregistration.setPassword(this.getPassword());
        userregistration.setUserName(this.getUserName());
        userregistration.setEmail(this.getEmail());
        userregistration.setCreateDate(nowDate);
        userregistration.setIsActive(true);
        return userregistration;
    }

}
