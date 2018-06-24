
public class Computer {
	boolean[] x = new boolean[9];
	boolean[] o = new boolean[9];
	boolean[] open = new boolean[9];

	public Computer() {

	}

	public void takeTurn() {
		for (int i = 0; i < 9; i++) {
			x[i] = false;
			o[i] = false;
			open[i] = false;
		}

		for (int i = 0; i < 9; i++) {
			if (Main.board.buttons[i].getText().equals("X")) {
				x[i] = true;
			} else if (Main.board.buttons[i].getText().equals("O")) {
				o[i] = true;
			} else {
				open[i] = true;
			}
		}

		if (o[0] && o[1] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if (o[1] && o[2] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (o[0] && o[2] && open[1]) {
			Main.board.buttons[1].setText("O");
		} else if (o[1] && o[2] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (o[0] && o[3] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if (o[0] && o[6] && open[3]) {
			Main.board.buttons[3].setText("O");
		} else if (o[6] && o[3] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (o[3] && o[4] && open[5]) {
			Main.board.buttons[5].setText("O");
		} else if (o[3] && o[5] && open[4]) {
			Main.board.buttons[4].setText("O");
		} else if (o[5] && o[4] && open[3]) {
			Main.board.buttons[3].setText("O");
		} else if (o[6] && o[7] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if (o[6] && o[8] && open[7]) {
			Main.board.buttons[7].setText("O");
		} else if (o[7] && o[8] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if (o[1] && o[4] && open[7]) {
			Main.board.buttons[7].setText("O");
		} else if (o[1] && o[7] && open[4]) {
			Main.board.buttons[4].setText("O");
		} else if (o[4] && o[7] && open[1]) {
			Main.board.buttons[1].setText("O");
		} else if (o[2] && o[5] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if (o[2] && o[8] && open[5]) {
			Main.board.buttons[5].setText("O");
		} else if (o[5] && o[8] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if (o[0] && o[4] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if (o[0] && o[8] && open[4]) {
			Main.board.buttons[4].setText("O");
		} else if (o[4] && o[8] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (o[2] && o[4] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if (o[2] && o[6] && open[4]) {
			Main.board.buttons[4].setText("O");
		} else if (o[4] && o[6] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if (x[0] && x[1] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if (x[1] && x[2] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (x[0] && x[2] && open[1]) {
			Main.board.buttons[1].setText("O");
		} else if (x[1] && x[2] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (x[0] && x[3] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if (x[0] && x[6] && open[3]) {
			Main.board.buttons[3].setText("O");
		} else if (x[6] && x[3] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (x[3] && x[4] && open[5]) {
			Main.board.buttons[5].setText("O");
		} else if (x[3] && x[5] && open[4]) {
			Main.board.buttons[4].setText("O");
		} else if (x[5] && x[4] && open[3]) {
			Main.board.buttons[3].setText("O");
		} else if (x[6] && x[7] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if (x[6] && x[8] && open[7]) {
			Main.board.buttons[7].setText("O");
		} else if (x[7] && x[8] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if (x[1] && x[4] && open[7]) {
			Main.board.buttons[7].setText("O");
		} else if (x[1] && x[7] && open[4]) {
			Main.board.buttons[4].setText("O");
		} else if (x[4] && x[7] && open[1]) {
			Main.board.buttons[1].setText("O");
		} else if (x[2] && x[5] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if (x[2] && x[8] && open[5]) {
			Main.board.buttons[5].setText("O");
		} else if (x[5] && x[8] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if (x[0] && x[4] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if (x[0] && x[8] && open[4]) {
			Main.board.buttons[4].setText("O");
		} else if (x[4] && x[8] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (x[2] && x[4] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if (x[2] && x[6] && open[4]) {
			Main.board.buttons[4].setText("O");
		} else if (x[4] && x[6] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if (open[4]) {
			Main.board.buttons[4].setText("O");
		} else if(x[1] && x[3] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if(x[1] && x[5] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if(x[3] && x[7] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if(x[5] && x[7] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if(x[0] && x[5] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if(x[0] && x[7] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if(x[1] && x[6] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if(x[1] && x[8] && open[2]) {
			Main.board.buttons[2].setText("O");
		} else if(x[2] && x[3] && open[0]) {
			Main.board.buttons[0].setText("O");
		} else if(x[2] && x[7] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if(x[3] && x[8] && open[6]) {
			Main.board.buttons[6].setText("O");
		} else if(x[5] && x[6] && open[8]) {
			Main.board.buttons[8].setText("O");
		} else if (open[0]) {
			Main.board.buttons[0].setText("O");
		} else if (open[2]) {
			Main.board.buttons[2].setText("O");
		} else if (open[6]) {
			Main.board.buttons[6].setText("O");
		} else if (open[8]) {
			Main.board.buttons[8].setText("O");
		} else if (open[1]) {
			Main.board.buttons[1].setText("O");
		} else if (open[3]) {
			Main.board.buttons[3].setText("O");
		} else if (open[5]) {
			Main.board.buttons[5].setText("O");
		} else if (open[7]) {
			Main.board.buttons[7].setText("O");
		}
		
		Main.playerTurn = true;

	}
}
