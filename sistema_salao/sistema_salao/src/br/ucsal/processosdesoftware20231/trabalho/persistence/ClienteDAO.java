package br.ucsal.processosdesoftware20231.trabalho.persistence;
import br.ucsal.processosdesoftware20231.trabalho.domain.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ClienteDAO {
	
	private static List<Cliente> clientes = new ArrayList<>();
	
	public static void insert(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public static void remove(Cliente cliente) {
		if(clientes.contains(cliente)) {
			clientes.remove(cliente);
		}
	}

	public static List<Cliente> ordenarClientes(){
		List<Cliente> clientesOrdenados = new ArrayList<>(clientes);
		clientesOrdenados.sort(Comparator.comparing(Cliente::getNome));
		return clientesOrdenados;
	}
	
	public static void listarClientes() {
        List<Cliente> clientesOrdenados = ordenarClientes();


        for (Cliente cliente : clientesOrdenados) {
			System.out.println(cliente.getNome());
    
        }

    }
}
