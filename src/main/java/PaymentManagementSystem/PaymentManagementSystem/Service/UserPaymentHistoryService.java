package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import PaymentManagementSystem.PaymentManagementSystem.Repository.UserPaymentHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserPaymentHistoryService {

    @Autowired
    static
    UserPaymentHistoryRepository userPaymentHistoryRepository;

    //************To get and set the user PaymentHistoryService********
    public UserPaymentHistoryService(UserPaymentHistoryRepository userPaymentHistoryRepository) {
        this.userPaymentHistoryRepository = userPaymentHistoryRepository;
    }

    //***********To get all User PaymentHistory by id*********
    public static List<UserPaymentHistory> getUserPaymentHistoryById(Long id) {
        return userPaymentHistoryRepository.findByUserId(id);
    }

    //********To lis all UserPaymentHistory***********
    public static List<UserPaymentHistory> getAllUserPaymentHistory() {
        // Code to retrieve and return the payment history from the service/repository
        return new ArrayList<>();
    }
}


