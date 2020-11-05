import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu {

	private JFrame frame;

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

	public Menu() {
		initialize();
	}

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
		
		String logout = "Logout";
		String login = "Login";
		JMenuItem mntmLogin = new JMenuItem(login);
		mntmLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(mntmLogin.getText().equalsIgnoreCase(logout)) {
					mntmLogin.setText(login);
				}
				else if(mntmLogin.getText().equalsIgnoreCase(login)) {
					Login yes = new Login();
					frame.setVisible(false);
					mntmLogin.setText(logout);
					while(yes.isShowing()) {
					}
					frame.setVisible(true);
				}
			}
		});
		mnFile.add(mntmLogin);
	}
	
	public static boolean authenticate(String username, String password) {
		if(username.equals("Yes") && password.equals("Yes")) {
			return true;
		}
		return false;
		}
}




