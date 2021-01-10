package MoodAnalyserProblem1;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class AnalyseMoodTest {

	@Test
	public void checkMood() {
		Scanner sc = new Scanner(System.in);
		String insert_mood = sc.nextLine();
		AnalyseMoodFile testobj = new AnalyseMoodFile();
		String result = testobj.analysmood(insert_mood);
		assertEquals("I am in Happy Mood", result);
		sc.close();
	}

}
