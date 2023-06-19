package PaymentManagementSystem.PaymentManagementSystem.Controller;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentMethod;
import PaymentManagementSystem.PaymentManagementSystem.Request.PaymentMethodRequest;
import PaymentManagementSystem.PaymentManagementSystem.Service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;

public class PaymentMethodController {
    @Autowired
    PaymentMethodService addPaymentMethodService;

    @PostMapping(value = "addPaymentMethod")
    public String PaymentMethod(@RequestBody PaymentMethod paymentMethod) {
        addPaymentMethodService.addPaymentMethod(paymentMethod);
        return "Payment added";
    }
    @RequestMapping(value = "updatePayment")
    public void updatePayment(@RequestBody PaymentMethodRequest paymentMethodRequest)
            throws ParseException {
        PaymentMethodService.updatePaymentMethod(paymentMethodRequest);
    }

}
