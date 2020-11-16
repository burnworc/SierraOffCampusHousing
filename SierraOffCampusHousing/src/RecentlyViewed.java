import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class RecentlyViewed extends JPanel {

	/**
	 * Create the panel.
	 */
	public RecentlyViewed() {
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		JLabel lblRecen = new JLabel("recen");
		lblRecen.setBounds(437, 263, 46, 14);
		add(lblRecen);

	}

}
