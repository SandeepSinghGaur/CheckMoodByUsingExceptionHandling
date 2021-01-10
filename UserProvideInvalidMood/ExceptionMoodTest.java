package UserProvideInvalidMood;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExceptionMoodTest {

	@Test
	public void givenNullModeReturnHappy()
	{
		ExceptionMood moodanalyser=new ExceptionMood(null);
		String mood=moodanalyser.mood_analyser();
		assertEquals("Happy", mood);
	}

}
