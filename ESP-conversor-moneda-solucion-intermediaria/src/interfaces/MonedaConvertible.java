package interfaces;

import enums.Moneda;

import java.math.BigDecimal;

public interface MonedaConvertible {

    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosArgentinos);
    BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda);

}