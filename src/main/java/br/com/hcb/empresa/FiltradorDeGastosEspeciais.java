package br.com.hcb.empresa;

import java.util.ArrayList;
import java.util.List;

import br.com.hcb.empresa.modelo.Gasto;

public class FiltradorDeGastosEspeciais {
	
	private double limite;
		
	public FiltradorDeGastosEspeciais(double limite) {
		this.limite = limite;
	}

	public List<Gasto> filtraGastosGrandes(List<Gasto> gastos) {
        List<Gasto> gastosAcimaDoLimite = new ArrayList<Gasto>();
        for (Gasto gasto : gastos) {
            if(gasto.getValor() > this.limite) 
                gastosAcimaDoLimite.add(gasto);
        }
        return gastosAcimaDoLimite;
    }
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
