package PaymentManagementSystem.PaymentManagementSystem.Service;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserRegistration;
import PaymentManagementSystem.PaymentManagementSystem.Repository.UserRegistrationRepository;
import PaymentManagementSystem.PaymentManagementSystem.Request.UserRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserRegistrationService {

    @Autowired
    UserRegistrationRepository userregistrationRepository;

    public void RegisterAccount(UserRegistrationRequest registrationRequest) {
        UserRegistration userregistration = new UserRegistration();
        userregistration.setUserName(registrationRequest.getUserName());
        userregistration.setPassword(registrationRequest.getPassword());
        userregistration.setEmail(registrationRequest.getEmail());
        userregistration.setCreateDate(new Date());
        userregistration.setIsActive(true);
        userregistrationRepository.save(userregistration);
    }

    public UserRegistration getUserRegistrationById(Integer id) {
        UserRegistration registrationById = userregistrationRepository.getUserRegistrationById(id);
        return registrationById;
    }
}
