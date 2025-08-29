import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Usted ha ingresado el nombre: " + nombre);

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Usted ha ingresado la edad: " + edad);

        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();
        System.out.println("La marca que ha ingresado es: " + marca);

        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine();
        System.out.println("El modelo que ha ingresado es: " + modelo);

        System.out.print("Ingrese la cilindrada: ");
        String cilindrada = sc.nextLine();
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);

        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine();
        System.out.println("El tipo de combustible es: " + combustible);

        System.out.print("Ingrese la capacidad en pasajeros: ");
        int pasajeros = Integer.parseInt(sc.nextLine());
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");

        sc.close();
    }
}
