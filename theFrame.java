package thickPasswords;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

public class theFrame extends JFrame {

	private static int upp = 0;
	private static int low = 0;
	private static int num = 0;
	private static int sym = 0;
	private static int cyr = 0;
	private static int geor = 0;
	private static int viet = 0;
	private static int spsym = 0;
	
	private JPanel contentPane;
	private final JTextPane outputPane = new JTextPane();


	
	public static String strBuild() {
		String upps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lows = "abcdefghijklmnopqrstuvwxyz";
		String nums = "1234567890";
		String syms = "`~!@#$%^&*()_-+=[]{}|';:<,>./?";
		String cyrs = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
		String geors = "ღჯუკენგშწზხცფძვთაპროლდჟჭჩყსმიტქბჰ";
		String viets = "ăâáắấàằầảẳẩãẵẫạặậđ₫êéếèềẻểẽễẹệĩỉịìíôơóốớòồờỏổởõỗỡọộợụựữũủửừùúứưuýỳỷỹỵ";
		String spsyms = "☺☻♥♦♣♠•◘○◙♂♀♪♫☼►◄↕‼¶§▬↑↓→←∟↔▲▼æÆ¿ªº⌐¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛╞╟╚╔╩╦╠═╬╧╨╤╥╘╒╓╫╪┘█▄▌▐▀αßΓπΣσµτΦΘΩδ∞φε∩≡±≥≤⌠⌡≈°√ⁿ²";
		String tbus = "";
		
		if(upp == 1) {
			tbus += upps;
		}
		if(low == 1) {
			tbus += lows;
		}
		if(num == 1) {
			tbus += nums;
		}
		if(sym == 1) {
			tbus += syms;
		}
		if(cyr == 1) {
			tbus += cyrs;
		}
		if(geor == 1) {
			tbus += geors;
		}
		if(viet == 1) {
			tbus += viets;
		}
		if(spsym == 1) {
			tbus += spsyms;
		}
		
		StringBuilder strBuild = new StringBuilder();
        Random rand = new Random();
        while (strBuild.length() < 30) { // length of the random string.
            int index = (int) (rand.nextFloat() * tbus.length());
            strBuild.append(tbus.charAt(index));
        }
        String finalStr = strBuild.toString();
		return finalStr;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					theFrame frame = new theFrame();
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
	public theFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		outputPane.setBounds(10, 183, 251, 41);
		contentPane.add(outputPane);
		
		JCheckBox uppBox = new JCheckBox("Uppercase");
		uppBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		uppBox.setBounds(38, 31, 77, 23);
		contentPane.add(uppBox);
		
		JCheckBox lowBox = new JCheckBox("Lowercase");
		lowBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lowBox.setBounds(38, 58, 99, 23);
		contentPane.add(lowBox);
		
		JCheckBox numBox = new JCheckBox("Numbers");
		numBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		numBox.setBounds(38, 84, 99, 23);
		contentPane.add(numBox);
		
		JCheckBox symBox = new JCheckBox("Symbols");
		symBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		symBox.setBounds(38, 110, 99, 23);
		contentPane.add(symBox);
		
		JCheckBox cyrilBox = new JCheckBox("Cyrillic");
		cyrilBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cyrilBox.setBounds(142, 31, 99, 23);
		contentPane.add(cyrilBox);
		
		JCheckBox georgBox = new JCheckBox("Georgian");
		georgBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		georgBox.setBounds(142, 58, 99, 23);
		contentPane.add(georgBox);
		
		
		JCheckBox vietBox = new JCheckBox("Vietnamese");
		vietBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		vietBox.setBounds(142, 84, 99, 23);
		contentPane.add(vietBox);
		
		JCheckBox spsymBox = new JCheckBox("Special");
		spsymBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		spsymBox.setBounds(142, 110, 99, 23);
		contentPane.add(spsymBox);
		
		JButton btn = new JButton("generate");
		btn.setBounds(88, 149, 89, 23);
		contentPane.add(btn);
		
		btn.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent arg0) {
		    	  if(uppBox.isSelected()) {upp = 1;}else {upp = 0;}
		    	  if(lowBox.isSelected()) {low = 1;}else {low = 0;}
		    	  if(numBox.isSelected()) {num = 1;}else {num = 0;}
		    	  if(symBox.isSelected()) {sym = 1;}else {sym = 0;}
		    	  if(cyrilBox.isSelected()) {cyr = 1;}else {cyr = 0;}
		    	  if(georgBox.isSelected()) {geor = 1;}else {geor = 0;}
		    	  if(vietBox.isSelected()) {viet = 1;}else {viet = 0;}
		    	  if(spsymBox.isSelected()) {spsym = 1;}else {spsym = 0;}
		    	  String s = strBuild();
		    	  outputPane.setText(s);
		      }
		  });
	} 
}
