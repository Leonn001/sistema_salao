package br.ucsal.processosdesoftware20231.trabalho.tui;
import java.util.Date;
import br.ucsal.processosdesoftware20231.trabalho.domain.Cliente;
import br.ucsal.processosdesoftware20231.trabalho.domain.Funcionario;
import br.ucsal.processosdesoftware20231.trabalho.domain.Servico;
import br.ucsal.processosdesoftware20231.trabalho.persistence.AgendamentoDAO;
import br.ucsal.processosdesoftware20231.trabalho.tui.util.UtilTUI;

public class AgendamentoTUI {
	
	private static final Integer SIM = 1;
	
	public static void incluir() {
		System.out.println("############ INCLUSÃO DE SERVICOS ############");

		Integer resposta = SIM;

		do {

			Date data = UtilTUI.obterData("Informe a data do agendamento:");
			Cliente cliente = UtilTUI.obterCliente("Informe o cliente");
			Funcionario funcionario = UtilTUI.obterFuncionario("Informe o funcionario:");			
			Servico servico = new Servico(data,cliente,funcionario);
	

			try {
				AgendamentoDAO dao = new AgendamentoDAO();
				dao.agendar(servico,funcionario);
				System.out.println("Inclusão feita com sucesso.");
				return;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				resposta = UtilTUI.obterInteger("Deseja tentar incluir de novo, corrigindo os dados (1 para sim e 2 para não)? ");
			}

		} while (resposta == SIM);

	}
}
