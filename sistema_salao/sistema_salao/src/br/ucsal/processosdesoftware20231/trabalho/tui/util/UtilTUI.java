package br.ucsal.processosdesoftware20231.trabalho.tui.util;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.ucsal.processosdesoftware20231.trabalho.domain.Cliente;
import br.ucsal.processosdesoftware20231.trabalho.domain.Funcionario;
import br.ucsal.processosdesoftware20231.trabalho.persistence.ClienteDAO;
import br.ucsal.processosdesoftware20231.trabalho.persistence.FuncionarioDAO;

public class UtilTUI {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static Funcionario obterFuncionario(String mensagem) {
	    System.out.print("Digite o código do funcionário: ");
	    int codigoFuncionario = scanner.nextInt();
	    
	    for (Funcionario funcionario : FuncionarioDAO.ordenarFuncionarios()) {
	    	System.out.println("Testando nome funcionario: " + funcionario.getNome());
	        if (funcionario.getCodigo() == codigoFuncionario) {
	        	System.out.println("Testando codigo : " + funcionario.getCodigo());
	            return funcionario;
	        }
	    }
	    System.out.println("Funcionário não encontrado.");
	    return null;
	}
	
	public static Cliente obterCliente(String mensagem) {
	    System.out.print("Digite o código do cliente: ");
	    int codigoCliente = scanner.nextInt();
	    
	    for (Cliente cliente : ClienteDAO.ordenarClientes()) {

	        if (cliente.getCodigo() == codigoCliente) {
	            return cliente;
	            
	        }
	    }
	    System.out.println("Cliente não encontrado.");
		return null;
	}

	public static double obterDouble(String mensagem) {
		System.out.println(mensagem);
		double numero = scanner.nextDouble();
		scanner.nextLine();
		return numero;
	}
	
    public static Date obterData(String mensagem) {
        System.out.println(mensagem);
        String dataTexto = scanner.nextLine();

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = formatoData.parse(dataTexto);
            return data;
        } catch (ParseException e) {
            System.out.println("Formato de data inválido!");
            return null;
        }
    }

	public static Integer obterInteger(String mensagem) {
		System.out.println(mensagem);
		try {
			int numero = scanner.nextInt();
			return numero;
		} finally {
			scanner.nextLine();
		}
	}

	public static String obterString(String mensagem) {
		System.out.println(mensagem);
		return scanner.nextLine();
	}
	
	public static float obterFloat(String mensagem) {
		System.out.println(mensagem);
		try {
			float numero = scanner.nextFloat();
			return numero;
		} finally {
			scanner.nextLine();
		}
	}

}
