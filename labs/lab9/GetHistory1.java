package lab9;

import lab9.implementations.HonestFeedback;
import lab9.providers.ProvidesColor;
import lab9.providers.ProvidesFeedback;
import lab9.providers.ProvidesGuess;
import lab9.providers.ReceivesHistory;
import sedgewick.StdDraw;

public class GetHistory1 implements ReceivesHistory {

	private GameProperties gp;
	private ProvidesGuess pg;
	private ProvidesGuess codeBreaker;
	private ProvidesColor pc;
	private double count = 0;

	public GetHistory1(GameProperties gp, ProvidesGuess pg, ProvidesGuess codeBreaker, ProvidesColor pc) {
		this.gp = gp;
		this.pg = pg;
		this.codeBreaker = codeBreaker;
		this.pc = pc;
	}
	@Override
	public void sendHistory(History history) {
		// TODO Auto-generated method stub
		Guess mostRecent = history.getHistoryAt(history.size()-1);
		System.out.println("The most recent move: " + mostRecent);
		ProvidesFeedback pf = new HonestFeedback(mostRecent);

		double rowco = 0.95 - count*0.075;
		
		StdDraw.setPenColor(pc.getColorForPeg(mostRecent.getA()[0]));
		StdDraw.filledCircle(0.04, rowco, 0.015);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(0.65, 0.95 - this.count * 0.075, "match: " + pf.numSamePosition(pg.getGuess()) + " same colors: " + pf.numIntersection(pg.getGuess()));

		StdDraw.setPenColor(pc.getColorForPeg(mostRecent.getA()[1]));
		StdDraw.filledCircle(0.16, rowco, 0.015);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(0.65, 0.95 - this.count * 0.075, "match: " + pf.numSamePosition(pg.getGuess()) + " same colors: " + pf.numIntersection(pg.getGuess()));

		StdDraw.setPenColor(pc.getColorForPeg(mostRecent.getA()[2]));
		StdDraw.filledCircle(0.28, rowco, 0.015);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(0.65, 0.95 - this.count * 0.075, "match: " + pf.numSamePosition(pg.getGuess()) + " same colors: " + pf.numIntersection(pg.getGuess()));

		StdDraw.setPenColor(pc.getColorForPeg(mostRecent.getA()[3]));
		StdDraw.filledCircle(0.4, rowco, 0.015);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(0.65, 0.95 - this.count * 0.075, "match: " + pf.numSamePosition(pg.getGuess()) + " same colors: " + pf.numIntersection(pg.getGuess()));
		
		this.count = this.count +1;
	}


}
