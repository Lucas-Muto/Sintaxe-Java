package Questao8;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Insira o tamanho da matriz:");
        int tam=teclado.nextInt();

        int M[][]=new int[tam][tam];
        int somai=0;

        int somal;
        int somac;
        int somad1=0;
        int somad2=0;

        //Insercao dos valores na matriz NxN
        System.out.printf("Insira dos valores da Matriz %dx%d:\n",tam,tam);
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M.length;j++){
                M[i][j]=teclado.nextInt();

            }
        }
        //Calculo da soma padrao
        for(int j=0;j<M.length;j++){
            somai=somai+M[0][j];
        }

        //Teste das somas das linhas e colunas
        for(int i=0;i<M.length;i++){
            somal=0;
            somac=0;
            for(int j=0;j<M.length;j++){
                somal=somal+M[i][j];
                somac=somac+M[j][i];
            }
            if(somal!=somai | somac!=somai){
                System.out.println("Nao é um quadrado mágico.");
                System.exit(1);
            }
        }

        //Teste da soma das diagonais
        for(int i=0;i<M.length;i++){
            somad1=somad1+M[i][i];
            somad2=somad2+M[i][M.length-i-1];
        }
        if(somad1!=somai | somad2!=somai){
            System.out.println("Nao é um quadrado mágico.");
        }
        else{
            System.out.println("É um quadrado mágico.");
        }
    }
}
