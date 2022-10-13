public class APIAdapter implements LMSApplication {

	private MessageCreator mesge;

	private MessageCreator messageCreator;

	@Override
	public String convrtMsgtoAPI(int mesge) {
		return "this is the message API";
	}
}
