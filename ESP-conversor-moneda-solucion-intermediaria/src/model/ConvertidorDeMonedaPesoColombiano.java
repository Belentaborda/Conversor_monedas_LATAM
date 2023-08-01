package model;

import java.math.BigDecimal;

import enums.Moneda;

public class ConvertidorDeMonedaPesoColombiano extends ConvertidorDeMoneda {
	@Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesosArgentinos) {
        moneda = Moneda.PESO_COLOMBIANO;
        return super.convertirParaMoneda(moneda, valorEnPesosArgentinos);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_COLOMBIANO;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
	
	
}

