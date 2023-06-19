package PaymentManagementSystem.PaymentManagementSystem.Controller;

import PaymentManagementSystem.PaymentManagementSystem.Model.Registration;
import PaymentManagementSystem.PaymentManagementSystem.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @GetMapping(value = "getRegistrationById")
    public Registration getRegistrationById(@RequestParam Integer id) {
        Registration registrationById = registrationService.getRegistrationById(id);
        return registrationById;
    }

    @GetMapping("/api")
    public ResponseEntity<String> RequestEndpoint() {
        // Return a 200 OK response with a custom message
        return ResponseEntity.ok("Success!");
    }
}
