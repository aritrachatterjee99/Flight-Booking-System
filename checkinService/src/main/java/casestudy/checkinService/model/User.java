package casestudy.checkinService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "Bookdb")
public class User {
	@Id
	@NonNull
	private String booking_Id;
	private String flight_Id;
	private String user_First_Name;
	private String user_Last_Name;
	private String user_Gender;
	private String user_Contact;
	private String date_of_Journey;
	private String no_of_Passanger;
	
	public User() {
		super();
	}

	public User(String booking_Id, String flight_Id, String user_First_Name, String user_Last_Name, String user_Gender,
			String user_Contact, String date_of_Journey, String no_of_Passanger) {
		super();
		this.booking_Id = booking_Id;
		this.flight_Id = flight_Id;
		this.user_First_Name = user_First_Name;
		this.user_Last_Name = user_Last_Name;
		this.user_Gender = user_Gender;
		this.user_Contact = user_Contact;
		this.date_of_Journey = date_of_Journey;
		this.no_of_Passanger = no_of_Passanger;
	}

	public String getBooking_Id() {
		return booking_Id;
	}

	public void setBooking_Id(String booking_Id) {
		this.booking_Id = booking_Id;
	}

	public String getFlight_Id() {
		return flight_Id;
	}

	public void setFlight_Id(String flight_Id) {
		this.flight_Id = flight_Id;
	}

	public String getUser_First_Name() {
		return user_First_Name;
	}

	public void setUser_First_Name(String user_First_Name) {
		this.user_First_Name = user_First_Name;
	}

	public String getUser_Last_Name() {
		return user_Last_Name;
	}

	public void setUser_Last_Name(String user_Last_Name) {
		this.user_Last_Name = user_Last_Name;
	}

	public String getUser_Gender() {
		return user_Gender;
	}

	public void setUser_Gender(String user_Gender) {
		this.user_Gender = user_Gender;
	}

	public String getUser_Contact() {
		return user_Contact;
	}

	public void setUser_Contact(String user_Contact) {
		this.user_Contact = user_Contact;
	}

	public String getDate_of_Journey() {
		return date_of_Journey;
	}

	public void setDate_of_Journey(String date_of_Journey) {
		this.date_of_Journey = date_of_Journey;
	}

	public String getNo_of_Passanger() {
		return no_of_Passanger;
	}

	public void setNo_of_Passanger(String no_of_Passanger) {
		this.no_of_Passanger = no_of_Passanger;
	}

	@Override
	public String toString() {
		return "User [booking_Id=" + booking_Id + ", flight_Id=" + flight_Id + ", user_First_Name=" + user_First_Name
				+ ", user_Last_Name=" + user_Last_Name + ", user_Gender=" + user_Gender + ", user_Contact="
				+ user_Contact + ", date_of_Journey=" + date_of_Journey + ", no_of_Passanger=" + no_of_Passanger + "]";
	}
	
	
	
}
