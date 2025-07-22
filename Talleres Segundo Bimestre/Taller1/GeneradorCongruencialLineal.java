
import java.util.Scanner;

public class GeneradorCongruencialLineal {

    private int semilla;
    private int a;
    private int c;
    private int m;

    public GeneradorCongruencialLineal(int semilla, int a, int c, int m) {
        this.semilla = semilla;
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public int generarSiguiente() {
        semilla = (a * semilla + c) % m;
        return semilla;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la semilla (X0):");
        int semilla = scanner.nextInt();

        System.out.println("Ingrese el multiplicador (a):");
        int a = scanner.nextInt();

        System.out.println("Ingrese el incremento (c):");
        int c = scanner.nextInt();

        System.out.println("Ingrese el módulo (m):");
        int m = scanner.nextInt();

        System.out.println("¿Cuántos números pseudoaleatorios desea generar?");
        int cantidad = scanner.nextInt();

        GeneradorCongruencialLineal gcl = new GeneradorCongruencialLineal(semilla, a, c, m);

        System.out.println("\nNúmeros pseudoaleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            int numero = gcl.generarSiguiente();
            System.out.println("X" + (i + 1) + " = " + numero);
        }

        scanner.close();
    }
}
