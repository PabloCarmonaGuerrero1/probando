package Ejercicios_practicar_Java_5;

public class Ejercicio2 {
    public static void  main(String[]args){
        String[] car=new String[10];
        car[0]="a";
        car[1]="x";
        car[4]="@";
        car[6]=" ";
        car[7]="+";
        car[8]="Q";
        for (int i=0;i<car.length;i++){
            System.out.println(car[i]);
        }
        // Los imprime como si fueran null
    }
}
