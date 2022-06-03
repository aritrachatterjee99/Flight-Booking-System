package casestudy.BookingManagementService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import casestudy.BookingManagementService.model.User;
import casestudy.BookingManagementService.repo.BookRepo;



@Service
public class BookingService {
	@Autowired
	private BookRepo bookrepo;
	public String addBooking(User user) {
		bookrepo.save(user);
		return ("Ticket booked successfully.Booking ID is:"+user.getBooking_Id());
	}
}
