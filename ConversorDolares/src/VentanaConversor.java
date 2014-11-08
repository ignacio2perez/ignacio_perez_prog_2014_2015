import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class VentanaConversor extends JFrame {

	private JPanel contentPane;
	private JTextField valorEuros;
	private JTextField valorDolares;

	/**
	 * Create the frame.
	 */
	public VentanaConversor(final float valorConversion) {
		setTitle("VENTANA CONVERSI\u00D3N D\u00D3LARES");
		setResizable(false);
		
		// Definición de ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// Zona Euros
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEuros.setBounds(10, 18, 86, 25);
		contentPane.add(lblEuros);
		
		valorEuros = new JTextField();
		valorEuros.setBounds(10, 43, 86, 20);
		contentPane.add(valorEuros);
		valorEuros.setColumns(10);
		
		// Zona Dólares
		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDolares.setBounds(10, 82, 86, 25);
		contentPane.add(lblDolares);
		
		valorDolares = new JTextField();
		valorDolares.setColumns(10);
		valorDolares.setBounds(10, 107, 86, 20);
		contentPane.add(valorDolares);
		
		
		// Botón conversión
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float euros;
				euros=Float.parseFloat(valorEuros.getText());
				valorDolares.setText(String.valueOf(euros*valorConversion));
			}
		});
		
		btnNewButton.setBounds(103, 67, 89, 23);
		contentPane.add(btnNewButton);
	}
}
