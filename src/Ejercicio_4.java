public class Ejercicio_4 {

    public static void main(String[] args) {
            // Ejercicio 1
        System.out.println("Ejercicio 1");
        System.out.println("");
        int numeroIf = 5;

            if (numeroIf > 0) {
                System.out.println("El número es positivo");
            } else if (numeroIf < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es cero");
            }

            // Ejercicio 2
        System.out.println("Ejercicio 2");
        System.out.println("");
        int numeroWhile = 0;

            while (numeroWhile < 3) {
                numeroWhile++;
                System.out.println(numeroWhile);
            }

            // Ejercicio 3
        System.out.println("Ejercicio 3");
        System.out.println("");
        int numeroDoWhile = 0;

            do {
                numeroDoWhile++;
                System.out.println(numeroDoWhile);
            } while (numeroDoWhile < 3);

            // Ejercicio 4
        System.out.println("Ejercicio 4");
        System.out.println("");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                System.out.println(numeroFor);
            }

            // Ejercicio 5
        System.out.println("Ejercicio 5");
        System.out.println("");
        String estacion = "verano";

            switch (estacion) {
                case "primavera":
                    System.out.println("Estamos en primavera");
                    break;
                case "verano":
                    System.out.println("Estamos en verano");
                    break;
                case "otoño":
                    System.out.println("Estamos en otoño");
                    break;
                case "invierno":
                    System.out.println("Estamos en invierno");
                    break;
                default:
                    System.out.println("Esa no es una estación");
                    break;
            }
        }
    }
