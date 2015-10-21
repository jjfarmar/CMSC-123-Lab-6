public class BadTransactionException extends Exception{

	public int transactionAmount;

	public BadTransactionException(int badTransAmt){
		super("Invalid Amount: " + badTransAmt);

		transactionAmount = badTransAmt;
	}

}