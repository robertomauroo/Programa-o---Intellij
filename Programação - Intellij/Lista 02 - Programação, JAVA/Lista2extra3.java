package aula2;

import java.util.Scanner;

public class Lista2extra3 {
    public static int code;
    public static double salarioAtual, salarioFinal, aumento;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Escrituário");
        System.out.println("2. Secretário");
        System.out.println("3. Caixa");
        System.out.println("4. Gerente");
        System.out.println("5. Diretor");

        System.out.println("Informe o codigo referente ao seu cargo:");
        code = sc.nextInt();



        System.out.println("Insira o valor do seu salário atual");
        salarioAtual = sc.nextDouble();


            System.out.println("Este cargo nao existe");
        if (code == 1) {

            aumento = salarioAtual*0.5;
            salarioFinal = salarioAtual + aumento;

            System.out.println("Seu aumento foi de "+aumento +"Reais");
            System.out.println("Seu novo salario é "+salarioFinal +"Reais");
        } else if (code == 2) {

            aumento = salarioAtual*0.35;
            salarioFinal = salarioAtual + aumento;

            System.out.println("Seu aumento foi de "+aumento+"Reais");
            System.out.println("Seu novo salario é "+salarioFinal+"Reais");
        } else if (code == 3) {

            aumento = salarioAtual*0.2;
            salarioFinal = salarioAtual + aumento;

            System.out.println("Seu aumento foi de "+aumento+"Reais");
            System.out.println("Seu novo salario é "+salarioFinal+"Reais");
        } else if (code == 4) {

            aumento = salarioAtual*0.1;
            salarioFinal = salarioAtual + aumento;

            System.out.println("Seu aumento foi de "+aumento+"Reais");
            System.out.println("Seu novo salario é "+salarioFinal+"Reais");
        } else if (code == 5){
            System.out.println("Seu cargo não sofreu alteração");
        }

    }
}
