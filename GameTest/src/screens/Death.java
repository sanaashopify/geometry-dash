package screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Death {
	public static boolean value = false;

	public Death() {
		value = false;
		final JFrame y = new JFrame("Death");
		y.setSize(500, 200);
		y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		y.setResizable(false);
		y.setLocationRelativeTo(null);
		y.setLayout(null);
		y.setBackground(Color.BLUE);

		draw(y);

	}

	public static void draw(final JFrame y) {

		JLabel l1 = new JLabel("YOU DIED");
		l1.setBounds(125, 30, 500, 50);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 50));

		JButton button = new JButton("Exit");
		button.setBounds(100, 100, 100, 50);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});
		JButton button1 = new JButton("Main Menu");
		button1.setBounds(300, 100, 100, 50);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				y.setVisible(false);
				value = true;

			}

		});
		y.add(l1);
		y.add(button);
		y.add(button1);

		y.setVisible(true);

	}

}
