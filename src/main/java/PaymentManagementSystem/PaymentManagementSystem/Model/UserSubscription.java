package PaymentManagementSystem.PaymentManagementSystem.Model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Data
@Table(name = "User_Subscription")
public class UserSubscription extends UserPaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    Long userId;
    Long planId;
    Date startDate;
    Date endDate;

    @ManyToOne
    @JoinColumn(name = "registerId")
    private UserRegistration userRegistration;

    @ManyToOne
    @JoinColumn(name = "subscriptionId")
    private UserSubscription usersubscription;

}
