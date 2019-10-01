import java.util.Scanner;

public class LetraI {


    public static double valorCompra,percentualDesconto,valorFinal;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor da compra:");
        valorCompra = scanner.nextDouble();
        System.out.println("Insira a % de desconto:");
        percentualDesconto = scanner.nextDouble();
        while(percentualDesconto > 1 || percentualDesconto < 0){
            System.out.println("ERROR 404!");
            System.out.println("Insira somente valores entre 0 e 1: ");
            percentualDesconto = scanner.nextDouble();
        }
        valorFinal = valorCompra - (percentualDesconto * valorCompra);
        System.out.println("Seu desconto foi de: "+ percentualDesconto*valorCompra+"REAIS");
        System.out.println("O Valor Total a ser pago é de: "+valorFinal+"REAIS");

    }
}
