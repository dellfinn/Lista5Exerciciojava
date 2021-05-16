package Lista5Puc;

import java.util.Scanner;

public class Lista5Att10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero=10, soma=0;
        while (numero!=0){
            System.out.println("[PARA SAIR DO PROGRAMA APERTE ZERO ]");
            System.out.println("Digite o numero da tabuada que você quer: ");
            numero = ler.nextInt();

            if(numero!=0)
                System.out.println("Tabuada do "+numero);
            for(soma=1;(soma<11)&&(numero!=0);soma++){
                System.out.println("X"+soma+"="+numero*soma);
            }
            soma=0;
        }
    }
}
