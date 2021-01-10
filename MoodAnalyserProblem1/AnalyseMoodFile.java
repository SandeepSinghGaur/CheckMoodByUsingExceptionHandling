package MoodAnalyserProblem1;

import java.util.Scanner;

public class AnalyseMoodFile {

	public String analysmood(String message) {
		if (message.contains("Sad")) {
			System.out.println("I am in Sad Mood");
			return "I am in Sad Mood";
		} else {
			System.out.println("I am in Happy Mood");
			return "I am in Happy Mood";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		AnalyseMoodFile obj1 = new AnalyseMoodFile();
		obj1.analysmood(name);
		sc.close();
	}
}
