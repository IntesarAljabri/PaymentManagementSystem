package PaymentManagementSystem.PaymentManagementSystem.Service;

import PaymentManagementSystem.PaymentManagementSystem.Model.UserSubscription;
import PaymentManagementSystem.PaymentManagementSystem.Repository.UserSubscriptionRepository;
import PaymentManagementSystem.PaymentManagementSystem.Request.UserSubscriptionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSubscriptionService {

    @Autowired
    UserSubscriptionRepository userSubscriptionRepository;

    public UserSubscription getUserSubscriptionById(Integer id) {
        return userSubscriptionRepository.getUserSubscriptionById(id);
    }
    public UserSubscription createUserSubscription(UserSubscriptionRequest userSubscriptionRequest) {
        // Map data from UserSubscriptionRequest to UserSubscription entity
        UserSubscription userSubscription = new UserSubscription();
        userSubscription.setUserId(userSubscriptionRequest.getUserId());
        userSubscription.setPlanId(userSubscriptionRequest.getPlanId());
        userSubscription.setStartDate(userSubscriptionRequest.getStartDate());
        userSubscription.setEndDate(userSubscriptionRequest.getEndDate());

        // Save the UserSubscription entity to the database
        UserSubscription savedUserSubscription = userSubscriptionRepository.save(userSubscription);
        return userSubscription;
    }

//    public UserSubscription cancelUserSubscription(String subscriptionId) {
//        UserSubscription userSubscription = userSubscriptionRepository.findById(Integer.valueOf(subscriptionId)).orElse(null);
//        if (userSubscription != null) {
//            userSubscription.setCancelled(true);
//            userSubscriptionRepository.save(userSubscription);
//        }
//    }
}