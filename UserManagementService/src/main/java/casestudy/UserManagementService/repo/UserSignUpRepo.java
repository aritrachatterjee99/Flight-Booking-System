package casestudy.UserManagementService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import casestudy.UserManagementService.model.UserSignUp;

@Repository
public interface UserSignUpRepo extends MongoRepository<UserSignUp, String> {

}
