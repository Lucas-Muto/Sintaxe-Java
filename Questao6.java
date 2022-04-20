package Questao6;

public class Questao6 {

    public static void main(String[] args){
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        while(b<=100){
            c=a;
            a=b;
            b=c+b;
            System.out.println(b);
        }

    }
}
