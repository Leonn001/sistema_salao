package br.ucsal.processosdesoftware20231.trabalho.persistence;
import br.ucsal.processosdesoftware20231.trabalho.domain.Servico;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Iterator;


public class ServicosAgendadosDAO {
	
	private static List<Servico> servicos = new ArrayList<>();
	
	public static void insert(Servico servico) {
		servicos.add(servico);
		servico.getFuncionario().setDisponivel(false);
	}
	
	public static void remove(Servico servico) {
		if(servicos.contains(servico)) {
			servicos.remove(servico);
			servico.getFuncionario().setDisponivel(true);
		}
	}

	public static List<Servico> ordenarServicosAgendados(){
		List<Servico> servicosOrdenados = new ArrayList<>(servicos);
		servicosOrdenados.sort(Comparator.comparing(Servico::getDataMarcada).thenComparing((Servico::getDescricao)));
		return servicosOrdenados;
	}
	
	public static void listarServicosAgendados() {
        List<Servico> servicosOrdenados = ordenarServicosAgendados();

        for (Servico servico : servicosOrdenados) {
        	System.out.println("Data: " + servico.getDataMarcada()+ ", cliente: " + servico.getCliente());
    
        }

    }
}
