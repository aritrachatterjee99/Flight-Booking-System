package casestudy.checkinService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Checkindb")
public class Checkin {
	@Id
	private String booking_Id;
	private String SeatNo;
	
	public Checkin() {
		super();
	}

	public Checkin(String booking_Id, String seatNo) {
		super();
		this.booking_Id = booking_Id;
		this.SeatNo = seatNo;
	}

	public String getBooking_Id() {
		return booking_Id;
	}

	public void setBooking_Id(String booking_Id) {
		this.booking_Id = booking_Id;
	}

	public String getSeatNo() {
		return SeatNo;
	}

	public void setSeatNo(String seatNo) {
		SeatNo = seatNo;
	}

	@Override
	public String toString() {
		return "Checkin [booking_Id=" + booking_Id + ", SeatNo=" + SeatNo + "]";
	}
	


	
}
