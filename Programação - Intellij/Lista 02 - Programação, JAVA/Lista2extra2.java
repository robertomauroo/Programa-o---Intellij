package aula2;

import java.util.Scanner;

public class Lista2extra2 {

    public static int opcao;
    public static double n1,n2;
    public static int nQ,rQ;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Somar dois numeros");
        System.out.println("2. Raiz quadrada de um numero");
        System.out.println("Insira o numero da opção desejada");
        opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Insira o primeiro numero:");
            n1 = sc.nextDouble();
            System.out.println("Insira o segundo numero:");
            n2 = sc.nextDouble();
            System.out.println("A soma dos numeros é igual a: "+ (n1+n2));
        } else if(opcao == 2){
            System.out.println("Insira o numero para saber sua raiz quadrada");
            nQ = sc.nextInt();
            rQ = (int) Math.sqrt(nQ);
            System.out.println("A raiz quadrada de "+ nQ + " é igual a: "+rQ);
        }
    }
}
