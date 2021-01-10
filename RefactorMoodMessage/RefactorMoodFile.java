package RefactorMoodMessage;

import java.util.Scanner;

public class RefactorMoodFile {

	public String message;

	public RefactorMoodFile() {
		this.message="I am in Happy Mood";
		analysmood();
	}

	public RefactorMoodFile(String str) {
		this.message = str;
		analysmood(message);

	}
	

	public String analysmood(String message) {

		if (message.contains("I am in Sad Mood")) {
			return "Happy";
		} else {
			return "Sad";
		}
	}

	public  String analysmood() {
		if (message.contains("I am in Happy Mood")) {
			return "Happy";
		} else {
			return "Sad";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		new RefactorMoodFile();
		new RefactorMoodFile(name);
		sc.close();
	}
}
