package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
import PaymentManagementSystem.PaymentManagementSystem.Repository.RegistrationRepository;
import PaymentManagementSystem.PaymentManagementSystem.Request.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    public void RegisterAccount(RegistrationRequest registrationRequest) {
        Registration registration = new Registration();
        registration.setUserName(registrationRequest.getUserName());
        registration.setPassword(registrationRequest.getPassword());
        registration.setEmail(registrationRequest.getEmail());
        registration.setCreateDate(new Date());
        registration.setIsActive(true);
        registrationRepository.save(registration);
    }


}
