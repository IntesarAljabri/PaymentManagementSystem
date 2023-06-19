package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
public class UserPaymentHistory extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "registerId", referencedColumnName = "id") // FK
    Registration registration;

    @OneToOne
    @JoinColumn(name = "paymentId" , referencedColumnName = "id")
    PaymentMethod paymentMethod;

    @OneToOne
    @JoinColumn(name = "TransactionId" , referencedColumnName = "id")
    Transaction transaction;
    @OneToOne
    @JoinColumn(name = "paymentProcessId" , referencedColumnName = "id")
    PaymentProcess paymentProcess;

}