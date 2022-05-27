package casestudy.searchService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import casestudy.searchService.model.FlightSearchModel;
import casestudy.searchService.repo.SearchRepo;


@RestController
public class FlightSearchController {
	
	@Autowired
	public SearchRepo searchrepo;
	
	@GetMapping("/search/flights")
	public ResponseEntity<?> getAllFlights(){
		return ResponseEntity.ok(this.searchrepo.findAll());
	}
	
	@GetMapping("/search/flight/{origin}/{destination}")
    public List<FlightSearchModel> getFlightByOriginDest(@PathVariable String origin,@PathVariable String destination){
		 return searchrepo.findByorgdest(origin, destination) ; 
    }
	
	@GetMapping("/search/flight/{id}")
	public ResponseEntity<?> getflight(@PathVariable String id){
		return ResponseEntity.ok(this.searchrepo.findById(id));
	}
	
	@PostMapping("/search/flight")
	public ResponseEntity<?> addflight(@RequestBody FlightSearchModel flight){
		FlightSearchModel fly=this.searchrepo.save(flight);
		return ResponseEntity.ok(fly);
	}
}
