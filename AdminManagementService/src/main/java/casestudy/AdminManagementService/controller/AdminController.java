package casestudy.AdminManagementService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import casestudy.AdminManagementService.model.Flight;
import casestudy.AdminManagementService.repo.AdminRepo;

@RequestMapping("/admin")
@RestController
@CrossOrigin("http://localhost:3000")
public class AdminController {
	@Autowired
	public AdminRepo adminrepo;
	
	@GetMapping("/getflights")
	public ResponseEntity<?>getAllFlight(){
		return ResponseEntity.ok(this.adminrepo.findAll());
	}
	
	@GetMapping("/getflight/{id}")
	public ResponseEntity<?>getFlight(@PathVariable String id){
		return ResponseEntity.ok(this.adminrepo.findById(id));
	}
	
	@PostMapping("/addflight")
	public ResponseEntity<?>addFlight(@RequestBody Flight flight){
		Flight fly=this.adminrepo.save(flight);
		return ResponseEntity.ok(fly);
	}
	
	@DeleteMapping("/deleteflight/{id}")
	public void deleteFlight(@PathVariable String id) {
		this.adminrepo.deleteById(id);
	}
	
	@PutMapping("/updateflight")
	public ResponseEntity<?>updateFlight(@RequestBody Flight flight){
		Flight fly=this.adminrepo.save(flight);
		return ResponseEntity.ok(fly);
	}
}
