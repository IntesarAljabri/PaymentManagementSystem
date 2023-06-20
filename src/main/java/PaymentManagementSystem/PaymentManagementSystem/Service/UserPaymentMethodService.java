package PaymentManagementSystem.PaymentManagementSystem.Service;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentMethod;
import PaymentManagementSystem.PaymentManagementSystem.Repository.UserPaymentMethodRepository;
import PaymentManagementSystem.PaymentManagementSystem.Request.UserPaymentMethodRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserPaymentMethodService {
    @Autowired
    static UserPaymentMethodRepository userpaymentMethodRepository;


    public UserPaymentMethod addUserPaymentMethod(UserPaymentMethod userpaymentMethod) {
        return userpaymentMethodRepository.save(userpaymentMethod);
    }

    public static void updateUserPaymentMethod(UserPaymentMethodRequest userpaymentMethodRequest) {

        UserPaymentMethod userpaymentMethod = new UserPaymentMethod();
        userpaymentMethod.setMethodType(userpaymentMethod.getMethodType());
        userpaymentMethod.setCardNumber(userpaymentMethod.getCardNumber());
        userpaymentMethod.setExpirationDate(userpaymentMethod.getExpirationDate());
        userpaymentMethod.setCvv(userpaymentMethod.getCvv());
        userpaymentMethod.setCreateDate(new Date());
        userpaymentMethod.setUpdateDate(new Date());
        userpaymentMethod.setIsActive(Boolean.TRUE);
        userpaymentMethodRepository.save(userpaymentMethod);

    }

    public void deleteAllUserPaymentMethods() {
        userpaymentMethodRepository.deleteAll();
    }
}
