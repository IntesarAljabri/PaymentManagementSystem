package PaymentManagementSystem.PaymentManagementSystem.Controller;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserPaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/payment-history")
public class UserPaymentHistoryController {
    @Autowired
    UserPaymentHistoryService userPaymentHistoryService;

    //***********To get UserPaymentHistoryService by id**************
    @GetMapping(value = "getUserPaymentHistoryById")
    public UserPaymentHistory getUserPaymentHistoryById(@RequestParam Integer id) {
        UserPaymentHistory userPaymentHistoryById = (UserPaymentHistory) userPaymentHistoryService.getUserPaymentHistoryById(Long.valueOf(id));
        return userPaymentHistoryById;
    }

    //*********TO get all UserPaymentHistory***********
    @RequestMapping(value = "getAllUserPaymentHistory", method = RequestMethod.GET)
    public List<UserPaymentHistory> getAllUserPaymentHistory() {
        return UserPaymentHistoryService.getAllUserPaymentHistory();
    }

    //***************To convert all data TO UserPaymentHistory*******
    private UserPaymentHistory convertToUserPaymentHistory(UserPaymentHistory userPaymentHistory) {
        UserPaymentHistory userPaymentHistory1 = new UserPaymentHistory();
        userPaymentHistory.setPaymentId(userPaymentHistory.getPaymentId());
        userPaymentHistory.setAmount(userPaymentHistory.getAmount());
        userPaymentHistory.setCurrency(userPaymentHistory.getCurrency());
        userPaymentHistory.setDate(userPaymentHistory.getDate());
        userPaymentHistory.setStatus(userPaymentHistory.getStatus());

        return userPaymentHistory;
    }

//    @GetMapping("/api/payment-history")
//    public ResponseEntity<UserPaymentHistoryResponse> getUserPaymentHistory(@RequestParam("userId") Long userId) {
//        List<UserPaymentHistory> paymentHistory = UserPaymentHistoryService.getUserPaymentHistoryById(userId);
//        UserPaymentHistoryResponse paymentHistoryResponse = new UserPaymentHistoryResponse();
//        paymentHistoryResponse.setPayments(paymentHistory);
//        return ResponseEntity.ok(paymentHistoryResponse);
//    }
}

