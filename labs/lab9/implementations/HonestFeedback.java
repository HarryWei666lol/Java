package lab9.implementations;

import java.util.HashSet;
import java.util.Set;

import lab9.Guess;
import lab9.providers.ProvidesFeedback;

/**
 * Correctly responds to a given Guess
 * 
 * @author roncytron
 *
 */
public class HonestFeedback implements ProvidesFeedback {
	
	private final Guess code;
	
	/** 
	 * Capture the code that will be compared with Guesses
	 * @param code
	 */
	public HonestFeedback(Guess code) {
		this.code = code;
	}

	/**
	 * For the supplied Guess, how many peg ids occur in the correct position
	 *   with respect to the desired goal?
	 * For example, if the goal is 0 2 3 1
	 *            and the guess is 0 1 3 4
	 * then the result is 2, because the pegs with ids 0 and 3 are in exactly the
	 * right position.
	 * @param guess the Guess to be judged with respect to the goal
	 * @return the number of peg ids in the correct position
	 */

	@Override
	public int numSamePosition(Guess other) {
		int count = 0;
		for (int i = 0; i < this.code.getA().length; i++) { // because a is defined as private in the previous class, 
			                                                  //we need to use this.code.getA().length to get a here
			if (this.code.getA()[i] == other.getA()[i]) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Given the supplied Guess, how many peg ids are in common with the desired
	 *    goal and the guess?
	 *    
	 * For example, if the goal is 0 2 3 1
	 *            and the guess is 0 1 3 4
	 * then the result is 3 because peg ids 0, 1, and 3 occur in both the goal and
	 * the guess.
	 * @param guess the Guess to be judged with respect to the goal
	 * @return the number of peg ids in common with the goal and the guess
	 */

	@Override
	public int numIntersection(Guess other) { // use sets because set can keep track of 
		                                          //what is in one set and what is in another set
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i : this.code.getA()) {
			set1.add(i);
		}
		for(int i : other.getA()) {
			set2.add(i);
		}
		set1.retainAll(set2); // keep the common terms in both set1 and set2 into the original set1
		                         //intersection of 2 sets
		return set1.size(); // set1.size gets how large the new set1 is
	}
	
	/**
	 * Is the solution correct?   This can be reduced from numSamePosition(guess)
	 *   returning an answer showing all pegs of the Guess are in the correct
	 *   position.
	 * @param guess the supplied Guess to be judged
	 * @return true if the guess is completely correct
	 */

	public boolean isSolution(Guess other) {
		return this.code.getA().length == this.numSamePosition(other);
	}

}
