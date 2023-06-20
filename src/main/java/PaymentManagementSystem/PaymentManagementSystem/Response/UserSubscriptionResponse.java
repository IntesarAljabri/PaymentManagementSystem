package PaymentManagementSystem.PaymentManagementSystem.Response;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserSubscription;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
@Builder
public class UserSubscriptionResponse {

    Long userId;
    Long planId;
    LocalDate startDate;
    LocalDate endDate;


    public static UserSubscriptionResponse covertUserSubscriptionToResponse(UserSubscription userSubscription) {
        return UserSubscriptionResponse.builder()
                .userId(userSubscription.getUserId())
                .planId(userSubscription.getPlanId())
                .startDate(userSubscription.getStartDate())
                .endDate(userSubscription.getEndDate())
                .build();
    }

}
