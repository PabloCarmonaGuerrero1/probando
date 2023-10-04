package Ejercicios_practicar_Java_5;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String[] pal=new String[8];
        String[] pal2=new String[8];
        int h=0;
        int h2=0;
        String[] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
        int numcolores=0;
        for(int i=0;i< pal.length;i++){
            System.out.println("Di una palabra");
            String palabra= scanner.next();
            pal[i]=palabra;
            for (int j = 0;j<colores.length;j++){
                if (palabra.equals(colores[j])){
                    numcolores++;
                }
            }
        }
        String[] dist = new String[8-numcolores];

        for (int i =0;i< pal.length;i++){
            for (int j =0;j< colores.length;j++){
                boolean d = false;
                if (pal[i].equals(colores[j])){
                    pal2[h]=pal[i];
                    h++;
                    d=true;
                }
                if (d==false){
                    pal2[numcolores+h2]=pal[i];
                    h2++;
                }
            }
        }
        for (int i=0;i<pal2.length;i++){
            System.out.println(pal2[i]);
        }
    }
}
