package PaymentManagementSystem.PaymentManagementSystem.Controller;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserPaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment-history")
public class UserPaymentHistoryController {
    @Autowired
    UserPaymentHistoryService userPaymentHistoryService;

    @GetMapping(value = "getUserPaymentHistoryById")
    public UserPaymentHistory getUserPaymentHistoryById(@RequestParam Integer id) {
        UserPaymentHistory userPaymentHistoryById = (UserPaymentHistory) userPaymentHistoryService.getUserPaymentHistoryById(Long.valueOf(id));
        return userPaymentHistoryById;
    }

    private UserPaymentHistory convertToUserPaymentHistory(UserPaymentHistory userPaymentHistory) {
        UserPaymentHistory userPaymentHistory1 = new UserPaymentHistory();
        userPaymentHistory.setPaymentId(userPaymentHistory.getPaymentId());
        userPaymentHistory.setAmount(userPaymentHistory.getAmount());
        userPaymentHistory.setCurrency(userPaymentHistory.getCurrency());
        userPaymentHistory.setDate(userPaymentHistory.getDate());
        userPaymentHistory.setStatus(userPaymentHistory.getStatus());

        return userPaymentHistory;
    }

}
