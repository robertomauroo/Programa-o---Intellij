import java.util.Scanner;

public class LetraF {



    public static double preco, qtd,total;
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor do produto: ");
        preco = scanner.nextDouble();
        System.out.println("Entre com a quantidade de produtos: ");
        qtd = scanner.nextDouble();

        total = qtd*preco;

        System.out.println("O valor total a ser pago é de: " + total+"reais");

    }
}
