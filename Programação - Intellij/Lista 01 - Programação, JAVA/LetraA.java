import java.util.Scanner;

public class LetraA {
    public static void main(String[] args){
        String nome, idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu Nome: ");
        nome = scanner.next();
        System.out.println("Insira sua Idade: ");
        idade = scanner.next();

        System.out.println("Seu Nome é: "+nome+" e Sua Idade é: "+idade);
    }
}
