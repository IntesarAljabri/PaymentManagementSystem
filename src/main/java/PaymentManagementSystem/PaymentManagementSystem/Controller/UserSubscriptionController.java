package PaymentManagementSystem.PaymentManagementSystem.Controller;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserSubscription;
import PaymentManagementSystem.PaymentManagementSystem.Request.UserPaymentProcessRequest;
import PaymentManagementSystem.PaymentManagementSystem.Request.UserSubscriptionRequest;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subscription")
public class UserSubscriptionController {

    @Autowired
    UserSubscriptionService userSubscriptionService;



    @GetMapping(value = "getUserSubscriptionById")
    public UserSubscription getUserSubscriptionById(@RequestParam Integer id) {
        UserSubscription getUserSubscriptionById = userSubscriptionService.getUserSubscriptionById(id);
        return getUserSubscriptionById;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserSubscription createUSerSubscription(@RequestBody UserSubscriptionRequest userSubscriptionRequest) {
        return userSubscriptionService.createUserSubscription(userSubscriptionRequest);
    }
//    @PostMapping
//    public ResponseEntity<String> processPayment(@RequestBody UserSubscriptionRequest subscriptionRequest) {
//        // Assuming the Subscription create is successful, return a 204 Created response
//        return ResponseEntity.status(HttpStatus.CREATED).body("Subscription created successfully");
//    }

//    @DeleteMapping("/{subscriptionId}")
//    public void cancelUserSubscription(@PathVariable String subscriptionId) {
//        userSubscriptionService.cancelUserSubscription(subscriptionId);
//    }
}
