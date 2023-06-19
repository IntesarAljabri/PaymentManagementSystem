package PaymentManagementSystem.PaymentManagementSystem.Controller;

import PaymentManagementSystem.PaymentManagementSystem.Model.Transaction;
import PaymentManagementSystem.PaymentManagementSystem.Repository.TransactionRepository;
import PaymentManagementSystem.PaymentManagementSystem.Response.TransactionResponse;
import PaymentManagementSystem.PaymentManagementSystem.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/Transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @RequestMapping(value = "getAllTransaction", method = RequestMethod.GET)
    public List<Transaction> getAllTransaction() {
        return transactionService.getAllTransaction();
    }

    @GetMapping(value = "getTransactionById")
    public Transaction  getTransactionById(@RequestParam Long id) {
        Transaction transactionById = transactionService.getTransactionById(Math.toIntExact(id));
        return transactionById;
    }
    @GetMapping("/{transactionId}")
    public ResponseEntity<TransactionResponse> getTransaction(@PathVariable("transactionId") Long transactionId) {
        // Retrieve the transaction details from the service
        Transaction transaction = transactionService.getTransactionById(Math.toIntExact(transactionId));

        // Create a TransactionResponse object and populate it with the transaction details
        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.setTransactionId(transaction.getTransactionId());
        transactionResponse.setAmount(transaction.getAmount());
        transactionResponse.setCurrency(transaction.getCurrency());
        transactionResponse.setStatus(transaction.getStatus());

        // Return the TransactionResponse with a 200 OK status code
        return ResponseEntity.ok(transactionResponse);
    }
}

