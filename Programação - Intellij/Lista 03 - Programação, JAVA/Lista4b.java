package lista4;

import java.util.Scanner;

public class Lista4b {
    public static int maisIdoso,idade,paciente;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero de pacientes:");
        paciente = sc.nextInt();
        for(int i=0;i<paciente;i++){
            System.out.println("Informe a idade do paciente "+i+1);
            idade = sc.nextInt();
            if(maisIdoso<idade)
                maisIdoso = idade;

        }
        System.out.println("Seu paciente mais idoso tem "+maisIdoso+" anos de idade");
    }
}
