package Ejercicios_practicar_Java_6;

public class Ejercicio3 {
    public static boolean primo(int x){
        int bomb= 0;
        for (int i =1 ; i<9;i++){
            if (x%i==0){
                bomb++;
            }
        }
        if (x>9){
            if (bomb>1){
                return false;
            }
        }
        if (x<10){
            if (bomb>2){
                return false;
            }
        }
        return true;
    }
    public static int sigprimo(int x){
        boolean d = false;
        int s = 1;
        while (d==false){
            int h=x+s;
            if (primo(h)){
                s=h;
                break;
            }
            s++;
        }
        return s;
    }
    public static void main(String[]args){
        System.out.println("El siguiente primo es : "+sigprimo(5));
    }
}
