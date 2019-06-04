package fiuba.algo3.modelo;

public abstract class MaterialBloque extends Material{
    public int durabilidad;

    public abstract void recibirDanio(Pico pico);
    public abstract void recibirDanio(Hacha hacha);

}