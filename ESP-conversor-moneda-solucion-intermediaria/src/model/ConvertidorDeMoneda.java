package model;

import enums.Moneda;
import interfaces.MonedaConvertible;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class ConvertidorDeMoneda implements MonedaConvertible {

    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosArgentinos) { // de peso arg para
        return valorEnPesosArgentinos.divide(moneda.getFACTOR_CONVERSION(), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda){ // a peso argentino
        return valorEnMoneda.multiply(moneda.getFACTOR_CONVERSION());
    }

}