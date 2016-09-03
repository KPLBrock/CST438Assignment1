		/**
			*	A	half-secretive	map	of	questions	to	answers	(at	most	one	answer	per	question).
			*	Gives	out	random	questions	(keys)	from	the	map,	and
			*	can	be	queried	to	test	if	a	given	question	maps	to	a	given	answer.
			*/
import java.util.*;

		public	class	QuestionsAnswers	{
				/***	Maps	question	to	answer.*/
			    HashMap<String,String> questionMap = new HashMap<String, String>();
			    
				void	put(String	question,	String	answer)	
				{
					questionMap.put(question, answer);
				}
				/***	Queries	if	question	maps	to	answer.*/
				boolean	testAnswer(String	question,	String	answer)	
				{
					return answer.equals(questionMap.get(question));
				}
				/***	Gives	out	a	random	question	from	the	key	set.*/
				String	getRandomQuestion()	
				{
					Random       random    = new Random();
					List<String> keys      = new ArrayList<String>(questionMap.keySet());
					String       randomKey = keys.get( random.nextInt(keys.size()) );
					return randomKey;
				}
		}