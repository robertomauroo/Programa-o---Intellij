import java.util.Scanner;

public class LetraC {

    public static double base,altura,area;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a Base: ");
        base = scanner.nextDouble();

        System.out.println("Insira a Altura: ");
        altura = scanner.nextDouble();

        area = (base*altura)/2;

        System.out.println("A area do trinângulo é: " + area);


    }
}
