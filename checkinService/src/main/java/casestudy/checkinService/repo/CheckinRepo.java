package casestudy.checkinService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import casestudy.checkinService.model.Checkin;

@Repository
public interface CheckinRepo extends MongoRepository<Checkin, String> {

}
