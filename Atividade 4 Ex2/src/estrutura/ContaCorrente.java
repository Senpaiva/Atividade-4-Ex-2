package estrutura;

public class ContaCorrente extends Conta{
	private float limiteDeCredito;
	
	public ContaCorrente(float saldo, String tipo, float limite) {
		super(saldo, tipo);
	}

}
