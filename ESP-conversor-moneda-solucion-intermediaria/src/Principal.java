import enums.TipoConversion;
import model.*;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) throws Exception {

		String conversionDeMoneda = "Convertir moneda";
		String conversionDeTemperatura = "Convertir temperatura";

		boolean ejecuta = true;

		Repetidor repetidor = new Repetidor();

		while (ejecuta) {
			String operacion = JOptionPane.showInputDialog(null, "Elija la operación que quiere realizar",
					"Conversiones", JOptionPane.QUESTION_MESSAGE, null,
					new String[] { conversionDeMoneda, conversionDeTemperatura }, "Elección").toString();

			if (operacion.equals(conversionDeMoneda)) {
				IniciadorConversionMonedas iniciadorConversionMonedas = new IniciadorConversionMonedas();
				String operadorDeMonedas = JOptionPane
						.showInputDialog(null, "Elige una moneda", "Monedas", JOptionPane.WARNING_MESSAGE, null,
								new String[] { TipoConversion.PESO_ARGENTINO_PARA_DOLAR.getDescripcion(),
										TipoConversion.DOLAR_PARA_PESO_ARGENTINO.getDescripcion(),
										TipoConversion.PESO_ARGENTINO_PARA_EURO.getDescripcion(),
										TipoConversion.EURO_PARA_PESO_ARGENTINO.getDescripcion(),
										TipoConversion.PESO_ARGENTINO_PARA_LIBRA_ESTERLINA.getDescripcion(),
										TipoConversion.LIBRA_ESTERLINA_PARA_PESO_ARGENTINO.getDescripcion(),
										TipoConversion.PESO_ARGENTINO_PARA_REAL.getDescripcion(),
										TipoConversion.REAL_PARA_PESO_ARGENTINO.getDescripcion(),
										TipoConversion.PESO_ARGENTINO_PARA_PESO_CHILENO.getDescripcion(),
										TipoConversion.PESO_CHILENO_PARA_PESO_ARGENTINO.getDescripcion(),
										TipoConversion.PESO_ARGENTINO_PARA_PESO_COLOMBIANO.getDescripcion(),
										TipoConversion.PESO_COLOMBIANO_PARA_PESO_ARGENTINO.getDescripcion(),
										TipoConversion.PESO_ARGENTINO_PARA_PESO_URUGUAYO.getDescripcion(),
										TipoConversion.PESO_URUGUAYO_PARA_PESO_ARGENTINO.getDescripcion()},
								"Escoja")
						.toString();

				String valorString = JOptionPane.showInputDialog("Introduzca la cantidad de dinero a transformar");
				Validador validador = new Validador();
				if (!validador.verificar(valorString)) {
					JOptionPane.showMessageDialog(null, "Inválido");
				} else {
					double valorInicial = validador.transformarEnDouble(valorString);
					BigDecimal valorConvertido = iniciadorConversionMonedas.ConversionMoneda(operadorDeMonedas,
							valorInicial);
					JOptionPane.showMessageDialog(null, valorConvertido);
				}
			} else if (operacion.equals(conversionDeTemperatura)) {
				IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
				String operadorDeTemperatura = JOptionPane.showInputDialog(null, "Elija la escala de temperatura",
						"Monedas", JOptionPane.QUESTION_MESSAGE, null,
						new String[] { TipoConversion.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
								TipoConversion.CELSIUS_PARA_KELVIN.getDescripcion(),
								TipoConversion.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
								TipoConversion.KELVIN_PARA_CELSIUS.getDescripcion(),
								TipoConversion.KELVIN_PARA_FAHRENHEIT.getDescripcion() },
						"Escoja").toString();

				String valorString = JOptionPane.showInputDialog("Introduce un valor");
				Validador validador = new Validador();
				if (!validador.verificar(valorString)) {
					JOptionPane.showMessageDialog(null, "Inválido");
				} else {
					double valorInicial = validador.transformarEnDouble(valorString);
					double valorConvertido = iniciadorConversionTemperatura.ConversionTemperatura(operadorDeTemperatura, valorInicial);
					JOptionPane.showMessageDialog(null, valorConvertido);
				}
			}
			ejecuta = repetidor.intentaRepetir();
		}

	}
}