/*
sequência abaixo é conhecida como série de Fibonacci. Faça um programa para escrever esta série até o seu trigésimo termo.
Série de Fibonacci : 1,1,2,3,5,8,13,21,34,55,…
 */
package Lista5Puc;

import java.util.Scanner;

public class Lista5Att4 {
    public static void main(String[] args) {//METODO PRINCIPAL
        Scanner ler = new Scanner(System.in);//COMANDO PARA LEITURA

        String repetir = "continue";

        while (repetir.equals("Continue") || repetir.equals("continue")) {//comando onde da o loop do programa fazendo comparação
            //de String para na hora de fazer a repetição e o programa não finalizar

            int anterior, soma, limite, auxiliar;//VARIAVEIS

            anterior = soma = limite = 1;

            System.out.print(+anterior + ",");//VIRGULA ENTRE AS SEQUENCIA DO FIBONACCI

            while (limite < 30) {//LIMITE DETERMINADO PARA FAZER O CALCULO FIBONACCI

                System.out.print(+soma + ",");//VIGULA DO PROGRAMA NA HORA DA IMPRENSSÃO
                auxiliar = soma;
                soma = soma + anterior;
                anterior = auxiliar;
                limite++;
            }
            System.out.println("");//PERFUMARIA PARA PULAR LINHA
            System.out.println("Se deseja continuar digite continue");//COMANDO DE REPETIÇÃO
            repetir = ler.next();//LEITURA DO COMANDO DE REPETIÇÃO
        }
    }
}