package enums;

import java.math.BigDecimal;

public enum Moneda {

    //Cotizaciones al 29/07/2023 Argentina 
    DOLAR(BigDecimal.valueOf(273.16)),
    EURO(BigDecimal.valueOf(301.47)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(350.90)),
    REAL(BigDecimal.valueOf(57.80)),
    PESO_CHILENO(BigDecimal.valueOf(0.33)),
	PESO_COLOMBIANO(BigDecimal.valueOf(0.069)),
	PESO_URUGAYO(BigDecimal.valueOf(7.24));

    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }
}
