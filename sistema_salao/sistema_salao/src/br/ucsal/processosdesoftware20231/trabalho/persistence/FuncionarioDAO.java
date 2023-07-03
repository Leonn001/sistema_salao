package br.ucsal.processosdesoftware20231.trabalho.persistence;
import br.ucsal.processosdesoftware20231.trabalho.domain.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class FuncionarioDAO {
	
	private static List<Funcionario> funcionarios = new ArrayList<>();
	
	public static void insert(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public static void remove(Funcionario funcionario) {
		if(funcionarios.contains(funcionario)) {
			funcionarios.remove(funcionario);
		}
	}

	public static List<Funcionario> ordenarFuncionarios(){
		List<Funcionario> funcionariosOrdenados = new ArrayList<>(funcionarios);
		funcionariosOrdenados.sort(Comparator.comparing(Funcionario::getNome).thenComparing(Funcionario::getEspecialidade));
		return funcionariosOrdenados;
	}
	
	public static void listarFuncionarios() {
        List<Funcionario> funcionariosOrdenados = ordenarFuncionarios();
        
        for (Funcionario funcionario : funcionariosOrdenados) {
        	System.out.println(funcionario.getNome()+" , especialidade: " + funcionario.getEspecialidade());
            

        }


    }
}
