package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@Data
@Table(name = "PaymentProcess")
public class UserPaymentProcess extends UserPaymentMethod{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer paymentId;

    @JoinColumn(name = "registerId", referencedColumnName = "id") // FK
    Registration registration;
}
