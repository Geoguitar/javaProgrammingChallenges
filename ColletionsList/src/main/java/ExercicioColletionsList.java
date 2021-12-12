import java.util.ArrayList;
import java.util.List;

public class ExercicioColletionsList {
    public static void main(String[] args) {
//1- Criar uma lista e executar as operações abaixo:
        List<String> listName = new ArrayList<>();

//Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        listName.add("Juliana");
        listName.add("Pedro");
        listName.add("Carlos");
        listName.add("Larissa");
        listName.add("João");

//Navegue na lista exibindo cada nome no console.
        System.out.println(listName);

//Substitua o nome Carlos por Roberto.
        listName.set(2, "Roberto");
        System.out.println(listName);

//Retorne o nome da posição 1.
        String positionName = listName.get(1);
        System.out.println("Nome na posição 1: " + positionName);

//Remova o nome da posição 4.
//Remova o nome João.
//Retorne a quantidade de itens na lista.
//Verifique se o nome Juliano existe na lista.
//Crie uma nova lista com os nomes: Ismael e Rodrigo.
//Adicione todos os itens da nova lista na primeira lista criada.
//Ordene os itens da lista por ordem alfabética.
//Verifique se a lista está vazia.

    }
}
