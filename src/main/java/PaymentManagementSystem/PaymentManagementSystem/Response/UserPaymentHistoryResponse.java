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
public class UserPaymentHistoryResponse {

    private Long id;
    String paymentId;
    Long amount;
    String currency;
    Date date;
    String status;


//    public UserSubscriptionResponse convertUserSubscriptionToResponse(UserSubscription userSubscription) {
//        UserSubscriptionResponse response = new UserSubscriptionResponse();
//        response.setUserId(userSubscription.getUserId());
//        response.setPlanId(userSubscription.getPlanId());
//        response.setStartDate(userSubscription.getStartDate());
//        response.setEndDate(userSubscription.getEndDate());
//        return response;
//    }

    public UserPaymentHistoryResponse convertToUserPaymentHistoryResponse(UserPaymentHistory userPaymentHistory) {
        return UserPaymentHistoryResponse.builder()
                .paymentId(userPaymentHistory.getPaymentId())
                .amount(userPaymentHistory.getAmount())
                .currency(userPaymentHistory.getCurrency())
                .date(userPaymentHistory.getDate())
                .status(userPaymentHistory.getStatus())
                .build();
    }

    @GetMapping("/api/payment-history")
    public ResponseEntity<UserPaymentHistoryResponse> getUserPaymentHistory(@RequestParam("userId") Long userId) {
        // Retrieve payment history for the given user ID
        List<UserPaymentHistory> paymentHistory = UserPaymentHistoryService.getUserPaymentHistoryById(userId);

        // Create the Payment objects and populate them with data
        UserPaymentHistory payment1 = new UserPaymentHistory();
        payment1.setPaymentId("111222333");
        payment1.setAmount((long) 50.25);
        payment1.setCurrency("USD");
        payment1.setDate(getDate());
        payment1.setStatus("captured");

        UserPaymentHistory payment2 = new UserPaymentHistory();
        payment2.setPaymentId("444555666");
        payment2.setAmount((long) 75.75);
        payment2.setCurrency("USD");
        payment2.setDate(getDate());
        payment2.setStatus("refunded");

        // Add the Payment objects to the list
        List<UserPaymentHistory> payments = new ArrayList<>();
        payments.add(payment1);
        payments.add(payment2);

        return (ResponseEntity<UserPaymentHistoryResponse>) paymentHistory;
    }

}



