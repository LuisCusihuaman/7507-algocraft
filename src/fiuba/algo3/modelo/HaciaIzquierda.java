package fiuba.algo3.modelo;

public class HaciaIzquierda extends Direccion {

    @Override
    public void avanzar(Mapa mapa, Jugador jugador) {

        int columnaActualJugador = jugador.getPosicionColumna();
        int filaActualJugador = jugador.getPosicionFila();
        int columnaSiguienteJugador = columnaActualJugador - 1;
        int filaSiguienteJugador = filaActualJugador;

        //mapa.mover(jugador, jugador.getPosicionColumna(), jugador.getPosicionFila(), jugador.getPosicionColumna() - 1, jugador.getPosicionFila());
        mapa.mover(jugador, jugador.getPosicionColumna(), jugador.getPosicionFila(), jugador.getPosicionColumna() - 1, jugador.getPosicionFila());
        jugador.setPosicion(filaSiguienteJugador, columnaSiguienteJugador);

    }
}
