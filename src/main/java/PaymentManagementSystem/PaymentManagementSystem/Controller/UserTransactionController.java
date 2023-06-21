package PaymentManagementSystem.PaymentManagementSystem.Controller;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserTransaction;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/Transaction")
public class UserTransactionController {

    @Autowired
    UserTransactionService usertransactionService;

    //********To get all Transaction*************
    @RequestMapping(value = "getAllTransaction", method = RequestMethod.GET)
    public List<UserTransaction> getAllTransaction() {
        return usertransactionService.getAllUserTransaction();
    }


    //************To get Transaction by id and authorized by admin user**************
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/getTransactionById")
    public ResponseEntity<UserTransaction> getUserTransactionById(@RequestParam Long id) {
        UserTransaction userTransaction = usertransactionService.getUserTransactionById(Math.toIntExact(id));
        return ResponseEntity.ok(userTransaction);
    }

}

