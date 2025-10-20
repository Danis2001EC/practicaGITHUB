public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, GitHub! Este es mi primer programa en Java en el repositorio.");
        System.out.println("Tabla de multiplicar del 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-5s %2d = %2d%n", "5 x " + i, i, 5 * i);
        }
        System.out.println();
        System.out.println("Tabla de multiplicar del 3:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-5s %2d = %2d%n", "3 x " + i, i, 3 * i);
        }
        System.out.println("Última actualización: 20/10/2025 06:53 PM -05");
        System.out.println("Contador de ejecución: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }
    }
}