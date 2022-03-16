package testjava;

public class NotEligibleException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public NotEligibleException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
