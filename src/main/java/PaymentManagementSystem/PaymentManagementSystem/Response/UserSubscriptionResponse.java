package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserSubscription;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserPaymentHistoryService;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@Builder
public class UserSubscriptionResponse {

    Long userId;
    Long planId;
    Date startDate;
    Date endDate;

    public UserSubscriptionResponse() {
        this.userId=null;
        this.planId=null;
        this.startDate=null;
        this.endDate=null;
    }


    @GetMapping("/api/payment-history")
    public ResponseEntity<UserPaymentHistoryResponse> getUserPaymentHistory(@RequestParam("userId") Long userId) {
        // Retrieve payment history for the given user ID
        List<UserPaymentHistory> paymentHistory = UserPaymentHistoryService.getUserPaymentHistoryById(userId);

        // Create the Payment objects and populate them with data from the payment history
        List<UserPaymentHistory> paymentList = new ArrayList<>();
        for (UserPaymentHistory payment : paymentHistory) {
            UserPaymentHistory paymentObj = new UserPaymentHistory();
            paymentObj.setPaymentId(payment.getPaymentId());
            paymentObj.setAmount(payment.getAmount());
            paymentObj.setCurrency(payment.getCurrency());
            paymentObj.setDate(payment.getDate());
            paymentObj.setStatus(payment.getStatus());
            paymentList.add(paymentObj);
        }
        return (ResponseEntity<UserPaymentHistoryResponse>) paymentList;
    }
}



