package fiuba.algo3.modelo;

public class Jugador implements Elemento {

    private MesaCrafteo mesaDeCrafteo;
    private Inventario inventario;
    private Posicion posicion;
    private Material materialSeleccionado = null;

    public Jugador() {
        this.mesaDeCrafteo = new MesaCrafteo();
        this.inventario = new Inventario();
        this.posicion = new Posicion();
        this.inventario.agregarHerramienta(new Hacha(new Madera()));
    }

    public boolean inventarioContieneHerramienta(Herramienta herramienta) {
        return this.inventario.contieneHerramienta(herramienta);
    }

    public boolean inventarioContieneMaterial(Material material) {
        return this.inventario.contieneMaterial(material);
    }

    public void avanzar(Mapa mapa, Direccion direccion) {
        direccion.avanzar(mapa, this);
    }

    public void setPosicion(int fila, int columna) {
        this.posicion.setColumna(columna);
        this.posicion.setFila(fila);
    }

    public int getPosicionColumna() {
        return this.posicion.getColumna();
    }

    public int getPosicionFila() {
        return this.posicion.getFila();
    }

    public void seleccionarMaterial(int posicion) {
        this.materialSeleccionado = this.inventario.seleccionarMaterial(posicion);
    }

    public void colocarEnMesa(int posicion) {
        this.mesaDeCrafteo.colocar(this.materialSeleccionado, posicion); 
    }

    public void craftear() {
        this.inventario.agregarHerramienta(this.mesaDeCrafteo.construir());
    }

    public void agregarMaterialAInventario(Material material) {
        this.inventario.agregarMaterial(material);
    }

    public void agregarHerramientaAInventario(Herramienta herramienta) {
        this.inventario.agregarHerramienta(herramienta);
    }
}
