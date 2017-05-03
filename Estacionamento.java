
public class Estacionamento {

	public static final float VALOR_FRACAO = (float) 2.0;
	public static final float VALOR_HORA = (float) 7.0;
	public static final float VALOR_DIARIA = (float) 30.0;
	
	public static float calcularPagamento(int horas, int minutos){
		
		if (horas >= 9){
			return VALOR_DIARIA;
		} else {
		
			final float valorTotalHoras = horas  * VALOR_HORA;
			final float valorTotalMinutos = (float) (Math.ceil(minutos / 15.0) * VALOR_FRACAO);
			return valorTotalHoras + valorTotalMinutos;
		}
	}
	
}
