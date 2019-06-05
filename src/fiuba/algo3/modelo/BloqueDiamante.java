package fiuba.algo3.modelo;

public class BloqueDiamante extends Bloque{

    public BloqueDiamante() { this.durabilidad = 100; }

    public int getDurabilidad() {
        return this.durabilidad;
    }

    public void recibirDanio(Pico pico) {
        this.durabilidad -= 0;
    }

    public void recibirDanio(Hacha hacha) {
        this.durabilidad -= 0;
    }

    public void recibirDanio(PicoFino picoFino) {
        this.durabilidad -= picoFino.getFuerza();
    }
}
