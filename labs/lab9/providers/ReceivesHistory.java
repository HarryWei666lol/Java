package lab9.providers;

import lab9.History;

/**
 * There are various destinations for a History:
 *    a console printout of progress
 *    a visualization
 * 
 * @author roncytron
 *
 */
public interface ReceivesHistory { // allows us to send a history which keeps track of the guesses
	public void sendHistory(History history);
}
