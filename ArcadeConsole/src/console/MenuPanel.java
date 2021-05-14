package console;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPanel extends JPanel {

	public MenuPanel(JButton game1, JButton game2, JButton game3) {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.anchor = GridBagConstraints.NORTH;

		add(new JLabel("<html><h1><strong><i>OOP Games!</i></strong></h1><hr></html>"), gbc);
		add(new JLabel("<html><h2><strong>Welcome, we are happy to see you :)</strong></h2></html>"), gbc);

		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JPanel buttonPanel = new JPanel(new GridBagLayout());
		buttonPanel.add(game1, gbc);
		buttonPanel.add(game2, gbc);
		buttonPanel.add(game3, gbc);

		gbc.weighty = 1;
		add(buttonPanel, gbc);
	}
}