package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserTransaction;
import PaymentManagementSystem.PaymentManagementSystem.Repository.UserTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTransactionService {
    @Autowired
    UserTransactionRepository usertransactionRepository;

    //***********To get All UserTransaction
    public static List<UserTransaction> getAllUserTransaction() {
        return getAllUserTransaction();
    }

    //***********To get UserTransaction by id**********
    public UserTransaction getUserTransactionById(Integer id) {
        UserTransaction transactionById = (UserTransaction) usertransactionRepository;
        return transactionById;
    }

}
