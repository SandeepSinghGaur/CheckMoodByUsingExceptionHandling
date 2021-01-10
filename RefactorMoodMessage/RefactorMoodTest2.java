package RefactorMoodMessage;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class RefactorMoodTest2 {
	@Test
	// when i am inserting : I am in Sad Mood our Parametric constructor give Happy result.
	public void check_mood_return_happy11() {
		Scanner sc = new Scanner(System.in);
		String insert_mood = sc.nextLine();
		RefactorMoodFile testobj = new RefactorMoodFile(insert_mood);
		String result = testobj.analysmood(insert_mood);
		assertEquals("Happy", result);
	     sc.close();
	}
	@Test
	// and Default Constructor also give Happy result.
	public void check_mood_return_happy12() {
		RefactorMoodFile testobj = new RefactorMoodFile();
		String result = testobj.analysmood();
		assertEquals("Happy", result);
	}

}
