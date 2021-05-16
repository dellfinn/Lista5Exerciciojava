package Lista5Puc;

import java.util.Scanner;

public class Lista5Att7 {
    public static void main(String[] args){

        int numero, maior = 0, menor = 0;

        String repetir = "s";


        Scanner read = new Scanner(System.in);

        System.out.println("Descubra qual é o maior dentre esses números");
        while (repetir.equals("s") || repetir.equals("S")) {
            do {
                System.out.println("Digite um número ");
                numero = read.nextInt();
                System.out.println("Quer continuar ?[S/N]");
                repetir = read.next();

                if (numero > maior)
                    maior = numero;

                if (numero <= menor && numero != 0 || menor <= 0 ) menor = numero;

            }
            while (numero == 0);
        }
        System.out.println("O maior numero é " + maior);
        System.out.println("O menor numero é " + menor);
    }


}