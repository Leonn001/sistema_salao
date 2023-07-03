package br.ucsal.processosdesoftware20231.trabalho.tui;
import br.ucsal.processosdesoftware20231.trabalho.tui.util.*;
import br.ucsal.processosdesoftware20231.trabalho.domain.*;
import br.ucsal.processosdesoftware20231.trabalho.persistence.*;

public class FuncionarioTUI {
	
	private static final Integer SIM = 1;
	
	public static void incluir() {
		System.out.println("############ INCLUSÃO DE FUNCIONARIOS ############");

		Integer resposta = SIM;

		do {

			String nome = UtilTUI.obterString("Informe o nome");
			String especialiade = UtilTUI.obterString("Informe a especialidade:");
			int codigoEspecialidade = UtilTUI.obterInteger("Informe o codigo da especialidade:");
			int codigo = UtilTUI.obterInteger("Informe o codigo");


			Funcionario funcionario = new Funcionario(nome,especialiade,codigoEspecialidade,codigo);

			try {
				FuncionarioDAO.insert(funcionario);
				System.out.println("Inclusão feita com sucesso.");
				return;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				resposta = UtilTUI.obterInteger("Deseja tentar incluir de novo, corrigindo os dados (1 para sim e 2 para não)? ");
			}

		} while (resposta == SIM);

	}
}