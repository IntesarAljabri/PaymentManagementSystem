package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.Transaction;
import PaymentManagementSystem.PaymentManagementSystem.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public static List<Transaction> getAllTransaction() {return getAllTransaction();}
    public Transaction getTransactionById(Integer id) {
        Transaction transactionById = (Transaction) transactionRepository;
        return transactionById;
    }

}
