package fiuba.algo3.modelo;

public class HaciaArriba extends Direccion {

    @Override
    public void avanzar(Mapa mapa, Jugador jugador) {
        mapa.mover(jugador, jugador.getPosicionX(), jugador.getPosicionY(), jugador.getPosicionX(), jugador.getPosicionY() - 1);
    }
}
