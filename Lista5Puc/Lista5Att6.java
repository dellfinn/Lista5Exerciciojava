package Lista5Puc;

import java.util.Scanner;

public class Lista5Att6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor, valorPoupanca = 0, valorRendaFixa = 0, valorCDBs = 0;
        String repetir = "continue";

        while (repetir.equals("Continue") || repetir.equals("continue")) {
            System.out.println("Descubra qual é o melhor investimento para você!");
            System.out.println("-------------------------------------------------");
            System.out.println("Digite o valor do seu investimento: ");
            valor = ler.nextDouble();

            if (valor < 100) {
                System.out.println("Para se iniciar um investimento deve ser maior do que 100 seu pobre!");
            } else {
                valorPoupanca = valor * 0.005;
                valorRendaFixa = valor * 0.01;
                valorCDBs = valor * 0.015;
            }
            if (valor < 1000) {
                System.out.println("Você inestiu " + valor + " e o retorno desse investimento na poupança é de: " + valorPoupanca);
            } else {
                if (valor < 2500) {
                    System.out.println("Você inestiu " + valor + " e o retorno desse investimento na poupança é de: " + valorPoupanca);
                    System.out.println("Você inestiu " + valor + " e o retorno desse investimento na renda fixa é de:" + valorRendaFixa);
                } else {
                    System.out.println("Você inestiu " + valor + " e o retorno desse investimento na poupança é de: " + valorPoupanca);
                    System.out.println("Você inestiu " + valor + " e o retorno desse investimento na renda fixa é de " + valorRendaFixa);
                    System.out.println("Você inestiu " + valor + " e o retorno desse investimento no CDBs " + valorCDBs);
                }
                System.out.println("Se deseja continuar o programa escreve Continue, se não  aperte qualquer outra tecla ou digite um valor negativo");
                repetir = ler.next();//comando de repetição do programa
            }
        }
    }
}