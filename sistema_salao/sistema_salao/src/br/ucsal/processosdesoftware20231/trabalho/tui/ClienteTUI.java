package br.ucsal.processosdesoftware20231.trabalho.tui;
import br.ucsal.processosdesoftware20231.trabalho.tui.util.*;
import br.ucsal.processosdesoftware20231.trabalho.domain.*;
import br.ucsal.processosdesoftware20231.trabalho.persistence.*;

public class ClienteTUI {
	
	private static final Integer SIM = 1;
	
	public static void incluir() {
		System.out.println("############ INCLUSÃO DE CLIENTES ############");

		Integer resposta = SIM;

		do {

			String nome = UtilTUI.obterString("Informe o nome");
			String cpf = UtilTUI.obterString("Informe o cpf:");
			int codigo = UtilTUI.obterInteger("Informe o codigo");


			Cliente cliente = new Cliente(nome,cpf,codigo);

			try {
				ClienteDAO.insert(cliente);
				System.out.println("Inclusão feita com sucesso.");
				return;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				resposta = UtilTUI.obterInteger("Deseja tentar incluir de novo, corrigindo os dados (1 para sim e 2 para não)? ");
			}

		} while (resposta == SIM);

	}
}
