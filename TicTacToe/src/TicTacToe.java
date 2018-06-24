import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class TicTacToe extends JFrame {
	public JButton[] buttons;
	public JButton reset;
	public JLabel label;

	Computer ai = new Computer();

	Main main = new Main();

	public TicTacToe() {
		initComponents();
	}

	public void button1ActionPerformed(ActionEvent e) {
		if (buttons[0].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[0].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}

	}

	public void button2ActionPerformed(ActionEvent e) {
		if (buttons[1].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[1].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}
	}

	public void button3ActionPerformed(ActionEvent e) {
		if (buttons[2].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[2].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}
	}

	public void button4ActionPerformed(ActionEvent e) {
		if (buttons[3].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[3].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}
	}

	public void button5ActionPerformed(ActionEvent e) {
		if (buttons[4].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[4].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}
	}

	public void button6ActionPerformed(ActionEvent e) {
		if (buttons[5].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[5].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}
	}

	public void button7ActionPerformed(ActionEvent e) {
		if (buttons[6].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[6].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}
	}

	public void button8ActionPerformed(ActionEvent e) {
		if (buttons[7].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[7].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}
	}

	public void button9ActionPerformed(ActionEvent e) {
		if (buttons[8].getText().equals("")) {
			if (Main.playerTurn == true) {
				buttons[8].setText("X");
				Main.checkforwin();
				Main.playerTurn = false;
				ai.takeTurn();
				Main.checkforwin();
			}
		}
	}

	public void resetActionPerformed(ActionEvent e) {
		for (int i = 0; i < 9; i++) {
			buttons[i].setText("");
		}
		label.setText("Tic Tac Toe");
		Main.playerTurn = true;

	}

	public void reset() {
		for (int i = 0; i < 9; i++) {
			buttons[i].setText("");
		}
		label.setText("Tic Tac Toe");
		Main.playerTurn = true;
	}

	public void setLabelText(String s) {
		label.setText(s);
	}

	public void initComponents() {
		buttons = new JButton[9];

		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton();
		}

		reset = new JButton();
		label = new JLabel();

		setTitle("Tic Tac Toe");
		Container contentPane = getContentPane();

		// ---- buttons[0] ----
		buttons[0].setText("");
		buttons[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button1ActionPerformed(e);
			}
		});

		// ---- buttons[1] ----
		buttons[1].setText("");
		buttons[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button2ActionPerformed(e);
			}
		});

		// ---- buttons[2] ----
		buttons[2].setText("");
		buttons[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button3ActionPerformed(e);
			}
		});

		// ---- buttons[3] ----
		buttons[3].setText("");
		buttons[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button4ActionPerformed(e);
			}
		});

		// ---- buttons[4] ----
		buttons[4].setText("");
		buttons[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button5ActionPerformed(e);
			}
		});

		// ---- buttons[5] ----
		buttons[5].setText("");
		buttons[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button6ActionPerformed(e);
			}
		});

		// ---- buttons[6] ----
		buttons[6].setText("");
		buttons[6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button7ActionPerformed(e);
			}
		});

		// ---- buttons[7] ----
		buttons[7].setText("");
		buttons[7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button8ActionPerformed(e);
			}
		});

		// ---- buttons[8] ----
		buttons[8].setText("");
		buttons[8].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button9ActionPerformed(e);
			}
		});

		// ---- reset button ----
		reset.setText("Reset");
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetActionPerformed(e);
			}
		});

		// ---- label ----
		label.setText("Tic Tac Toe");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(contentPaneLayout.createParallelGroup().addGroup(contentPaneLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
								.addComponent(buttons[0], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(buttons[1], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(buttons[2], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
								.addComponent(buttons[3], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(buttons[4], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(buttons[5], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
								.addComponent(buttons[6], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(buttons[7], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(buttons[8], GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup().addComponent(reset,
								GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addContainerGap(11, Short.MAX_VALUE)));
		contentPaneLayout.setVerticalGroup(contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup().addContainerGap()
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(buttons[0], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttons[1], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttons[2], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(buttons[3], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttons[4], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttons[5], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(buttons[6], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttons[7], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttons[8], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(reset, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(15, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(getOwner());
	}
}