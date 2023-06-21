package PaymentManagementSystem.PaymentManagementSystem.Controller;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserRegistration;
import PaymentManagementSystem.PaymentManagementSystem.Response.UserRegistrationResponse;
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

    //********To get UserRegistration by id and check it by try and catch***************
    @GetMapping(value = "getUserRegistrationById")
    public UserRegistrationResponse getUserRegistrationById(@RequestParam Integer id) {
        try {
        UserRegistration registrationById = userregistrationService.getUserRegistrationById(id);
            if (registrationById == null) {
                System.err.println("UserRegistration is not found ");
                return null;
            }
            return UserRegistrationResponse.convertUserRegistrationToResponse(registrationById);
        } catch (Exception e) {
            System.err.println("Internal Server Error: " + e.getMessage());
            return null; // or return an appropriate error response
        }
    }

    //*************To get message if response =200 ok that mean created********
    @GetMapping("/api")
    public ResponseEntity<String> RequestEndpoint() {
        // Return a 200 OK response with a custom message
        return ResponseEntity.ok("Success!");
    }
}
