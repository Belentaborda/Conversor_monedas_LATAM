package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaEuro extends ConvertidorDeMoneda {
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosArgentinos) {
        moneda = Moneda.EURO;
        return super.convertirParaMoneda(moneda, valorEnPesosArgentinos);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.EURO;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}

