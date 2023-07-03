package br.ucsal.processosdesoftware20231.trabalho.tui;
import br.ucsal.processosdesoftware20231.trabalho.persistence.ClienteDAO;
import br.ucsal.processosdesoftware20231.trabalho.persistence.FuncionarioDAO;
import br.ucsal.processosdesoftware20231.trabalho.persistence.ServicosAgendadosDAO;
import br.ucsal.processosdesoftware20231.trabalho.persistence.ServicosOferecidosDAO;
import br.ucsal.processosdesoftware20231.trabalho.tui.util.UtilTUI;

public class MenuTUI {
	
	public static void executar() {
		OpcaoMenuEnum opcaoSelecionada = null;
		do {
			try {
				exibirOpcoes();
				opcaoSelecionada = obterOpcaoSelecionada();
				executarOpcao(opcaoSelecionada);
			} catch (Exception e) {
				System.out.println("Algo de errado. Entre em contato com o suporte, informando erro 0134. (Erro="
						+ e.getClass() + ")");
			}
		} while (opcaoSelecionada == null || !opcaoSelecionada.equals(OpcaoMenuEnum.SAIR));
	}

	private static void executarOpcao(OpcaoMenuEnum opcaoSelecionada) {
		switch (opcaoSelecionada) {
		case CADASTRAR_CLIENTE:
			ClienteTUI.incluir();
			break;
		case CADASTRAR_FUNCIONARIO:
			FuncionarioTUI.incluir();
			break;
		case CADASTRAR_SERVICO:
			ServicoTUI.incluir();
			break;
		case REALIZAR_AGENDAMENTO:
			AgendamentoTUI.incluir();
			break;
		case LISTAR_CLIENTES:
			ClienteDAO.listarClientes();
			break;
		case LISTAR_FUNCIONARIOS:
			FuncionarioDAO.listarFuncionarios();
			break;
		case LISTAR_SERVICOS_OFERECIDOS:
			ServicosOferecidosDAO.listarServicosOferecidos();
			break;
		case LISTAR_SERVICOS_AGENDADOS:
			ServicosAgendadosDAO.listarServicosAgendados();
			break;
		case SAIR:
			System.out.println("Bye...");
			break;
		default:
			System.out.println("Opção não válida.");
			break;
		}
	}
	
	private static OpcaoMenuEnum obterOpcaoSelecionada() {
		Integer opcaoInt = UtilTUI.obterInteger("Informe a opção desejada:");
		return OpcaoMenuEnum.valueOfInteger(opcaoInt);
	}

	private static void exibirOpcoes() {
		System.out.println("\n\n############ MENU ############");
		for (OpcaoMenuEnum opcaoMenu : OpcaoMenuEnum.values()) {
			System.out.println(opcaoMenu.obterDescricaoCompleta());
		}
	}
}
