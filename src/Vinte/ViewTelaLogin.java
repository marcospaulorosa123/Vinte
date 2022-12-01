package Vinte;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class ViewTelaLogin {

	private JFrame frame;
	private JPasswordField textFieldSenha;
	private JTextField textFieldLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaLogin window = new ViewTelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewTelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldSenha = new JPasswordField();
		textFieldSenha.setBounds(126, 130, 163, 20);
		frame.getContentPane().add(textFieldSenha);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(126, 73, 163, 20);
		frame.getContentPane().add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		JLabel lblNewLabelLogin = new JLabel("Login");
		lblNewLabelLogin.setBounds(126, 48, 46, 14);
		frame.getContentPane().add(lblNewLabelLogin);
		
		JLabel lblNewLabelSenha = new JLabel("Senha");
		lblNewLabelSenha.setBounds(126, 105, 46, 14);
		frame.getContentPane().add(lblNewLabelSenha);
		
		JButton btnNewButtonEntrar = new JButton("Entrar");
		btnNewButtonEntrar.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if (validaLogin(textFieldLogin.getText(), new String(textFieldSenha.getPassword()))) {
				
				JOptionPane.showMessageDialog(null, "Welcome to Bodega!");
				
			}else {
				JOptionPane.showMessageDialog(null, "Error in user or password!");
			}
			
	}
});
	btnNewButtonEntrar.setBounds(167, 177, 89, 23);
	frame.getContentPane().add(btnNewButtonEntrar);
	
	}
	
	public boolean validaLogin(String login, String senha) {
		return login.equals("admin") && senha.equals("admin");
	}
	
}