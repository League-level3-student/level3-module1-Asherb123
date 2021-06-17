package _05_Intro_To_Hash_Maps;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements MouseListener {
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton ad = new JButton("Add Entry");
	JButton search = new JButton("Search by ID");
	JButton view = new JButton("View List");
	JButton remove = new JButton("Remove Entry");
	
	HashMap<Integer, String> hashyboi = new HashMap<Integer, String>();

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. 
	 * 
	 * Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: 
	 * ID: 123 Name: Harry Howard 
	 * ID: 245 Name: Polly Powers 
	 * ID: 
	 * 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 */

	void add() {
		

		panel.addMouseListener(this);
		ad.addMouseListener(this);
		search.addMouseListener(this);
		view.addMouseListener(this);
		remove.addMouseListener(this);
		
		frame.add(panel);

		panel.add(ad);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		_02_LogSearch a = new _02_LogSearch();
		a.add();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		if (e.getSource()==ad) {
		String a =	JOptionPane.showInputDialog("Please enter an ID number");
		String name = JOptionPane.showInputDialog("Please enter your name");
			
		int id = Integer.parseInt(a); 
		
		hashyboi.put(id, name);
			
	}
	
	if (e.getSource()== search) {
		String a = JOptionPane.showInputDialog("Please enter an ID");
		int id = Integer.parseInt(a);
	
	if (hashyboi.containsKey(id)) {
		String s = hashyboi.get(id);
		JOptionPane.showMessageDialog(null, ""+s);
	}
	else {
		JOptionPane.showMessageDialog(null, "This ID does not exist, please try again");
	}
	}
	
	if (e.getSource()== view) {
		
		for (Integer keys : hashyboi.keySet()) {
			JOptionPane.showMessageDialog(null, "ID: "+ keys + " Name: "+hashyboi.get(keys));
		}
		
		
	}
	
	 if (e.getSource()==remove) {
		String s = JOptionPane.showInputDialog("Please enter the ID you would like to remove");
		int id = Integer.parseInt(s);
		
		if (hashyboi.containsKey(id)) {
			hashyboi.remove(id);
		}
		else {
			JOptionPane.showMessageDialog(null, "This ID does not exist. Please try again");
		}
	 }
	
	
	
	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
