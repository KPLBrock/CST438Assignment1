import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class QuestionsAnswersTest extends TestCase  {

	@Test
	public void test() {
		String testQuestion = "Which is bigger, a dog or a cat?";
		String testAnswer = "Dog.";
		QuestionsAnswers testGame = new QuestionsAnswers();
		testGame.put(testQuestion, testAnswer);
		assertEquals(testQuestion, testGame.getRandomQuestion());
		assertTrue(testGame.testAnswer(testQuestion, testAnswer));
		
	}

}
