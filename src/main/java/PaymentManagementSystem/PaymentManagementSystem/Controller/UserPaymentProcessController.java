package PaymentManagementSystem.PaymentManagementSystem.Controller;
import PaymentManagementSystem.PaymentManagementSystem.Request.UserPaymentProcessRequest;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserPaymentProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paymentProcess")
public class UserPaymentProcessController {

    @Autowired
    UserPaymentProcessService userpaymentProcessService;

    //***********TO create UserPaymentProcess by post Method*************
    @RequestMapping(value = "createUserPaymentProcess", method = RequestMethod.POST)
    public void createUSerPaymentProcess(@RequestBody UserPaymentProcessRequest userpaymentProcessRequest) {
        userpaymentProcessService.createUserPayment(userpaymentProcessRequest);
    }


    //******************To check 201 method is created
    @PostMapping
    public ResponseEntity<String> processPayment(@RequestBody UserPaymentProcessRequest paymentRequest) {
        // Assuming the payment processing is successful, return a 201 Created response
        return ResponseEntity.status(HttpStatus.CREATED).body("Payment processed successfully");
    }

}
