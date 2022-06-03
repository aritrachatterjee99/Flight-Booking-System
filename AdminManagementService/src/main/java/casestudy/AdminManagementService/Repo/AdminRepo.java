package casestudy.AdminManagementService.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import casestudy.AdminManagementService.model.Flight;

public interface AdminRepo extends MongoRepository<Flight, String> {

}
