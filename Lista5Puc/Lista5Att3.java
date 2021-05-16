package Lista5Puc;

import java.util.Scanner;

public class Lista5Att3 {
    public static void main(String[] args) {//METODO PRINCIPAL

        Scanner ler = new Scanner(System.in);//COMANDO SCANNER PARA LER A ENTRADA DE UM VALOR

        String repetir = "continue";//FOI DEFENIDO UMA STRING CONTINUE PARA FAZER COMPARAÇÃO DE VALORES E FAZER REPETIÇÃO DO PROGRAMA

        while (repetir.equals("Continue") || repetir.equals("continue")) {//COMANDO DE REPETIÇÃO PARA QUANDO O PROGRAMA FINALIZAR E REPETI-LO
            // NOVAMENTE QUAND
            double n = 1, h = 0, controle;

            System.out.println("Entre com o numero definido para N: ");
            controle = ler.nextDouble();

            while (n <= controle) {
                h = h + 1 / n;
                n++;
            }
            System.out.println("O valor de H= " + h);

            System.out.println("Se deseja continuar digite continue");
            repetir=ler.next();
            ler.close();

        }

    }

}