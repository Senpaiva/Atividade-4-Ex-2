package estrutura;

public class Atm {
	private int limiteTransacao;
	private TransacaoRemota tran;
	
	public Atm(int limite, TransacaoRemota tran){
		this.limiteTransacao = limite;
		this.tran = tran;
	}
	
	public boolean verificarCartao() {
		return true;
	}
	
	public boolean verificarValor() {
		return true;
	}
	public void desembFundos() {
		
	}
	public void receberFundos() {
		
	}
}
