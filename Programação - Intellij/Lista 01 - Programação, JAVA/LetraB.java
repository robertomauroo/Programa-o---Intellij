import java.util.Scanner;

public class LetraB {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double numero;
        double dobro;
        System.out.println("Informe o numero:");
        numero = scanner.nextDouble();
        dobro = numero *2;
        System.out.println("O dobro do numero é: " + dobro);


    }
}
