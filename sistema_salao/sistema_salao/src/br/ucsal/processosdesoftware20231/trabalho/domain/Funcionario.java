package br.ucsal.processosdesoftware20231.trabalho.domain;

public class Funcionario {
	
	private int codigo;
	private String nome;
	private String especialidade;	
	private int codigoEspecialidade;
	private boolean disponivel;
	
	public Funcionario(String nome, String especialidade, int codigoEspecialidade,int codigo) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.disponivel = true;
		this.codigoEspecialidade = codigoEspecialidade;
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public int getCodigoEspecialidade() {
		return codigoEspecialidade;
	}
	public void setCodigoEspecialidade(int codigoEspecialidade) {
		this.codigoEspecialidade = codigoEspecialidade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
