package Questao2;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        float R,S,T;
        R=teclado.nextFloat();
        S=teclado.nextFloat();
        T=teclado.nextFloat();
        
        if(R>S && R>T){
            System.out.println("O maior número é "+R);
        }
        else if(S>R && S>T){
            System.out.println("O maior número é "+S);
        }
        else{
            System.out.println("O maior número é "+T);
        }
        
    }
    
}
