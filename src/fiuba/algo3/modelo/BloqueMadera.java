package fiuba.algo3.modelo;

public class BloqueMadera extends Bloque {

    public BloqueMadera()
    {
        this.durabilidad = 10;
        this.identificador = 'm';
    }

    public void recibirDanio(Pico pico)
    {
        this.durabilidad -= 0;
        pico.desgastar();
    }

    public void recibirDanio(Hacha hacha)
    {
        if(durabilidad <= 0){
            throw new BloqueSeRompioException();
        }
        durabilidad -= hacha.getFuerza();
        hacha.desgastar();
    }

    public void recibirDanio(PicoFino picoFino)
    {
        this.durabilidad -= 0;
    }

    @Override
    public Material cederMaterial()
    {
        return new Madera();
    }
}