package PaymentManagementSystem.PaymentManagementSystem.Model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    Date createDate;
    Date updateDate;
    Boolean isActive;

}
