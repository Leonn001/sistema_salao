package br.ucsal.processosdesoftware20231.trabalho.domain;
import java.util.Date;

public class Servico {
	
	private String descricao;
	private int codigoServico;
	private Date dataMarcada;
	private Cliente cliente;
	private Funcionario funcionario;
	private float valor;
	
	// Construtor para cadastrar um serviço
	public Servico(String descricao,float valor, int codigoServico) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.codigoServico = codigoServico;
	}
	
	// Construtor para agendar um serviço
	public Servico(Date dataMarcada,Cliente cliente,Funcionario funcionario ) {
		super();
		this.dataMarcada = dataMarcada;
		this.cliente = cliente;
		this.funcionario = funcionario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataMarcada() {
		return dataMarcada;
	}

	public void setDataMarcada(Date dataMarcada) {
		this.dataMarcada = dataMarcada;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(int codigoServico) {
		this.codigoServico = codigoServico;
	}
}
