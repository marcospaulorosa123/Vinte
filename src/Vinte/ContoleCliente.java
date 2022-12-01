package Vinte;

public class ContoleCliente {
	public boolean cadastraCliente (Clientes c) {
		
		boolean result = false;
		
		if (c != null && 
				c.getCodigo().length() > 0
				&& c.getNome().length() > 0
				&& c.getCpf() != "0"
				&& c.getCompraFiado() != null ){
					
			
					return true;
				}
		return result;
	}
}
