package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaLibraEsterlina extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosArgentinos) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaMoneda(moneda, valorEnPesosArgentinos);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}


