import java.util.Scanner;

public class LetraJ {


    public static double real,dolar;
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira um valor em REAIS");
    real = scanner.nextDouble();
    System.out.println("Insira a cotação atual do DOLAR");
    dolar = scanner.nextDouble();
    System.out.println("O valor em dolares é de: "+ real/dolar);

    }
}
