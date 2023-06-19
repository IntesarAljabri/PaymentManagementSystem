package PaymentManagementSystem.PaymentManagementSystem.Controller;

import PaymentManagementSystem.PaymentManagementSystem.Model.PaymentProcess;
import PaymentManagementSystem.PaymentManagementSystem.Request.PaymentProcessRequest;
import PaymentManagementSystem.PaymentManagementSystem.Service.PaymentProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paymentProcess")
public class PaymentProcessController {

    @Autowired
    PaymentProcessService paymentProcessService;

    @RequestMapping(value = "createPaymentProcess", method = RequestMethod.POST)
    public void createPaymentProcess(@RequestBody PaymentProcessRequest paymentProcessRequest) {
        paymentProcessService.createPayment(paymentProcessRequest);
    }
    @PostMapping
    public ResponseEntity<String> processPayment(@RequestBody PaymentProcessRequest paymentRequest) {
        // Assuming the payment processing is successful, return a 201 Created response
        return ResponseEntity.status(HttpStatus.CREATED).body("Payment processed successfully");
    }

}
