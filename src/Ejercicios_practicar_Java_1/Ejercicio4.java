package Ejercicios_practicar_Java_1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número : ");
        int n1 = scanner.nextInt();
        System.out.print("Introduce otro número : ");
        int n2 = scanner.nextInt();
        System.out.println("Su suma : "+(n1+n2)+"\n"+
                "Su resta : "+(n1-n2)+"\n"+
                "Su multiplicación : "+(n1*n2)+"\n"+
                "Su división : "+(n1/n2));
    }

}
