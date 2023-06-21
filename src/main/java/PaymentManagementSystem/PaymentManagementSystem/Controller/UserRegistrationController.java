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
@RequestMapping("/api/rRegistration")
public class UserRegistrationController {
    @Autowired
    UserRegistrationService userregistrationService;

    //********To get UserRegistration by id***************
    @GetMapping(value = "getUserRegistrationById")
    public UserRegistration getUserRegistrationById(@RequestParam Integer id) {
        UserRegistration registrationById = userregistrationService.getUserRegistrationById(id);
        return registrationById;
    }

    //*************To get message if response =200 ok that mean created********
    @GetMapping("/api")
    public ResponseEntity<String> RequestEndpoint() {
        // Return a 200 OK response with a custom message
        return ResponseEntity.ok("Success!");
    }
}
