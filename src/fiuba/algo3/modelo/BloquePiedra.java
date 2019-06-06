package fiuba.algo3.modelo;

public class BloquePiedra extends Bloque {

    public BloquePiedra() {
        this.durabilidad = 30;
    }

    public void recibirDanio(Pico pico) {

        durabilidad -= pico.getFuerza();

        if(durabilidad < 0){

            durabilidad = 0;
        }
    }

    public void recibirDanio(Hacha hacha) {
        this.durabilidad -= 0;
    }
}