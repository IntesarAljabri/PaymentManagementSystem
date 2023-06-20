package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserPaymentHistory;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserSubscription;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


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
         List<UserPaymentHistory> payments;
    }

    public static UserSubscriptionResponse convertUserSubscriptionToResponse(UserSubscription userSubscription) {
        UserSubscriptionResponse response = new UserSubscriptionResponse();
        response.setUserId(userSubscription.getUserId());
        response.setPlanId(userSubscription.getPlanId());
        response.setStartDate(userSubscription.getStartDate());
        response.setEndDate(userSubscription.getEndDate());
        return response;
    }

}
