package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


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

    public static UserPaymentHistoryResponse convertToUserPaymentHistoryResponse(UserPaymentHistory userPaymentHistory) {
        return UserPaymentHistoryResponse.builder()
                .paymentId(userPaymentHistory.getPaymentId())
                .amount(userPaymentHistory.getAmount())
                .currency(userPaymentHistory.getCurrency())
                .date(userPaymentHistory.getDate())
                .status(userPaymentHistory.getStatus())
                .build();
    }
//    UserSubscriptionResponse response = new UserSubscriptionResponse();
//
//    UserPaymentHistory payment1 = new UserPaymentHistory();
//         payment1.setPaymentId("111222333");
//         payment1.setAmount(50.25);
//         payment1.setCurrency("USD");
//         payment1.setDate("2023-06-10");
//         payment1.setStatus("captured");
//
//    UserPaymentHistory payment2 = new UserPaymentHistory();
//         payment2.setPaymentId("444555666");
//         payment2.setAmount(75.75);
//         payment2.setCurrency("USD");
//         payment2.setDate("2023-06-12");
//         payment2.setStatus("refunded");
//
//   response.setUserPaymentHistory(Arrays.asList(payment1, payment2));
//
//     // Convert the response object to a JSON string
//     Gson gson = new Gson();
//     String jsonResponse = gson.toJson(response);
//
//     System.out.println(jsonResponse);
}

