package br.com.hcb.empresa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.hcb.empresa.FiltradorDeGastosEspeciais;
import br.com.hcb.empresa.modelo.Gasto;

public class FiltradorDeGastosEspeciaisTest {

    @Test
    public void testVerificaGastosAcimaLimite() {

        Gasto gasto1 = new Gasto(120, "abaixo", null, null);
        Gasto gasto2 = new Gasto(180, "igual", null, null);
        Gasto gasto3 = new Gasto(200, "acima", null, null);
        // List<Gasto> lista = Arrays.asList(g1, g2, g3);
        List<Gasto> gastos = new ArrayList<Gasto>();
        gastos.add(gasto1);
        gastos.add(gasto2);
        gastos.add(gasto3);
        FiltradorDeGastosEspeciais filtradorDeGastosEspeciais = new FiltradorDeGastosEspeciais(180);
        List<Gasto> filtraGastosGrandes = filtradorDeGastosEspeciais.filtraGastosGrandes(gastos);
        assertNotNull(filtraGastosGrandes);
        assertEquals(1, filtraGastosGrandes.size());
    }

}
