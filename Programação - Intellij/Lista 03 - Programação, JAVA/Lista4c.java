package lista4;

import java.util.Scanner;

public class Lista4c {
    public static int meses;
    public static double capital, juros,lucro, lucroFinal, jurosReal;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu capital:");
        capital = sc.nextDouble();
        System.out.println("Informe o juros mensal");
        juros = sc.nextDouble();
        System.out.println("Informe o numero de meses");
        meses = sc.nextInt();
        jurosReal = juros/100;
        for(int i=1;i<=meses;i++){
            lucro = jurosReal*capital;
            lucroFinal = lucro+capital;
            capital = lucroFinal;
            System.out.println("mês: "+i+" grana: "+lucroFinal);
        }
    }
}
