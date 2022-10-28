package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor valido: ");
        int value = scan.nextInt();

        while(value < 0 | value > 10){
            System.out.println("Valor invalido! Digite novamente: ");
            value = scan.nextInt();
        }
    }
}
