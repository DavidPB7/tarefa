import java.util.ArrayList;
import java.util.Collections;


public class Array_dinamico {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(7);
        numeros.add(1);

        System.out.println("Array dinamico: ");
        System.out.println(numeros);

        System.out.println("-------------------");

        System.out.println("Elementos no meu array: ");

        for (int i = 0; i < numeros.size() ; i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("-------------------");

        Collections.sort(numeros);
        System.out.println("Elementos do array em ordem crescente: " + numeros);
        for (int i = 0; i < numeros.size() ; i++) {
            System.out.println(numeros.get(i));
        }
        

        System.out.println("-------------------");

        System.out.println("Elementos do array maiores:");
        ArrayList<Integer> maiores = new ArrayList<>(numeros.subList(2, 5));

        for(int j = 0; j < maiores.size(); j++) {
            System.out.println(maiores.get(j));
        }
        System.out.println("-------------------");

        boolean resposta = numeros.equals(maiores);
        System.out.println("Os arrays maiores e numeros sao iguais em elementos e em posicao? " + resposta);
        System.out.println("-------------------");

        System.out.println("Mostrando os elementos do array numeros em ordem decrescente: ");

        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.println(numeros.get(i));
        }

    }
}