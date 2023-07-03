package br.ucsal.processosdesoftware20231.trabalho.persistence;
import br.ucsal.processosdesoftware20231.trabalho.domain.Servico;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ServicosOferecidosDAO {
	
	private static List<Servico> servicos = new ArrayList<>();
	
	public static void insert(Servico servico) {
		servicos.add(servico);
	}
	
	public static void remove(Servico servico) {
		if(servicos.contains(servico)) {
			servicos.remove(servico);
		}
	}

	public static List<Servico> ordenarServicosOferecidos(){
		List<Servico> servicosOrdenados = new ArrayList<>(servicos);
		servicosOrdenados.sort(Comparator.comparing(Servico::getDescricao).thenComparing((Servico::getValor)));
		return servicosOrdenados;
	}
	
	public static void listarServicosOferecidos() {
        List<Servico> servicosOrdenados = ordenarServicosOferecidos();
       

        for (Servico servico : servicosOrdenados) {
        	System.out.println(servico.getDescricao() +", "+ servico.getValor());
        }

    }
}
