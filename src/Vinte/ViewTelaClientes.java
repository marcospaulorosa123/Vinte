package Vinte;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ViewTelaClientes {

	private JFrame frame;
	private TextField textFieldNome;
	private TextField textFieldCpf;
	private TextField textFieldFiado;
	//protected Clientes c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//System.out.println("hello guys");
		
		//JOptionPane.showMessageDialog( null, "Hello Marcos, nice to meet you");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaClientes window = new ViewTelaClientes();
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
	public ViewTelaClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.desktop);
		frame.setType(Type.UTILITY);
		frame.getContentPane().setLayout(null);
		
		Label label_cod = new Label("Código do Cliente:");
		label_cod.setBackground(SystemColor.inactiveCaptionBorder);
		label_cod.setBounds(100, 10, 225, 21);
		frame.getContentPane().add(label_cod);
		
		TextField textFieldCod = new TextField();
		textFieldCod.setBounds(100, 37, 225, 22);
		frame.getContentPane().add(textFieldCod);
		
		Button cadastra_cliente = new Button("Cadastrar Cliente");
		cadastra_cliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("cliente cadastrado");
				
				
				JOptionPane.showMessageDialog(
						null,"Nome: "+ textFieldNome.getText()+
						"\nCodigo: "+ textFieldCod.getText()+
						"\nCPF: "+ textFieldCpf.getText()+
						"\nCompra Fiado: "+ textFieldFiado.getText()+
						"\nSuccessfully registered customer");

				
			}
		});
		cadastra_cliente.setBounds(100, 229, 225, 22);
		frame.getContentPane().add(cadastra_cliente);
		
		Label label_nome = new Label("Nome do Cliente:");
		label_nome.setBackground(SystemColor.inactiveCaptionBorder);
		label_nome.setBounds(100, 65, 225, 22);
		frame.getContentPane().add(label_nome);
		
		Label label_cpf = new Label("CPF do Cliente:");
		label_cpf.setBackground(SystemColor.inactiveCaptionBorder);
		label_cpf.setBounds(100, 121, 225, 22);
		frame.getContentPane().add(label_cpf);
		
		Label label_fiado = new Label("Cliente compra Fiado:\r\n('SIM' ou 'NÃO')");
		label_fiado.setBackground(SystemColor.inactiveCaptionBorder);
		label_fiado.setBounds(100, 177, 225, 18);
		frame.getContentPane().add(label_fiado);
		
		textFieldNome = new TextField();
		textFieldNome.setBounds(100, 93, 225, 22);
		frame.getContentPane().add(textFieldNome);
		
		textFieldCpf = new TextField();
		textFieldCpf.setBounds(100, 149, 225, 22);
		frame.getContentPane().add((Component) textFieldCpf);
		
		textFieldFiado = new TextField();
		textFieldFiado.setBounds(100, 201, 226, 22);
		frame.getContentPane().add(textFieldFiado);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}