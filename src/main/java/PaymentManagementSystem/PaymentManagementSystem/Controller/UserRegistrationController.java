package PaymentManagementSystem.PaymentManagementSystem.Controller;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserRegistration;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/userrRegistration")
public class UserRegistrationController {
    @Autowired
    UserRegistrationService userregistrationService;

    @GetMapping(value = "getUserRegistrationById")
    public UserRegistration getUserRegistrationById(@RequestParam Integer id) {
        UserRegistration userregistrationById = userregistrationService.getUserRegistrationById(id);
        return userregistrationById;
    }

    @GetMapping("/api")
    public ResponseEntity<String> RequestEndpoint() {
        // Return a 200 OK response with a custom message
        return ResponseEntity.ok("Success!");
    }
}
