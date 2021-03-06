import java.util.ArrayList;
import java.util.Collections;
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
        for (String listNames:listName) {
            System.out.println(listNames);
        }

//Substitua o nome Carlos por Roberto.
        listName.set(2, "Roberto");
        System.out.println(listName);

//Retorne o nome da posição 1.
        String positionName = listName.get(1);
        System.out.println("Nome na posição 1: " + positionName);

//Remova o nome da posição 4.
        System.out.println(listName);
        listName.remove(4);
        System.out.println(listName);

//Remova o nome João.
        listName.remove("João");
        System.out.println(listName);

//Retorne a quantidade de itens na lista.
        int quantidadeItens = listName.size();
        System.out.println("Itens na Lista: " + quantidadeItens);

//Verifique se o nome Juliano existe na lista.
        boolean pesquisaNome = listName.contains("Juliano");
        System.out.println("Resultado de pesquisa: " + pesquisaNome);

//Crie uma nova lista com os nomes: Ismael e Rodrigo.
        List<String> listNameNew = new ArrayList<>();
        listNameNew.add("Ismael");
        listNameNew.add("Rodrigo");
//Adicione todos os itens da nova lista na primeira lista criada.
        

//Ordene os itens da lista por ordem alfabética.
        Collections.sort(listName);
        System.out.println("Lista ordenada: " + listName);

//Verifique se a lista está vazia.
        boolean listaVazia = listName.isEmpty();
        if (false){
            System.out.println("A lista encontra-se vázia!!");
        }else{
            int totalItens = listName.size();
            System.out.println("Total de itens na Lista: " + totalItens);
        }
    }
}
