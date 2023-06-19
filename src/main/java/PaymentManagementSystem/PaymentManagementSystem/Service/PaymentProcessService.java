package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentProcess;
import PaymentManagementSystem.PaymentManagementSystem.Repository.PaymentProcessRepository;
import PaymentManagementSystem.PaymentManagementSystem.Repository.RegistrationRepository;
import PaymentManagementSystem.PaymentManagementSystem.Request.PaymentProcessRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PaymentProcessService {

    @Autowired
    PaymentProcessRepository paymentProcessRepository;
    @Autowired
    RegistrationRepository registrationRepository;

    public void createPayment(PaymentProcessRequest paymentProcessRequest) {
        PaymentProcess newPayment = new PaymentProcess();
        newPayment.setPaymentId(11);
        newPayment.setAmount((long) 100.50);
        newPayment.setCurrency("USD");
        newPayment.setMethodType("credit_card");
        newPayment.setCardNumber("4111111111111111L");
        newPayment.setExpirationDate("10/2");
        newPayment.setCvv("123");
        newPayment.setCreateDate(new Date());
        newPayment.setIsActive(true);
        newPayment.setRegistration(registrationRepository.getRegistrationById(11));
        paymentProcessRepository.save(newPayment);
    }


}
