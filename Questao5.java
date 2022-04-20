package Questao5;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int X=teclado.nextInt();
        int soma=1;
        if(X>0){
            for(int i=X;i>0;i--){
                soma=soma*i;
            }
            System.out.println(soma);
        }
        else{
            soma=-1;
            System.out.println("Número negativo");
            System.out.println(soma);
        }
        
    }
}
