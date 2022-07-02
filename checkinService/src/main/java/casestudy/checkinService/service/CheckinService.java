package casestudy.checkinService.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import casestudy.checkinService.exception.BookingNotFoundException;
import casestudy.checkinService.model.Checkin;
import casestudy.checkinService.model.User;
import casestudy.checkinService.repo.CheckinRepo;

@Service
public class CheckinService {
	@Autowired
	CheckinRepo checkinRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	public static String seatNumber() {
		Random r=new Random();
		int min=1;
		int max=30;
		Integer randomnum=r.nextInt(max-min)+min;
		String row=randomnum.toString();
		String[] arr= {"A","B","C","D","E","F"};
		int ran=r.nextInt(arr.length);
		String col=arr[ran];
		String seat=row+col;
		return seat;
	}
	
	public List<Checkin> getCheckin(String id){	
		
			User user=restTemplate.getForObject("http://localhost:4003/book/getbookingbyid/"+id, User.class);
			
			if(user==null) {
				throw new BookingNotFoundException("Booking Id not found"+id);
			}
			else {
			String booking_Id=user.getBooking_Id();
			String SeatNo=seatNumber();
			Checkin checkin=new Checkin(booking_Id, SeatNo);
			List<Checkin> list=Arrays.asList(checkin);
			checkinRepo.save(checkin);
			return list;
			}
		 
	}

}
