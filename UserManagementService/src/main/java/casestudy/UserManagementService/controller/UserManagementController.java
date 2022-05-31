package casestudy.UserManagementService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import casestudy.UserManagementService.model.Flight;
import casestudy.UserManagementService.model.UserSignUp;
import casestudy.UserManagementService.repo.UserRepo;
import casestudy.UserManagementService.repo.UserSignUpRepo;
import casestudy.UserManagementService.service.UserService;

@RequestMapping("/user")
@RestController
public class UserManagementController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private UserRepo userrepo;
	
	@Autowired
	private UserSignUpRepo signuprepo;
	
	@PostMapping("/signup")
	public ResponseEntity<?>addUser(@RequestBody UserSignUp signup){
		UserSignUp user=this.signuprepo.save(signup);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/allusers")
	public ResponseEntity<?>getAllUsers(){
		return ResponseEntity.ok(this.signuprepo.findAll());
	}
	
	@GetMapping("/getuser/{id}")
	public ResponseEntity<?>getUser(@PathVariable Integer id){
		return ResponseEntity.ok(this.signuprepo.findById(id));
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable Integer id){
		this.signuprepo.deleteById(id);
	}
	
	@PutMapping("/updateuser")
	public ResponseEntity<?>updateUser(@RequestBody UserSignUp signup){
		UserSignUp user=this.signuprepo.save(signup);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/getflights")
	public ResponseEntity<?>getAllFlight(){
		return ResponseEntity.ok(this.userrepo.findAll());
	}
	
	@GetMapping("/getflight/{id}")
	public ResponseEntity<?>getFlight(@PathVariable String id){
		return ResponseEntity.ok(this.userrepo.findById(id));
	}
	
	@GetMapping("/getflight/{flight_origin}/{flight_destination}")
	public List<Flight>getFlightBylocation(@PathVariable String flight_origin,@PathVariable String flight_destination ){
		return userservice.getFlightDetailsByOrgDest(flight_origin, flight_destination);
	}

}