package casestudy.BookingManagementService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import casestudy.BookingManagementService.model.User;

@Repository
public interface BookRepo extends MongoRepository<User, Integer> {

}
