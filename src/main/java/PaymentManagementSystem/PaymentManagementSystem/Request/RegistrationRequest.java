package PaymentManagementSystem.PaymentManagementSystem.Request;

import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class RegistrationRequest {

    Integer registerId;
    String userName;
    String password;
    String email;

    public Registration convertToRegistration() {
        Date nowDate = new Date();
        Registration registration = new Registration();
        registration.setRegisterId(this.getRegisterId());
        registration.setPassword(this.getPassword());
        registration.setUserName(this.getUserName());
        registration.setEmail(this.getEmail());
        registration.setCreateDate(nowDate);
        registration.setIsActive(true);
        return registration;
    }




}
