import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Favorites extends JPanel {

	/**
	 * Create the panel.
	 */
	public Favorites() {
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(135, 206, 250));
		textArea.setBounds(10, 80, 980, 409);
		add(textArea);

	}
}
