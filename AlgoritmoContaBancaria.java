package variaveisprimitivas;
/*Desenvolva um algoritmo que simule a abertura de uma conta bancária cujo
saldo inicial é zero A seguir, simule um deposito de um valor qualquer e mostre o
saldo atual Depois disso, simule uma retirada(débito) qualquer e apresente o
saldo final*/
import java.util.Scanner;

public class AlgoritmoContaBancaria {

    public static void main(String[] args) {
        // criar um objecto de entrada 
        Scanner sc = new Scanner(System.in);
        System.out.println("O saldo  da sua conta é: 0.00R$");
        System.out.print("Faça o seu depósito: ");
        // solicitar valor de saque 
        float saldo = sc.nextFloat();
        System.out.println("O seu saldo atual é: " + saldo);
        System.out.print("Quanto você pretende debitar da sua conta: ");
        //solicitar valor de debito 
        float debito = sc.nextFloat();
        // subtrir o valor a debitar da conta 
        saldo = saldo - debito;
        System.out.println("O valor debitado da ssua conta é: " + debito);
        System.out.println("O saldo atual da sua conta é: " + saldo);

        sc.close();

    }

}
