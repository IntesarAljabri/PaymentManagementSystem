package PaymentManagementSystem.PaymentManagementSystem.Request;
import PaymentManagementSystem.PaymentManagementSystem.Model.UserSubscription;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Data
@Getter
@Setter
public class UserSubscriptionRequest {
    Long userId;
    Long planId;
    Date startDate;
    Date endDate;


    public UserSubscription covertUserSubscriptionToResponse(UserSubscription userSubscription) {
        Date nowDate = new Date();
        userSubscription.setUserId(this.getUserId());
        userSubscription.setPlanId(this.getPlanId());
        userSubscription.setStartDate(this.getStartDate());
        userSubscription.setEndDate(this.getEndDate());
        userSubscription.setCreateDate(nowDate);
        userSubscription.setIsActive(true);
        return userSubscription;
    }

}
