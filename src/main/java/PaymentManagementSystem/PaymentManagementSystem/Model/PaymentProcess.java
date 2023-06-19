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
@Table(name = "PaymentProcess")
public class PaymentProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer paymentId;
    Long amount;
    String currency;
    PaymentMethod paymentMethod;
    Long cardNumber;
    Date expriationDate;
}
