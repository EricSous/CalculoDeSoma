package calculadora;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while (opc.equals("s") || opc.equals("S")) {
            System.out.println("Digite o valor 1:");
            n1.setValor(scan.nextInt());
            System.out.println("Digite o valor 2:");
            n2.setValor(scan.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            System.out.println("A soma do primeiro valor com o segundo é igual: " + res.getValor());
            System.out.println("Deseja somar outro valor? (S) ou (N)");
            opc = scan.next();

        }
    }
}