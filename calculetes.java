package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculetes {

	private JFrame frmCalculadora;
	private JTextField numero1;
	private JTextField numero2;
	public float calculoInterno;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculetes window = new calculetes();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public calculetes() {
		initialize();
	}
	
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aluno\\Downloads\\1346551.png"));
		frmCalculadora.setTitle("Calculadora\r\n");
		frmCalculadora.setBounds(100, 100, 643, 599);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 607, 538);
		frmCalculadora.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setBounds(259, 5, 88, 27);
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setFont(new Font("MV Boli", Font.BOLD, 11));
		btnNewButton.setBounds(407, 148, 49, 46);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.setFont(new Font("MV Boli", Font.BOLD, 11));
		btnNewButton_1.setBounds(466, 148, 49, 46);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setFont(new Font("MV Boli", Font.BOLD, 11));
		btnNewButton_2.setBounds(525, 148, 72, 46);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.setFont(new Font("MV Boli", Font.BOLD, 11));
		btnNewButton_3.setBounds(407, 205, 49, 46);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("√");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_4.setBounds(466, 205, 49, 46);
		panel.add(btnNewButton_4);
		
		JButton btnn = new JButton("(N)^");
		btnn.setFont(new Font("MV Boli", Font.BOLD, 11));
		btnn.setBounds(525, 205, 72, 46);
		panel.add(btnn);
		
		JButton btnNewButton_6 = new JButton("=");
		btnNewButton_6.setFont(new Font("MV Boli", Font.BOLD, 11));
		btnNewButton_6.setBounds(466, 262, 49, 46);
		panel.add(btnNewButton_6);
		
		numero1 = new JTextField();
		numero1.setBounds(10, 161, 237, 20);
		panel.add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setBounds(10, 192, 237, 20);
		panel.add(numero2);
		numero2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("RESULTADO");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 221, 237, 14);
		panel.add(lblNewLabel_1);
		
		//Região para execultar as funções dos botções//
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculando soma = new calculando();
				float valorFloat = Float.valueOf(numero1.getText());
				float valorFloat1 = Float.valueOf(numero2.getText());
				
				calculoInterno = soma.soma(valorFloat, valorFloat1);
				System.out.println(calculoInterno);
				
			}
		});
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = String.valueOf(calculoInterno);
				lblNewLabel_1.setText(resultado);;			
				}
		});
	
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculando multiplica = new calculando();
				float valorFloat = Float.valueOf(numero1.getText());
				float valorFloa1 = Float.valueOf(numero2.getText());
				
				calculoInterno = multiplica.multiplca(valorFloat, valorFloa1);
				System.out.println(calculoInterno);
				
			}
		});

		
		btnn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculando potencia = new calculando();
				float valorFloat = Float.valueOf(numero1.getText());
				float valorFloa1 = Float.valueOf(numero2.getText());
				
					calculoInterno = potencia.potencia(valorFloat, valorFloa1);
					System.out.println(calculoInterno);
				
			}
		});
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculando divisao = new calculando();
				float valorFloat = Float.valueOf(numero1.getText());
				float valorFloa1 = Float.valueOf(numero2.getText());
				
				calculoInterno = divisao.divisao(valorFloat, valorFloa1);
				System.out.println(calculoInterno);
			}
		});
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculando menos = new calculando();
				float valorFloat = Float.valueOf(numero1.getText());
				float valorFloa1 = Float.valueOf(numero2.getText());
				
				calculoInterno = menos.menos(valorFloat, valorFloa1);
				System.out.println(calculoInterno);
			}
		});
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculando raiz = new calculando();
				float valorFloat = Float.valueOf(numero1.getText());
				
				calculoInterno = raiz.raiz(valorFloat);
				System.out.println(calculoInterno);
			}
		});
	}
}
