package casestudy.BookingManagementService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "Bookdb")
public class User {
	@Id
	@NonNull
	private int booking_Id;
	private int user_Id;
	private String user_First_Name;
	private String user_Last_Name;
	private String user_Gender;
	private String user_Contact;
	private String date_of_Journey;
	private int no_of_Passanger;
	private int fare_paid;
	public User(int booking_Id, int user_Id, String user_First_Name, String user_Last_Name, String user_Gender,
			String user_Contact, String date_of_Journey, int no_of_Passanger, int fare_paid) {
		super();
		this.booking_Id = booking_Id;
		this.user_Id = user_Id;
		this.user_First_Name = user_First_Name;
		this.user_Last_Name = user_Last_Name;
		this.user_Gender = user_Gender;
		this.user_Contact = user_Contact;
		this.date_of_Journey = date_of_Journey;
		this.no_of_Passanger = no_of_Passanger;
		this.fare_paid = fare_paid;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBooking_Id() {
		return booking_Id;
	}
	public void setBooking_Id(int booking_Id) {
		this.booking_Id = booking_Id;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
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
	public int getNo_of_Passanger() {
		return no_of_Passanger;
	}
	public void setNo_of_Passanger(int no_of_Passanger) {
		this.no_of_Passanger = no_of_Passanger;
	}
	public int getFare_paid() {
		return fare_paid;
	}
	public void setFare_paid(int fare_paid) {
		this.fare_paid = fare_paid;
	}
	@Override
	public String toString() {
		return "User [booking_Id=" + booking_Id + ", user_Id=" + user_Id + ", user_First_Name=" + user_First_Name
				+ ", user_Last_Name=" + user_Last_Name + ", user_Gender=" + user_Gender + ", user_Contact="
				+ user_Contact + ", date_of_Journey=" + date_of_Journey + ", no_of_Passanger=" + no_of_Passanger
				+ ", fare_paid=" + fare_paid + "]";
	}
	
	
}
