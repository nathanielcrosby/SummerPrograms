
public class Main {
	public static boolean playerTurn = true;
	public static boolean playerWon = false;
	public static boolean computerWon = false;
	public static boolean playing = true;
	static long resetWaitTime = 2000; //ms

	public static TicTacToe board = new TicTacToe();

	public static void main(String[] args) {
		while (playing) {
			if (board.isVisible() == false) {
				board.setVisible(true);
			}
		}
	}

	public static void checkforwin() {
		if ((board.buttons[0].getText().equals("X") && board.buttons[3].getText().equals("X")
				&& board.buttons[6].getText().equals("X"))
				|| (board.buttons[0].getText().equals("X") && board.buttons[1].getText().equals("X")
						&& board.buttons[2].getText().equals("X"))
				|| (board.buttons[0].getText().equals("X") && board.buttons[4].getText().equals("X")
						&& board.buttons[8].getText().equals("X"))
				|| (board.buttons[1].getText().equals("X") && board.buttons[4].getText().equals("X")
						&& board.buttons[7].getText().equals("X"))
				|| (board.buttons[2].getText().equals("X") && board.buttons[5].getText().equals("X")
						&& board.buttons[8].getText().equals("X"))
				|| (board.buttons[3].getText().equals("X") && board.buttons[4].getText().equals("X")
						&& board.buttons[5].getText().equals("X"))
				|| (board.buttons[6].getText().equals("X") && board.buttons[7].getText().equals("X")
						&& board.buttons[8].getText().equals("X"))
				|| (board.buttons[2].getText().equals("X") && board.buttons[4].getText().equals("X")
						&& board.buttons[6].getText().equals("X"))) {
			playerWon = true;
			computerWon = false;
			System.out.println("Player Wins!!!");
			board.setLabelText("Player Wins!!!");
		}

		if ((board.buttons[0].getText().equals("O") && board.buttons[3].getText().equals("O")
				&& board.buttons[6].getText().equals("O"))
				|| (board.buttons[0].getText().equals("O") && board.buttons[1].getText().equals("O")
						&& board.buttons[2].getText().equals("O"))
				|| (board.buttons[0].getText().equals("O") && board.buttons[4].getText().equals("O")
						&& board.buttons[8].getText().equals("O"))
				|| (board.buttons[1].getText().equals("O") && board.buttons[4].getText().equals("O")
						&& board.buttons[7].getText().equals("O"))
				|| (board.buttons[2].getText().equals("O") && board.buttons[5].getText().equals("O")
						&& board.buttons[8].getText().equals("O"))
				|| (board.buttons[3].getText().equals("O") && board.buttons[4].getText().equals("O")
						&& board.buttons[5].getText().equals("O"))
				|| (board.buttons[6].getText().equals("O") && board.buttons[7].getText().equals("O")
						&& board.buttons[8].getText().equals("O"))
				|| (board.buttons[2].getText().equals("O") && board.buttons[4].getText().equals("O")
						&& board.buttons[6].getText().equals("O"))) {
			playerWon = false;
			computerWon = true;
			System.out.println("Computer Wins!!!");
			board.setLabelText("Computer Wins!!!");
		}

		if (playerWon == true || computerWon == true) {
		/*	if (playerWon) {
				board.setLabelText("Player Won!");
			} else {
				board.setLabelText("Computer Won!");
			}
			long a = System.currentTimeMillis();
			long b = System.currentTimeMillis();
			while((b-a) <= resetWaitTime) {
				b = System.currentTimeMillis();
			}*/
			//board.reset();
			playerWon = false;
			computerWon = false;
			playerTurn = true;
		}
	}

}
