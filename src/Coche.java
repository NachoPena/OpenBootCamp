public class Coche {
    private int numPuertas;

    public void anadirPuerta() {
        numPuertas++;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.anadirPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}