package Lista5Puc;

import java.util.Scanner;

public class Lista5Att2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int NumeroLimiteInferior,NumeroLimiteSuperior;//variavel onde se vai receber entradas
        String repetir="continue";//variavel String quando for fazer repetição do programa
        double quadrado;
        while (repetir.equals("Continue") || repetir.equals("continue")) {//comando onde da o loop do programa fazendo comparação
            //de String para na hora de fazer a repetição e o programa não finalizar
            System.out.println("----------------------------------------");//perfumaria
            System.out.println("DESUBRA O VALOR DO NUMERO AO QUADRADO   ");//titulo
            System.out.println("----------------------------------------");//perfumaria

            System.out.print("Insira o numero limite inferior:");//pededindo entrada do numero limite infeiror
            NumeroLimiteInferior = ler.nextInt();//leitura do numero limite inferior

            if (NumeroLimiteInferior < 0) {//se o numero for menor do que zero o programa irar informa-lo
                System.out.println("Numero invalido só aceitamos numeros positivos");// informando para o usuario
            } else {//se não continue o programa


                System.out.print("Insira o numero limite superior: ");//pededindo entrada do numero limite superior
                NumeroLimiteSuperior = ler.nextInt();

                if (NumeroLimiteSuperior < 0) {//se o numero for menor do que zero o programa irar informa-lo
                    System.out.println("Numero invalido só aceitamos numeros positivos");// informando para o usuario
                } else {//se não continue o programa

                    if(NumeroLimiteInferior>NumeroLimiteSuperior){//se NumeroLimiteInferior>NumeroLimiteSuperior exiba as informações
                    System.out.println("O numero Limite inferior não pode ser maior do que numero limite superior");
                }

                    while (NumeroLimiteInferior <= NumeroLimiteSuperior) {//repetição NumeroLimiteInferior <= NumeroLimiteSuperior

                        quadrado = Math.pow(NumeroLimiteInferior, 2);//elevação do numero NumeroLimiteInferior²
                        System.out.println(+NumeroLimiteInferior + " ao quadrado é: " + quadrado);//saida da mensagem
                        NumeroLimiteInferior++;// NumeroLimiteInferior+1
                    }

                }
                System.out.println("Se deseja continuar digite continue");//repetição
                repetir=ler.next();
            }
        }
    }
}