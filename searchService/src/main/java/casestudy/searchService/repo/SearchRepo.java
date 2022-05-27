package casestudy.searchService.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import casestudy.searchService.model.FlightSearchModel;

@Repository
public interface SearchRepo extends MongoRepository<FlightSearchModel, String> {
	 @Query("{ $and: [ { 'flight_origin' : ?0 }, { 'flight_destination' : ?0 } ] }")
	public List<FlightSearchModel> findByorgdest(String flight_origin, String flight_destination);


}
 