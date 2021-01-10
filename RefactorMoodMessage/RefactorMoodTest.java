package RefactorMoodMessage;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class RefactorMoodTest {
	// in this case we are inserting : I am Happy Mood.
	// Parametric Constructor give Sad result
	@Test
	public void check_mood_return_happy11() {
		Scanner sc = new Scanner(System.in);
		String insert_mood = sc.nextLine();
		RefactorMoodFile testobj = new RefactorMoodFile(insert_mood);
		String result = testobj.analysmood(insert_mood);
		assertEquals("Sad", result);
		sc.close();
	}

	// Default Constructor give Happy result
	@Test
	public void check_mood_return_happy12() {
		RefactorMoodFile testobj = new RefactorMoodFile();
		String result = testobj.analysmood();
		assertEquals("Happy", result);
	}

}
