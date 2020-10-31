import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuBar extends JFrame {

	private JMenuItem item = new JMenuItem("Search by name, city, or zip code");
	private JMenuItem item2 = new JMenuItem("Add favorites");
	private JMenuItem item3 = new JMenuItem("Recently viewed");
	private JMenuItem item4 = new JMenuItem("Saved homes");
	
	public MenuBar()
	{
		JFrame F = new JFrame("Apartment Finder");
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu ("File");
		
		menu.add(item);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		
		menubar.add(menu);
		F.setJMenuBar(menubar);
		F.setSize(300, 100);
		F.setVisible(true);
	
	}
	
	public static void main(String args[])
	{
		new MenuBar();
	}
}
