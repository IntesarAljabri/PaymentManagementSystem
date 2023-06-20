package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Data
@Table(name = "User_Subscription")
public class UserSubscription extends BaseEntity{

    Long userId;
    Long planId;
    LocalDate startDate;
    LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "registerId")
    private UserRegistration userRegistration;

    @ManyToOne
    @JoinColumn(name = "subscriptionId")
    private UserSubscription usersubscription;

}
