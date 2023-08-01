package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaDolar extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosArgentinos) {
        moneda = Moneda.DOLAR;
        return super.convertirParaMoneda(moneda, valorEnPesosArgentinos);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.DOLAR;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}

