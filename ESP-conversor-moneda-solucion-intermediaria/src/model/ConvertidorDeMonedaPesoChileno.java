package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaPesoChileno extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosArgentinos) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaMoneda(moneda, valorEnPesosArgentinos);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}

