import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ACT01 extends JFrame {

	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JTextField caja4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACT01 frame = new ACT01();
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
	public ACT01() {
		setTitle("ACT01");
		
		//Ventana visual
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Caja1
		caja1 = new JTextField();
		caja1.setBounds(10, 38, 86, 20);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		//Caja2
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(321, 38, 86, 20);
		contentPane.add(caja2);
		
		//Caja3
		caja3 = new JTextField();
		caja3.setColumns(10);
		caja3.setBounds(321, 198, 86, 20);
		contentPane.add(caja3);
		
		//Caja4
		caja4 = new JTextField();
		caja4.setColumns(10);
		caja4.setBounds(10, 198, 86, 20);
		contentPane.add(caja4);
		
		//Boton1
		JButton Boton1 = new JButton("Copiar");
		//Codigo Boton1
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textocaja1="";
				textocaja1=caja1.getText();
				caja2.setText(textocaja1);
						
			}
		});
		Boton1.setBounds(164, 37, 89, 23);
		contentPane.add(Boton1);
		
		//Boton2
		JButton Boton2 = new JButton("Copiar");
		//Codigo Boton2
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textocaja2="";
				textocaja2=caja2.getText();
				caja3.setText(textocaja2);
						
			}
		});
		
		Boton2.setBounds(321, 110, 89, 23);
		contentPane.add(Boton2);
		
		//Boton3
		JButton Boton3 = new JButton("Copiar");
		//Codigo Boton3
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textocaja3="";
				textocaja3=caja3.getText();
				caja4.setText(textocaja3);
						
			}
		});
		Boton3.setBounds(164, 197, 89, 23);
		contentPane.add(Boton3);
		
		//Boton4
		JButton Boton4 = new JButton("Copiar");
		//Codigo Bonton4
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textocaja4="";
				textocaja4=caja4.getText();
				caja1.setText(textocaja4);
						
			}
		});
		Boton4.setBounds(10, 110, 89, 23);
		contentPane.add(Boton4);
	}
}
