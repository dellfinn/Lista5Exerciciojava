package Lista5Puc;

import java.util.Scanner;
public class Lista5Att8 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        String sexo;
        float alturaM, MaisAltoM, MaisAltoF, BaixoAlturaM = 0, BaixoAlturaF = 0, alturaF = 0, alturaMediaM = 0, alturaMediaF = 0;
        float i = 1, masculinoContador = 0, femininoContador = 0;


        MaisAltoM = 0;

        MaisAltoF = 0;

        for (i = 1; i <= 3; i++) {
            System.out.println("digite M para Masculino ou F para feminino: ");
            sexo = ler.next();


            if (sexo.equals("m")) {
                masculinoContador++;
                System.out.println("Entre com a altura da pessoa: ");
                alturaM = ler.nextFloat();
                alturaMediaM = (float) (masculinoContador / alturaM );
                if (alturaM > MaisAltoM) {
                    MaisAltoM = alturaM;
                    if (alturaM <= BaixoAlturaM && BaixoAlturaM != 0 || BaixoAlturaM <= 0 ){ BaixoAlturaM = alturaM;
                        {
                            BaixoAlturaM = alturaM;
                        }
                    }
                }
            }

            if (sexo.equals("f")) {
                femininoContador++;
                System.out.println("Entre com a altura da pessoa: ");
                alturaF = ler.nextFloat();
                alturaMediaF = femininoContador / alturaF;
                if (alturaF > MaisAltoF) {
                    MaisAltoF = alturaF;
                    if (alturaF <= BaixoAlturaF && BaixoAlturaF != 0 || BaixoAlturaF <= 0 ){ BaixoAlturaF = alturaF;
                        {
                            BaixoAlturaM = alturaF;
                        }
                    }
                }
            }

        }
        System.out.println("A altura média dos Homens: " + alturaMediaM);
        System.out.println("A altura média dos Mulheres: " + alturaMediaF);
        System.out.println("A maior altura dentre os homens é: " + MaisAltoM);
        System.out.println("A maior altura dentre as mulheres é: " + MaisAltoF);
        System.out.println("O mais baixo dos homens é:" + BaixoAlturaM);
        System.out.println("O mais baixo das Mulheres é:" + BaixoAlturaF);
    }
}