package assignment2;

@SuppressWarnings("serial")
public class IncorrectPasswordException extends RuntimeException {

	
	public IncorrectPasswordException() {
		super();
	}

	public IncorrectPasswordException(String message) {
		super(message);
	}

}
