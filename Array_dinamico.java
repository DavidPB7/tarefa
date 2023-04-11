
import java.util.ArrayList;
import java.util.Arrays;


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

        Integer[] novo_numeros = numeros.toArray(new Integer[0]);
        System.out.println("Elementos do array em ordem crescente: ");
        Arrays.sort(novo_numeros);
        System.out.println(Arrays.toString(novo_numeros));
        System.out.println("-------------------");

        int posicao = Arrays.binarySearch(novo_numeros, 9);
        System.out.println("Considerando o meu novo array que esta ordenado.");
        System.out.println("O elemento 9 esta na posicao "+ posicao);
        System.out.println("-------------------");

        Integer[] maiores = new Integer[3];
        //ArrayList<Integer> maiores = new ArrayList<Integer>();
        maiores = Arrays.copyOfRange(novo_numeros, 2, 5);
        System.out.println("Elementos no array maiores: ");
        System.out.println(Arrays.toString(maiores));
        System.out.println("-------------------");

        //boolean resposta = Arrays.equals(numeros, maiores);
        //System.out.println("Os arrays 'numeros' e 'maiores apresenta a mesma quantidade de elementos nas mesmas posições:" + resposta);

    }
}

// import java.util.ArrayList;


// public class Array_dinamico {
//     public static void main(String[] args) {
//         ArrayList<Integer> numeros = new ArrayList<Integer>();
//         System.out.println("Olá, Mundo!");
//         System.out.println("1!");

//         numeros.add(5);
//         numeros.add(2);
//         numeros.add(9);
//         numeros.add(7);
//         numeros.add(1);

//         for (int i = 0; i < numeros.length; i++);
//     }

//     static void array_dinamico() {
//         ArrayList<Integer> numeros = new ArrayList<Integer>();
//         System.out.println("Olá, Mundo!");
//         System.out.println("1!");

//         numeros.add(5);
//         numeros.add(2);
//         numeros.add(9);
//         numeros.add(7);
//         numeros.add(1);
//     }

//     static void mostrar_array(array) {
//         for (int i = 0; i < array.length; i++);
//     }
// }
