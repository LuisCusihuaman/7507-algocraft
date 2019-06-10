package fiuba.algo3.modelo;

public class HaciaDerecha extends Direccion {

    @Override
    public void avanzar(Mapa mapa, Jugador jugador) {
        mapa.mover(jugador, jugador.getPosicionColumna(), jugador.getPosicionFila(), jugador.getPosicionColumna() + 1, jugador.getPosicionFila());
    }
}
