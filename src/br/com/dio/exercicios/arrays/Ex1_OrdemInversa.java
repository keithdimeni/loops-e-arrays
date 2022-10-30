package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, 0, 9, 6, 50, 4};

//        System.out.println(vetor.length);
    int count = 0;
        while(count < (vetor.length)){
//            System.out.print(vetor[count]);
            count++;
        }

        for(int i = (vetor.length - 1); i >= 0; i --){
            System.out.println(vetor[i] + " ");
        }

    }
}
