package PaymentManagementSystem.PaymentManagementSystem.Controller;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentMethod;
import PaymentManagementSystem.PaymentManagementSystem.Request.UserPaymentMethodRequest;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserPaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
@RestController
@RequestMapping("/api/paymentMethod")
public class UserPaymentMethodController {
    @Autowired
    UserPaymentMethodService userPaymentMethodService;

    @PostMapping("/addPaymentMethod")
    public ResponseEntity<String> addPaymentMethod(@RequestBody UserPaymentMethod userPaymentMethod) {
        userPaymentMethodService.addUserPaymentMethod(userPaymentMethod);
        return ResponseEntity.ok("Payment method added");
    }
    @RequestMapping(value = "updateUserPayment")
    public void updateUserPayment(@RequestBody UserPaymentMethodRequest userpaymentMethodRequest)
            throws ParseException {
        UserPaymentMethodService.updateUserPaymentMethod(userpaymentMethodRequest);
    }

}
