package estrutura;

import java.util.Date;

public class TransacaoRemota {
	private Date data;
	private Byte foto;
	private float valor;
	
	public TransacaoRemota(Date data, Byte foto, float valor) {
		this.data = data;
		this.foto = foto;
		this.valor = valor;
	}
}
