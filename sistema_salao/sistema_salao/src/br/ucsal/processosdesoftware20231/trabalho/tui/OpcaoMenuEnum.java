package br.ucsal.processosdesoftware20231.trabalho.tui;

public enum OpcaoMenuEnum {
	
	CADASTRAR_CLIENTE(1, "Cadastrar cliente"),

	CADASTRAR_FUNCIONARIO(2, "Cadastrar funcionario"),
	
	CADASTRAR_SERVICO(3, "Cadastrar servico"),
	
	REALIZAR_AGENDAMENTO(4, "Realizar um agendamento"),
	
	LISTAR_CLIENTES(5, "Listar os clientes"),
	
	LISTAR_FUNCIONARIOS(6, "Listar os funcionarios"),
	
	LISTAR_SERVICOS_OFERECIDOS(7, "Listar os servicos"),
	
	LISTAR_SERVICOS_AGENDADOS(8, "Listar os servicos agendados"),
	
	SAIR(9, "SAIR");
	
	private Integer codigo;
	
	private String descricao;
	
	private OpcaoMenuEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String obterDescricaoCompleta() {
		return codigo + " " + descricao;
	}
	
	public static OpcaoMenuEnum valueOfInteger(Integer opcaoInteger) {
		for (OpcaoMenuEnum opcaoMenu : values()) {
			if (opcaoMenu.codigo.equals(opcaoInteger)) {
				return opcaoMenu;
			}
		}
		return null;
	}	
}
