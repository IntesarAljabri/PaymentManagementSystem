package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import PaymentManagementSystem.PaymentManagementSystem.Repository.UserPaymentHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPaymentHistoryService {

    @Autowired
    static
    UserPaymentHistoryRepository userPaymentHistoryRepository;

    public UserPaymentHistoryService(UserPaymentHistoryRepository userPaymentHistoryRepository) {
        this.userPaymentHistoryRepository = userPaymentHistoryRepository;
    }

    public static List<UserPaymentHistory> getUserPaymentHistoryById(Long id) {
        return userPaymentHistoryRepository.findByUserId(id);
    }


}
