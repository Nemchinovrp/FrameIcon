import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class FrameIcon {
	JTextArea text;
	public static void main(String[] args) {
		FrameIcon icon =new FrameIcon();
		icon.makeGui();
	}
	public  void makeGui(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		Image image = Toolkit.getDefaultToolkit().getImage("res/russia.png");
		
		frame.setIconImage(image);
		frame.setSize(300,300);
		frame.setTitle("by Roman=)");
		
		ImageIcon ii = new ImageIcon("res/russia.png");
		ImageIcon ii1 = new ImageIcon("res/thailand.gif");
		ImageIcon ii2 = new ImageIcon("res/ukraine.gif");
		JButton button = new JButton(ii);
		JButton button1 = new JButton(ii1);
		JButton button2 = new JButton(ii2);
		frame.getContentPane().add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		Font font = new Font("sanserif", Font.BOLD, 20);
		 text = new JTextArea(7,12);
		text.setFont(font);
		text.setLineWrap(true);
		text.setEditable(false);
		button.addActionListener(new ButtonAction());
		button1.addActionListener(new ButtonAction1());
		button2.addActionListener(new ButtonAction2());
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public class ButtonAction implements ActionListener{ 
	public void actionPerformed(ActionEvent e) {
	
			text.append("Выбрана Россия!\n");
		
	}}
	public class ButtonAction1 implements ActionListener{ 
	public void actionPerformed(ActionEvent e) {
	
			text.append("Выбран Тайланд!\n");
		
	}}
	public class ButtonAction2 implements ActionListener{ 
	public void actionPerformed(ActionEvent e) {
	
			text.append("Выбрана Украина!\n");
		
	}}
}
