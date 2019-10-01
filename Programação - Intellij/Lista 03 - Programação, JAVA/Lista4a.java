package lista4;

import java.util.Scanner;

public class Lista4a {
    public static int av;
    public static double nota,media,mediaFinal;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero de avaliações do periodo letivo:");
        av = sc.nextInt();
        for(int i=1;i<=av;i++){
            System.out.println("Insira a nota da AV "+ i);
            nota = sc.nextDouble();
            media = media + nota;
        }
        mediaFinal = media/av;
        System.out.println("Sua média final ficou em: "+mediaFinal);

    }
}
