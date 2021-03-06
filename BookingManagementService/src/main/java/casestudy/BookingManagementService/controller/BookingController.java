package casestudy.BookingManagementService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import casestudy.BookingManagementService.model.User;
import casestudy.BookingManagementService.repo.BookRepo;
import casestudy.BookingManagementService.service.BookingService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/book")
public class BookingController {
	
	@Autowired
	private BookRepo bookrepo;
	
	@Autowired
	private BookingService service;
	
	@PostMapping("/newbooking")
	public String addUser(@RequestBody User user) {
		return service.addBooking(user);
	}
	
	@GetMapping("/bookings")
	public ResponseEntity<?>getAllUsers(){
		return ResponseEntity.ok(this.bookrepo.findAll());
	}
	
	@GetMapping("/getbookingbyid/{id}")
	public ResponseEntity<?>getUser(@PathVariable String id){
		return ResponseEntity.ok(this.bookrepo.findById(id));
	}
	
	@DeleteMapping("/cancelbooking/{id}")
	public void deleteUser(@PathVariable String id){
		this.bookrepo.deleteById(id);
	}
	
	
}
