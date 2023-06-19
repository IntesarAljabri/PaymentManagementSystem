package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Data
@Table(name = "Subscription")
public class UserSubscription extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "registerId")
    private UserRegistration userRegistration;

    @ManyToOne
    @JoinColumn(name = "subscriptionId")
    private UserSubscription usersubscription;
}
