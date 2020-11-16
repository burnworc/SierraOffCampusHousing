import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JPanel {
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Login() {
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(429, 189, 86, 20);
		add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(429, 225, 86, 20);
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnLogin.setBounds(535, 203, 89, 23);
		add(btnLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Pill Gothic 600mg Semibd", Font.PLAIN, 19));
		lblUsername.setBounds(341, 188, 98, 20);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Pill Gothic 600mg Semibd", Font.PLAIN, 19));
		lblPassword.setBounds(341, 224, 88, 20);
		add(lblPassword);

	}
}
