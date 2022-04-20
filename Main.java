package Questao1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int x;
        x=teclado.nextInt();
        int z;
        for(int i=0;i<x;i++){
            z=teclado.nextInt();
            if(z<0){
                System.out.println("O número é negativo");
            }
            else{
                System.out.println("O número é positivo");
            }
        }
    }
    
}
