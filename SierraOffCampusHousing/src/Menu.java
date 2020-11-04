import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setLayout(null);
		
		JLabel lblApartmentSearching = new JLabel("Apartment Searching");
		lblApartmentSearching.setFont(new Font("Pill Gothic 600mg Light", Font.PLAIN, 24));
		lblApartmentSearching.setBounds(393, 11, 212, 32);
		frame.getContentPane().add(lblApartmentSearching);
		
		TextField textField = new TextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		textField.setText("Search by name, zip code, or address");
		textField.setBounds(329, 153, 315, 22);
		frame.getContentPane().add(textField);
		
		Choice searchChoice = new Choice();
		searchChoice.add("Search Method");
		searchChoice.add("Zip");
		searchChoice.add("Address");
		searchChoice.add("Name");
		searchChoice.setBounds(203, 153, 120, 20);
		frame.getContentPane().add(searchChoice);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(searchChoice.getSelectedItem().equalsIgnoreCase("Zip")) {
					
				}
				else if(searchChoice.getSelectedItem().equalsIgnoreCase("Address")) {
					
				}
				else if(searchChoice.getSelectedItem().equalsIgnoreCase("Name")) {
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Search method was not selected");
				}
			}
		});
		btnSearch.setBounds(650, 153, 89, 23);
		frame.getContentPane().add(btnSearch);
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmRecentlyViewed = new JMenuItem("Recently Viewed");
		mntmRecentlyViewed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		mnFile.add(mntmRecentlyViewed);
		
		JMenuItem mntmFavorites = new JMenuItem("Favorites");
		mntmFavorites.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		mnFile.add(mntmFavorites);
		
		JMenuItem mntmSavedHomes = new JMenuItem("Saved Homes");
		mntmSavedHomes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		mnFile.add(mntmSavedHomes);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		mnFile.add(mntmLogin);
	}
}
