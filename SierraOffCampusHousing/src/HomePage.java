import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;
import java.awt.Choice;
import javax.swing.JTextArea;

public class HomePage extends JPanel {
	private JTextField textField;
	private Properties prop;

	/**
	 * Create the panel.
	 */
	public HomePage() {
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		Choice choice = new Choice();
		choice.setBounds(243, 201, 120, 20);
		add(choice);
		choice.add("Choose Method");
		choice.add("ID");
		choice.add("Name");
		choice.add("Location");
		
		JLabel lblApartmentSearching = new JLabel("Apartment Searching");
		lblApartmentSearching.setFont(new Font("Pill Gothic 600mg Light", Font.PLAIN, 26));
		lblApartmentSearching.setHorizontalAlignment(SwingConstants.CENTER);
		lblApartmentSearching.setBounds(369, 45, 240, 34);
		add(lblApartmentSearching);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		textField.setBounds(369, 201, 240, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNoSearchMethod = new JLabel("No search method selected.");
		lblNoSearchMethod.setForeground(new Color(255, 0, 0));
		lblNoSearchMethod.setFont(new Font("Pill Gothic 600mg Semibd", Font.PLAIN, 18));
		lblNoSearchMethod.setBounds(369, 232, 240, 20);
		add(lblNoSearchMethod);
		lblNoSearchMethod.setVisible(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(new Color(135, 206, 250));
		textArea.setBounds(10, 95, 700, 394);
		add(textArea);
		textArea.setVisible(false);
		
		prop = new Properties();
		
		JButton btnSearchAgain = new JButton("Search Again");
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			if(choice.getSelectedItem().equalsIgnoreCase("Choose Method")) {
				lblNoSearchMethod.setVisible(true);
			}
			else if(choice.getSelectedItem().equalsIgnoreCase("ID")) {
				lblNoSearchMethod.setVisible(false);
				if(textField.getText() != "") {
					textArea.append(prop.searchID(textField.getText()));
					textArea.setVisible(true);
					btnSearchAgain.setVisible(true);
				}
			}
			else if(choice.getSelectedItem().equalsIgnoreCase("Name")) {
				lblNoSearchMethod.setVisible(false);
				if(textField.getText() != "") {
					textArea.append(prop.searchName(textField.getText()));
					textArea.setVisible(true);
					btnSearchAgain.setVisible(true);
				}
			}
			else if(choice.getSelectedItem().equalsIgnoreCase("Location")) {
				lblNoSearchMethod.setVisible(false);
				if(textField.getText() != "") {
					textArea.append(prop.searchLocation(textField.getText()));
					textArea.setVisible(true);
					btnSearchAgain.setVisible(true);
				}
			}
			}
		});
		btnSearch.setBounds(637, 200, 89, 23);
		add(btnSearch);
		
		btnSearchAgain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textArea.setVisible(false);
				btnSearchAgain.setVisible(false);
			}
		});
		btnSearchAgain.setBounds(787, 232, 101, 23);
		add(btnSearchAgain);
		btnSearchAgain.setVisible(false);
	}
}
