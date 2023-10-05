package Ejercicios_practicar_Java_5_1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String[][] tablero = new String[3][3];
        for (int f = 0;f<tablero.length;f++) {
            for (int c = 0; c < 3; c++) {
                tablero[f][c] = "H";
            }
        }
        for (int i = 1;i<=9;i++){
            if (i%2==0){
                System.out.println("Indica en que posición quieres colocar la O jugador 2");
                System.out.print("Fila : ");
                int fil = scanner.nextInt();
                System.out.println(" ");
                System.out.print("Columna :");
                int colum=scanner.nextInt();
                tablero[fil-1][colum-1]="O";
                for (int f = 0;f<tablero.length;f++){
                    for (int c = 0; c<3;c++){
                        System.out.print(tablero[f][c]+" ");
                    }
                    System.out.println(" ");
                }
                if (tablero[0][0].equals("O") && tablero[0][1].equals("O") && tablero[0][2].equals("O")){
                    System.out.println("Jugador 2 gana!");
                    break;
                }
                if (tablero[1][0].equals("O") && tablero[1][1].equals("O") && tablero[1][2].equals("O")){
                    System.out.println("Jugador 2 gana!");
                    break;
                }
                if (tablero[2][0].equals("O") && tablero[2][1].equals("O") && tablero[2][2].equals("O")){
                    System.out.println("Jugador 2 gana!");
                    break;
                }
                if (tablero[0][0].equals("O") && tablero[1][0].equals("O") && tablero[2][0].equals("O")){
                    System.out.println("Jugador 2 gana!");
                    break;
                }
                if (tablero[0][1].equals("O") && tablero[1][1].equals("O") && tablero[2][1].equals("O")){
                    System.out.println("Jugador 2 gana!");
                    break;
                }
                if (tablero[0][2].equals("O") && tablero[1][2].equals("O") && tablero[2][2].equals("O")){
                    System.out.println("Jugador 2 gana!");
                    break;
                }
                if (tablero[0][0].equals("O") && tablero[1][1].equals("O") && tablero[2][2].equals("O")){
                    System.out.println("Jugador 2 gana!");
                    break;
                }
                if (tablero[0][2].equals("O") && tablero[1][1].equals("O") && tablero[2][0].equals("O")){
                    System.out.println("Jugador 2 gana!");
                    break;
                }
            }else {
                System.out.println("Indica en que posición quieres colocar la X jugador 1");
                System.out.print("Fila : ");
                int fil = scanner.nextInt();
                System.out.println(" ");
                System.out.print("Columna : ");
                int colum=scanner.nextInt();
                tablero[fil-1][colum-1]="X";
                for (int f = 0;f<tablero.length;f++){
                    for (int c = 0; c<3;c++){
                        System.out.print(tablero[f][c]+" ");
                    }
                    System.out.println(" ");
                }
                if (tablero[0][0].equals("X") && tablero[0][1].equals("X") && tablero[0][2].equals("X")){
                    System.out.println("Jugador 1 gana!");
                    break;
                }
                if (tablero[1][0].equals("X") && tablero[1][1].equals("X") && tablero[1][2].equals("X")){
                    System.out.println("Jugador 1 gana!");
                    break;
                }
                if (tablero[2][0].equals("X") && tablero[2][1].equals("X") && tablero[2][2].equals("X")){
                    System.out.println("Jugador 1 gana!");
                    break;
                }
                if (tablero[0][0].equals("X") && tablero[1][0].equals("X") && tablero[2][0].equals("X")){
                    System.out.println("Jugador 1 gana!");
                    break;
                }
                if (tablero[0][1].equals("X") && tablero[1][1].equals("X") && tablero[2][1].equals("X")){
                    System.out.println("Jugador 1 gana!");
                    break;
                }
                if (tablero[0][2].equals("X") && tablero[1][2].equals("X") && tablero[2][2].equals("X")){
                    System.out.println("Jugador 1 gana!");
                    break;
                }
                if (tablero[0][0].equals("X") && tablero[1][1].equals("X") && tablero[2][2].equals("X")){
                    System.out.println("Jugador 1 gana!");
                    break;
                }
                if (tablero[0][2].equals("X") && tablero[1][1].equals("X") && tablero[2][0].equals("X")){
                    System.out.println("Jugador 1 gana!");
                    break;
                }
            }
        }
    }
}
