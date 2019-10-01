import java.util.Scanner;

public class LetraH {

    public static double salario,percentual,reajuste;
    public static boolean erro = false;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do Salário:");
        salario = scanner.nextDouble();
        System.out.println("Insira o percentual de reajuste:");
        percentual = scanner.nextDouble();

        while (percentual < 0 || percentual > 1){
            erro = false;
            System.out.println("ERROR 404!!");
            System.out.println("Insira um valor entre 0 e 1!");
            percentual = scanner.nextDouble();
        }

        reajuste = (salario * percentual) + salario;
        System.out.println("O valor do seu salario com o reajuste é de: " + reajuste);
    }
}
