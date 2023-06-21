package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserSubscription;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserTransaction;
import PaymentManagementSystem.PaymentManagementSystem.Service.UserPaymentHistoryService;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
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


    public static UserSubscriptionResponse covertUserSubscriptionToResponse(UserSubscription userSubscription) {
        return UserSubscriptionResponse.builder()
                .userId(userSubscription.getUserId())
                .planId(userSubscription.getPlanId())
                .startDate(userSubscription.getStartDate())
                .endDate(userSubscription.getEndDate())
                .build();
    }

}



