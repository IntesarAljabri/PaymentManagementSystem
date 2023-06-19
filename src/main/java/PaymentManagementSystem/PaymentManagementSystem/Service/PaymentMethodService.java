package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentMethod;
import PaymentManagementSystem.PaymentManagementSystem.Repository.PaymentMethodRepository;
import PaymentManagementSystem.PaymentManagementSystem.Request.PaymentMethodRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PaymentMethodService {
    @Autowired
    static
    PaymentMethodRepository paymentMethodRepository;


    public PaymentMethod addPaymentMethod(PaymentMethod paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }
    public static void updatePaymentMethod(PaymentMethodRequest paymentMethodRequest) {

        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setAmount(paymentMethod.getAmount());
        paymentMethod.setCurrency(paymentMethod.getCurrency());
        paymentMethod.setMethodType(paymentMethodRequest.getMethodType());
        paymentMethod.setCardNumber(paymentMethod.getCardNumber());
        paymentMethod.setExpirationDate(paymentMethod.getExpirationDate());
        paymentMethod.setCvv(paymentMethod.getCvv());
        paymentMethod.setCreateDate(new Date());
        paymentMethod.setUpdateDate(new Date());
        paymentMethod.setIsActive(Boolean.TRUE);
        paymentMethodRepository.save(paymentMethod);

    }
    public void deleteAllPaymentMethods() {
        paymentMethodRepository.deleteAll();
    }
}
