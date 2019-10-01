package lista4;

import java.util.Scanner;

public class Lista4d {
    public static int eleitores,candidatoA,candidatoB,candidatoC,nulos;
    public static void main(String[] args){
        char voto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero de eleitores:");
        eleitores = sc.nextInt();
        for(int i=0;i<eleitores;i++){
            System.out.println("Insira o seu voto:");
            voto = sc.next().charAt(0);
            if((voto == 'a') || (voto=='b') || (voto=='c')){
                if(voto == 'a')
                    candidatoA++;
                if(voto=='b')
                    candidatoB++;
                if(voto=='c')
                    candidatoC++;

            }else{
                System.out.println("Seu voto é inválido, VOCE VOTOU NULO");
                nulos++;
            }
        }
        System.out.println("O candidato A obteve: "+candidatoA+" votos");
        System.out.println("O candidato B obteve: "+candidatoB+" votos");
        System.out.println("O candidato C obteve: "+candidatoC+" votos");
        System.out.println("O numero de votos nulos foi de: "+nulos);

    }
}
