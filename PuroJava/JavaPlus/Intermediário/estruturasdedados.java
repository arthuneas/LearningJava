package JavaPlus.Intermediário;

import java.util.*;
import java.util.stream.Collectors;

public class estruturasdedados {
    //map ⇾ estrutura de chave/valor
    //set ⇾ um vetor de valores não duplicados
    //list ⇾ lista ordenada com elementos ordenados
    //queue ⇾ fila, processamento em ordem

    public static void main(String[] args) {

        // lista fixa
        List<String> list0 = List.of("apple", "banana", "cherry");

        //lista dinâmica, input de valores
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("Arthur");
        list1.add("Arthur");

        list1.get(0);

        System.out.println(list1);

        //---------------------

        Set<String> setStrings = new HashSet<>();
        setStrings.add("hello");
        setStrings.add("Arthur");
        setStrings.add("Arthur");

        System.out.println(setStrings.contains("hello"));

        System.out.println(setStrings);

        //---------------------

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Arthur");
        map.put(2, "Santos ");

        System.out.println(map.get(1));

        //---------------------

        Queue<String> queue = new LinkedList<>(); // fila/pilha
        queue.add("Arthur");
        queue.add("Santos");
        queue.add("Almeida");
        queue.add("Fim");

        System.out.println(queue.poll()); //retira o primeiro valor da fila
        System.out.println(queue.peek()); //aponta o primeiro valor da fila
        System.out.println(queue.remove()); //remove a primeira pessoa, mas trata uma exceção quando a fila é nula
        System.out.println(queue);

        LinkedList<String> linked = new LinkedList<>(); //  estruturas de fila puro

        //---------------------
        //stream api
        // stream é uma sequência de elementos que suporta operações de agregação.
        // stream é uma interface funcional, ou seja, tem apenas um método abstrato.
        list1.add("fernanda souza");
        list1.add("fernanda almeida");
        list1.add("fernanda santos");
        list1.add("eduardo almeida");

        //filtra, mapeia, reduce e coleta os resultados em uma nova lista
        List<String> fernandas = list1
                .stream().filter(nome -> nome.startsWith("fernanda"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(fernandas);

        //reduce, transformando fernanda em uma string única, concatenando os nomes
        String fernanda = list1
                .stream()
                .filter(nome -> nome.startsWith("fernanda"))
                .map(String::toUpperCase)
                .reduce("", (a, b) -> a + b); //retorna string

        System.out.println(fernanda);

        //collect, transformando a lista de fernandas em um set, eliminando duplicatas
        Set<String> nanda = list1
                .stream()
                .filter(nome -> nome.startsWith("fernanda"))
                .map(String::toUpperCase)
                .map(nome -> nome.replaceAll(" ", ""))
                .collect(Collectors.toSet()); //retorna um set

        System.out.println(nanda);





    }


}
