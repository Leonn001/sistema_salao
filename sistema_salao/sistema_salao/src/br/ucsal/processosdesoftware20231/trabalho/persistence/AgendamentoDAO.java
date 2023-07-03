package br.ucsal.processosdesoftware20231.trabalho.persistence;
import br.ucsal.processosdesoftware20231.trabalho.exception.*;
import br.ucsal.processosdesoftware20231.trabalho.domain.*;

public class AgendamentoDAO {
	
	public void agendar(Servico servico,Funcionario funcionario) throws Exception {
		try {
			verificarServicoFuncionario(servico,funcionario);
			verificarDisponibilidadeFuncionario(funcionario);
			ServicosAgendadosDAO.insert(servico);
			
			
		} catch (Exception e) {
			throw new AgendamentoException("Ocorreu um erro", e);
		}
	}
	
	public void verificarServicoFuncionario(Servico sevico,Funcionario funcionario) throws AgendamentoException {
		if(funcionario.getCodigoEspecialidade() != sevico.getCodigoServico()) {
			throw new AgendamentoException("Esse funcionário não faz esse tipo de servico");
		}
	}
	
	public void verificarDisponibilidadeFuncionario(Funcionario funcionario) throws AgendamentoException {
		if(funcionario.isDisponivel() == false) {
			throw new AgendamentoException("Esse funcionário está indisponível");
		}
	}
	
}
