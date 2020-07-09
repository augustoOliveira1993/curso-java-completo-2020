package model.exceptions;

public class LimitedBalanceException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public LimitedBalanceException(String msg) {
		super(msg);
	}
}
