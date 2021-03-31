package estrutura;

import java.util.Date;

public class Cartao {
	private String senha;
	private float limite;
	private Date exp;
	
	public Cartao(String senha, float limite, Date exp) {
		this.senha = senha;
		this.limite = limite;
		this.exp = exp;
	}
	
	public void validarSenha() {
		
	}
}
