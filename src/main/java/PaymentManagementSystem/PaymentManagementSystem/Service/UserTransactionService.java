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

    public static List<UserTransaction> getAllUserTransaction() {
        return getAllUserTransaction();
    }

    public UserTransaction getUserTransactionById(Integer id) {
        UserTransaction usertransactionById = (UserTransaction) usertransactionRepository;
        return usertransactionById;
    }

}
