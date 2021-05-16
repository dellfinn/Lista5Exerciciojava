package Lista5Puc;

import java.util.Scanner;

public class Lista5Att1 {
    public static void main(String[] args) {// metodo principal
        Scanner ler = new Scanner(System.in);//comando para receber entrada de um valor
        int numero, soma, controle;//variaveis
        String repetir = "continue";//variavel String "repetir para dar loop no programa escrevendo continue
        while (repetir.equals("Continue") || repetir.equals("continue")) {//comando onde da o loop do programa fazendo comparação
            //de String para na hora de fazer a repetição e o programa não finalizar

            numero = 1;
            soma = 0;
            System.out.println("Programa acomulador de somas (1+2+3+4+.....+N)");//titulo do programa
            System.out.println("Porfavor selecione o valor limite a ser somado a partir de 1");//comanda onde pede a entrada de um valor
            controle = ler.nextInt();//leitura do controle onde recebe um valor
            if (controle <= 0) {//foi coloca if nesse momento pois quando o programa recebe um numero menor ou igual a zero o programa da resultado a um valor igual a zero
                System.out.println("Por favor selecione uma opção valida, um numero maior do que ZERO!");//mensagem caso isso aconteça
            }
            while (numero <= controle) {//numero menor iual controle
                soma = soma + numero;//soma recebe soma + o numero
                numero++;// comando incrementador para somar os numero ++1
            }

            System.out.println("A soma de 1 até :" + controle + "=" + soma);//saida da entrada digitada pelo usuario mais o resultado
            System.out.println("Se deseja continuar digite continue");// laço onde foi feito a repetição caso o usuario deseja contunuar a utiliza-lo
            repetir = ler.next();//leitura

        }

    }
}
