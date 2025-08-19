package sistemabancario;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTeste1 {
	
	private GerenciadoraClientes gerClientes;
	
	@Test
	public void testePesquisaCliente1() {
		/* ==== Montagem do cenário ==== */
		//Criando alguns clientes
		Cliente cliente01 = new Cliente(1, "João da Silva", 47, "joaodasilva@gmail.com", 1, true);
		
		Cliente cliente02 = new Cliente(2, "João da Silva", 37, "mariadasilva@gmail.com", 2, true);
		
		List<Cliente> clientesDoBanco = new ArrayList<Cliente>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		/*========  Execução  =======*/
		Cliente clienteTeste = gerClientes.pesquisaCliente(1);
	}
	
	
	
	
}
