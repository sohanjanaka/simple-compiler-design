package compiler_GUI;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	String door1_stat = "lock";
	String door2_stat = "lock";
	String door3_stat = "lock";
	String door4_stat = "lock";


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 836);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		

		



		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(23, 370, 637, 442);
		contentPane.add(tabbedPane);

		JEditorPane HLL_tab = new JEditorPane();
		tabbedPane.addTab("HLL", null, HLL_tab, null);

		JEditorPane Assembly_tab = new JEditorPane();
		tabbedPane.addTab("Assembly", null, Assembly_tab, null);

		JButton btn_refresh_2 = new JButton("");
		btn_refresh_2.setIcon(new ImageIcon(GUI.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btn_refresh_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {

					BufferedWriter outfile = new BufferedWriter(new FileWriter("input.txt"));
					BufferedReader infile = new BufferedReader(new FileReader("input.txt"));

					outfile.write("check 1;");
					outfile.close();

					String line;
					String mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					HLL_tab.setText(mem);
					infile.close();

					Process p = Runtime.getRuntime().exec("./test.sh");
					p.waitFor();
					p.destroy();

					infile = new BufferedReader(new FileReader("output.txt"));
					mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					Assembly_tab.setText(mem);
					infile.close();

				} catch (Exception ex) {
					System.err.println(ex);
				}
				
			}
		});

		btn_refresh_2.setBounds(596, 38, 51, 42);
		contentPane.add(btn_refresh_2);

		JButton btn_refresh_1 = new JButton("");
		btn_refresh_1.setIcon(new ImageIcon(GUI.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btn_refresh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {

					BufferedWriter outfile = new BufferedWriter(new FileWriter("input.txt"));
					BufferedReader infile = new BufferedReader(new FileReader("input.txt"));

					outfile.write("check 0;");
					outfile.close();

					String line;
					String mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					HLL_tab.setText(mem);
					infile.close();

					Process p = Runtime.getRuntime().exec("./test.sh");
					p.waitFor();
					p.destroy();

					infile = new BufferedReader(new FileReader("output.txt"));
					mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					Assembly_tab.setText(mem);
					infile.close();

				} catch (Exception ex) {
					System.err.println(ex);
				}
				
			}
		});
		btn_refresh_1.setBounds(266, 38, 51, 42);
		contentPane.add(btn_refresh_1);

		JButton btn_refresh_3 = new JButton("");
		btn_refresh_3.setIcon(new ImageIcon(GUI.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btn_refresh_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {

					BufferedWriter outfile = new BufferedWriter(new FileWriter("input.txt"));
					BufferedReader infile = new BufferedReader(new FileReader("input.txt"));

					outfile.write("check 2;");
					outfile.close();

					String line;
					String mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					HLL_tab.setText(mem);
					infile.close();

					Process p = Runtime.getRuntime().exec("./test.sh");
					p.waitFor();
					p.destroy();

					infile = new BufferedReader(new FileReader("output.txt"));
					mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					Assembly_tab.setText(mem);
					infile.close();

				} catch (Exception ex) {
					System.err.println(ex);
				}
				
			}
		});
		btn_refresh_3.setBounds(266, 186, 51, 42);
		contentPane.add(btn_refresh_3);

		JButton btn_refresh_4 = new JButton("");
		btn_refresh_4.setIcon(new ImageIcon(GUI.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btn_refresh_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {

					BufferedWriter outfile = new BufferedWriter(new FileWriter("input.txt"));
					BufferedReader infile = new BufferedReader(new FileReader("input.txt"));

					outfile.write("check 3;");
					outfile.close();

					String line;
					String mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					HLL_tab.setText(mem);
					infile.close();

					Process p = Runtime.getRuntime().exec("./test.sh");
					p.waitFor();
					p.destroy();

					infile = new BufferedReader(new FileReader("output.txt"));
					mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					Assembly_tab.setText(mem);
					infile.close();

				} catch (Exception ex) {
					System.err.println(ex);
				}
				
			}
		});
		btn_refresh_4.setBounds(596, 186, 51, 42);
		contentPane.add(btn_refresh_4);

		JButton btn_door1 = new JButton();
		btn_door1.setText(door1_stat);
		btn_door1.setBackground(new Color(51, 204, 51));

		btn_door1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (door1_stat == "lock") {
					door1_stat = "unlock";
					btn_door1.setText(door1_stat);
					btn_door1.setBackground(new Color(255, 102, 102));
				} else {
					door1_stat = "lock";
					btn_door1.setText(door1_stat);
					btn_door1.setBackground(new Color(51, 204, 51));
				}

				try {

					BufferedWriter outfile = new BufferedWriter(new FileWriter("input.txt"));
					BufferedReader infile = new BufferedReader(new FileReader("input.txt"));

					outfile.write("door 0 " + door1_stat + ";");
					outfile.close();

					String line;
					String mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					HLL_tab.setText(mem);
					infile.close();

					Process p = Runtime.getRuntime().exec("./test.sh");
					p.waitFor();
					p.destroy();

					infile = new BufferedReader(new FileReader("output.txt"));
					mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					Assembly_tab.setText(mem);
					infile.close();

				} catch (Exception ex) {
					System.err.println(ex);
				}

			}
		});
		btn_door1.setBounds(36, 38, 216, 109);
		contentPane.add(btn_door1);
		
		
		
		
		JButton btn_door2 = new JButton();
		btn_door2.setText(door2_stat);
		btn_door2.setBackground(new Color(51, 204, 51));
		
		btn_door2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (door2_stat == "lock") {
					door2_stat = "unlock";
					btn_door2.setText(door1_stat);
					btn_door2.setBackground(new Color(255, 102, 102));
				} else {
					door2_stat = "lock";
					btn_door2.setText(door1_stat);
					btn_door2.setBackground(new Color(51, 204, 51));
				}

				try {

					BufferedWriter outfile = new BufferedWriter(new FileWriter("input.txt"));
					BufferedReader infile = new BufferedReader(new FileReader("input.txt"));

					outfile.write("door 1 " + door2_stat + ";");
					outfile.close();

					String line;
					String mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					HLL_tab.setText(mem);
					infile.close();

					Process p = Runtime.getRuntime().exec("./test.sh");
					p.waitFor();
					p.destroy();

					infile = new BufferedReader(new FileReader("output.txt"));
					mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					Assembly_tab.setText(mem);
					infile.close();

				} catch (Exception ex) {
					System.err.println(ex);
				}
			}
		});
		btn_door2.setBounds(368, 38, 216, 109);
		contentPane.add(btn_door2);
		
		
		JButton btn_door3 = new JButton();
		btn_door3.setText(door3_stat);
		btn_door3.setBackground(new Color(51, 204, 51));
		btn_door3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (door3_stat == "lock") {
					door3_stat = "unlock";
					btn_door3.setText(door1_stat);
					btn_door3.setBackground(new Color(255, 102, 102));
				} else {
					door3_stat = "lock";
					btn_door3.setText(door1_stat);
					btn_door3.setBackground(new Color(51, 204, 51));
				}

				try {

					BufferedWriter outfile = new BufferedWriter(new FileWriter("input.txt"));
					BufferedReader infile = new BufferedReader(new FileReader("input.txt"));

					outfile.write("door 2 " + door3_stat + ";");
					outfile.close();

					String line;
					String mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					HLL_tab.setText(mem);
					infile.close();

					Process p = Runtime.getRuntime().exec("./test.sh");
					p.waitFor();
					p.destroy();

					infile = new BufferedReader(new FileReader("output.txt"));
					mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					Assembly_tab.setText(mem);
					infile.close();

				} catch (Exception ex) {
					System.err.println(ex);
				}
				
			}
		});
		btn_door3.setBounds(36, 186, 216, 109);
		contentPane.add(btn_door3);
		
		
		JButton btn_door4 = new JButton();
		btn_door4.setText(door4_stat);
		btn_door4.setBackground(new Color(51, 204, 51));
		btn_door4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (door4_stat == "lock") {
					door4_stat = "unlock";
					btn_door4.setText(door4_stat);
					btn_door4.setBackground(new Color(255, 102, 102));
				} else {
					door4_stat = "lock";
					btn_door4.setText(door4_stat);
					btn_door4.setBackground(new Color(51, 204, 51));
				}

				try {

					BufferedWriter outfile = new BufferedWriter(new FileWriter("input.txt"));
					BufferedReader infile = new BufferedReader(new FileReader("input.txt"));

					outfile.write("door 3 " + door4_stat + ";");
					outfile.close();

					String line;
					String mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					HLL_tab.setText(mem);
					infile.close();

					Process p = Runtime.getRuntime().exec("./test.sh");
					p.waitFor();
					p.destroy();

					infile = new BufferedReader(new FileReader("output.txt"));
					mem = "";
					while ((line = infile.readLine()) != null) {
						mem = mem + line + "\n";
					}
					Assembly_tab.setText(mem);
					infile.close();

				} catch (Exception ex) {
					System.err.println(ex);
				}
				
			}
		});
		btn_door4.setBounds(368, 186, 216, 109);
		contentPane.add(btn_door4);
		
		JLabel doorlbl_1 = new JLabel("Door 1");
		doorlbl_1.setBounds(109, 159, 70, 15);
		contentPane.add(doorlbl_1);
		
		JLabel doorlbl_2 = new JLabel("Door 2");
		doorlbl_2.setBounds(448, 159, 70, 15);
		contentPane.add(doorlbl_2);
		
		JLabel doorlbl_3 = new JLabel("Door 3");
		doorlbl_3.setBounds(109, 307, 70, 15);
		contentPane.add(doorlbl_3);
		
		JLabel doorlbl_4 = new JLabel("Door 4");
		doorlbl_4.setBounds(448, 307, 70, 15);
		contentPane.add(doorlbl_4);

	}
}
