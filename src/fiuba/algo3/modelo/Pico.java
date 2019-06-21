package fiuba.algo3.modelo;

public class Pico extends Herramienta {

    public Pico(Madera madera) {
        this.durabilidad = 100;
        this.fuerza = 2;
        this.material = madera;
        this.desgaste = new DesgasteNormal(100, 2);
        this.fuerzaEspecialContraMetal = 0;
        this.receta = "mmm-m--m-";
        this.identificador = "pico_madera";
    }

    public Pico(Piedra piedra) {
        this.durabilidad = 200;
        this.fuerza = 4;
        this.material = piedra;
        this.desgaste = new DesgasteNormal(200, 4, 1.5);
        this.fuerzaEspecialContraMetal = 4;
        this.receta = "ppp-m--m-";
        this.identificador = "pico_piedra";
    }

    public Pico(Metal metal) {
        this.durabilidad = 400;
        this.fuerza = 12;
        this.material = metal;
        this.desgaste = new DesgasteNormal(400, 12, 0.3);
        this.fuerzaEspecialContraMetal = 0;
        this.receta = "MMM-m--m-";
        this.identificador = "pico_metal";
    }

    public void usarEn(Posicionable posicionable){

        posicionable.recibirDanio(this);
        desgastar();
        if (durabilidad <= 0) {
            throw new HerramientaSeRompioException();
        }
    }

    public int getFuerzaEspecialContraMetal(){
        return this.fuerzaEspecialContraMetal;
    }

    public void desgastar(){

        durabilidad = this.desgaste.desgastar();
    }
}
