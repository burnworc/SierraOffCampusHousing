import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private HomePage home;
	private Login log;
	private RecentlyViewed rec;
	private Favorites fav;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 990, 21);
		contentPane.add(menuBar);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mntmHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home.setVisible(true);
				log.setVisible(false);
				rec.setVisible(false);
				fav.setVisible(false);
			}
		});
		menuBar.add(mntmHome);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home.setVisible(false);
				log.setVisible(true);
				rec.setVisible(false);
				fav.setVisible(false);
			}
		});
		menuBar.add(mntmLogin);
		
		JMenuItem mntmRecentlyViewed = new JMenuItem("Recently Viewed");
		mntmRecentlyViewed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home.setVisible(false);
				log.setVisible(false);
				rec.setVisible(true);
				fav.setVisible(false);
			}
		});
		menuBar.add(mntmRecentlyViewed);
		
		JMenuItem mntmFavorites = new JMenuItem("Favorites");
		mntmFavorites.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home.setVisible(false);
				log.setVisible(false);
				rec.setVisible(false);
				fav.setVisible(true);
			}
		});
		menuBar.add(mntmFavorites);
		home = new HomePage();
		home.setSize(1000, 500);
		getContentPane().add(home);
		log = new Login();
		log.setSize(1000,500);
		getContentPane().add(log);
		rec = new RecentlyViewed();
		rec.setSize(1000,500);
		getContentPane().add(rec);
		fav = new Favorites();
		fav.setSize(1000,500);
		getContentPane().add(fav);
		contentPane.setLayout(null);
	}
}
