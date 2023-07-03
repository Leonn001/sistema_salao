package br.ucsal.processosdesoftware20231.trabalho.tui;
import br.ucsal.processosdesoftware20231.trabalho.domain.Servico;
import br.ucsal.processosdesoftware20231.trabalho.persistence.ServicosOferecidosDAO;
import br.ucsal.processosdesoftware20231.trabalho.tui.util.UtilTUI;


public class ServicoTUI {
	private static final Integer SIM = 1;
	
	public static void incluir() {
		System.out.println("############ INCLUSÃO DE SERVICOS ############");

		Integer resposta = SIM;

		do {

			String descricao = UtilTUI.obterString("Informe o tipo de servico:");
			float valor = UtilTUI.obterFloat("Informe o valor:");
			int codigoServico = UtilTUI.obterInteger("Informe o codigo do servico:");
			System.out.println("OBS: O codigo de servico deve ser referenciado no funcionario (para o mesmo servico prestado, mesmo codigo");


			Servico servico = new Servico(descricao,valor,codigoServico);

			try {
				ServicosOferecidosDAO.insert(servico);
				System.out.println("Inclusão feita com sucesso.");
				return;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				resposta = UtilTUI.obterInteger("Deseja tentar incluir de novo, corrigindo os dados (1 para sim e 2 para não)? ");
			}

		} while (resposta == SIM);

	}
}
