package PaymentManagementSystem.PaymentManagementSystem.Controller;


import PaymentManagementSystem.PaymentManagementSystem.Model.UserTransaction;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/Transaction")
public class UserTransactionController {

    @Autowired
    UserTransactionService usertransactionService;

    @RequestMapping(value = "getAllTransaction", method = RequestMethod.GET)
    public List<UserTransaction> getAllTransaction() {
        return usertransactionService.getAllUserTransaction();
    }

    @GetMapping("/getTransactionById")
    public ResponseEntity<UserTransaction> getUserTransactionById(@RequestParam Long id) {
        UserTransaction userTransaction = usertransactionService.getUserTransactionById(Math.toIntExact(id));
            return ResponseEntity.ok(userTransaction);
        }


//    @GetMapping("/{transactionId}")
//    public ResponseEntity<TransactionResponse> getTransaction(@PathVariable("transactionId") Long transactionId) {
//        // Retrieve the transaction details from the service
//        Transaction transaction = transactionService.getTransactionById(Math.toIntExact(transactionId));
//
//        // Create a TransactionResponse object and populate it with the transaction details
//        TransactionResponse transactionResponse = new TransactionResponse();
//        transactionResponse.setTransactionId(transaction.getTransactionId());
//        transactionResponse.setAmount(transaction.getAmount());
//        transactionResponse.setCurrency(transaction.getCurrency());
//        transactionResponse.setStatus(transaction.getStatus());
//
//        // Return the TransactionResponse with a 200 OK status code
//        return ResponseEntity.ok(transactionResponse);
//    }
}

