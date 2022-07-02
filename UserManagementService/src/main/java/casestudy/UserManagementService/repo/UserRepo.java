package casestudy.UserManagementService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import casestudy.UserManagementService.model.Flight;

@Repository
public interface UserRepo extends MongoRepository<Flight, String> {

}
