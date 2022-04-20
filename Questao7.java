package Questao7;
import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int s=0;
        int k=0;
        float p=0;
        float r=0;
        float b=0;
        float o=0;
        System.out.println("Insira notas entre 0 e 100:");

        while(0<=s & s<=100){
            s=teclado.nextInt();
            if(s>=0 & s<=25){
                p++;
                k++;
            }
            else if(s>25 & s<=50){
                r++;
                k++;
            }
            else if(s>50 & s<=75){
                b++;
                k++;
            }
            else if(s>75 & s<=100){
                o++;
                k++;
            }

        }
        System.out.printf("Péssimas:%.2f%%\n",(p*100/k));
        System.out.printf("Ruins:%.2f%%\n",(r*100/k));
        System.out.printf("Boas:%.2f%%\n",(b*100/k));
        System.out.printf("Ótimas:%.2f%%\n",(o*100/k));
    }
}
