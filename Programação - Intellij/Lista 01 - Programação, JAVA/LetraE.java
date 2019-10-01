import java.util.Scanner;

public class LetraE {


    public static double vendas, comissao;
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor das vendas: ");
        vendas = scanner.nextDouble();
        comissao = vendas*0.1;

        System.out.println("O valor da sua comissão é de: " + (int)comissao + "%");

    }
}
