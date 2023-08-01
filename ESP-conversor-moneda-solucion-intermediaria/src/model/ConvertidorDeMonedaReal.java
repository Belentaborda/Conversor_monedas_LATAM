package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaReal extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosArgentinos) {
        moneda = Moneda.REAL;
        return super.convertirParaMoneda(moneda, valorEnPesosArgentinos);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.REAL;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}
