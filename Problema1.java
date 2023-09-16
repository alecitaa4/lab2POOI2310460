import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        try {
            int N = scanner.nextInt();


            if (N >= 2 && N <= 20) {

                for (int i = 1; i <= 10; i++) {
                    int resultado = N * i;
                    System.out.println(N + "*" + i + "=" + resultado);
                }
            } else {
                System.out.println("El numero debe estar entre 2 y 20");
            }
            scanner.close();

        } catch (Exception e){
            System.out.println("Solo aceptamos numeros");
        }

        scanner.close();


    }
}