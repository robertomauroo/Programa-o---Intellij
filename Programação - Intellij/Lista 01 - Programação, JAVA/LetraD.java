import java.util.Scanner;

public class LetraD {


    public static double perimetro, area, raio;

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio: ");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio,2);
        System.out.println("O valor da area é: "+ (int)area);

        perimetro = (2*Math.PI)*raio;
        System.out.println("O valor do perimetro é: "+ (int)perimetro);

    }

}
