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

    //******** To create new UserRegistration**************
    public void CreateRegisterAccount(UserRegistrationRequest registrationRequest) {
        UserRegistration userregistration = new UserRegistration();
        userregistration.setUserName(registrationRequest.getUserName());
        userregistration.setPassword(registrationRequest.getPassword());
        userregistration.setEmail(registrationRequest.getEmail());
        userregistration.setCreateDate(new Date());
        userregistration.setIsActive(true);
        userregistrationRepository.save(userregistration);
    }

    //*******To check newUserRegistration by try and catch ************
    public void createUserRegistration(Integer id, String username, String password, String email) throws Exception {
        try {
            UserRegistrationRepository.createUserRegistration(id, username, password, email);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to create registration.");
        }
    }

    //********* To get UserRegistration by id******************
    public UserRegistration getUserRegistrationById(Integer id) {
        try {
            UserRegistration registrationById = userregistrationRepository.getUserRegistrationById(id);
            return registrationById;
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Return null value to indicate failure
        }
    }
}
