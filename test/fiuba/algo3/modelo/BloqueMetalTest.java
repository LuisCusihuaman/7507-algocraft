package fiuba.algo3.modelo;

import org.junit.Assert;
import org.junit.Test;

public class BloqueMetalTest {

    @Test
    public void test01BloqueDeMetalEsGolpeadoConPicoDeMaderaYSeVerificaQueNoSeReduceSuDurabilidad(){

        Madera madera = new Madera();
        Pico picoDeMadera = new Pico(madera);

        BloqueMetal bloque = new BloqueMetal();

        bloque.recibirDanio(picoDeMadera);

        Assert.assertEquals(50, bloque.getDurabilidad());
    }

    @Test
    public void test02BloqueDeMetalEsGolpeadoConPicoDePiedraYSeReduceSuDurabilidadCorrectamente(){

        Piedra piedra = new Piedra();
        Pico picoDePiedra = new Pico(piedra);

        BloqueMetal bloqueMetal = new BloqueMetal();
        int durabilidadInicialBloque = bloqueMetal.getDurabilidad();

        bloqueMetal.recibirDanio(picoDePiedra);

        Assert.assertEquals(durabilidadInicialBloque - 4, bloqueMetal.getDurabilidad());
    }

}