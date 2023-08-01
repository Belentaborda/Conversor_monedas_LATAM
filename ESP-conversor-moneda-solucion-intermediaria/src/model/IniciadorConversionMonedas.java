package model;

import enums.Moneda;
import enums.TipoConversion;

import java.math.BigDecimal;

public class IniciadorConversionMonedas {

	private static final String PESO_ARGENTINO_PARA_DOLAR = "De Peso Argentino a Dolar";
	private static final String DOLAR_PARA_PESO_ARGENTINO = "De dolar a Peso Argentino";

	private static final String PESO_ARGENTINO_PARA_EURO = "De Peso Argentino a Euro";
	private static final String EURO_PARA_PESO_ARGENTINO = "De Euro a Peso Argentino";

	private static final String PESO_ARGENTINO_PARA_LIBRA_ESTERLINA = "De Peso Argentino a Libra Esterlina";
	private static final String LIBRA_ESTERLINA_PARA_PESO_ARGENTINO = "De Libra Esterlina a Peso Argentino";

	private static final String PESO_ARGENTINO_PARA_REAL = "De Peso Argentino a Real";
	private static final String REAL_PARA_PESO_ARGENTINO = "De Real a Peso Argentino";

	private static final String PESO_ARGENTINO_PARA_PESO_CHILENO = "De Peso Argentino a Peso Chileno";
	private static final String PESO_CHILENO_PARA_PESO_ARGENTINO = "De Peso Chileno a Peso Argentino";

	private static final String PESO_ARGENTINO_PARA_PESO_COLOMBIANO = "De Peso Argentino a Peso Colombiano";
	private static final String PESO_COLOMBIANO_PARA_PESO_ARGENTINO = "De Peso Colombiano a Peso Argentino";

	private static final String PESO_ARGENTINO_PARA_PESO_URUGUAYO = "De Peso Argentino a Peso Urugayo";
	private static final String PESO_URUGUAYO_PARA_PESO_ARGENTINO = "De Peso Uruguayo a Peso Argentino";

	private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
	private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
	private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
	private ConvertidorDeMoneda convertirdorDeMonedaReal = new ConvertidorDeMonedaReal();
	private ConvertidorDeMoneda convertidorDeMonedaPesoChileno = new ConvertidorDeMonedaPesoChileno();
	private ConvertidorDeMoneda convertidorDeMonedaPesoColombiano = new ConvertidorDeMonedaPesoColombiano();
	private ConvertidorDeMoneda convertidorDeMonedaPesoUrugayo = new ConvertidorDeMonedaPesoUrugayo();

	private Moneda moneda;

	public BigDecimal ConversionMoneda(String operacionMonedas, double valorInicial) throws Exception {

		switch (operacionMonedas) {
		case PESO_ARGENTINO_PARA_DOLAR -> {
			return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
		}
		case DOLAR_PARA_PESO_ARGENTINO -> {
			return convertidorDeMonedaDolar.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
		}
		case PESO_ARGENTINO_PARA_EURO -> {
			return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
		}
		case EURO_PARA_PESO_ARGENTINO -> {
			return convertidorDeMonedaEuro.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
		}
		case PESO_ARGENTINO_PARA_LIBRA_ESTERLINA -> {
			return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
		}
		case LIBRA_ESTERLINA_PARA_PESO_ARGENTINO -> {
			return convertidorDeMonedaLibraEsterlina.convertirParaPesoArgentino(moneda,
					BigDecimal.valueOf(valorInicial));
		}
		case PESO_ARGENTINO_PARA_REAL -> {
			return convertirdorDeMonedaReal.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
		}
		case REAL_PARA_PESO_ARGENTINO -> {
			return convertirdorDeMonedaReal.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
		}
		case PESO_ARGENTINO_PARA_PESO_CHILENO -> {
			return convertidorDeMonedaPesoChileno.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
		}
		case PESO_CHILENO_PARA_PESO_ARGENTINO -> {
			return convertidorDeMonedaPesoChileno.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
		}
		case PESO_ARGENTINO_PARA_PESO_COLOMBIANO -> {
			return convertidorDeMonedaPesoColombiano.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
		}
		case PESO_COLOMBIANO_PARA_PESO_ARGENTINO -> {
			return convertidorDeMonedaPesoColombiano.convertirParaPesoArgentino(moneda,
					BigDecimal.valueOf(valorInicial));
		}
		case PESO_ARGENTINO_PARA_PESO_URUGUAYO -> {
			return convertidorDeMonedaPesoUrugayo.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
		}
		case PESO_URUGUAYO_PARA_PESO_ARGENTINO -> {
			return convertidorDeMonedaPesoUrugayo.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
		}

		default -> throw new Exception("Inválido");
		}

	}

}
