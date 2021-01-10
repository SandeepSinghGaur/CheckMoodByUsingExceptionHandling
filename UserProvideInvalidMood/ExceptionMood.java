package UserProvideInvalidMood;

public class ExceptionMood {
	public String message;

	public ExceptionMood(String message) {
		this.message = message;
	}

	public String mood_analyser(String message) {
		this.message = message;
		return mood_analyser();
	}

	public String mood_analyser() {
		try {
			if (message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
		} catch (Exception e) {
			return "Happy";
		}
	}

}
