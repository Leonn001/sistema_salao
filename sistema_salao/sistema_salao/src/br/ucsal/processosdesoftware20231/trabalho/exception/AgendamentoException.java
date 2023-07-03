package br.ucsal.processosdesoftware20231.trabalho.exception;

public class AgendamentoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public AgendamentoException(String message) {
		super(message);
	}

	public AgendamentoException(String message, Exception e) {
		super(message, e);
	}
}
