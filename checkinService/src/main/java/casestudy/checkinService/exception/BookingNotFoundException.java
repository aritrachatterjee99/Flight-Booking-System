package casestudy.checkinService.exception;

public class BookingNotFoundException extends NullPointerException {
	private static final long serialVersionUID = 1L;

	public BookingNotFoundException(String message) {
		super(message);
	}

}
