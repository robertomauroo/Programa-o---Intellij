package aula2;

import java.util.Scanner;

public class Lista2extra1 {
    public static double n1,n2,media;
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota da AV1");
        n1 = sc.nextDouble();
        System.out.println("Informe a nota da AV2");
        n2 = sc.nextDouble();
        media = (n1+n2)/2;

        if (media >= 6) {
            System.out.println("Voce esta aprovado");
        } else if (media < 3) {
            System.out.println("Voce esta reprovado");

        }else if ((media>=3) && (media < 7)){
            System.out.println("Voce ficou para a recuperação precisando de "+ (media - 12) *-1 + " pontos");
        }

    }
}
