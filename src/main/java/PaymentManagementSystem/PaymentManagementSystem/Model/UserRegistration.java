package PaymentManagementSystem.PaymentManagementSystem.Model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
@Table(name = "user_registration")
public class UserRegistration extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer Id;
    String userName;
    String password;
    String email;

}
