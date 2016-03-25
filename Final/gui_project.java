package Final;
/**
 * gui_project.java is a 
 * platform that will utilize
 * collection class lists
 * & display a GUI that changes
 * colors as the boxes
 * are marked one at a time
 * 
 * @Matt LaClair
 * @version 1.00 2014/10/10
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class gui_project extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args)   { 
	
	//Create Frame
	final JFrame frame = new JFrame(); 
	frame.setTitle("Please Select A Color");
	frame.setSize(450,450);
	frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setVisible(true);
    frame.isResizable();
    
    
    //Create Color Name Array List
	final ArrayList <String> color_list = new ArrayList<String>();
	color_list.add("Black");
	color_list.add("Blue");
	color_list.add("Red");
	color_list.add("Yellow");
	color_list.add("Green");
	color_list.add("Purple");
	color_list.add("Orange");
	color_list.add("Maroon");
	color_list.add("Tan");
	color_list.add("Brown");
	color_list.add("White");
	color_list.add("Grey");
	color_list.add("Light Blue");
	color_list.add("Light Green");
	color_list.add("Pink");
	color_list.add("Lime Green");
	color_list.add("Baby Blue");
	color_list.add("Turqoise");
	color_list.add("Burnt Orange");
	color_list.add("Light Purple");
	
	//Create Matching Color Hexadecimal Array List
	final ArrayList <String> hex_list = new ArrayList<String>();
	hex_list.add("#000000");
	hex_list.add("#162cd2");
	hex_list.add("#ff0000");
	hex_list.add("#eeee00");
	hex_list.add("#6b8e23");
	hex_list.add("#a020f0");
	hex_list.add("#ffa500");
	hex_list.add("#8b0000");
	hex_list.add("#daa520");
	hex_list.add("#8b4500");
	hex_list.add("#fffaf0");
	hex_list.add("#595959");
	hex_list.add("#16bad2");
	hex_list.add("#00ff7f");
	hex_list.add("#ff1493");
	hex_list.add("#32cd32");
	hex_list.add("#09d5f2");
	hex_list.add("#00868b");
	hex_list.add("#ff4500");
	hex_list.add("#d02090");
    
	//Create Check Boxes Using Name & Associated Hexadecimal Number
	JCheckBox rad1 = new JCheckBox(hex_list.get(0) + "  " + color_list.get(0));
	JCheckBox rad2 = new JCheckBox(hex_list.get(1) + "  " + color_list.get(1));
	JCheckBox rad3 = new JCheckBox(hex_list.get(2) + "  " + color_list.get(2));
	JCheckBox rad4 = new JCheckBox(hex_list.get(3) + "  " + color_list.get(3));
	JCheckBox rad5 = new JCheckBox(hex_list.get(4) + "  " + color_list.get(4));
	JCheckBox rad6 = new JCheckBox(hex_list.get(5) + "  " + color_list.get(5));
	JCheckBox rad7 = new JCheckBox(hex_list.get(6) + "  " + color_list.get(6));
	JCheckBox rad8 = new JCheckBox(hex_list.get(7) + "  " + color_list.get(7));
	JCheckBox rad9 = new JCheckBox(hex_list.get(8) + "  " + color_list.get(8));
	JCheckBox rad10 = new JCheckBox(hex_list.get(9) + "  " + color_list.get(9));
	JCheckBox rad11 = new JCheckBox(hex_list.get(10) + "  " + color_list.get(10));
	JCheckBox rad12 = new JCheckBox(hex_list.get(11) + "  " + color_list.get(11));
	JCheckBox rad13 = new JCheckBox(hex_list.get(12) + "  " + color_list.get(12));
	JCheckBox rad14 = new JCheckBox(hex_list.get(13) + "  " + color_list.get(13));
	JCheckBox rad15 = new JCheckBox(hex_list.get(14) + "  " + color_list.get(14));
	JCheckBox rad16 = new JCheckBox(hex_list.get(15) + "  " + color_list.get(15));
	JCheckBox rad17 = new JCheckBox(hex_list.get(16) + "  " + color_list.get(16));
	JCheckBox rad18 = new JCheckBox(hex_list.get(17) + "  " + color_list.get(17));
	JCheckBox rad19 = new JCheckBox(hex_list.get(18) + "  " + color_list.get(18));
	JCheckBox rad20 = new JCheckBox(hex_list.get(19) + "  " + color_list.get(19));

	//Create Button Group/Add Buttons to Group to Prevent Multiple Ticks
	ButtonGroup group = new ButtonGroup();
	group.add(rad1);
	group.add(rad2);
	group.add(rad3);
	group.add(rad4);
	group.add(rad5);
	group.add(rad6);
	group.add(rad7);
	group.add(rad8);
	group.add(rad9);
	group.add(rad10);
	group.add(rad11);
	group.add(rad12);
	group.add(rad13);
	group.add(rad14);
	group.add(rad15);
	group.add(rad16);
	group.add(rad17);
	group.add(rad18);
	group.add(rad19);
	group.add(rad20);
	
	//Create Panel/Add Check Boxes/Add Panel to Frame
	final JPanel panel = new JPanel(new GridLayout(10,2,10,10));
	panel.add(rad1);
	panel.add(rad2);
	panel.add(rad3);
	panel.add(rad4);
	panel.add(rad5);
	panel.add(rad6);
	panel.add(rad7);
	panel.add(rad8);
	panel.add(rad9);
	panel.add(rad10);
	panel.add(rad11);
	panel.add(rad12);
	panel.add(rad13);
	panel.add(rad14);
	panel.add(rad15);
	panel.add(rad16);
	panel.add(rad17);
	panel.add(rad18);
	panel.add(rad19);
	panel.add(rad20);
	frame.add(panel);
	
	//Create Action Listeners that Change Colors
	rad1.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(0)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(0));
		}
	});
	rad2.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(1)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(1));
		}
	});
	rad3.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(2)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(2));
		}
	});
	rad4.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(3)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(3));
		}
	});
	rad5.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(4)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(4));
		}
	});
	rad6.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(5)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(5));
		}
	});
	rad7.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(6)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(6));
		}
	});
	rad8.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(7)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(7));
		}
	});
	rad9.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(8)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(8));
		}
	});
	rad10.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(9)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(9));
		}
	});
	rad11.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(10)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(10));
		}
	});
	rad12.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(11)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(11));
		}
	});
	rad13.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(12)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(12));
		}
	});
	rad14.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(13)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(13));
		}
	});
	rad15.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(14)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(14));
		}
	});
	rad16.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(15)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(15));
		}
	});
	rad17.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(16)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(16));
		}
	});
	rad18.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(17)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(17));
		}
	});
	rad19.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(18)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(18));
		}
	});
	rad20.addActionListener(new ActionListener (){
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.decode(hex_list.get(19)));
			JOptionPane.showMessageDialog(null, "You chose " + color_list.get(19));
		}
	});

}
}

