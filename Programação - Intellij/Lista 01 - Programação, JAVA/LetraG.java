import java.util.Scanner;

public class LetraG {

    public static double comp,larg,area;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o Comprimento da sala em METROS");
        comp = scanner.nextDouble();
        System.out.println("Insira a Largura da sala em METROS");
        larg = scanner.nextDouble();
        area = comp*larg;
        System.out.println("O tamanho da sala é de: "+ area + "m²");

    }
}
