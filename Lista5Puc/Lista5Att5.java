package Lista5Puc;

import java.util.Scanner;

public class Lista5Att5 {
    public static void main(String[] args) {//metodo principal
        double divisor, divisor1, divisor2, resto, resto1;//variaveis
        String repetir = "continue";//string para oc comando de repetição


        Scanner ler = new Scanner(System.in);//comando para recever uma entrada de um valor no system.out.print
        while (repetir.equals("Continue") || repetir.equals("continue")) {//comando onde da o loop do programa fazendo comparação
            //de String para na hora de fazer a repetição e o programa não finalizar
            System.out.println("Maximo divisor comum");//titulo
            System.out.println("Insira o divisor 1 ");//mensagem para receber um valor no divisor1
            divisor1 = ler.nextFloat();

            System.out.println("Insira o divisor 2 ");//mensagem para receber um valor no divisor2
            divisor2 = ler.nextFloat();

            if (divisor2 < divisor1) {//condição se divisor 2 for maior do que o divisor 1
                divisor2 = divisor1 + divisor2;
                divisor1 = divisor2 - divisor1;
                divisor2 = divisor2 - divisor1;
            }
            System.out.println(+divisor1 + " e " + divisor2 + " ");//saida dos valores

            divisor = divisor1;
            resto = divisor2 % divisor;

            if (resto == 0) {
                divisor = divisor1;
                System.out.println("O maximo divisor comum é : " + divisor);//saida dos valors
            } else {
                while (resto != 0) {
                    divisor = divisor - 1;
                    resto = divisor1 % divisor;
                    resto1 = divisor2 % divisor;
                    if (resto == 0 && resto1 == 0) {
                        resto = 0;
                    } else {
                        resto = 1;
                    }
                }
                System.out.println("O maximo divisor comum é : " + divisor);//saida dos valores


            }
            System.out.println("Se deseja continuar o programa escreve Continue, se não  aperte qualquer outra tecla");
            repetir = ler.next();//comando de repetição do programa
        }
    }
}