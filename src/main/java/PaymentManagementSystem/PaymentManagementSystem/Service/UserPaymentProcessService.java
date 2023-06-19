package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentProcess;
import PaymentManagementSystem.PaymentManagementSystem.Repository.UserPaymentProcessRepository;
import PaymentManagementSystem.PaymentManagementSystem.Repository.UserRegistrationRepository;
import PaymentManagementSystem.PaymentManagementSystem.Request.UserPaymentProcessRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserPaymentProcessService {

    @Autowired
    UserPaymentProcessRepository userpaymentProcessRepository;
    @Autowired
    UserRegistrationRepository userregistrationRepository;

    public void createUserPayment(UserPaymentProcessRequest userpaymentProcessRequest) {
        UserPaymentProcess newPayment = new UserPaymentProcess();
        newPayment.setPaymentId(11);
        newPayment.setAmount((long) 100.50);
        newPayment.setCurrency("USD");
        newPayment.setMethodType("credit_card");
        newPayment.setCardNumber("4111111111111111L");
        newPayment.setExpirationDate("10/2");
        newPayment.setCvv("123");
        newPayment.setCreateDate(new Date());
        newPayment.setIsActive(true);
        newPayment.setRegistration(userregistrationRepository.getUserRegistrationById(11));
        userpaymentProcessRepository.save(newPayment);
    }


}
