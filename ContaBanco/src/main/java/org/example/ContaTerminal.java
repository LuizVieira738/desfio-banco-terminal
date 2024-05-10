package org.example;

import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        int numero;
        String agencia, nomeCliente;
        float saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta!");
        numero = entrada.nextInt();
        entrada.nextLine();


        System.out.println("Por favor, digite o número da agência!");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, informe o saldo de sua conta!");
        saldo = entrada.nextFloat();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");

    }

}
