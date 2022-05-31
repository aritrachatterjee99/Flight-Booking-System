package casestudy.BookingManagementService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collation = "Flightdb")
public class Flight {
	@Id
	@NonNull
	private String flight_id;
	private String flight_company;
	private String flight_origin;
	private String flight_destination;
	private String flight_departure;
	private String flight_arrival;
	private int flight_duration;
	
	public Flight(String flight_id, String flight_company, String flight_origin, String flight_destination,
			String flight_departure, String flight_arrival, int flight_duration) {
		super();
		this.flight_id = flight_id;
		this.flight_company = flight_company;
		this.flight_origin = flight_origin;
		this.flight_destination = flight_destination;
		this.flight_departure = flight_departure;
		this.flight_arrival = flight_arrival;
		this.flight_duration = flight_duration;	
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_company() {
		return flight_company;
	}

	public void setFlight_company(String flight_company) {
		this.flight_company = flight_company;
	}

	public String getFlight_origin() {
		return flight_origin;
	}

	public void setFlight_origin(String flight_origin) {
		this.flight_origin = flight_origin;
	}

	public String getFlight_destination() {
		return flight_destination;
	}

	public void setFlight_destination(String flight_destination) {
		this.flight_destination = flight_destination;
	}

	public String getFlight_departure() {
		return flight_departure;
	}

	public void setFlight_departure(String flight_departure) {
		this.flight_departure = flight_departure;
	}

	public String getFlight_arrival() {
		return flight_arrival;
	}

	public void setFlight_arrival(String flight_arrival) {
		this.flight_arrival = flight_arrival;
	}

	public int getFlight_duration() {
		return flight_duration;
	}

	public void setFlight_duration(int flight_duration) {
		this.flight_duration = flight_duration;
	}

	@Override
	public String toString() {
		return "Flight [flight_id=" + flight_id + ", flight_company=" + flight_company + ", flight_origin="
				+ flight_origin + ", flight_destination=" + flight_destination + ", flight_departure="
				+ flight_departure + ", flight_arrival=" + flight_arrival + ", flight_duration=" + flight_duration
				+ "]";
	}
	
	
	

}
