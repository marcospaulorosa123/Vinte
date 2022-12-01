package Vinte;


public class Clientes {
	private String codigo;
	private String nome;
	private String cpf;
	private String compraFiado;
	
	Clientes(String param_codigo, String param_nome, String param_cpf, String param_compraFiado){
		this.codigo = param_codigo;
		this.nome = param_nome;
		this.cpf = param_cpf;
		this.compraFiado = param_compraFiado;
	}
	 void mostra() {
		System.out.println("\tcodigo: " + this.codigo);
		System.out.println("\tnome: " + this.nome);
		System.out.println("\tsalario " + this.cpf);
		System.out.println("\tsalario " + this.compraFiado);
		}

	public Clientes() {
		// TODO Auto-generated constructor stub
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCompraFiado() {
		return compraFiado;
	}
	public void setCompraFiado(String compraFiado) {
		this.compraFiado = compraFiado;
	}
}
